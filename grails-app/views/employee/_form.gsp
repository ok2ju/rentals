<g:field name="username" type="text" value="${userInstance.username}" required="" class="form-control" placeholder="Username"/>
<g:field name="password" type="text" value="${userInstance.password}" required="" class="form-control" placeholder="Password"/>
<g:field name="firstname" type="text" value="${userInstance.firstname}" required="" class="form-control" placeholder="Firstname"/>
<g:field name="lastname" type="text" value="${userInstance.lastname}" required="" class="form-control" placeholder="Lastname"/>
<g:field name="position" type="text" value="${userInstance.position}" required="" class="form-control" placeholder="Position"/>
<div class="form-control">
	<g:datePicker name="dob" value="${new Date()}" noSelection="['':'-Choose-']" class="form-control"/>
</div>
<g:select name="sex" value="${userInstance.sex}" optionKey="key" optionValue="value" from="${[[key: 'm', value: 'Male'],[key: 'f', value: 'Female']]}" class="form-control"/>
<g:select name="branch" from="${branch}" value="${branch?.id}" optionKey="id" class="form-control"/>