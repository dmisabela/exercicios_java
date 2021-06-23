//Fazer um programa para ler o nome de um aluno e as três notas 
//que ele obteve nos três trimestres do ano (primeiro trimestre 
//vale 30 e o segundo e terceiro valem 35 cada). Ao final, 
//mostrar qual a nota final do aluno no ano. Dizer também se o 
//aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, 
//quantos pontos faltam para o aluno obter o mínimo para ser aprovado 
//(que é 60% da nota). 

package poo_ex3;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno ();
		
		System.out.println("Insira o nome do aluno: ");
		aluno.nome = sc.nextLine();
		
		System.out.println("Insira a primeira nota (N1 entre 0 e 35): ");
		aluno.n1 = sc.nextDouble();
		
		System.out.println("Insira a segunda nota (N2 entre 0 e 35): ");
		aluno.n2 = sc.nextDouble();
		
		System.out.println("Insira a terceira nota (N3 entre 0 e 30): ");
		aluno.n3 = sc.nextDouble();
		
		double media = aluno.calcularMedia();
		double faltantes = aluno.pontosFaltantes();
		
		if (media >= 60) {
			System.out.println("Aluno " + aluno.nome 
								+ ", Nota final: " + media + ", PASSOU!");
		}
		
		else {
			System.out.println("Aluno " + aluno.nome
								+ ", Nota final: " + media
								+ ", Reprovado. Faltaram " 
								+ faltantes + " pontos." );
		}
				
		
		sc.close();

	}

}
