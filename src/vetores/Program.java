/*

A dona de um pensionato possui dez quartos para alugar para estudantes,
sendo esses quartos identificados pelos números 0 a 9.

Fazer um programa que inicie com todos os dez quartos vazios, e depois
leia uma quantidade N representando o número de estudantes que vão
alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos
N estudantes. Para cada registro de aluguel, informar o nome e email do
estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha
que seja escolhido um quarto vago. Ao final, seu programa deve imprimir
um relatório de todas ocupações do pensionato, por ordem de quarto.

*/

package vetores;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		
		System.out.println("Quantos quartos serão alugados? (Limite: 10) ");
		int n = sc.nextInt();
		
		if (n > 10) {
			System.out.println("Limite excedido.");
		}
		
		else {
		
			Aluguel[] vetor = new Aluguel[10];
		
			for (int i=1; i<=n; i++) {
				System.out.println("Aluguel #" + i);
				
				System.out.println("Nome: ");
				String nome = sc.next();
				
				System.out.println("Email: ");
				String email = sc.next();
				
				System.out.println("Quarto: (de 0 a 9) ");
				int quartos = sc.nextInt();	
				
					if (quartos>10) {
						System.out.println("Número de quarto inválido.");
					}
					else if (vetor[quartos] != null) {
						System.out.println("Quarto já ocupado. Não foi possível alugar.");
					}
					else {								
					vetor[quartos] = new Aluguel(nome, email);
					}
				
				}				
		
				System.out.println("Quartos ocupados: ");			
					for (int i=0; i<vetor.length; i++) {
						if(vetor[i] != null) {	
						System.out.println(i + ": " + vetor[i]);
						}			
					}			
		}
		
		sc.close();

	}

}
