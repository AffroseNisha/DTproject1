<%@ page language="java" contentType="text/html"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@include file="Header.jsp"%>
<div id="container">
<c:forEach items="${prodlist}" var="product">
<div class="row">
<div class="col-sm-6 col-md-3">
<c:forEach items="${prodlist}" var="product">
<a href="ProdDesc/${product.proid }" class="thumbnail"></a>
<img src="<c:url value="/resources/images/${product.proid}.jpg"/>"alt="Generic placeholder thumbnail"/>

</a>


<div class="caption">
<h4>${product.proname}</h4>
			<p>${product.price}</p>
			<p>${product.pimage}</p>
			</div>
			</div>
			</div>
			</c:forEach>

</div>
</c:forEach>
</div>


</div>

</div>