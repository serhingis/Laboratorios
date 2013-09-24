/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase6;

/**
 *
 * @author educacionit
 */
public class Auto {

    private int nroAuto;
    
    public Auto(int numero) {
        nroAuto = numero;
    }

    public int getNroAuto() {
        return nroAuto;
    }

    public void setNroAuto(int nroAuto) {
        this.nroAuto = nroAuto;
    }

    public boolean equals(Object obj) {

        if (obj instanceof Auto) {
            return this.getNroAuto() == ((Auto)obj).getNroAuto();
        } else {
            return false;
        }

    }
    
    
    
}

