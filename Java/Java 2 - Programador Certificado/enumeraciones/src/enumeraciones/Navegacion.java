package enumeraciones;

public class Navegacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Barco b = new Barco();
		Direcciones d;
		b.setOrientacion(Direcciones.NORTE);
		d=b.getOrientacion();
		System.out.println("Distancia recorrida: " + d.getDistancia());
	}

}
