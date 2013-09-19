/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase5;

import javax.transaction.TransactionRequiredException;

/**
 *
 * @author educacionit
 */
public class AvionDePasajeros extends TransporteAereo implements Volador{
    
    private String aerolinea;
    
    public void aterrizar() {
        System.out.println("AvionDePasajeros.aterrizar()....");
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }
    
    
}
