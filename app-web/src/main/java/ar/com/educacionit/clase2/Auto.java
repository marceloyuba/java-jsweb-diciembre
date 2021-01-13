package ar.com.educacionit.clase2;

public class Auto {

	//atributos
	int anio;
	String color;
	long chasis;
	String patente;
	boolean encendido;
	float velocidadActual;
	float velocidadMaxima;
	boolean puedaAcelerar;
	float combustible;
	float litros;
	
	//defecto
	
	Auto(){
		this.velocidadMaxima = 10;
	}
	
	//constructor
	Auto(String color, long chasis){
		this.color = color;
		this.chasis = chasis;
		this.velocidadMaxima = 10;
	}
		
		
		
	Auto(String color, long chasis, float velocidadMaxima){
		this.color = color;
		this.chasis = chasis;
		this.velocidadActual = 0;
		this.velocidadMaxima = velocidadMaxima;
	}
	
	//metodos
	
	void patentar(String nuevaPatente){
		this.patente = nuevaPatente;
		System.out.println("Se ha patentado el auto");
		
	}
	
	void arrancar() {
		if(!this.encendido) {
		this.encendido = true;
		}else {
			System.out.println("El auto ya esta encendido");
		}
	}
	boolean isEncendido() {
		return this.encendido;
	}
	boolean hayCombustible() {
		return this.combustible > 0;
	}
	
	void acelerar() {
		if(this.isEncendido() && this.hayCombustible()) {
			if(this.velocidadActual < this.velocidadMaxima) {
				this.velocidadActual++;
				this.combustible--;
			}else {
				System.out.println("Velocidad maxima, no puede acelerar");
			}
		}else {
			System.out.println("Auto apagado, no puede acelerar");
		}
	}
	
	public void acelerar(float fuerza) {
		
		if(this.isEncendido() && this.hayCombustible()) {
			if((this.velocidadActual + fuerza) < this.velocidadMaxima) {
				this.velocidadActual+= fuerza;
				this.combustible-=3;
			}else {
				System.out.println("Velocidad maxima, no puede acelerar");
			}
		}else {
			System.out.println("Auto apagado, no puede acelerar");
		}
	}
	
	
	void frenar() {
		if(this.encendido) {
			if(this.velocidadActual > 0) {
				this.velocidadActual --;
			}else {
				System.out.println("el auto se ha detenido");
				
			}
		}else {
			System.out.println("Auto apagado, no puede acelerar");
		}
	}
	void apagar() {
		if(this.encendido) {
			this.velocidadActual = 0;
			this.encendido = false;
			
		}else {
			System.out.println("Auto apagado");
		}
	}
			
		
	
	
	boolean puedaAcelerar() {
		boolean puedeAcelerar = false;
		if(this.isEncendido() && this.hayCombustible()) {
			puedeAcelerar = this.velocidadActual < this.velocidadMaxima;
		}
		return puedeAcelerar;
	}
	void cargarCombustible(float litros) {
		this.combustible += litros;
	}

	
}
