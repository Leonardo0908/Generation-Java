package Desafios;

import java.util.Scanner;

public class Desafio6While {
	public static void main(String[] args) {
		
		float num,nota,total = 0;
		int numQuantidade = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("\n Calculo de M�dia: ");
		System.out.println("\n Digite -1 para finalizar:");
		System.out.printf("\n e Calcular a M�dia... \n ou outro n�mero para continuar... ");
		num = entrada.nextFloat();
		
		while(num != -1) {
			
			System.out.println("\n Digite uma Nota...");
			nota = entrada.nextFloat();
			
			if(nota >= 0 && nota <= 10) {
				total += nota;
				numQuantidade++;
			}else {
				num = 0;
			}
			System.out.println("\n Digite -1 para finalizar:");
			System.out.printf("\n e Calcular a M�dia... \n ou outro n�mero para continuar... ");
			num = entrada.nextFloat();
		}
		total /= numQuantidade;
		System.out.printf("\n Valor da M�dia � %.2f",total );
	}
}
