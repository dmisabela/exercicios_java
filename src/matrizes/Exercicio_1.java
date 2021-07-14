////Fazer um programa para ler um n�mero inteiro N e uma matriz de
//ordem N contendo n�meros inteiros. Em seguida, mostrar a diagonal
//principal e a quantidade de valores negativos da matriz.

//Adicionado: exibi��o da matriz

package matrizes;

import java.util.Scanner;

public class Exercicio_1 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite o valor N para ordem da matriz");
		int n = sc.nextInt();
		
		int[][] matriz = new int [n][n];
		//indica que � um arranjo bidimensional
		//instancia a matriz na mem�ria 
		
		
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
		
		System.out.println("Diagonal principal: ");
		for (int x = 0; x<n; x++) {
			System.out.println(matriz[x][x] + " ");
			//elementos da diagonal principal smp est�o na linha e coluna com mesmo valor
		}
		
		System.out.print("Quantidade de n�meros negativos: ");
		
		int count = 0; 
		
		for(int i = 0; i<matriz.length; i++) {			
					
			for(int j = 0; j<matriz[i].length; j++) {				
				if (matriz[i][j] < 0) {
					count++;
				}				
			}				
		}
		
		System.out.println(count);
		
		sc.close();		
	}	
}


