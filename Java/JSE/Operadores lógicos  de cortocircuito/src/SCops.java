// Ilustra los operadores de cortocircuito
public class SCops {
	public static void main(String[] args) {
		int n,d,q;
		
		n = 10;
		d = 2;
		
		if(d !=0 && (n % d) == 0)
			System.out.println(d + " es factor de " + n);
		
		d = 0; // establecer d a cero
		
		// Como d es cero, el segundo operando no se evalúa
		if(d !=0 && (n % d) == 0) //El operador de cortocircuito evita la división por cero
			System.out.println(d + " es factor de " + n);
		
		/*
		 * Intentar lo mismo sin el operadorde cortocircuito
		 * Se produce un error de division por cero
		 */
		if(d !=0 & (n % d) == 0) // Evaluar ambas expresiones y permitir la división por cero
			System.out.println(d + " es factor de " + n);
	}
}
