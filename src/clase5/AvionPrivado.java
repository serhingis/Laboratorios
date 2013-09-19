/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase5;

/**
 *
 * @author educacionit
 */
public class AvionPrivado extends TransporteAereo implements Volador {
    
    public void aterrizar() {
        System.out.println("AvionPrivado.aterrizar()....");
    }
    
    private String licencia;

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }
    
    
    
}
