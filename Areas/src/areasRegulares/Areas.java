package areasRegulares;

public class Areas {

	public static void main(String[] args) {
		//Programa para calcular areas
		//declarar variables base y altura, asignamos valores.
		int base=5;
		int altura=10;
		// declaramos la variable area y aplicamos la formula del triangulo 
		//base * altura /2
		
		double areaTriangulo = (base * altura) /2;
		
		//imprimir resultados 
		
		System.out.printf("El area del triangulo es %2.f", areaTriangulo);
	}

}
