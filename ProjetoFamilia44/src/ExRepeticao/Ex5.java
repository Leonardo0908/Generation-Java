/*Crie um programa que leia um n�mero do 
 * teclado at� que encontre um n�mero igual 
 * a zero. No final, mostre a soma dos n�meros 
 * digitados.(DO...WHILE)
 */

package ExRepeticao;

import java.util.Scanner;

public class Ex5 {
		public static void main(String[] args) {
		
			int numero = 0, resultado = 0;
			
			Scanner entrada = new Scanner(System.in);
			
			
			do {
				System.out.println("\n Digite um valor: ");
				numero = entrada.nextInt();
				
				resultado += numero;
				
			}while(numero != 0);
			System.out.println("\n Valores somados � igual: "+resultado);
			System.out.println("\n Fim do Programa...");
	}
}
