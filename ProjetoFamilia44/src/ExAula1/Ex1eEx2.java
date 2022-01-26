/*1. Faça um sistema que leia a idade de 
	ma pessoa expressa em anos, meses e
	dias e mostre-a expressa apenas em dias.
 2. Faça um sistema que leia a idade de uma 
    pessoa expressa em dias e mostre-a
    expressa em anos, meses e dias.	
*/

package ExAula1;

import java.util.Scanner;

public class Ex1eEx2 {
	public static void main(String[] args) {
		
		int anos,meses,dias,totals;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Digite quantos anos: ");
		anos = leia.nextInt();
		
		System.out.println("\n Digite quantos meses: ");
		meses = leia.nextInt();
		
		System.out.println("\n Digite quantos dias: ");
		dias = leia.nextInt();
		
		dias += anos * 365;
		dias += meses * 30;
		
		System.out.println("\n Total de dias é: " +dias);
		
		int meses2,anos2;
		
		anos2 = dias / 365;
		meses2 = (dias % 365) / 30;
		dias = (dias % 365) % 30;
		
		System.out.println("\n anos: "+anos2);
		System.out.println("\n meses: "+meses2);
		System.out.println("\n dias: "+dias);
	}
}
