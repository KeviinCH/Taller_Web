<%@page import="hck.app.Beans.GeneroDAO"%>
<% GeneroDAO oListDAO = new GeneroDAO();%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Director</title>
    </head>
    <body>
        <h2>Registrar datos del Director</h2>
        <form action="ServletDirector" method="post">
            <input type="text" name="dni" placeholder="Ingrese DNI">
            <input type="text" name="nombre" placeholder="Ingrese Nombre">
            <input type="text" name="telefono" placeholder="Ingrese Núm. Celular">
            <select name="cbxGenero">
                <%for (hck.app.Beans.Genero genero : oListDAO.ListarGenero()){%>
                    <option value="<%=genero.getCod_genero()%>">
                        <%=genero.getDescripcion()%>
                    </option>
                <%}%>
            </select>
            <input type="submit" value="Grabar datos">
        </form>
    </body>
</html>
