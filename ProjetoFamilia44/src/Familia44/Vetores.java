package Familia44;

import java.util.Scanner;

public class Vetores {
	public static void main(String[] args) {
		int n = 0;
		int[] numeros = new int[3];
		
//		numeros[0] = 200;
//		numeros[1] = 201;
//		numeros[2] = 202;
		
	//	System.out.println("\n "+ numeros[2]);
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("\n Digite o primeiro valor de números: ");
		
		numeros [0] = entrada.nextInt();
		
		for(int i = 0;i <= 2; i++) {
			System.out.println("\n O valor de indece é: " +i+ " = "+numeros[i]);
		}
		
	}
}
