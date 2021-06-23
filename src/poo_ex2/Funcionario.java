package poo_ex2;

public class Funcionario {
	
	public String nome;
	public double salarioBruto;
	public double imposto;
	public double porcent;
	
	
	public double calcularLiquido () {
		
		double salarioLiquido = salarioBruto - imposto;
		double aumento = (porcent/100)*salarioBruto;
		return salarioLiquido + aumento;				
	}
	
	
	public String toString() {
		
		String employee = (
				"Funcionário: " + nome + 
				", Salário líquido: R$" + calcularLiquido());
		
		return employee;
		
	}

}
