<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html >
    <head>

        <link rel="stylesheet" href="${urlCss}" type="text/css" /> 
        <title>Taxis</title>
    </head>
    <body>
           <h2>Taxis</h2>
        <table width="50%">
            <tr>
                <th>Id</th>
                <th>Taxi Name</th>
                <th>ZIP Code</th>
                <th>Number of Passengers</th>
            </tr>

             <c:forEach items="${taxisList}" var="taxi">
                <tr>
                    <td>
                        <a href="${taxi.id}.htm">
                            ${taxi.id}</a> 
                    </td> 
                    
                    <td>${taxi.name}</td>
                    <td>${taxi.postcode}</td>
                    <td>${taxi.passengers}</td>
                </tr>
            </c:forEach>

        </table>	
        <br>
    </body>
</html>