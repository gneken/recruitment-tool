<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<html>
<head>
<jsp:include page="include.jsp" />
<title>Admin</title>
</head>
<body>


	<jsp:include page="navbar.jsp" />
	<div class="container main">
		<div class="row">
			<div class="col-md-2"></div>
			<div class="col-md-8">
				<h3>Dear <strong>${user}</strong>, Welcome to Admin Page. <a
					href="<c:url value="/logout" />">Logout</a></h3>
					 <hr>
				<table>
					<tr style="font-weight: bold;">
						<td>Name</td>
						<td>Surname</td>
						<td>ssn</td>
						<td>Email</td>
						<td>Password</td>
						<td>Username</td>
						<td>Role</td>
					</tr>

					<c:forEach var="person" items="${person}">

						<tr>
							<td><c:out value="${person.name}"></c:out></td>
							<td><c:out value="${person.surname}"></c:out></td>
							<td><c:out value="${person.ssn}"></c:out></td>
							<td><c:out value="${person.email}"></c:out></td>
							<td><c:out value="${person.password}"></c:out></td>
							<td><c:out value="${person.username}"></c:out></td>
							<td><c:out value="${person.role.name}"></c:out></td>

						</tr>

					</c:forEach>

				</table>
			</div>
			<div class="col-md-2"></div>
		</div>
	</div>
	<br>

	</div>





</body>
</html>



