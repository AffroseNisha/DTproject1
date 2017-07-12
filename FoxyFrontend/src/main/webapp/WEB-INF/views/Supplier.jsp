<%@ page language="java" contentType="text/html"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@include file="Header.jsp"%>
<form:form action="InsertSupplier" modelAttribute="supplier">

<table align="center">
<tr>
<td colspan="2"><center>Supplier Details</center>
</td>
<tr>
<td>Supplier Id</td>
<td><form:input path="suppId"/></td>
</tr>
<tr>
<td>Supplier Name</td>
<td><form:input path="SuppName"/></td>
</tr>

<tr>
<td>Supplier Address</td>
<td><form:input path="Address"/></td>
</tr>
<tr>
<td colspan="3"><input type="submit"/></td>
</tr>
</table>
</form:form>

<!-- Displaying the Supplier Details -->
<table cellspacing="2" align="center" border="1">

<tr bgcolor="Black">
<td>Supplier Id</td>

<td>Supplier Name</td>
<td>Supplier Address</td>
</tr>

<c:forEach items="${suplist}" var="supplier">
<tr bgcolor="pink">
<td>${supplier.suppId}</td>
<td>${supplier. suppName}</td>
<td>${supplier.address}</td>

<<td><a href="<c:url value="deleteSupplier/${supplier.suppId}"/>">Delete</a>
				<a href="<c:url value="updateSupplier/${Supplier.suppId}"/>">Update</a>
			</td>
			
</tr>


</c:forEach>


</table>
<!-- Completed displaying -->
</body>
</html>