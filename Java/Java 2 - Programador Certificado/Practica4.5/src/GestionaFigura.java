import java.util.Scanner;


public class GestionaFigura {

	private static Scanner sc = null;
	private static int opcion = 0; 
	private static boolean  fin = false;
	
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		
		System.out.println("Aplicación Gestión Figuras");
				
		for(;;){
						
			System.out.println("Escoja una opción del menu: ");
			System.out.println("1 - Crear Triangulo");
			System.out.println("2 - Crear Círculo");
			System.out.println("3 - Crear Rectángulo");
			System.out.println("4 - Salir");
			
			System.out.print("Opción escojida: ");
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
					System.out.println("No es una opción valida");
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
