
public class Circulo extends Figura {
	private int radio;
	public Circulo(String color, int radio) {
		super(color);
		this.setRadio(radio);
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI*radio*radio;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

}
