
public class PruebaFinally {

	public static void main(String[] args) {
		try{
			int s = 4/0;
			System.out.println("El programa sigue");
		}
		catch(ArithmeticException e){
			System.out.println("Divisi�n por 0");
		}
		finally{
			System.out.println("Excepci�n finally");
		}
		System.out.println("Final del main");
	}

}
