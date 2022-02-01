package ExArrays;

import java.util.Scanner;

public class Ex4P {
	public static void main(String[] args) {
		
		float [][] matriz  = new float [2][2]; 
		float [][] matriz2 = new float [2][2];
		float [][] matriz3 = new float [2][2];
		
		int i = 0,x = 0,op = 0;
		int num = 0;//constante
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("\n 1° Matriz");
		for(i = 0;i < 2; i++) {
			for(x = 0;x < 2; x++) {
				System.out.println("\n Digite um valor: ");
				matriz[i][x] = entrada.nextFloat();
			}
		}
		System.out.println("\n 2° Matriz");
		for(i = 0; i < 2; i++) {
			for(x = 0;x < 2; x++) {
				System.out.println("\n Digite um valor: ");
				matriz2 [i][x] = entrada.nextFloat();			
			}
		}
	 
		
		do {
		System.out.println("\t\tSelecione uma opção");
		System.out.println("(1) somar as duas matrizes");
		System.out.println("(2) subtrair a primeira matriz da segunda");
		System.out.println("(3) adicionar uma constante as duas matrizes");
		System.out.println("(4) imprimir as matrizes");
		System.out.println("(0) Para finalizar o Programa Digite 0");
		op = entrada.nextInt();
		
		switch(op) {
		case 1:
			for(i = 0;i < 2; i++) {
				for(x = 0;x < 2; x++) {
					matriz3 [i][x] = matriz [i][x] + matriz2 [i][x];
					System.out.print("\t["+(matriz3[i][x])+"] ");
				}
				System.out.print("\n");
			}
			break;
		case 2:
			System.out.print("\n 4° Matriz Subtração \n");
			for(i = 0;i < 2; i++) {
				for(x = 0;x < 2; x++) {
					matriz3 [i][x] = matriz [i][x] - matriz2 [i][x];
					System.out.print("\t["+(matriz3[i][x])+"] ");
				}
			}
			
				System.out.print("\n");
			
			break;
		case 3:
			System.out.print("\n 3° Matriz Soma \n");
			for(i = 0;i < 2; i++) {
				for(x = 0;x < 2; x++) {
					System.out.println("\n Digite a constante: ");
					num = entrada.nextInt();
					
					matriz[i][x] += num;
					matriz[i][x] += num;
					
					System.out.println("\n Matriz 1: "+matriz[i][x]);
					System.out.println("\n Matriz 2: "+matriz2[i][x]);
			
				}
				System.out.print("\n");
			}
			break;	
		case 4:
			System.out.print("\n 4° imprimir matrizes: \n");
			 
			for(i = 0;i < 2; i++) {
				for(x = 0;x < 2; x++) {
					System.out.print("["+(matriz[i][x])+"] ");
				}
				System.out.print("\n");
			}
			for(i = 0;i < 2; i++) {
				for(x = 0;x < 2; x++) {
					System.out.print("["+(matriz2[i][x])+"] ");
				}
				System.out.print("\n");
			}
			break;
		default:
			if(op != 0) {
			System.out.println("\n Opção inválida....");
			}
			else {
				System.out.println("\n Obrigado por Usar o Programa");
			}
		
		}
		
		}while(op != 0);
	}
}
