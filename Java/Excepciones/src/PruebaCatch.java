
public class PruebaCatch {

	public static void main(String[] args) {
		try{
			int s = 4/0;
			System.out.println("El programa sigue");
		}
		catch(ArithmeticException e){
			System.out.println("División por 0");
		}
		catch(Exception e){
			System.out.println("Excepción General");
		}
		System.out.println("Final del main");
	}

}
