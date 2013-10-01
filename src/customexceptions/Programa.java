package customexceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Programa {
    
    public static void main(String[] args) {
       
        List<Vuelo> vuelos = new ArrayList<>();
        int cantidadPasajes = 100;
        int cantidadPequeñaPasajes = 25;
        Vuelo vuelo1 = new Vuelo("EducacionIT-123", cantidadPasajes);
        Vuelo vuelo2 = new Vuelo("EducacionIT-456", cantidadPequeñaPasajes);
        vuelos.add(vuelo1);
        vuelos.add(vuelo2);
                
        for(Vuelo v : vuelos) {
            try {
                v.venderPasajes(cantidadPasajes);
            } catch (NoHayMasPasajesException ex) {
                System.out.print("El vuelo: " + ex.getVuelo() + " no tiene ");
                System.out.println(ex.getCantidadDePasajes() + " lugares disponibles");
            }
        }
    }

}
