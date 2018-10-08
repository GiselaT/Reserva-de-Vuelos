/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservadevuelos;

import java.time.LocalDate;

/**
 *
 * @author Hèctor
 */
public class Vuelo {
    
    private int idVuelo;
    private Aerolinea aerolinea;
    private String ciudadOrigen;
    private String ciudadDestino;
    private LocalDate fechaLlegada;
    private LocalDate fechaPartida;
    public  int idAsiento;

    public Vuelo(int id, Aerolinea aerolinea, String ciudadOrigen, String ciudadDestino, LocalDate fechaLlegada, LocalDate fechaPartida, int idAsiento) {
        this.idVuelo = idVuelo;
        this.aerolinea = aerolinea;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.fechaLlegada = fechaLlegada;
        this.fechaPartida = fechaPartida;
        this.idAsiento = idAsiento;
    }

    public int getId() {
        return idVuelo;
    }

    public void setId(int idVuelo) {
        this.idVuelo = idVuelo;
    }

    public Aerolinea getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(Aerolinea aerolinea) {
        this.aerolinea = aerolinea;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public LocalDate getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(LocalDate fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public LocalDate getFechaPartida() {
        return fechaPartida;
    }

    public void setFechaPartida(LocalDate fechaPartida) {
        this.fechaPartida = fechaPartida;
    }

    public int getAsiento() {
        return idAsiento;
    }

    public void setAsiento(int idAsiento) {
        this.idAsiento = idAsiento;
    }
    
    
    
}
