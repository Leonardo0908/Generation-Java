/* Faça um programa em que permita a entrada de um
 * número qualquer e exiba se este número é par ou 
 * ímpar. Se for par exiba também a raiz quadrada do 
 * mesmo; se for ímpar exiba o número elevado ao quadrado.
*/
package ExCondicional;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		
		int numero;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("\n Digite um valor: ");
		numero = entrada.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("\n Valor é par: ");
			
			numero = (int) Math.sqrt(numero);// Raiz
			System.out.println("\n Raiz do Valor: "+numero);
		}
		else {
			System.out.println("\n Valor é impar: ");
		
			numero = (int) Math.pow(numero, 2);
			System.out.println("\n Valor ao quadrado: "+numero);
		}
		
	}
}
