<%@ page language="java" contentType="text/html"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@include file="Header.jsp"%>

<div id="container">

<c:forEach items="${prodlist}" var="product"> 
<div class="column">
<div class="col-sm-6 col-md-3">
<a href="ProductDesc/${product.proid }" class="thumbnail">
<img src="<c:url value="/resources/images/${product.proid }.jpg"/>"style="height:200px; width:60%" alt="Error on loading images"/>
</a>
<div class="caption">
<h4>${product.proname}</h4>
<p>Rs.${product.price}</p>
</div>
</div>
</div>
</c:forEach>
</div>