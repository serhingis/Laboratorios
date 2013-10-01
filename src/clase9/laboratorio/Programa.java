package clase9.laboratorio;

public class Programa {
    
    public static void main(String[] args) throws CantidadDeArgumentosException{
        
        if(args.length != 2 ) {
            throw new CantidadDeArgumentosException("ID", "Nivel", "El programa debe tener sólo dos parámetros ");
        }
        
        try {
            
            int   parm1 = Integer.parseInt(args[0]);
            int   parm2 = Integer.parseInt(args[1]);
            float res   = dividirArgumentos(parm1, parm2);
            System.out.println("El resultado de la división es: " + res);
            System.exit(0);
        
        } catch(NumberFormatException nfe) {
            System.err.println("Los dos valores deben ser númericos");
            System.exit(1);
        
        } catch(ArithmeticException a) {
            System.out.println("Se ha detectado el error: " + a.getMessage());
            System.exit(1);
        
        } catch(Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
        
    }

    public static float dividirArgumentos(int arg1, int arg2) throws ArithmeticException {
           float resultado = arg1/arg2;
           return resultado;
    }

}
