/*
 * Uso de if
 */
public class IfDemo {
	public static void main(String[] args) {
		int a,b,c;
		
		a = 2;
		b = 3;
		
		if(a < b) System.out.println("a es menor que b");
		
		//no muestra nada
		if(a == b) System.out.println("No tiene que ver esto");
		
		System.out.println();
		
		c = a - b; // c contiene -1
		
		System.out.println("c contiene -1");
		
		if(c >= 0) System.out.println("c no es negativo");
		
		if(c <= 0) System.out.println("c es negativo");
		
		System.out.println();
		
		c = b - a; // c ahora contiene 1
		
		System.out.println("c ahora contiene 1");
		
		if(c >= 0) System.out.println("c no es negativo");
		
		if(c <= 0) System.out.println("c es negativo");
		
	}

}
