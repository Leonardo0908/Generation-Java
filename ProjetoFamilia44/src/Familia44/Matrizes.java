package Familia44;

import java.util.Scanner;

public class Matrizes {
	public static void main(String[] args) {
		
		int [][] matriz = new int [3][2];
		
		Scanner entrada = new Scanner(System.in);
		
		for(int i = 0; i < 3;i++) {
			for(int x = 0;x < 2; x++) {
				System.out.println("\n Digite o valor: ");
				matriz[i][x] = entrada.nextInt();
			}
		}
		System.out.println("\n");
		
		for(int i = 0; i < 3;i++) {
			for(int x = 0;x < 2; x++) {
				System.out.print( matriz[i][x] *2+"\t" );
			}
			System.out.println("\n");
		}
	}
}
