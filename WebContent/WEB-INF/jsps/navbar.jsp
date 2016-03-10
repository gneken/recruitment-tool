<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>


<!-- background wrapper one -->
<div class="background-wrapper-one">
	<div class="container" id="banner">
		<div class="row">
			<h1 style="font-weight: bold; color: #BFA794">
				<spring:message code="recruitmenttool.header" />
			</h1>
		</div>
	</div>
	<!-- /background wrapper one -->
</div>

<!-- background wrapper two -->
<div class="background-wrapper-two">
	<nav class="navbar-xs navbar-default navbar-static-top"
		role="navigation" id="topnavbar">
		<!-- nav container -->
		<div class="container" id="header">

			<div class="navbar-header" id="toggle">
				<!-- small screen nav toggle -->
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#bs-example-navbar-collapse-1">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
			</div>


			<!-- nav links -->
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav">
					<li class="start"><a class="navbar-header"
						href='<c:url value="/" />'><spring:message code="start" /></a></li>
					<sec:authorize access="isAuthenticated() and hasRole('APPLICANT')">
						<li class="applicant"><a class="navbar-header"
							href='<c:url value="/applicant" />'><spring:message
									code="mypage" /></a></li>
					</sec:authorize>
					<sec:authorize access="isAuthenticated() and hasRole('RECRUIT')">
						<li class="recruiter"><a class="navbar-header"
							href='<c:url value="/recruiter" />'><spring:message
									code="mypage" /></a></li>
					</sec:authorize>
					<sec:authorize access="!isAuthenticated()">
						<li class="login"><a class="navbar-header"
							href='<c:url value="/login" />'><spring:message code="login" /></a></li>
					</sec:authorize>
					<li class="register"><a class="navbar-header"
						href='<c:url value="/register" />'><spring:message
								code="register" /></a></li>
					<li class="faq"><a class="navbar-header" href="#"><spring:message
								code="faq" /></a></li>
				</ul>

				<ul class="nav navbar-nav navbar-right">
					<li><a href="?language=en">EN</a></li>
					<li><a href="?language=sv">SV</a></li>
					<sec:authorize access="isAuthenticated()">
						<li><a class="navbar-header" href='<c:url value="/logout" />'><spring:message
									code="logout" /></a></li>
					</sec:authorize>
				</ul>

				<!-- /navbar-collapse -->
			</div>
			<!-- /nav container -->
		</div>
	</nav>