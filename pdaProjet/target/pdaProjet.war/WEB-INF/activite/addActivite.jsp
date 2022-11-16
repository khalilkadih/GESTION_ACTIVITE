<%@include file="../includes/header.jsp" %>
<div class="text-center mx-5">
    <div class="input-group mb-3 w-25 p-3 form-group">

        <form  method="POST">
            <label class="control-label">
                titre :
            </label>
            <input type="text" name="titre" class="form-control">

            <p></p>
            <label class="control-label">
                description :
            </label>
            <input type="text" name="description" class="form-control">
            <p></p>
            <label class="control-label">
                date de debut  :
            </label>
            <input type="date" name="date_debut" class="form-control">
            <label class="control-label">
                date de fin  :
            </label>
            <input type="date" name="date_fin" class="form-control">
            <label class="control-label" for="etat">
                Etat d'activite :
            </label>
            <select name="etat" id="etat" >
                <option value="0">
                    Select One
                </option>
                <option value="1">active</option>
                <option value="2">desactive</option>
            </select>
            </br>
            </br></br>
            <p></p>

            <button type="submit" class="btn btn-primary">insert data</button>

        </form>

    </div>
</div>
</body>
</html>