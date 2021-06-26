package construtures_sobrecarga_encapsulamento;

public class Banco {
	
	private int conta;
	private String name;
	private double saldo;
	private static final double taxa = 5.00; 
	
	//construtores
	
	public Banco(int conta, String name) {
		this.conta = conta;
		this.name = name;
	}

	public Banco(int conta, String name, double depositoInicial) {
		this.conta = conta;
		this.name = name;
		depositarValor(depositoInicial); //para melhor manuten��o caso mude depois 
	}
	
		//get and setters

		public int getConta() {
			return conta;
		}
	
		public String getName() {
			return name;
		}
	
		public void setName(String name) {
			this.name = name;
		}
		
		public double getSaldo() {
			return saldo;
		}
		
		
	//transa��es
		
	public double depositarValor(double deposito) {
		return saldo+= deposito;
	}
	
	public double sacarValor(double saque) {
		return saldo-= (saque + taxa);
	}
	
	//dados
	
	public String toString() {
		
		String Dados = (
				"Conta: " + conta
				+ ", Titular: " + name
				+ ", Saldo: R$" + saldo);
		
		return Dados; 
		
	} 
	

}
