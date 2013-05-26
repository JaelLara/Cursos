// Programa que nos muestra los numeros primos del 2 al 100
public class NumerosPrimos {
	public static void main(String[] args) {
		int i, j;
		boolean primo;
		for(i = 2; i <= 100; i++){
			primo = true;
			for(j = 2; j < i && primo == true; j++){
				if(i % j == 0){
					primo = false;
				}
			}
			if(primo){
				System.out.println( i + " es un numero primo");
			}
		}
	}

}
