package hck.app.Beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GeneroDAO extends hck.app.Conexion.Conexion{
    public void registrarGenero(Genero ogenero) throws SQLException{
         String res="INSERT INTO genero VALUES (null,?)";
        try {
             Connection con = conectar();
             PreparedStatement ps=con.prepareStatement(res);
            
            ps.setString(1, ogenero.getDescripcion());
            
            ps.execute();
            ps.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    
    }
    
    public ArrayList<Genero> ListarGenero(){
        ArrayList<Genero> listaG = new ArrayList<>();
        String sql="SELECT * FROM genero";
        
        try {
            Connection con=conectar();
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Genero ogenero=new Genero(
                     rs.getInt("cod_genero"),
                     rs.getString("descripcion"));
                listaG.add(ogenero);
            }
            rs.close();
            ps.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaG;
    }

}
