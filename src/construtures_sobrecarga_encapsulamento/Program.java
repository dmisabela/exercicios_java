//Em um banco, para se cadastrar uma conta banc�ria, � necess�rio informar o n�mero da conta, o nome do
//titular da conta, e o valor de dep�sito inicial que o titular depositou ao abrir a conta. Este valor de dep�sito
//inicial, entretanto, � opcional, ou seja: se o titular n�o tiver dinheiro a depositar no momento de abrir sua
//conta, o dep�sito inicial n�o ser� feito e o saldo inicial da conta ser�, naturalmente, zero.

//Importante: uma vez que uma conta banc�ria foi aberta, o n�mero da conta nunca poder� ser alterado. J�
//o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasi�o de casamento, por
//exemplo).

//Por fim, o saldo da conta n�o pode ser alterado livremente. � preciso haver um mecanismo para proteger
//isso. O saldo s� aumenta por meio de dep�sitos, e s� diminui por meio de saques. Para cada saque
//realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo n�o for
//suficiente para realizar o saque e/ou pagar a taxa.

//Voc� deve fazer um programa que realize o cadastro de uma conta, dando op��o para que seja ou n�o
//informado o valor de dep�sito inicial. Em seguida, realizar um dep�sito e depois um saque, sempre
//mostrando os dados da conta ap�s cada opera��o.

package construtures_sobrecarga_encapsulamento;

import java.util.Locale;
import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);		
		Scanner sc  = new Scanner(System.in);
		
		Banco banco; //declara antes
		
		System.out.println("Entre com o n�mero da conta: ");
		int conta = sc.nextInt();
		
		System.out.println("Qual seu nome completo?: ");
		String nome = sc.next();		
	
				
		System.out.println("Voc� ir� fazer um dep�sito inicial? (S/N) ");
		char opcao = sc.next().charAt(0);
	
		
		if (opcao == 'S') {
			System.out.println("Qual valor do dep�sito?: ");
			double depositoInicial = sc.nextDouble();	
			banco = new Banco(conta, nome, depositoInicial); //sobrecarga	
		}	
		
		else {
			banco = new Banco(conta, nome); //sobrecarga	
		}
				
		System.out.println("Dados: " + banco);
		
		System.out.println("Entre com um valor para dep�sito: ");
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
