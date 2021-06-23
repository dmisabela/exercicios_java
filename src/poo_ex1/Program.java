//Fazer um programa para ler os valores da largura e altura de um retângulo. 
//Em seguida, mostrar na tela o valor de sua área, perímetro e diagonal. 
//Usar uma classe como mostrado no projeto ao lado.

package poo_ex1;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Rectangle ret = new Rectangle();
		
		
		System.out.println("Digite o valor da altura do retângulo: ");
		ret.altura = sc.nextDouble();
		
		System.out.println("Digite o valor da largura do retângulo: ");
		ret.largura = sc.nextDouble();
		
		
		double area = ret.calcularArea();
		double perimetro = ret.calcularPerimetro();
		double diagonal = ret.calcularDiagonal();
		
		System.out.println("Area: " + area);
		System.out.println("Perimetro: " + perimetro);
		System.out.println("Diagonal: " + diagonal);
		
		sc.close();

	}

}
