// Juego adivinar letras, tercera versión
public class Guess3 {
	public static void main(String[] args) throws java.io.IOException {
		char ch, answer = 'K';
		
		System.out.println("I'm thinkg of a letter between A and Z.");
		System.out.println("Can you guess it: ");
		
		ch = (char) System.in.read(); // obtener char
		
		if(ch == answer) System.out.println("** Right **");
		else{
			System.out.println("...Sorry, you're wrong");
			//if aninado
			if(ch < answer) System.out.println("Too low");
			else System.out.println("Too high");
		}
	}

}
