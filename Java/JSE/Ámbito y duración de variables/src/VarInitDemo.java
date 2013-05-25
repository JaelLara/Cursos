// Ilustra la duración de una variable
public class VarInitDemo {
	public static void main(String[] args) {
		int x;
		
		for (x = 0; x < 3; x++){
			int y = -1; //se inicializa cada vez que se entra al bloque
			System.out.println("y es: " + y); //siempre imprime -1
			y = 100;
			System.out.println("y ahora es: " + y);
		}
	}
}
