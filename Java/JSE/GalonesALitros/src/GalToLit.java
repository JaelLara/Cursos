/*
 * Este programa convierte galones a litros
 */
public class GalToLit {
	public static void main(String[] args) {
		double galones; //contiene el numero de galones
		double litros; //contiene el numero de litros
		
		galones = 10; //empezamos con 10 galones
		
		litros = galones * 3.7854; //convertir a litros
		
		System.out.println(galones + " galones son: " + litros + " litros");
	}

}
