import java.io.IOException;


public class Principal {

	public static void main(String[] args) throws IOException{
		LecturaNumeros ln = new LecturaNumeros();
		
		int suma = 0;
		for(int i = 0; i < 5; i++){
			suma += ln.readInt("Introduce número");
		}
		
		System.out.println("La suma es " + suma);
	}
}
