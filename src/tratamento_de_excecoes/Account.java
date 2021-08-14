package tratamento_de_excecoes;

public class Account {
	
	private int number;
	private String holder;
	private double balance;
	private double withdrawLimit;
	
	public Account() {
		
	}

	public Account(int number, String holder, double balance, double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;				
	}

		public int getNumber() {
			return number;
		}
	
		public void setNumber(int number) {
			this.number = number;
		}
	
		public String getHolder() {
			return holder;
		}
	
		public void setHolder(String holder) {
			this.holder = holder;
		}
	
		public double getBalance() {
			return balance;
		}
	
		public double getWithdrawLimit() {
			return withdrawLimit;
		}
	
		public void setWithdrawLimit(double withdrawLimit) {
			this.withdrawLimit = withdrawLimit;
		}
	
	
		public double depositarValor(double amount) {
			return balance+= amount;
		}
		
		public double sacarValor(double amount) throws BusinessException {
			
			if (amount > getBalance()) {
				throw new BusinessException("Não há saldo suficiente na sua conta.");
			}
			
			if (amount > getWithdrawLimit()) {
				throw new BusinessException("O valor informado é maior do que o limite da conta.");
			}			
			
			return balance-= amount;
		}
	
		

}
