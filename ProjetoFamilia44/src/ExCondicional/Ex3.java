/* Fa�a um programa que receba a idade de uma pessoa e 
 * mostre na sa�da em qual categoria ela se encontra:
 * 10-14 infantil
 * 15-17 juvenil
 * 18-25 adulto
 * */

package ExCondicional;

import java.util.Scanner;

public class Ex3 {
		public static void main(String[] args) {
			
			int idade;
			
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("\n Digite sua idade: ");
			idade = entrada.nextInt();
			
			if(idade >= 10 && idade <= 14) {
				System.out.println("\n Categoria Infantil: ");
			}
			else if(idade >= 15 && idade <= 17) {
				System.out.println("\n Categoria Juvenil: ");
			}
			else if(idade >= 18 && idade <= 25) {
				System.out.println("\n Categoria Adulto: ");
			}
			else {
				System.out.println("\n Categoria n�o aceita: ");
			}
		}
}
