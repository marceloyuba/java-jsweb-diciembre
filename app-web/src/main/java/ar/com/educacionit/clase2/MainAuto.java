package ar.com.educacionit.clase2;

public class MainAuto{

	public static void main(String[] args) {
	
	Auto clioRojo = new Auto("rojo", 12345, 10);
    
    clioRojo.arrancar();
    clioRojo.cargarCombustible(5);	
	
    while(clioRojo.puedaAcelerar()) {
    clioRojo.acelerar(5);
    clioRojo.frenar();
    clioRojo.acelerar(5);
    }
    System.out.println(clioRojo.getVelocidadActual());
	
    clioRojo.apagar();
    
    
    
    
    
    Auto astra = new Auto("negro", 122334);
    
	Auto vento = new Auto("verde", 123366);
	
  
	
		
    	
		
		
		
		
		
		
		
	}

}
