<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Shopping Cart-${title}</title>

<!-- To fetch title from the page controller for navbar -->
<script>
	window.menu = '${title}';
</script>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>

<link href="${css}/bootstrap-theme.css" rel="stylesheet">
<link href="${css}/myapp.css" rel="stylesheet">

</head>

<body>

	<!-- Navigation -->

	<%@ include file="./shared/navbar.jsp"%>

	<!-- Page Content home  -->
	<c:if test="${userclickhome==true}">
		<%@include file="home.jsp"%>
	</c:if>

	<!-- Load when User clicks About us  -->
	<c:if test="${userclickabout==true}">
		<%@include file="about.jsp"%>
	</c:if>

	<!-- Load when User clicks Contact -->
	<c:if test="${userclickcontact}==true">
		<%@include file="contact.jsp"%>
	</c:if>

	<!-- Load when User clicks Contact -->
	<c:if
		test="${userclickallproducts==true or userclickcategoryproducts==true}">
		<%@include file="listproducts.jsp"%>
	</c:if>


	<!-- Footer -->
	<%@ include file="./shared/footer.jsp"%>

	<!-- Navbar highlighter JS link-->
	<script src="${js}/myapp.js"></script>


</body>

</html>
