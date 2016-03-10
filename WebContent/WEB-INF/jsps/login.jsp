<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<jsp:include page="include.jsp" />
<title>Login page</title>
</head>

<body>
	<jsp:include page="navbar.jsp" />

	<div class="container main">
		<div class="login-container jumbotron">
			<div class="login-card">
				<div class="login-form">
					<c:url var="loginUrl" value="/login" />
					<form action="${loginUrl}" method="post" class="form-horizontal">
						<c:if test="${param.error != null}">
							<div class="alert alert-danger">
								<p><spring:message code="login.invalid" />.</p>
							</div>
						</c:if>
						<c:if test="${param.logout != null}">
							<div class="alert alert-success">
								<p><spring:message code="login.loggedout" />.</p>
							</div>
						</c:if>
						<div class="input-group input-sm">
							<label class="input-group-addon" for="username"><i
								class="fa fa-user"></i></label> <input type="text" class="form-control"
								id="username" name="ssoId" placeholder="<spring:message code="login.username" />" required>
						</div>
						<div class="input-group input-sm">
							<label class="input-group-addon" for="password"><i
								class="fa fa-lock"></i></label> <input type="password"
								class="form-control" id="password" name="password"
								placeholder="<spring:message code="login.password" />" required>
						</div>
						<input type="hidden" name="${_csrf.parameterName}"
							value="${_csrf.token}" />

						<div class="form-actions">
							<input type="submit"
								class="btn btn-block btn-primary btn-default" value="<spring:message code="login.button" />">
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>

</body>
</html>