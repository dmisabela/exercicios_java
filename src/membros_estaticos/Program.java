//Fa�a um programa para ler a cota��o do d�lar, e depois um valor em d�lares a ser comprado por
//uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos d�lares, considerando ainda
//que a pessoa ter� que pagar 6% de IOF sobre o valor em d�lar.

package membros_estaticos;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o valor do d�lar? ");
		double dolar = sc.nextDouble();
		
		System.out.println("Quantos dolares voc� quer comprar? ");
		double quantidade = sc.nextDouble();
		
		double total = Conversao.total(dolar, quantidade);
		
		System.out.println("O valor pago em reais ser� de: R$ " + total);
		
		sc.close();
		
	}

}
