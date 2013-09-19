package clase4.ejercicio1;

public class Programa {

	public static void main(String[] args) {
		
		Zoologico zoo1 = new Zoologico();
		Zoologico zoo2 = new Zoologico();
		Zoologico zoo3 = new Zoologico();
		
		System.out.println("Zoologico 1: ");
//		zoo1.abrir();
		zoo1.alimentarAnimales(125);
		zoo1.cerrar();
		
		System.out.println("Zoologico 2: ");
		
		zoo2.abrir();
		zoo2.alimentarAnimales(300);
		zoo2.cerrar();
		
		System.out.println("Zoologico 3: ");
		
		zoo3.abrir();
		zoo3.alimentarAnimales(100);
		zoo3.cerrar();

	}

}
