package poo_ex1;

public class Rectangle {
	
	public double altura;
	public double largura;
	
	
	public double calcularArea() {
		
		double area = altura * largura;
		return area;
	}

	public double calcularPerimetro () {
		
		double perimetro = altura + largura + altura + largura;
		return perimetro;
	}
	
	public double calcularDiagonal() {
		
		double diagonal = Math.sqrt(altura * altura + largura * largura);
		return diagonal;
	}
	
}
