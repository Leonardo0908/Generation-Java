/*4- Faça um programa que leia duas matrizes 2 x 2
 * com valores reais. Ofereça ao usuário um menu de opções:
 *  (1) somar as duas matrizes 
 *	(2) subtrair a primeira matriz da segunda 
 *	(3) adicionar uma constante as duas matrizes
 *	(4) imprimir as matrizes 
 *	Nas duas primeiras opções uma terceira matriz 2 x 2 
 *  deve ser criada. Na terceira opção o valor da constante 
 *  deve ser lido e o resultado da adição da constante deve ser 
 *  armazenado na própria matriz.
 */
package ExArrays;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		
		float [][] matriz  = new float [2][2]; 
		float [][] matriz2 = new float [2][2];
		float [][] matriz3 = new float [2][2];
		float [][] matriz4 = new float [2][2];
		int i = 0,x = 0;
		final int num = 3;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("\n 1° Matriz");
		for(i = 0;i < 2; i++) {
			for(x = 0;x < 2; x++) {
				System.out.println("\n Digite um valor: ");
				matriz[i][x] = entrada.nextFloat();
			}
		}
		System.out.println("\n 2° Matriz");
		for(i = 0; i < 2; i++) {
			for(x = 0;x < 2; x++) {
				System.out.println("\n Digite um valor: ");
				matriz2 [i][x] = entrada.nextFloat();			
			}
		}
		System.out.print(" 1° Matriz");
		for(i = 0;i < 2; i++) {
			for(x = 0;x < 2; x++) {
				 
				System.out.print("\n " +matriz [i][x]+"\t");
			}
		}
		System.out.println("\n");
		
		System.out.print(" 2° Matriz");
		for(i = 0;i < 2; i++) {
			for(x = 0;x < 2; x++) {
				 
				System.out.print("\n " +matriz2 [i][x]);
			}
		}
		System.out.println("\n");
		
		System.out.print(" 3° Matriz");
		for(i = 0;i < 2; i++) {
			for(x = 0;x < 2; x++) {
				matriz3 [i][x] = matriz [i][x] + matriz2 [i][x];
				System.out.print("\n " +matriz3 [i][x]+"\t");
			}
		}
		System.out.println("\n");
		
		System.out.print(" 4° Matriz");
		for(i = 0;i < 2; i++) {
			for(x = 0;x < 2; x++) {
				matriz4 [i][x] = matriz [i][x] - matriz2 [i][x];
				System.out.print("\n " +matriz4 [i][x]);
			}
		}
		System.out.println("\n");
		
		System.out.print(" 3° Matriz constande valor 3 sera adicionado: ");
		for(i = 0;i < 2; i++) {
			for(x = 0;x < 2; x++) {
				matriz3 [i][x] += num;
				System.out.print("\n " +matriz3 [i][x]+"\t");
			}
		}
	}
}
