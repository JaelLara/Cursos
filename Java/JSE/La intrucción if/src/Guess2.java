import java.io.IOException;

// Juego de adivinar letras, segunda versión
public class Guess2 {
	public static void main(String[] args) throws  IOException{
		char ch, answer = 'K';
		
		System.out.println("I'm thinkg of a letter between A and Z.");
		System.out.println("Can you guess it: ");
		
		ch = (char) System.in.read(); // obtener char
		
		if(ch == answer) System.out.println("** Right **");
		else System.out.println("...Sorry, you're wrong");
	}
}
