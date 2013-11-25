
public class CuentaClave extends Cuenta {
	private int clave = 0;
	
	public CuentaClave(int clave){
		super();
		this.setClave(clave);
	}
	
	public CuentaClave(int clave, float saldo){
		super(saldo);
		this.setClave(clave);
	}

	public int getClave() {
		return clave;
	}

	public void setClave(int clave) {
		this.clave = clave;
	}
	
	@Override
	public void extraer(float importe) {
		if(importe < super.getSaldo()){
			super.extraer(importe);
		}
	}	
}
