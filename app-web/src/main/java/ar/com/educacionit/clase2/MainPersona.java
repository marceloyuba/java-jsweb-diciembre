package ar.com.educacionit.clase2;

public class MainPersona {

	public static void main(String[] args) {
	
		// creo un objeto de la clase persona usando el constructor x defecto
		Persona carlos = new Persona("Carlos", "Lopez", 1, "14556525", 78);
		Persona ana = new Persona("Ana", "Manera",1,"302332223", 17);
		System.out.println(ana.saludar(true));
		ana.cambiarNombre("Carla");
		
		//asignar un valor al atributo nombre del objeto carlos, de la clase persona
		
		//ejecutar/invocar un metodo del objeto carlos
		String saludoDeCarlos = carlos.saludar();
		
		System.out.println(saludoDeCarlos);
		System.out.println(ana.saludar(false));
		
		//invocar el atributo de clases cantidadDeOjos de la clase persona
		System.out.println(carlos.getnombre() + " - tiene " + Persona.cantidadDeOjos + " ojos");
		
		//invocar el atributo de instancia cantidadDeOjos de la clase persona
		System.out.println(carlos.getnombre() + " - tiene " + carlos.cantidadDeOjos + " ojos");

		carlos.informar();
		ana.informar();
		
		
		
		
		
		
		
		
		
		
	}

}
