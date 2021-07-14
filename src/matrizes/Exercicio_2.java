//Fazer um programa para ler dois n�meros inteiros M e N, e depois ler
//uma matriz de M linhas por N colunas contendo n�meros inteiros,
//podendo haver repeti��es. Em seguida, ler um n�mero inteiro X que
//pertence � matriz. Para cada ocorr�ncia de X, mostrar os valores �
//esquerda, acima, � direita e abaixo de X, quando houver, conforme
//exemplo.

package matrizes;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Digite o n�mero de linhas");
		int m = sc.nextInt(); 
		
		System.out.println("Digite o n�mero de colunas");
		int n = sc.nextInt(); 
		
		int[][] matriz = new int [m][n];
		
		//for para percorrer as linhas  
				for(int i = 0; i<matriz.length; i++) {			
					//for para percorrer as colunas			
					for(int j = 0; j<matriz[i].length; j++) {
						System.out.println("Digite a posi��o [" + i + "][" + j + "]");
						matriz[i][j] = sc.nextInt();
					}					
				}
				
				
			System.out.println("Sua matriz: ");
				
				for(int i = 0; i<matriz.length; i++) {			
						
					for(int j = 0; j<matriz[i].length; j++) {
						System.out.print(matriz[i][j] + " ");				
					}	
				
				System.out.println(" ");
			}
				
		System.out.println("Digite um dos n�meros presentes na matriz: ");
		int num = sc.nextInt(); 
		
		for(int i = 0; i<matriz.length; i++) {			
			
			for(int j = 0; j<matriz[i].length; j++) {
				if(matriz[i][j] == num) {
					System.out.println("Posi��o: [" + i + "][" + j + "]");
					if (j>0) {
						System.out.println("Esquerda: " + matriz[i][j-1]);
					}
					if (i>0) {
						System.out.println("Acima: " + matriz[i-1][j]);
					}
					if (j<matriz[i].length-1) {
						System.out.println("Direita: " + matriz[i][j+1]);
					}
					if (i<matriz.length-1) {
						System.out.println("Abaixo: " + matriz[i+1][j]);
					}
				}
			}				
		}	
				
		sc.close();
		
	}
}
