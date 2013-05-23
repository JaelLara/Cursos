/*
 * Usar el teorema de Potágoras para
 * calcular la longitud de la hipotenusa
 * dadas las longitudes de los dos lados
 * opuestos.
 * 
 */
public class Hipo {
	public static void main(String[] args) {
		double x, y, z;
		
		x = 3;
		y = 4;
		
		z = Math.sqrt(x*x + y*y); //en la invocación de sqrt() se antepone el 
								  //el nombre de la Clase de la que es miembro
		
		System.out.println("La Hipotenusa es : " + z);
	}

}
