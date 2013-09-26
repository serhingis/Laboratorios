/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7.ejercicio1;

import java.util.ArrayList;

/**
 *
 * @author educacionit
 */
public class Empresa {

    public static void main(String[] args) {

        // Punto a 
        Empleado e1 = new Empleado("Nombre1", "Apellido1", 40);
        Empleado e2 = new Empleado("Nombre2", "Apellido2", 40);
        Empleado e3 = new Empleado("Nombre3", "Apellido3", 40);
        Empleado e4 = new Empleado("Nombre4", "Apellido4", 40);
        Empleado e5 = new Empleado("Nombre5", "Apellido5", 40);
        Empleado e6 = new Empleado("Nombre6", "Apellido6", 40);
        
        // Punto b
        ArrayList losEmpleados = new ArrayList();
        losEmpleados.add(e1);
        losEmpleados.add(e2);
        losEmpleados.add(e3);
        losEmpleados.add(e4);
        losEmpleados.add(e5);
        losEmpleados.add(e6);
        
        // Punto c
        System.out.println("");
        System.out.println("Lista de empleados: ");
        informarDatosDeEmpleados(losEmpleados);
        
        System.out.println("");
        
        // Punto d
        System.out.println("losEmpleados tiene: " + losEmpleados.size() + " entradas");
        
        System.out.println("");
        
        System.out.println("Lista de Empleados menores de 30: ");
        // Punto e
        informarDatosDeEmpleados(obtenerDatosDeEmpleadosMenosDe30(losEmpleados));
        
    }

    public static void informarDatosDeEmpleados(ArrayList losEmpleados) {
        for(int i = 0; i < losEmpleados.size(); i++) {
            Empleado prtEmpleado = (Empleado) losEmpleados.get(i);
            System.out.println(prtEmpleado.getPrtNombre());
        }
    }
    
    public static ArrayList obtenerDatosDeEmpleadosMenosDe30(ArrayList losEmpleados) {
        ArrayList al = new ArrayList();
        for(int i = 0; i < losEmpleados.size(); i++) {
            Empleado prtEmpleado = (Empleado) losEmpleados.get(i);
            if (prtEmpleado.getEdad() < 30) {
                al.add(losEmpleados.get(i));
            }
        }
        return al;
    }
}
