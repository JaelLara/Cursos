// Ilustra el ámbito de bloques
public class AmbitoDemo {
	public static void main(String[] args) {
		int x; //conocido paratodo el código main
		
		x = 10;
		
		if(x == 10){// iniciar un nuevo ámbito
			int y = 20; // sólo esconocido para este bloque
			
			//x e y se conocen aquí
			
			System.out.println("x e y: " + x + " " + y);
			
			x = y * 2;
		}
		
		 y = 100; //¡Error! y es desconocido aquí.
		 
		 // x sigue siendo conocido
		 System.out.println("x es: " + x);
	}
}
