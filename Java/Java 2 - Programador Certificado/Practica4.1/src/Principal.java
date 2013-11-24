import java.util.Enumeration;
import java.util.Scanner;


public class Principal {
	private static String dni = null;
	private static String nom = null;
	private static long tel = 0;
	private static Scanner sc = null;
	private static int opcion = 0; 
	private static boolean  fin = false;
	private static Agenda agenda = null;
	private static Persona persona = null;
	
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		agenda = new Agenda();
		
		System.out.println("Aplicación Agenda Persona");
				
		for(;;){
						
			System.out.println("Escoja una opción del menu: ");
			System.out.println("1 - Agregar persona");
			System.out.println("2 - Buscar persona");
			System.out.println("3 - Eliminar persona");
			System.out.println("4 - Mostrar todas las personas");
			System.out.println("5 - Salir");
			
			System.out.print("Opción escojida: ");
			opcion = sc.nextInt();
			
			switch(opcion){
				case 1:
					System.out.println("Introduzca los datos de la nueva persona");
					obtenerDatos();
					if(!agenda.agregar(dni, nom, tel)){
						System.out.println("Ya existe el DNI introducido");
					}
					else{
						System.out.println("Nueva persona introducida");
					}
					break;
				case 2:
					System.out.println("Introduzca el Dni a buscar: ");
					obtenerDni();
					persona = agenda.recuperar(dni);
					recuperarPersona(persona);
					break;
				case 3:
					System.out.println("Introduzca el Dni a eliminar: ");
					obtenerDni();
					agenda.eliminar(dni);
					break;
				case 4:
					System.out.println("Las personas que figuran en la agenda son:");
					Enumeration<Persona> e = agenda.total();
					while(e.hasMoreElements()){
						persona = e.nextElement();
						recuperarPersona(persona);						
					}
					break;
				case 5:
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

	private static void obtenerDatos(){
		System.out.println("Introduzca Dni: ");
		dni = sc.next();
		System.out.println("Introduzca Nombre: ");
		nom = sc.next();
		System.out.println("Introduzca Telefono: ");
		tel = sc.nextLong();
		
	}
	
	private static void obtenerDni(){
		dni = sc.next();
	}

	private static void recuperarPersona(Persona persona){
		System.out.println("Dni: " + persona.getDni());
		System.out.println("Nombre: " + persona.getNom());
		System.out.println("Telefono: " + persona.getTel());
	}
	
}
