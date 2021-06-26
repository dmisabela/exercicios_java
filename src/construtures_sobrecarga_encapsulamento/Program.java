//Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta, o nome do
//titular da conta, e o valor de depósito inicial que o titular depositou ao abrir a conta. Este valor de depósito
//inicial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar no momento de abrir sua
//conta, o depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero.

//Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado. Já
//o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, por
//exemplo).

//Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger
//isso. O saldo só aumenta por meio de depósitos, e só diminui por meio de saques. Para cada saque
//realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo não for
//suficiente para realizar o saque e/ou pagar a taxa.

//Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não
//informado o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre
//mostrando os dados da conta após cada operação.

package construtures_sobrecarga_encapsulamento;

import java.util.Locale;
import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);		
		Scanner sc  = new Scanner(System.in);
		
		Banco banco; //declara antes
		
		System.out.println("Entre com o número da conta: ");
		int conta = sc.nextInt();
		
		System.out.println("Qual seu nome completo?: ");
		String nome = sc.next();		
	
				
		System.out.println("Você irá fazer um depósito inicial? (S/N) ");
		char opcao = sc.next().charAt(0);
	
		
		if (opcao == 'S') {
			System.out.println("Qual valor do depósito?: ");
			double depositoInicial = sc.nextDouble();	
			banco = new Banco(conta, nome, depositoInicial); //sobrecarga	
		}	
		
		else {
			banco = new Banco(conta, nome); //sobrecarga	
		}
				
		System.out.println("Dados: " + banco);
		
		System.out.println("Entre com um valor para depósito: ");
		double deposito = sc.nextDouble();	
		banco.depositarValor(deposito);
		
		System.out.println("Dados atualizados: " + banco);
		
		System.out.println("Entre com um valor para saque: ");
		double saque = sc.nextDouble();	
		banco.sacarValor(saque);
		
		System.out.println("Dados atualizados: " + banco);		
		
		sc.close();

	}

}
