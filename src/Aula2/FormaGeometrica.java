package Aula2;

public abstract class FormaGeometrica {

	public abstract float calcularArea();
	
	public static void mostrar(FormaGeometrica forma) {
		float resultado = forma.calcularArea();
		System.out.println("Area calculada: "+resultado);
	}
}
