<%@include file="../includes/header.jsp" %>
<div class="text-center mx-5">
    <div class="input-group mb-3 w-25 p-3 form-group">

        <form  method="POST">
            <label class="control-label">
                Annee :
            </label>
            <input type="text" name="anne" class="form-control">

            <p></p>
            <label class="control-label">
                date de  debut :
            </label>
            <input type="date" name="date_debut" class="form-control">
            <p></p>
            <label class="control-label">
                date de fin  :
            </label>
            <input type="date" name="date_fin" class="form-control">
            <label class="control-label">
                satus :
            </label>
            <select name="status" id="status" >
                <option value="active">
                    Active
                </option>
                <option value="en cours">en cours</option>
                <option value="termine">termine</option>
            </select>
            </br>
            </br></br>
            <button type="submit" class="btn btn-primary">insert data</button>

        </form>

    </div>
</div>
</body>
</html>