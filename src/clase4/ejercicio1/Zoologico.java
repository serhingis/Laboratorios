package clase4.ejercicio1;

public class Zoologico {

	public static final int CANTIDAD_ANIMALES = 25;
	public static final int RACIONES_POR_ANIMAL = 5;
	
	private boolean abierto;
	
	public void abrir() {
		this.abierto = true;
	}
	
	public void alimentarAnimales(int unaCantidadDeRaciones) {
		
		if (!estaAbierto()) {
			System.out.println("ERROR: Zoologico.alimentarAnimales() - Abra en Zoo antes de alimentar a los animales");
			return;
		}
		Cuidador cuidador = new Cuidador(unaCantidadDeRaciones);
		
		cuidador.alimentarAnimales();
		
	}
	
	public void cerrar() {
		
		if (!estaAbierto()) {
			System.out.println("ERROR: Zoologico.cerrar() - El Zoo no está abierto");
			return;
		}
		
		this.abierto = false;
	}
	
	public boolean estaAbierto() {
		return this.abierto;
	}
	
}
