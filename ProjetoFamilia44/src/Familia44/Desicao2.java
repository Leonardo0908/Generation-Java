package Familia44;

import java.util.Scanner;

public class Desicao2 {
	public static void main(String[] args) {
		
		int op;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("\n\t\t Menu de op��es carinhosas: ");
		System.out.println("\n 1-N�o desista dos seus Sonhos... ");
		System.out.println("\n 2-Vo�� � capaz... ");
		System.out.println("\n 3-Seja perseverante... ");
		System.out.println("\n 4-Seus sonhnos s�o poss�veis... ");
		System.out.println("\n 5-Persista, Resista e n�o desista... ");
		System.out.println("\n Digite a sua op��o: ");
		
		op = entrada.nextInt();
		
		switch (op) {
		
			case 1: 
				System.out.println("\n 1-N�o desista dos seus Sonhos... ");
				break;
			case 2: 	
				System.out.println("\n 2-Vo�� � capaz... ");
				break;
			case 3:
				System.out.println("\n 3-Seja perseverante... ");
				break;
			case 4:
				System.out.println("\n 4-Seus sonhnos s�o poss�veis... ");
				break;
			case 5:
				System.out.println("\n 5-Persista, Resista e n�o desista... ");
				break;
			default:
				System.out.println("\n Op��o invalida... ");
		}
	}
}