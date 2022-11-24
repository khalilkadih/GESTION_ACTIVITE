<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="../includes/header.jsp" %>
<div class="text-center mx-5">
    <div class="input-group mb-3 w-25 p-3 form-group">

        <form  method="POST">
            <label class="control-label">
                Domaine :
            </label>
            <input type="text" name="domaine" class="form-control">

            <p></p>
            <label class="control-label">
                structure :
            </label>
            <input type="text" name="structure" class="form-control">
            <div>
            <button type="submit" class="btn btn-primary">insert data</button>
            </div>
        </form>

    </div>
</div>
</body>
</html>