// Ilustra el �mbito de bloques
public class AmbitoDemo {
	public static void main(String[] args) {
		int x; //conocido paratodo el c�digo main
		
		x = 10;
		
		if(x == 10){// iniciar un nuevo �mbito
			int y = 20; // s�lo esconocido para este bloque
			
			//x e y se conocen aqu�
			
			System.out.println("x e y: " + x + " " + y);
			
			x = y * 2;
		}
		
		 y = 100; //�Error! y es desconocido aqu�.
		 
		 // x sigue siendo conocido
		 System.out.println("x es: " + x);
	}
}
