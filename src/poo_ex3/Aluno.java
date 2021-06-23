package poo_ex3;

public class Aluno {
	
	public String nome;
	public double n1;
	public double n2;
	public double n3;
	public double media;
	
	public double calcularMedia() {
		media = n1 + n2 + n3;
		return media;
	}
	
	public double pontosFaltantes() {
		
		double faltantes = (60.00 - media);
		return faltantes;	
		
		
	}
	
	
	

}
