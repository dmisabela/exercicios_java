//Fazer um programa para ler os dados de um funcion�rio 
//(nome, sal�rio bruto e imposto). Em seguida, mostrar os 
//dados do funcion�rio (nome e sal�rio l�quido). Em seguida, 
//aumentar o sal�rio do funcion�rio com base em uma porcentagem 
//dada (somente o sal�rio bruto � afetado pela porcentagem) e 
//mostrar novamente os dados do funcion�rio. Use a classe 
//projetada abaixo.

package poo_ex2;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Funcionario func = new Funcionario();
		
		System.out.println("Nome do empregado: ");
		func.nome = sc.nextLine();
		
		System.out.println("Sal�rio bruto: ");
		func.salarioBruto = sc.nextDouble(); 
		
		System.out.println("Imposto: ");
		func.imposto = sc.nextDouble();
		
		System.out.println(func);
		
		System.out.println("Quantos % o sal�rio ir� aumentar? ");
		func.porcent = sc.nextDouble();
		
		System.out.println(func);		
		
		sc.close();

	}

}
