package clase9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExcepcionesChequeadas {

    public static void main(String[] args) {
        
        try {
            FileInputStream fis = abrirArchivo("c:/testsergio.txt");
        } catch(FileNotFoundException fnf ) {
            System.out.println("---Errorrrrrrr ------");
        }
        
    }
    
    public static FileInputStream abrirArchivo(String file) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("c:/test.txt");
        return fis;
    }
}
