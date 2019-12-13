<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="/Judo/css/style.css">
<title>Accueil</title>
</head>


<body>
	<header>
		<%@ include file="/WEB-INF/jspf/header.jspf"%>
	</header>


	<div id="container">
		<div class="content">
			<%@ include file="/WEB-INF/jspf/menu.jspf"%>
			
		</div>

		<div class="content">
			<jsp:include page="${requestScope.page}"></jsp:include>
		</div>
	</div>

	<footer>
		<%@ include file="/WEB-INF/jspf/footer.jspf"%>
	</footer>

</body>

</html>