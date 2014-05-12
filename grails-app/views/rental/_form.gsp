<%@ page import="com.rentals.Rental" %>

<g:field name="title" type="text" value="${rentalInstance.title}" required="" class="form-control" placeholder="Title"/>

<g:field name="type" type="text" value="${rentalInstance.type}" required="" class="form-control" placeholder="Type"/>

<g:field name="rooms" type="number" value="${rentalInstance.rooms}" required="" class="form-control" placeholder="Rooms"/>

<g:field name="rent" type="number" value="${rentalInstance.rent}" required="" class="form-control" placeholder="Rent"/>

<g:field name="description" type="text" value="${rentalInstance.description}" required="" class="form-control" placeholder="Description"/>

<g:field name="address.street" type="text" value="${rentalInstance?.address.street}" required="" class="form-control" placeholder="Street"/>

<g:field name="address.area" type="text" value="${rentalInstance?.address.area}" required="" class="form-control" placeholder="Area"/>

<g:field name="address.city" type="text" value="${rentalInstance?.address.city}" required="" class="form-control" placeholder="City"/>

<g:field name="address.postcode" type="text" value="${rentalInstance?.address.postcode}" required="" class="form-control" placeholder="Postcode"/>

