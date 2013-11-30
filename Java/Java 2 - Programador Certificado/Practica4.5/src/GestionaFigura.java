import java.util.Scanner;


public class GestionaFigura {

	private static Scanner sc = null;
	private static int opcion = 0; 
	private static boolean  fin = false;
	
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		
		System.out.println("Aplicaci�n Gesti�n Figuras");
				
		for(;;){
						
			System.out.println("Escoja una opci�n del menu: ");
			System.out.println("1 - Crear Triangulo");
			System.out.println("2 - Crear C�rculo");
			System.out.println("3 - Crear Rect�ngulo");
			System.out.println("4 - Salir");
			
			System.out.print("Opci�n escojida: ");
			opcion = sc.nextInt();
			
			switch(opcion){
				case 1:
					mostrar(new Triangulo("marron", 5,6));
					break;
				case 2:
					mostrar(new Circulo("azul", 5));
					break;
				case 3:
					mostrar(new Rectangulo("verde", 5,6));
					break;
				case 4:
					System.out.println("Fin Programa");
					fin = true;
					break;
				default:
					System.out.println("No es una opci�n valida");
					break;
			}
			if(fin){
				break;
			}
			System.out.println();
		}
	}
	
	private static void mostrar(Figura f){
		System.out.println("El area de la figura es: " + f.area());
		System.out.println("El color de la figura es: " + f.getColor());
	}

}
