<%-- 
    Document   : newjspaddUser
    Created on : 07.05.2019, 13:42:17
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
                Please add eser
            </div>   
            <form method="post" action="/addUser">
                <label for="first-name">First Name
                    <input class="input-field" type="text"  id="first-name" name="first-name">
                   </label>   
                 <label for="last-name">Lastst Name
                    <input class="input-field" type="text"  id="last-name" name="last-name">
                   </label>
                <input type="submit" value="Add user">
            </form>
        </div>
        
    </body>
</html>

