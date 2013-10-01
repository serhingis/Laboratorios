package customexceptions;

public class NoHayMasPasajesException extends Exception{
    
    private int cantidadDePasajes; 
    private String vuelo;

    public NoHayMasPasajesException() {
    }

    public NoHayMasPasajesException(int cantidadDePasajes, String vuelo) {
        this.cantidadDePasajes = cantidadDePasajes;
        this.vuelo = vuelo;
    }

    public int getCantidadDePasajes() {
        return cantidadDePasajes;
    }

    public void setCantidadDePasajes(int cantidadDePasajes) {
        this.cantidadDePasajes = cantidadDePasajes;
    }

    public String getVuelo() {
        return vuelo;
    }

    public void setVuelo(String vuelo) {
        this.vuelo = vuelo;
    }
    
}
