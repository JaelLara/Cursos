// Juego de adivinar letras.
public class Guess {
	public static void main(String[] args) throws java.io.IOException{
		char ch, respuesta = 'K';
		
		System.out.println("Pienso que es un letra entre la A y la Z");
		System.out.print("La puedes adivinar: ");
		
		ch = (char) System.in.read(); // leer un char desde teclado
		
		if(ch == respuesta) System.out.println("** Correcto **");
	}

}
