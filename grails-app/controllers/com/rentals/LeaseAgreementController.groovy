package com.rentals

import grails.plugin.springsecurity.annotation.Secured
import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional
import com.rentals.users.EndUser


@Transactional(readOnly = true)
class LeaseAgreementController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def leaseAgreementService
    def staffService

    @Secured('hasAnyRole("ST")')
    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        [
            leaseAgreements: LeaseAgreement.list(params), 
            leaseAgreementInstanceCount: LeaseAgreement.count()
        ]
    }

    @Secured('hasAnyRole("ST")')
    def create() {
        def leaseAgreementInstance = new LeaseAgreement()
        [
            leaseAgreementInstance: new LeaseAgreement(), 
            client: EndUser.list(), 
            rental: Rental.get(params.rentalId), 
            staff: staffService.getCurrentUser()
        ]
    }
    
    @Secured('hasAnyRole("ST")')
    def save(LeaseAgreement leaseAgreementInstance) {
        if (leaseAgreementInstance == null) {
            return
        }
        if (leaseAgreementInstance.hasErrors()) {
            render(
                view:'create', 
                model: [
                    leaseAgreementInstance: leaseAgreementInstance, 
                    client: leaseAgreementInstance.client, 
                    rental: leaseAgreementInstance.rental
                ]
            )
            return
        }
        
        leaseAgreementInstance.save()
        def rental = leaseAgreementInstance.rental
        rental.addToLeaseAgreements(leaseAgreementInstance)
        rental.save(true)

        redirect(view: 'show', params:[id: leaseAgreementInstance.id])
    }

}
