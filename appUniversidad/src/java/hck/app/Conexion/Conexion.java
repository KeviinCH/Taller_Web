package hck.app.Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    Connection con = null; //Crear la variable de conexión
    public Connection conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbuniversidad","root","");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error al conectar"+e.getMessage());
        }
        return con;
    }
    
}
