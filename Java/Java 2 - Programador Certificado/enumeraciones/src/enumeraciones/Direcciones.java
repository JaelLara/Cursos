package enumeraciones;

public enum Direcciones {
	NORTE(4), SUR(2), ESTE(1), OESTE(3);
	int distancia;
	Direcciones(int d){
		distancia = d;
	}
	
	int getDistancia(){
		return distancia;
	}
}
