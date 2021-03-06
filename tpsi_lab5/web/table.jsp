<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page session="true" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Java Web - laboratorium 5</title>
    </head>
    <body>
        
        <table>
        <c:forEach items="${sessionScope.students}" var="os">
                <tr>
                    <td>${os.firstName}</td>
                    <td>${os.lastName}</td>
                    <td>${os.email}</td>
                </tr>
            </c:forEach>
        </table>    
        
        <form action='/tpsi_lab5/form' method='post'>
            Podaj dane studenta:
            <input type='text' name='firstName'>
            <input type='text' name='lastName'>
            <input type='text' name='email'>
            <input type='submit'>
        </form>
        <p>Licznik odwiedzin strony: ${sessionScope.licznik}</p>
    </body>
</html>