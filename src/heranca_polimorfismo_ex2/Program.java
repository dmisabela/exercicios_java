//Fazer um programa para ler os dados de N contribuintes (N fornecido pelo usu�rio), os quais 
//podem ser pessoa f�sica ou pessoa jur�dica, e depois mostrar o valor do imposto pago por cada um, 
//bem como o total de imposto arrecadado. 
//Os dados de pessoa f�sica s�o: nome, renda anual e gastos com sa�de. Os dados de pessoa jur�dica 
//s�o nome, renda anual e n�mero de funcion�rios. As regras para c�lculo de imposto s�o as 
//seguintes:
//Pessoa f�sica: pessoas cuja renda foi abaixo de 20000.00 pagam 15% de imposto. Pessoas com 
//renda de 20000.00 em diante pagam 25% de imposto. Se a pessoa teve gastos com sa�de, 50% 
//destes gastos s�o abatidos no imposto. 
//Exemplo: uma pessoa cuja renda foi 50000.00 e teve 2000.00 em gastos com sa�de, o imposto 
//fica: (50000 * 25%) - (2000 * 50%) = 11500.00
//Pessoa jur�dica: pessoas jur�dicas pagam 16% de imposto. Por�m, se a empresa possuir mais de 10 
//funcion�rios, ela paga 14% de imposto. 
//Exemplo: uma  empresa  cuja  renda foi 400000.00 e possui 25 funcion�rios, o imposto fica: 
//400000 * 14% = 56000.00

package heranca_polimorfismo_ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		List<Contribuintes> list = new ArrayList<>();
		
		System.out.println("Digite o n�mero de contribuintes: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			
			System.out.println("Dados do contribuinte #" + i);
			System.out.print("Pessoa F�sica ou Jur�dica? (F/J): ");
			char ch = sc.next().charAt(0);
			
			System.out.print("Nome: ");
			String nome = sc.next();
			
			System.out.println("Renda anual: ");
			double rendaAnual = sc.nextDouble();
			
				if (ch == 'F') {
					
					System.out.print("Gastos com sa�de: ");
					double gastosSaude = sc.nextDouble();
					list.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
				}
				
				else if (ch == 'J') {
					
					System.out.print("N�mero de empregados: ");
					int numEmpregados = sc.nextInt();
					list.add(new PessoaJuridica(nome, rendaAnual, numEmpregados));
				}
				
				else {
					System.out.println("A op��o digitada n�o foi v�lida.");
				}			
			}

		System.out.println("IMPOSTOS PAGOS: ");
		
		for (Contribuintes contribuintes : list) {
			
			System.out.println(contribuintes.getNome() 
					+ ": $"+ String.format("%.2f", contribuintes.taxa()));			
		}
		
		System.out.println("TOTAL DE IMPOSTOS: ");
		
		double total = 0.0;
		
		for(Contribuintes contribuintes : list) {
			
			total += contribuintes.taxa();
		}	
		
		System.out.println("$" + String.format("%.2f", total));
		
		sc.close();
		
		
		
		
		
		
		
		

	}

}
