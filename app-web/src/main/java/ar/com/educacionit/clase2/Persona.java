package ar.com.educacionit.clase2;

public class Persona {

	//atributos de clase
	static int cantidadDeOjos = 2;
	
	//atributos de instancia
	
	private String nombre;
	String apellido;
	int tipoDocumento;
	String numeroDocumento;
	int edad;
	
	//constructor por defecto
	
	Persona () {
		
	}
	
	//constructor definido

	//metodos
	String saludar() {
		String saludo = "Hola soy " + this.nombre + " mucho gusto!!";
		return saludo;
	}
	//sobrecarga de saludar
	public String saludar (boolean gritar) {
		String saludo;
		if(!gritar) {
			return this.saludar();
		}else {
			saludo = "HOLA SOY" + this.nombre + " " +this.apellido + "MUCHO GUSTO!";
		}
		return saludo;
	}
	
	
	
	public Persona(String nombre, String apellido, int tipoDocumento, String numeroDocumento, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
		this.edad = edad;
	}

	void informar() {
		if(edad > 18) {
			System.out.println("Soy " + this.nombre + " " + this.apellido + " " + this.tipoDocumento +" " + this.numeroDocumento + " mayor de edad");
		}
		else {
			System.out.println("Soy " + this.nombre + " " + this.apellido + " " + this.tipoDocumento + " " + this.numeroDocumento + " menor de edad");
		}
	}
	public void cambiarNombre (String nuevoNombre) {
		this.nombre = nuevoNombre;
	}
	public String getnombre() {
		return this.nombre.toUpperCase();
	}
}
