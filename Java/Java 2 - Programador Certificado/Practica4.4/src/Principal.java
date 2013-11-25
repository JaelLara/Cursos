import java.util.Scanner;


public class Principal {

	private static Scanner sc = null;
	private static int opcion = 0; 
	private static boolean  fin = false;
	private static CuentaClave cuenta = null;
	
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		
		System.out.println("Aplicación Cajero Automático");
				
		for(;;){
						
			System.out.println("Escoja una opción del menu: ");
			System.out.println("1 - Crear cuenta vacia");
			System.out.println("2 - Crear cuenta saldo inicial");
			System.out.println("3 - Ingresar dinero");
			System.out.println("4 - Sacar dinero");
			System.out.println("5 - Ver saldo");
			System.out.println("6 - Salir");
			
			System.out.print("Opción escojida: ");
			opcion = sc.nextInt();
			
			switch(opcion){
				case 1:
					if(cuenta == null){
						System.out.print("Escribe la clave de la cuenta: ");
						cuenta = new CuentaClave(sc.nextInt());
						System.out.println("Cuenta creada sin saldo");
						obtenerSaldo(cuenta);
					}
					else{
						System.out.println("Ya hay una cuenta creada");
					}
					break;
				case 2:
					if(cuenta == null){
						System.out.print("Escribe la clave de la cuenta: ");
						int clave = sc.nextInt();
						System.out.print("Introduzca el saldo inicial de la cuenta: ");
						cuenta = new CuentaClave(clave, sc.nextFloat());
						obtenerSaldo(cuenta);
					}
					else{
						System.out.println("Ya hay una cuenta creada");
					}
					break;
				case 3:
					if(cuenta != null){
						System.out.print("Introduzca el importe a añadir a la cuenta: ");
						cuenta.ingresar(sc.nextFloat());
						obtenerSaldo(cuenta);
					}
					else{
						System.out.println("Primero hay que crear una cuenta");
					}
					break;
				case 4:
					if(cuenta != null){
						System.out.print("Introduzca el importe a extraer de la cuenta: ");
						cuenta.extraer(sc.nextFloat());
						obtenerSaldo(cuenta);
					}
					else{
						System.out.println("Primero hay que crear una cuenta");
					}
					break;
				case 5:
					if(cuenta != null){
						obtenerSaldo(cuenta);
					}
					else{
						System.out.println("Primero hay que crear una cuenta");
					}
					break;
				case 6:
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
	
	private static void obtenerSaldo(Cuenta cuenta){
		System.out.println("El saldo actual de la cuenta es: " + cuenta.getSaldo());
	}
}