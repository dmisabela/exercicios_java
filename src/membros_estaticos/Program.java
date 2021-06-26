//Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por
//uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda
//que a pessoa terá que pagar 6% de IOF sobre o valor em dólar.

package membros_estaticos;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o valor do dólar? ");
		double dolar = sc.nextDouble();
		
		System.out.println("Quantos dolares você quer comprar? ");
		double quantidade = sc.nextDouble();
		
		double total = Conversao.total(dolar, quantidade);
		
		System.out.println("O valor pago em reais será de: R$ " + total);
		
		sc.close();
		
	}

}
