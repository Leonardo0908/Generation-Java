package ExCondicional;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		
		
		int op,numero = 0;
		float valor = 0;
		
		 Scanner entrada = new Scanner(System.in);
		
		System.out.println("\n 1  Picanha   		-----25,00  ");
		System.out.println("\n 2  Lasanha 	    	------20,00 ");
		System.out.println("\n 3  Strogonoff 		------18,00 ");
		System.out.println("\n 4  Bife Acebolado 	-------15,00");
		System.out.println("\n 5  Pão com ovo         -------5,00 ");
		
		op = entrada.nextInt();
		System.out.println("\n Você aceita pagar 10% de gorjeta para o garçom? ");
		System.out.println("\n Sim digite 0 ou Não digite 1 ");
		numero = entrada.nextInt();
		
		switch(op) {
		case 1:
			System.out.println("\n 1  Picanha   		-----25,00  ");
			valor = 25;
			if(numero == 0) {
				valor *= 1.1;
			}
			System.out.printf("\n Valor Final é %.2f " ,valor);
			break;
			
		case 2:
			System.out.println("\n 2  Lasanha 	    	------20,00 ");
			valor = 20;
			if(numero == 0) {
				valor *= 1.1;
			}
			System.out.printf("\n Valor Final é %.2f ",valor);
			break;
			
		case 3:
			System.out.println("\n 3  Strogonoff 		------18,00 ");
			valor = 18;
			if(numero == 0) {
				valor *= 1.1;
			}
			System.out.printf("\n Valor Final é %.2f ",valor);
			break;
			
		case 4:
			System.out.println("\n 4  Bife Acebolado 	-------15,00");
			valor = 15;
			if(numero == 0) {
				valor *= 1.1;
			}
			System.out.printf("\n Valor Final é %.2f ",valor);
			break;
			
		case 5:
			System.out.println("\n 5  Pão com ovo 	    -------5,00 ");
			valor = 5;
			if(numero == 0) {
				valor *= 1.1;
			}
			System.out.printf("\n Valor Final é %.2f",valor);
			break;
				
		default:
			System.out.println("\n Opção invalida: ");
		}
	}
}
