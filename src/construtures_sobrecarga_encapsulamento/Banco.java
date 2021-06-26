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

	public Banco(int conta, String name, double saldo) {
		this.conta = conta;
		this.name = name;
		this.saldo = saldo;
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
		
		
	//transações
		
	public double depositarValor(double deposito) {
		return saldo+= deposito;
	}
	
	public double sacarValor(double saque) {
		return saldo-= (saque + taxa);
	}
	
	

}
