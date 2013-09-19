/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase5;

/**
 *
 * @author educacionit
 */
public class Superman extends TransporteAereo implements Volador{
    
    public void aterrizar() {
        System.out.println("Superman.aterrizar()....");
    }
    
    private String nombre;

    public String getNombre() {
        return "Kent, Clark";
    }

    public void setNombre(String nombre) {
        this.nombre = "Kent, Clark";
    }
    
    
}
