package hck.app.Beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EstadoCivilDAO extends hck.app.Conexion.Conexion{
    //Registrar un estado civil
     public void registrarEstado(EstadoCivil ecivil) throws SQLException{
        String res="INSERT INTO estado_civil VALUES (null,?)";
        
        try {
            Connection con=conectar();
            PreparedStatement ps=con.prepareStatement(res);
            
            ps.setString(1, ecivil.getDescripcion());
            
            ps.execute();
            ps.close();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
    }
}
