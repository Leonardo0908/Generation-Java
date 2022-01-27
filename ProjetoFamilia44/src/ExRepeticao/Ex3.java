/*3- Solicitar a idade de várias pessoas e imprimir: Total 
 *   de pessoas com menos de 21 anos. Total de pessoas com
 *   mais de 50 anos. O programa termina quando
 *   idade for =-99. (WHILE)*/

package ExRepeticao;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		int x = 0, idade,pessoaMenor21 = 0,pessoaMaior50 = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		
		
		while(x != -99) {
			
			System.out.println("\n Digite um 1 para continuar: ");
			System.out.println("\n Ou Digite -99 para parar : ");
			x = entrada.nextInt();
			
			System.out.println("\nDigite a Idade da pessoa: ");
			idade = entrada.nextInt();
			
			if(idade < 21 && idade >= 0) {
				pessoaMenor21++;
			}
			else if(idade > 50) {
				pessoaMaior50++;
			}
		}
		System.out.println("\n Pessoas com idade menos 21 anos é "+pessoaMenor21);
		System.out.println("\n Pessoas com idade maior 50 anos é "+pessoaMaior50);
	}
}
