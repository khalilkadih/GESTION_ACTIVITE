<%@ page import="com.pdaProjet.Entitys.Participants" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.stream.Collectors" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <title>Gestion  produit</title>
</head>
<body>
<%@include file="../includes/header.jsp"%>
<div class="conatiner col-md-10 col-md-offset-1 text-center mt-5 p-5">
    <div class="panel panel-default">
        <div class="panel-heading mt-5">Show all Participant</div>
        <a href="participant/add" class="btn btn-primary">add participant</a>

        <div class="panel-body mt-5">
            <form action="chercher.com" method="get">
                <label>mot cle</label>
                <input type="text" name="motcle" value="" />
                <button type="submit" class="btn btn-primary">chercher</button>
            </form>

        </div>
    </div>
</div>
<table class="table table-striped">
    <tr>
        <th>ID</th>
        <th>domaine</th>
        <th>structure</th>
    </tr>
    <c:forEach items="${part}" var="a">
        ${a.class.canonicalName}
   <%-- <tr>
        <td>${a.id}</td>
        <td>${a.titre}</td>
        <td>${a.description}</td>
        <td>${a.date_debut}</td>
        <td>${a.date_defin}</td>
        <td>${a.etat}</td>

    </tr>--%>
    </c:forEach>
</table>
</body>
</html>