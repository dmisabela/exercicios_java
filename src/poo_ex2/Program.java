//Fazer um programa para ler os dados de um funcionário 
//(nome, salário bruto e imposto). Em seguida, mostrar os 
//dados do funcionário (nome e salário líquido). Em seguida, 
//aumentar o salário do funcionário com base em uma porcentagem 
//dada (somente o salário bruto é afetado pela porcentagem) e 
//mostrar novamente os dados do funcionário. Use a classe 
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
		
		System.out.println("Salário bruto: ");
		func.salarioBruto = sc.nextDouble(); 
		
		System.out.println("Imposto: ");
		func.imposto = sc.nextDouble();
		
		System.out.println(func);
		
		System.out.println("Quantos % o salário irá aumentar? ");
		func.porcent = sc.nextDouble();
		
		System.out.println(func);		
		
		sc.close();

	}

}
