/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservadevuelos1;

/**
 *
 * @author Héctor
 */
public class Cliente {
    
    private int id;
    private String nombreApellido;
    private int dni;
    private String domicilio;
    private String email;
    private int nroDePasaporte;
    private int nroDeTarjeta;

    public Cliente(int id, String nombreApellido, int dni, String domicilio, String email, int nroDePasaporte, int nroDeTarjeta) {
        this.id = id;
        this.nombreApellido = nombreApellido;
        this.dni = dni;
        this.domicilio = domicilio;
        this.email = email;
        this.nroDePasaporte = nroDePasaporte;
        this.nroDeTarjeta = nroDeTarjeta;
    }

    public Cliente(String nombreYApellido, int dni, String domicilio, String email, int nroDePasaporte, int nroDeTarjeta) {
        id=-1;
        this.nombreApellido = nombreApellido;
        this.dni = dni;
        this.domicilio = domicilio;
        this.email = email;
        this.nroDePasaporte = nroDePasaporte;
        this.nroDeTarjeta = nroDeTarjeta;
    }

    public Cliente() {
    }

    Cliente(String maria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNroDePasaporte() {
        return nroDePasaporte;
    }

    public void setNroDePasaporte(int nroDePasaporte) {
        this.nroDePasaporte = nroDePasaporte;
    }

    public int getNroDeTarjeta() {
        return nroDeTarjeta;
    }

    public void setNroDeTarjeta(int nroDeTarjeta) {
        this.nroDeTarjeta = nroDeTarjeta;
    }
}

