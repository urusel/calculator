<%-- 
    Document   : newjspaddUser
    Created on : 07.05.2019, 13:42:17
    Author     : user
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
               Already registered!
            </div>   
            <table>
                <tr>
                    <th>First Name</th>
                </tr>
                <c:forEach items="${userFromServer}" var="user">
                    <tr>
                        <td>${user.firstName}</td>
                    </tr>  
                </c:forEach>
            </table>
        </div>
        
    </body>
</html>

