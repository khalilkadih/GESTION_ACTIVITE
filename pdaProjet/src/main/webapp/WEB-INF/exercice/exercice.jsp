<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <title>Gestion  des exercice</title>
</head>
<body>

<%@include file="../includes/header.jsp"%>

<div class="conatiner col-md-10 col-md-offset-1 text-center mt-5 p-5">
    <div class="panel panel-default">
        <div class="panel-heading mt-5">cherche des exercie</div>
        <div class="panel-body mt-5">
            <a href="exercice/add" class="btn btn-primary">add Exerice</a>
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
        <th>Anne</th>
        <th>date debut</th>
        <th>date de fin </th>
        <th>Status </th>
        <th>delete</th>
        <th>update</th>
    </tr>
    <c:forEach items="${exercice}" var="e">
        <tr>
            <td>${e.id}</td>
            <td>${e.annee}</td>
            <td>${e.date_debut}</td>
            <td>${e.date_fin}</td>
            <td>${e.statu}</td>
            <td><a onclick="return confirm('etes-vous sure supprimer le produit?')"href="<%=request.getContextPath()%>/exercice/delete?id=${e.id}">Delete</a></td>
            <td> <a href="<%=request.getContextPath()%>/exercice/update?id=${e.id}">update</a> </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>