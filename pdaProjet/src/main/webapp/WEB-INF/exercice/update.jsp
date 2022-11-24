<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.pdaProjet.Entitys.StatusEnum" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="com.pdaProjet.Entitys.Exercices" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="../includes/header.jsp" %>
<% Exercices exerciceUpdate = (Exercices) request.getAttribute("ex");%>
<div class="text-center mx-5">
    <div class="input-group mb-3 w-25 p-3 form-group">

        <form  method="POST">
            <input type="hidden" name="id" value="${ex.id}">
            <div>


            <label class="control-label">
                titre :
            </label>
            <input type="text" name="titre" class="form-control" value="${ex.annee}">

            </div>

            <div>

            <label class="control-label">
                date de debut  :
            </label>
            <input type="date" name="date_debut" class="form-control" value="<%= exerciceUpdate.getDate_debut()%>">
            </div>
            <div>
            <label class="control-label">
                date de fin  :
            </label>
                <input type="date" name="date_fin" class="form-control" value="<%= exerciceUpdate.getDate_debut()%>">
            </div>
            <div>

            <label class="control-label" for="status">
                satus :
            </label>
                <select name="status" id="status">

                    <% for(StatusEnum statu :StatusEnum.values()){ %>
                              <option value="<%=statu.ordinal()%>">
                                  <%=statu%>
                                  </option>
                    <%}%>
                </select>


            </div>
            <div>


            <button type="submit" class="btn btn-primary">update data</button>
            </div>
        </form>

    </div>
</div>
</body>
</html>