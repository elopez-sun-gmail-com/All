<%-- 
    Document   : respuesta
    Created on : 15 jun. 2022, 9:48:42
    Author     : elopez
--%>

<%@page import="java.util.Enumeration"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Headers HTTP</title>
    </head>
    <body>
        <h1>Headers HTTP</h1>
        <br>
        Metodo Http: <%=request.getMethod()%>
        <br>
        <br>
        
        <%
            Enumeration cabeceros = request.getHeaderNames();
            while (cabeceros.hasMoreElements()) {
                String nombreCabecero = (String) cabeceros.nextElement();
                out.print("<b>" + nombreCabecero + "</b>:");
                out.print(request.getHeader(nombreCabecero));
                out.print("<br>");
            }
        %>
        
    </body>
</html>


