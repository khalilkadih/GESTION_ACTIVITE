<%@ page import="com.pdaProjet.Entitys.EtatEnum" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="../includes/header.jsp" %>
<div class="text-center mx-5">
  <div class="input-group mb-3 w-25 p-3 form-group">

    <form  method="POST">
      <input type="hidden" name="id" value="${act.id}">
      <label class="control-label">
        titre :
      </label>
      <input type="text" name="titre" class="form-control" value="${act.titre}">

      <p></p>
      <label class="control-label">
        description :
      </label>
      <input type="text" name="description" class="form-control" value="${act.description}">
      <p></p>
      <label class="control-label">
        date de debut  :
      </label>
      <input type="date" name="date_debut" class="form-control" value="${act.date_debut}">
      <label class="control-label">
        date de fin  :
      </label>
      <input type="date" name="date_fin" class="form-control" value="${act.date_defin}">
      <label class="control-label">
        satus :
      </label>
      <label class="control-label" for="etat">
        Etat :
        <select name="etat" id="etat">
          <% for(EtatEnum etat :EtatEnum.values()){ %>
          <option value="<%=etat.ordinal()%>">
            <%=etat%>
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