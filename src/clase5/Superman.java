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
    
	private String nombre;
	
    public void aterrizar() {
        System.out.println("Superman.aterrizar()....");
    }
    
    public String getNombre() {
        return "Sergio Fernandez";
    }

    public void setNombre(String nombre) {
        this.nombre = "Clark, Kent";
    }
    
    
}
