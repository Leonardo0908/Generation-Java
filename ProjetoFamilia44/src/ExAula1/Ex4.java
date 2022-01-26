package ExAula1;

import java.util.Scanner;

/*4. Escreva um sistema que leia três 
 *   números inteiros e positivos (A, B, C) e
 *   calcule a seguinte expressão:
 *   package Exercicios;
*/
public class Ex4 {
	public static void main(String[] args) {
		int numero1, numero2, numero3;
		float res;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Digite o 1° número: ");
		numero1 = leia.nextInt();
		System.out.println("\n Digite o 2° número: ");
		numero2 = leia.nextInt();
		System.out.println("\n Digite o 3° número: ");
		numero3 =leia.nextInt();
		
		res = numero1 + numero2;
	    double numR = Math.pow(res, 2);
		
	    res = numero2 + numero3;
	    double numS = Math.pow(res, 2);
	    
	    double numD = (numR + numS) / 2;
	    
	    System.out.println("\n O Resultado é: "+numD);
		
	}
}
