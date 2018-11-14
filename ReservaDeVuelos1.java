/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservadevuelos1;

import java.sql.SQLException;

/**
 *
 * @author Héctor
 */
public class ReservaDeVuelos1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
   Conexion conexion;
 
        try {
            conexion = new Conexion("jdbc:mysql://localhost:3306/reserva de vuelos?", "root", "");
            ClienteData clienteData = new ClienteData(conexion);
            
            
            Cliente cliente1 = new Cliente("Maria Gomez",33852065,"Sucre 290","mariagomez@gmail.com",1253653,0304252120);
            clienteData.guardarCliente(cliente1);
            System.out.println("No se pudo obtener el id luego de insertar un cliente");


        } catch (ClassNotFoundException | SQLException ex) {
          
        }
    }
}
        
    