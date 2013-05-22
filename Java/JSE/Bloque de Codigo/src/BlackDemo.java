/*
 * Uso de un bloque de código
 */
public class BlackDemo {
	public static void main(String[] args) {
		double i, j, d;
		
		i = 5;
		j = 10;
		
		//el destino de esta intrucción if es un bloque
		if(i != 0){
			System.out.println("i no es igual a zero");
			
			d = j / i;
			
			System.out.println("j / i es " + d);
		}
	}

}
