/*
 * Este programa ilustra las diferencias entre int y double
 */
public class Example3 {
	public static void main(String[] args) {
		int var; //declara una variable int
		double x; //declara una variable de coma flotante
		
		var = 10; //asigna el valor 10 a var
		
		x = 10.0; //asigna el valor 10.0 a x
		
		System.out.println("Valor original de var: " + var);
		System.out.println("Valor original de x: " + x);
		System.out.println(); //imprimir una linea en blanco
		
		//dividir ambas por 4
		
		var = var /4;
		x = x / 4;
		
		System.out.println("var despues division: " + var);
		System.out.println("x despues division: " + x);

	}

}
