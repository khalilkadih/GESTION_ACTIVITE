<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.pdaProjet.Entitys.StatusEnum" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="../includes/header.jsp" %>
<div class="text-center mx-5">
    <div class="input-group mb-3 w-25 p-3 form-group">

        <form  method="POST">
            <input type="hidden" name="id" value="${ex.id}">
            <label class="control-label">
                titre :
            </label>
            <input type="text" name="titre" class="form-control" value="${ex.annee}">

            <p></p>

            <label class="control-label">
                date de debut  :
            </label>
            <input type="date" name="date_debut" class="form-control" value="${ex.date_debut}">
            <label class="control-label">
                date de fin  :
                <input type="date" name="date_fin" class="form-control" value="${ex.date_fin}">
            </label>
            <label class="control-label" for="status">
                satus :
                <select name="status" id="status">

                    <% for(StatusEnum statu :StatusEnum.values()){ %>
                              <option value="<%=statu.ordinal()%>">
                                  <%=statu%>
                                  </option>
                    <%}%>
                </select>


            </label>

            </br>
            </br></br>
            <p></p>

            <button type="submit" class="btn btn-primary">update data</button>

        </form>

    </div>
</div>
</body>
</html>