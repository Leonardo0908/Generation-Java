package Familia44;

import java.util.Scanner;

public class Desicao2 {
	public static void main(String[] args) {
		
		int op;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("\n\t\t Menu de opções carinhosas: ");
		System.out.println("\n 1-Não desista dos seus Sonhos... ");
		System.out.println("\n 2-Voçê é capaz... ");
		System.out.println("\n 3-Seja perseverante... ");
		System.out.println("\n 4-Seus sonhnos são possíveis... ");
		System.out.println("\n 5-Persista, Resista e não desista... ");
		System.out.println("\n Digite a sua opção: ");
		
		op = entrada.nextInt();
		
		switch (op) {
		
			case 1: 
				System.out.println("\n 1-Não desista dos seus Sonhos... ");
				break;
			case 2: 	
				System.out.println("\n 2-Voçê é capaz... ");
				break;
			case 3:
				System.out.println("\n 3-Seja perseverante... ");
				break;
			case 4:
				System.out.println("\n 4-Seus sonhnos são possíveis... ");
				break;
			case 5:
				System.out.println("\n 5-Persista, Resista e não desista... ");
				break;
			default:
				System.out.println("\n Opção invalida... ");
		}
	}
}