/* 3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
 */

package ExArrays;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
	
		int [][] numeros = new int [3][3];
		int maior10 = 0;
		Scanner entrada = new Scanner(System.in);
		
		for(int i = 0;i < 3; i++) {
			for(int x = 0;x < 3; x++) {
				System.out.println("\n Digite o valor: ");
				numeros[i][x] = entrada.nextInt();
				
				if(numeros[i][x] > 10) {
					maior10++;
				}
			}
		}
		System.out.println("\n Valor maior que 10 são: "+maior10);
	 
 	}
}
