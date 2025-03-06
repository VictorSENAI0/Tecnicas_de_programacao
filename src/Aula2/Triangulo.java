package Aula2;

public class Triangulo extends FormaGeometrica {

	private float base;
	private float altura;
	
	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public Triangulo(float base, float altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	@Override
	public float calcularArea() {
		return (base*altura)/2f;
	}

	@Override
	public String toString() {
		return "Triangulo [base=" + base + ", altura=" + altura + ", calcularArea()=" + calcularArea() + "]";
	}


}
