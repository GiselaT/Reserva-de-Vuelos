/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservadevuelos;

/**
 *
 * @author Hèctor
 */
class Aerolinea {
    private Aerolinea aerolinea;
    private  int aeronave;

    public Aerolinea(Aerolinea aerolinea, int aeronave) {
        this.aerolinea = aerolinea;
        this.aeronave = aeronave;
    }

    public Aerolinea getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(Aerolinea aerolinea) {
        this.aerolinea = aerolinea;
    }

    public int getAeronave() {
        return aeronave;
    }

    public void setAeronave(int aeronave) {
        this.aeronave = aeronave;
    }
    
    
    
}
