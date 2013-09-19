package clase4.ejercicio1;

public class Cuidador extends Persona {

	private int cantidadDeRaciones;
	
	public Cuidador(int unaCantidadDeRaciones) {
		
		cantidadDeRaciones = unaCantidadDeRaciones;
		
	}
	
	
	public void alimentarAnimales() {

		int necesarias = Zoologico.RACIONES_POR_ANIMAL* Zoologico.CANTIDAD_ANIMALES;
		int diferencia = necesarias - this.cantidadDeRaciones;
		
		if (diferencia > 0) {
			System.out.println("....:: ATENCION ::.... No alcanzan las raciones");
		} else {
			System.out.println("....:: OK ::....");
		}
		
		System.out.println("Recibidas: " + this.cantidadDeRaciones + " Necesarias: " + necesarias);
	}
	
}
