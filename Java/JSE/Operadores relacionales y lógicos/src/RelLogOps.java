// Ilustra los operadores relacionales y l�gicos
public class RelLogOps {
	public static void main(String[] args) {
		int i,j;
		boolean b1, b2;
		
		i = 10;
		j = 11;
		
		if(i < j) System.out.println("i < j");
		if(i <= j) System.out.println("i <= j");
		if(i != j) System.out.println("i != j");
		if(i == j) System.out.println("No se tiene que ejecutar");
		if(i >= j) System.out.println("No se tiene que ejecutar");
		if(i > j) System.out.println("No se tiene que ejecutar");
		
		b1 = true;
		b2 = false;
		
		if(b1 & b2) System.out.println("No se tiene que ejecutar");
		if(!(b1 & b2)) System.out.println("!(b1 & b2) es verdad");
		if(b1 | b2) System.out.println("b1 | b2 es verdad");
		if(b1 ^ b2) System.out.println("b1 ^ b2 es verdad");
	}

}
