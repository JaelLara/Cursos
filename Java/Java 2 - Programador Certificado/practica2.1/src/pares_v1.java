
public class pares_v1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		int b = 100;
		int c = 0;
		System.out.print("La suma de los numeros pares entre " + a + " y " + b);
		while(a < b){
			if((a + c) % 2 == 0){
				c += a; 
			}
			a++;
		}
		
		System.out.println(" es: " + c);
	}

}
