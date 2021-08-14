//Fazer um programa para ler os dados de uma conta bancária e depois realizar um 
//saque nesta conta bancária, mostrando o novo saldo. Um saque não pode ocorrer 
//ou se não houver saldo na conta, ou se o valor do saque for superior ao limite de 
//saque da conta. 

package tratamento_de_excecoes;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Entre com os dados da conta: ");
		
		System.out.println("Número: ");
		int number = sc.nextInt();
		
		System.out.println("Titular: ");
		String holder = sc.next();
		
		System.out.println("Saldo inicial: ");
		double balance = sc.nextDouble();
		
		System.out.println("Limite de saque: ");
		double withdrawLimit = sc.nextDouble();
		
		Account account = new Account(number, holder, balance, withdrawLimit);
		
		System.out.println("Quantia do saque: ");
		double amount = sc.nextDouble();
		
		try {
			
			account.sacarValor(amount);
			System.out.println("Novo saldo: R$" + account.getBalance());
			
			
		}		
		
		catch (BusinessException e) {
			
			System.out.println("Erro de saque: " + e.getMessage());
			
		}
		
		catch (Exception e) {
			System.out.println("Erro inesperado. " + e);
		}
		
		
		
		
		
		
		
		sc.close();

	}

}
