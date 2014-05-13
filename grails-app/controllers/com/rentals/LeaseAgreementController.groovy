package com.rentals

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class LeaseAgreementController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond LeaseAgreement.list(params), model:[leaseAgreementInstanceCount: LeaseAgreement.count()]
    }

    def show(LeaseAgreement leaseAgreementInstance) {
        respond leaseAgreementInstance
    }

    def create() {
        respond new LeaseAgreement(params)
    }

    @Transactional
    def save(LeaseAgreement leaseAgreementInstance) {
        if (leaseAgreementInstance == null) {
            notFound()
            return
        }

        if (leaseAgreementInstance.hasErrors()) {
            respond leaseAgreementInstance.errors, view:'create'
            return
        }

        leaseAgreementInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'leaseAgreement.label', default: 'LeaseAgreement'), leaseAgreementInstance.id])
                redirect leaseAgreementInstance
            }
            '*' { respond leaseAgreementInstance, [status: CREATED] }
        }
    }

    def edit(LeaseAgreement leaseAgreementInstance) {
        respond leaseAgreementInstance
    }

    @Transactional
    def update(LeaseAgreement leaseAgreementInstance) {
        if (leaseAgreementInstance == null) {
            notFound()
            return
        }

        if (leaseAgreementInstance.hasErrors()) {
            respond leaseAgreementInstance.errors, view:'edit'
            return
        }

        leaseAgreementInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'LeaseAgreement.label', default: 'LeaseAgreement'), leaseAgreementInstance.id])
                redirect leaseAgreementInstance
            }
            '*'{ respond leaseAgreementInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(LeaseAgreement leaseAgreementInstance) {

        if (leaseAgreementInstance == null) {
            notFound()
            return
        }

        leaseAgreementInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'LeaseAgreement.label', default: 'LeaseAgreement'), leaseAgreementInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'leaseAgreement.label', default: 'LeaseAgreement'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
