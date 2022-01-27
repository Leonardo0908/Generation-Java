//Faça um programa que entre com três números e coloque em ordem crescente.

package ExCondicional;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		
		int n1 = 0,n2 = 0,n3 = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("\n Digite o 1° valor: ");
		n1 = entrada.nextInt();
		System.out.println("\n Digite o 2° valor: ");
		n2 = entrada.nextInt();
		System.out.println("\n Digite o 3° valor: ");
		n3 = entrada.nextInt();
		
		if(n1 > n2 && n1 > n3 && n2 > n3) {
			System.out.println("\n Valor 1° é: "+ n1);
			System.out.println("\n Valor 2° é: "+ n2);
			System.out.println("\n Valor 3° é: "+ n3);
		}
		else if(n1 > n2 && n1 > n3 && n3 > n2) {
			System.out.println("\n Valor 1° é: "+ n1);
			System.out.println("\n Valor 2° é: "+ n3);
			System.out.println("\n Valor 3° é: "+ n2);
		}
		else if(n2 > n1 && n2 > n3 && n1 > n3) {
			System.out.println("\n Valor 1° é: "+ n2);
			System.out.println("\n Valor 2° é: "+ n1);
			System.out.println("\n Valor 3° é: "+ n3);
		}
		else if(n2 > n1 && n2 > n3 && n3 > n1) {
			System.out.println("\n Valor 1° é: "+ n2);
			System.out.println("\n Valor 2° é: "+ n3);
			System.out.println("\n Valor 3° é: "+ n1);
		}
		else if(n3 > n1 && n3 > n2 && n1 > n2) {
			System.out.println("\n Valor 1° é: "+ n3);
			System.out.println("\n Valor 2° é: "+ n1);
			System.out.println("\n Valor 3° é: "+ n2);
		}
		else if(n3 > n1 && n3 > n2 && n2 > n1) {
			System.out.println("\n Valor 1° é: "+ n3);
			System.out.println("\n Valor 2° é: "+ n2);
			System.out.println("\n Valor 3° é: "+ n1);
		} 
	}
}
