/*2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
 *	� Os n�meros pares digitados;  
 *	� A soma dos n�meros pares digitados; 
 *	� Os n�meros �mpares digitados; 
 *	� A quantidade de n�meros �mpares digitados.
 */

package ExArrays;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		
		int[] numeros = new int [7];
		int parSoma = 0, imparQuantidade = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		for(int i = 1;i < 7; i++) {
			System.out.println("\n Digite o valor "+i+ "�" );
			numeros[i] = entrada.nextInt();
			
			if(numeros[i] % 2 == 0) { 
				parSoma += numeros[i];
			}
			else {
				imparQuantidade++;
			}
		}
		System.out.println("\n Os pares somados � igual a: "+parSoma);
		System.out.println("\n A quantidade de impares �: "+imparQuantidade);
	}
}
