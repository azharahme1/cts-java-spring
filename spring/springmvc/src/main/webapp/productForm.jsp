<!DOCTYPE html>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Validation</title>
<style type="text/css">

.error{
color: red;
}

</style>
</head>
<body>


	<form:form action="item.htm" method="post" modelAttribute="product">


		<table>
			<tr>
				<td>Id</td>
				<td><form:input type="text" path="id" /></td>
			</tr>
			<tr>
				<td>Name</td>
				<td>
				<form:input type="text" path="name" />
				<form:errors path="name" cssClass="error"/>
				</td>
			</tr>
			<tr>
				<td>Price</td>
				<td>
				<form:input type="text" path="price" />
				<form:errors path="price" cssClass="error"/>
				</td>
			</tr>
			<tr>
				<td>Desc</td>
				<td><form:textarea rows="5" cols="35" path="description"></form:textarea>
				</td>
			</tr>
		</table>
		<button type="submit">Save</button>

	</form:form>


</body>
</html>