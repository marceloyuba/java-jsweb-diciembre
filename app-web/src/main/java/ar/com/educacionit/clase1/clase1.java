package ar.com.educacionit.clase1;

public class clase1 {

	public static void main(String[] args) {
	
		//variables
		
		//numericas
		// byte < short < int < long < float < double
		
		//boolean : true false
		//char 'a'
		//String nombre = "carlos";
		
		// operadores
		//++ -- *= -=
		//logicos and &&; or ||; xor ; nor !
		//aritmeticos +*/-
		//asignacion =
		//relacionales == != < >
		// estructuras if, for, while, do, while
		
		
		//3 notas menor, mayor, pmin, pmay, promedio
		//suma de los menores, resta mayores
		
		int nota1;
		int nota2;
		int nota3;
		int menor = 0;
		int mayor = 0;
		int sumaMenores = 0;
		int restaMenores = 0;
		boolean iguales;
		byte pMenor = 0;
		byte pMayor = 0;
		float promedios;
		
		nota1 = 5;
		nota2 = 8;
		nota3 = 9;
		
		//menor
		
		if( (nota1 < nota2) & (nota1 < nota3) ) {
			menor = nota1;
			pMenor = 1;
			
		
		}
		if ( nota2 < nota1 && nota2 < nota3 ) {
			menor = nota2;
			pMenor = 2;
		}
			
		if ( nota3 < nota1 && nota3 < nota2 ) {
			menor = nota3;
			pMenor = 3;
		}
			//mayor
		
		
			if( (nota1 > nota2) & (nota1 > nota3) ) {
				mayor = nota1;
				pMayor = 1;
			
			}
			if ( nota2 > nota1 && nota2 > nota3 ) {
				pMayor = 2;
			}
				
			if ( nota3 > nota1 && nota3 > nota2 ) {
				pMayor = 3;
			}	
		//promedios
			
			promedios = nota1+nota2+nota3 / 3;
			sumaMenores = menor;
			restaMenores = mayor;
		
		//iguales
			
			iguales = (sumaMenores ==restaMenores);
			
		
		System.err.println(menor);		
		System.out.println(pMenor);
		System.out.println(mayor);
		System.out.println(pMayor);
		System.out.println(promedios);
		System.out.println(iguales);
		
	}

}
