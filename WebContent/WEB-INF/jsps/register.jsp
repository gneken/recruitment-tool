<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<jsp:include page="include.jsp" />
<title>Register to be eligble for recuritment!</title>
</head>
<body>

	<jsp:include page="navbar.jsp" />
	<div class="container main">
		<div class="row">
			<div class="col-md-3"></div>
			<div class="col-md-6">
				<sf:form method="post"
					action="${pageContext.request.contextPath}/docreate"
					id="registerform" commandName="person">

					<div class="table-wrapper">
						<table class="formtable">
							<tr>
								<td class="label"><spring:message code="register.name" />:</td>
								<td><sf:input class="controll" name="name" path="name"
										type="text" /><br /> <sf:errors path="name" cssClass="error"></sf:errors></td>
							</tr>
							<tr>
								<td class="label"><spring:message code="register.surname" />:</td>
								<td><sf:input class="controll" name="surname"
										path="surname" type="text" /><br /> <sf:errors
										path="surname" cssClass="error"></sf:errors></td>
							</tr>

							<tr>
								<td class="label"><spring:message code="register.ssn"/>:</td>
								<td><sf:input class="controll" name="ssn" path="ssn"
										type="text" /><br /> <sf:errors path="ssn" cssClass="error"></sf:errors></td>
							</tr>
							<tr>
								<td class="label"><spring:message code="register.email"/>:</td>
								<td><sf:input class="controll" name="email" path="email"
										type="text" /><br /> <sf:errors path="email"
										cssClass="error"></sf:errors></td>
							</tr>
							<tr>
								<td class="label"><spring:message code="register.username"/>:</td>
								<td><sf:input class="controll" name="username"
										path="username" type="text" /><br /> <sf:errors
										path="username" cssClass="error"></sf:errors></td>
							</tr>
							<tr>
								<td class="label"><spring:message code="register.password"/>:</td>
								<td><sf:input class="controll" name="password"
										path="password" type="text" /><br /> <sf:errors
										path="password" cssClass="error"></sf:errors></td>
							</tr>
							<tr>
								<td class="label"><spring:message code="register.role"/>:</td>
								<td><sf:select path="role">
										<sf:options items="${roles}" itemValue="id" itemLabel="name" />
									</sf:select></td>
							</tr>
							<tr>
								<td class="label"></td>
								<td><input class="controll btn btn-block btn-primary btn-default" value="<spring:message code="register.button"/>" type="submit" /></td>
							</tr>
						</table>
					</div>
				</sf:form>
			</div>
			<div class="col-md-3"></div>
		</div>
		<!--  row  -->
	</div>
	</div>



</body>
</html>