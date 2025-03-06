package Aula2;

public class Quadrado extends FormaGeometrica {

	private float lado;
	
	
	public float getLado() {
		return lado;
	}


	public void setLado(float lado) {
		this.lado = lado;
	}


	public Quadrado(float lado) {
		super();
		this.lado = lado;
	}


	@Override
	public float calcularArea() {
		return lado*lado;
	}


	@Override
	public String toString() {
		return "Quadrado [lado=" + lado + ", calcularArea()=" + calcularArea() + "]";
	}

	
}
