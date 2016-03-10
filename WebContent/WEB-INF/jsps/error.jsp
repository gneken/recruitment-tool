<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<jsp:include page="include.jsp" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Error</title>
</head>
<body>
	<jsp:include page="navbar.jsp" />
	<div class="container main">
		<div class="row" style="margin-top: 30px">
			<div class="col-md-2"></div>
			<div class="col-md-8">

				<p><spring:message code="error.text"/></p>
				
			</div>
			<div class="col-md-2"></div>
		</div>
	</div>
</body>
</html>