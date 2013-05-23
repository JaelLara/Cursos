// Demostrar valores boolean
public class BoolDemo {
	public static void main(String[] args) {
		boolean b;
		
		b = false;
		
		System.out.println("b es " + b);
		
		b = true;
		
		System.out.println("b es " + b);
		
		//un valor bolean puede controlar la intrucción if
		if(b) System.out.println("Esto se ejecuta");
		
		b = false;
		
		if(b) System.out.println("Esto no se ejecuta");
		
		// el resultado de un operador relacional es un valor boolean.
		System.out.println("10 > 9 es " + (10 > 9));
	}

}
