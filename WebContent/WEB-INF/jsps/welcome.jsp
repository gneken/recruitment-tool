<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<jsp:include page="include.jsp" />
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="navbar.jsp" />
	<div class="container main">
		<div class="row">
			<div class="col-md-2"></div>
			<div class="col-md-8">
				<h2><spring:message code="start.body.welcome"/></h2>
				<p>
					<spring:message code="start.body.p"/><a
						href='<c:url value="/register" />'><spring:message code="register"/></a> <spring:message code="start.body.p2"/>
				</p>
				
			</div>
			<div class="col-md-2"></div>
		</div>
	</div>
	<br>

	</div>

</body>
</html>
