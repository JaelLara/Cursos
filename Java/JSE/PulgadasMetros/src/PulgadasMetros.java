/*
 * Conversor de pulagadas a metros
 */
public class PulgadasMetros {
	public static void main(String[] args) {
		int pulgadas, contador;
		double metros;
		
		contador = 0;
		
		for(pulgadas = 1; pulgadas <= 100; pulgadas++){
			metros = pulgadas / 39.37;
			contador++;
			
			System.out.println(pulgadas + " pulgadas equivalen a " + metros +" metros");
			
			if(contador == 12){
				System.out.println();
				contador = 0;
			}
			
		}
	}

}
