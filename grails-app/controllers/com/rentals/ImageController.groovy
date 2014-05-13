package com.rentals

import grails.plugin.springsecurity.annotation.Secured
import grails.transaction.Transactional

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

@Secured('permitAll')
@Transactional(readOnly = true)
class ImageController {

	private static final Log log = LogFactory.getLog(ImageController.class)
	static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]
	static final okcontents = ['image/png', 'image/jpeg', 'image/gif']
	
	def rentalService

	@Secured('hasAnyRole("PO,BO")')
	def create() {
		[imageInstance: new Image(), rentalId: params.id]
	}

	@Secured('hasAnyRole("PO,BO")')
	@Transactional
	def save() {
		def file = request.getFile('bytes')

		if (!okcontents.contains(file.getContentType())) {
			flash.message = "Photo must be one of: ${okcontents}"
			render(view:'select_avatar', model:[user:user])
			return
		}
		
		Image image = new Image(bytes: file.bytes, contentType: file.getContentType())
		
		if (!rentalService.addImage(params.long('rentalId'), image)) {
			render(view:'create', model:[imageInstance: new Image(), rentalId: params.rentalId])
		}

		redirect(action:'create', params:[id: params.rentalId])
	}


	def show() {
		Image image = Image.get(params.id)
		if (!image || !image.bytes || !image.contentType) {
			response.sendError(404)
			return
		}
		response.contentType = image.contentType
		response.contentLength = image.bytes.size()
		OutputStream out = response.outputStream
		out.write(image.bytes)
		out.close()
	}
}
