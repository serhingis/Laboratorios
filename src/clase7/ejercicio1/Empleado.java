/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7.ejercicio1;

/**
 *
 * @author educacionit
 */
public class Empleado {
    
    private String nombre;
    private String dni;
    private int edad;

    public Empleado() {
    }

    
    public Empleado(String nombre, String dni, int edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String getPrtNombre() {
        return nombre + " " + dni + " " + edad;
    }
    
}
