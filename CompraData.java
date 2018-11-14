/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservadevuelos1;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Héctor
 */
public class CompraData {
    
      private Connection connection = null;

    public CompraData(Conexion conexion) throws SQLException {
        connection = conexion.getConexion();
    }
    
    public void guardarCompra(Compra compra){
        try {
            
            String sql = "INSERT INTO compra (id_asiento, id_cliente, fechaRealizada, monto) VALUES ( ? , ? , ? , ? );";
 
            try (PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                statement.setInt(1, compra.getId_asiento());
                statement.setInt(2, compra.getId_cliente());
                statement.setDate(3, Date.valueOf(compra.getFechaRealizada()));
                statement.setDouble(4, compra.getMonto());
                
                statement.executeUpdate();
                
                ResultSet rs = statement.getGeneratedKeys();
                
                if (rs.next()) {
                    compra.setId_compra(rs.getInt(1));
                } else {
                    System.out.println("No se pudo obtener el id luego de insertar una compra");
                }
            }
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar una compra: " + ex.getMessage());
        }
    }
    
        
        public List<Compra> obtenerCompra(){
        List<Compra> compras = new ArrayList<>();
            

        try {
            String sql = "SELECT * FROM compra;";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                ResultSet resultSet = statement.executeQuery();
                Compra compra;
                while(resultSet.next()){
                    compra = new Compra();
                    compra.setId_compra(resultSet.getInt("id_compra"));
                    compra.setId_cliente(resultSet.getInt("id_cliente"));
                    compra.setFechaRealizada(resultSet.getDate("fechaRealizada").toLocalDate());
                    compra.setMonto(resultSet.getDouble("monto"));
                    
                    compras.add(compra);
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error al obtener las compras : " + ex.getMessage());
        }
        
        
        return compras;
    }
        public void borrarCompra(int id){
    try {
            
            String sql = "DELETE FROM compra WHERE id =?;";

        try (PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            statement.setInt(1, id);
            
            
            statement.executeUpdate();
        }
    
        } catch (SQLException ex) {
            System.out.println("Error al borrar una compra: " + ex.getMessage());
        }
        }
        
         public Compra buscarCompra(int id){
    Compra compra=null;
    try {
            
            String sql = "SELECT * FROM compra WHERE id =?;";

        try (PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            statement.setInt(1, id);
            
            
            ResultSet resultSet=statement.executeQuery();
            
            while(resultSet.next()){
                compra = new Compra();               
                compra.setId_compra(resultSet.getInt("id_compra"));
                compra.setId_asiento(resultSet.getInt("id_asiento"));
                compra.setId_cliente(resultSet.getInt("id_cliente"));
                compra.setFechaRealizada(resultSet.getDate("fechaRealizada").toLocalDate());
                compra.setMonto(resultSet.getDouble("monto"));
                
            }
        }
            
            
            
            
    
        } catch (SQLException ex) {
            System.out.println("Error al buscar un compra: " + ex.getMessage());
        }
        
        return compra;
    }
   
}
/* Aca no le puse el update...de por si me parece raro poder modificar una compra.
deberiamos releer el enunciado a ver si va o no.*/


