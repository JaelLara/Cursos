//�Promoci�n sorpresa!
public class PromDemo {
	public static void main(String[] args) {
		byte b;
		int i;
		
		b = 10;
		i = b * b; // De acuerdo, no se necesita conversi�n
		
		b = 10;
		b = (byte) (b * b); //�Conversi�n necesaria!
		
		System.out.println("i y b: " + i + " " + b);
	}

}
