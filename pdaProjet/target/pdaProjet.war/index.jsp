<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body class="bg-primary">

<div class="w-50 m-auto mt-5  rounded shadow-sm p-3 mb-5 bg-body rounded">
    <div class="text-center">
        <h1>Login <span class="color-primary bg-primary rounded p-2">Admin</span> </h1>
    </div>
    <form class="p-3" action="activite" method="post">
        <div>
            <label for="email">Email*</label>
            <input id="email" name="email"  type="email" placeholder="email" class="form-control "/>
        </div>
        <div class="mt-3">
            <label for="password">Email*</label>
            <input id="password" name="password" type="password" placeholder="password" class="form-control "/>
        </div>
        <div class="mt-3 text-center">
            <button type="submit" class="btn btn-warning">submit</button>
            <p>
                <a href="" class="btn btn-primary mt-4"> SIGN UP</a>

            </p>
        </div>
    </form>
</div>
</body>
</html>