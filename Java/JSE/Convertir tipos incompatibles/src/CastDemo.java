// Ejemplo de conversión
public class CastDemo {
	public static void main(String[] args) {
		
		double x, y;
		byte b;
		int i;
		char ch;
		
		x = 10.0;
		y = 3.0;
		
		i = (int) (x / y); //convertir double a int. Se produce ercorte.
		System.out.println("El resulta de x / y transformado en int es: " + i);
		
		i = 100;
		b= (byte) i; //no se pierde información. byte puede almacenar el valor 100;
		System.out.println("El valor de b es: " + b);
		
		i = 257;
		b = (byte) i; //se pierde información. byte no puede almancenar el valor 257.
		System.out.println("El valor de b es: " + b);
		
		b = 88; //Código ASCII para X
		ch = (char) b; // conversión entre tipos incompatibles.
		System.out.println("ch: " + ch);
		
	}

}
