
public class pares_v2 {

	public static void main(String[] args) {
		int a = 1, b = 100;
		
		System.out.println("La suma de los numeros pares entre " + a + " y " + b + " es: " + suma(a,b));
	}

	public static int suma(int a, int b){
		int c = 0;
		for(a = 1; a < b; a++){
			c = ((a+c)%2==0)?a+c:c;
		}
		
		return c;
	}
}
