package com.rentals.users

import grails.transaction.Transactional

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory
import org.apache.ivy.core.module.descriptor.ExtendsDescriptor;

import com.rentals.users.landlord.PrivateOwner;

@Transactional
class PrivateOwnerService extends AbstractUserService {
	
	private static final Log log = LogFactory.getLog(PrivateOwnerService.class)

	
}
