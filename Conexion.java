/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservadevuelos1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Héctor
 */
class Conexion {

    private String url;
    private String usuario;
    private String password;


    private Connection conexion;
    
    public Conexion(String url, String usuario, String password) throws ClassNotFoundException {
        this.url = url;
        this.usuario = usuario;
        this.password = password;

        
        Class.forName("com.mysql.jdbc.Driver");

    }
    public Connection getConexion() throws SQLException{
        if(conexion == null){
          
                conexion = DriverManager.getConnection( url + "jdbcmusqllocalhost3306reserva_de_vuelos?zeroDateTimeBehavior=convertToNull ", usuario + "root ", password + "YES");
        }       
            return conexion;
        }
        
    }