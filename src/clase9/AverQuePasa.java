package clase9;

import java.io.FileInputStream;

public class AverQuePasa {
    
    public static void main(String[] args) {
        
        try {
               int num = 10/0;
               String p = null;
               System.out.println("La longitud de p es: " + p.length());
        }
        catch(ArithmeticException a) {
            a.printStackTrace();
            System.err.println("División por cero: " + a);
        }
        catch(NullPointerException npe) {
            npe.printStackTrace();
            System.err.println("Puntero nulo: " + npe);
        }
        catch(Exception e) {
            e.printStackTrace();
            System.err.println("Se ha atrapado una excepción: " + e);
        } finally {
            // Ejecuta siempre...........
            System.out.println("Salio por finally");
        }
    }        
}
