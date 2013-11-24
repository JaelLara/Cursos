
public class Persona {
	private String dni = null;
	private String nom = null;
	private long tel = 0;
	
	public Persona(String dni, String nom, long tel){
		this.dni = dni;
		this.nom = nom;
		this.tel = tel;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public long getTel() {
		return tel;
	}

	public void setTel(long tel) {
		this.tel = tel;
	}
}
