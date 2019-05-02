<%-- 
    Document   : login
    Created on : May 2, 2019, 6:20:25 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Title</title>
        <link href="../css/styles.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        <div class="form-style-2">
            <div class="form-style-2-heading">
                Please Sign Up!
            </div>
            <form method="post" action="/login">
                <label for="name">User name
                    <input class="input-field" type="text" id="name" name="name">
                </label>
                <label for="password"> Password
                    <input class="input-field" type="password" id="password" name="password">
                </label>
                <input type="submit" value="Sign Up">

            </form>
        </div> 
    </body>

</html>
