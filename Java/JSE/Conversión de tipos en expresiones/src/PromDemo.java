//¡Promoción sorpresa!
public class PromDemo {
	public static void main(String[] args) {
		byte b;
		int i;
		
		b = 10;
		i = b * b; // De acuerdo, no se necesita conversión
		
		b = 10;
		b = (byte) (b * b); //¡Conversión necesaria!
		
		System.out.println("i y b: " + i + " " + b);
	}

}
