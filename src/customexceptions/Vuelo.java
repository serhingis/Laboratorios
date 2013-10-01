package customexceptions;

public class Vuelo {

    
    private String nombre;
    private int lugaresDisponibles;

    public Vuelo() {
    }

    public Vuelo(String nombre, int lugaresDisponibles) {
        this.nombre = nombre;
        this.lugaresDisponibles = lugaresDisponibles;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLugaresDisponibles() {
        return lugaresDisponibles;
    }

    public void setLugaresDisponibles(int lugaresDisponibles) {
        this.lugaresDisponibles = lugaresDisponibles;
    }
    public void venderPasajes(int cantidadDePasajes) throws NoHayMasPasajesException{
        
        if(lugaresDisponibles < cantidadDePasajes) {
            throw new NoHayMasPasajesException(cantidadDePasajes, nombre);
        }
        
        lugaresDisponibles -= cantidadDePasajes;
    }
    
}