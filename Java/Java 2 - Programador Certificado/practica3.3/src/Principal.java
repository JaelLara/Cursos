import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Principal {

	public static void main(String[] args) throws IOException{
		String option;
		boolean salir = false;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Pila<String> pila = new Pila<String>();
		
		while(!salir){	
			System.out.println("Que quieres hacer: ");
			System.out.println("1 - Añadir cadena");
			System.out.println("2 - Quitar cadena");
			System.out.println("3 - Mostrar todo");
			System.out.println("4 - Salir");
			System.out.print("Opción elegida: ");
			option = bf.readLine();
			System.out.println();
			switch(option){
				case "1":
					System.out.println("Introducir cadena");
					pila.agregar(bf.readLine());
					break;
				case "2":
					System.out.println("Ultimo elemento borrado");
					pila.quitar();
					break;
				case "3":
					System.out.println("Elementos de la pila:");
					for(int i = 0; i < pila.total(); i++){
						System.out.println(pila.obtener(i));
					}
					break;
				case "4":
					System.out.println("Salir");
					salir = true;
					break;
				default:
					System.out.println("Opcion erronea");
					break;
			}
		}
	}

}
