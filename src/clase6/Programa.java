/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase6;

/**
 *
 * @author educacionit
 */
public class Programa {

    public static void main(String[] args) {
        
        Auto a1 = new Auto(123);
        Auto a2 = new Auto(123);

        if(a1.equals(a2)) {
                System.out.println("Son iguales");
        } else {
              System.out.println("NO son iguales");
        }  
        
    }
    
    
}
