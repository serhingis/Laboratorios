/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase5;

/**
 *
 * @author educacionit
 */
public class Aeropuerto {
    
    public void darPermisoDeAterrizar(Volador v) {
        
        v.aterrizar();
        
        if (v instanceof AvionPrivado) {
            AvionPrivado ap = (AvionPrivado)v;
            System.out.println("Aterrizó licencia " + ap.getLicencia());
        }
        
        if (v instanceof AvionDePasajeros) {
            AvionDePasajeros ap = (AvionDePasajeros)v;
            System.out.println("Aterrizó avion de " + ap.getAerolinea());
        }
        
        if (v instanceof Superman) {
            Superman ap = (Superman)v;
            System.out.println("Aterrizó " + ap.getNombre());
        }
        
    }
    
}
