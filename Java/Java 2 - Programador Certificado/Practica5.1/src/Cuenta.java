
public class Cuenta {
	
	//Variable con el saldo total de la cuenta
	private float saldo; 
	
	//Constructor que inicializa la cuenta con saldo 0
	public Cuenta(){
		saldo = 0;
	}
	
	//Constructir que inicializa la cuenta con un saldo minimo
	public Cuenta (float saldo){
		this.saldo = saldo;
	}
	
	//Metodo que un importe al saldo actual de la cuenta
	public void ingresar(float importe){
		saldo += importe;
	}
	
	//Metodo para restar un importe al saldo, puede ser que el saldo sea negativo
	public void extraer(float importe) throws SaldoInsuficienteException{
		if(importe < saldo){
			saldo -= importe;
		}
		else{
			throw new SaldoInsuficienteException("No hay saldo suficiente");
		}
	}
	
	//Metodo que devuelve el saldo actual de la cuenta
	public float getSaldo(){
		return saldo;
	}
	
}
