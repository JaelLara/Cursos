// Leer un carácter desde el teclado
public class KbIn {
	public static void main(String[] args) throws java.io.IOException{
		char ch;
		
		System.out.print("Pulsa cualquier tecla seguido de ENTER: ");
		
		ch = (char) System.in.read(); // obtener char
		
		System.out.println("Tu tecla es: " + ch);
	}

}
