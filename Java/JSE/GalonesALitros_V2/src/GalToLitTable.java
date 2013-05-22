/*
 * Este programa muestra una tabla de 
 * conversión de galones a litros
 */
public class GalToLitTable {
	public static void main(String[] args) {
		double galones, litros;
		int contador;
		
		galones = 1;
		for(contador = 0; contador < 100; contador++){
			
			litros = galones * 3.7854; //convertir a litros
			
			System.out.println(galones + " galones son: " + litros + " litros");
			
			if(galones%10 == 0){
				System.out.println();
			}
			
			galones++;
		}
	}

}
