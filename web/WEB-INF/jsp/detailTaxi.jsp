<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Taxi</title>
    </head>
    <body>

        <table>
            <tr>
                <td>ID</td>
                <td>${taxi.id}</td>
            </tr>
            <tr>
                <td>Name</td>
                <td>${taxi.naam}</td>
            </tr>    
             <tr>
                <td>Postcode</td>
                <td>${taxi.postcode}</td>
            </tr> 
            <tr>
                <td>Passengers</td>
                <td>${taxi.passengers}</td>
            </tr> 
            
        </table>         
                
    </body>
</html>
