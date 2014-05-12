package com.rentals.users


import grails.transaction.Transactional
import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

@Transactional
class EndUserService extends AbstractUserService {
	
	private static final Log log = LogFactory.getLog(EndUserService.class)
	
}
