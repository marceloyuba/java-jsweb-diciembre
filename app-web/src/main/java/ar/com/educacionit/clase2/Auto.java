package ar.com.educacionit.clase2;

public class Auto {

	//atributos
	private int anio;
	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public long getChasis() {
		return chasis;
	}

	public void setChasis(long chasis) {
		this.chasis = chasis;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public float getVelocidadActual() {
		return velocidadActual;
	}

	public void setVelocidadActual(float velocidadActual) {
		this.velocidadActual = velocidadActual;
	}

	public float getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(float velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public boolean isPuedaAcelerar() {
		return puedaAcelerar;
	}

	public void setPuedaAcelerar(boolean puedaAcelerar) {
		this.puedaAcelerar = puedaAcelerar;
	}

	public float getCombustible() {
		return combustible;
	}

	public void setCombustible(float combustible) {
		this.combustible = combustible;
	}

	public float getLitros() {
		return litros;
	}

	public void setLitros(float litros) {
		this.litros = litros;
	}

	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}
	private String color;
	private long chasis;
	private String patente;
	private boolean encendido;
	private float velocidadActual;
	private float velocidadMaxima;
	private boolean puedaAcelerar;
	private float combustible;
	private float litros;
	
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
