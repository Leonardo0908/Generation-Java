/*6. Construa um programa em c que, tendo como dados 
 * de entrada dois pontos quaisquer no plano, 
 * P(x1, y1) e P(x2, y2), escreva a distância entre eles. 
 * A fórmula que efetua tal cálculo é:*/

package ExAula1;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		
		int x1,x2,y1,y2;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Digite o valor x1: ");
		x1 = leia.nextInt();
		System.out.println("\n Difite o valor x2: ");
		x2 = leia.nextInt();
		System.out.println("\n Digite o valor y1: ");
		y1 = leia.nextInt();
		System.out.println("\n Digite o valor y2: ");
		y2 = leia.nextInt();
		
		double res = x2 - x1;
		res = Math.pow(res, 2.0);
		
		 double res2 = y2 - y1;
		res2 = (double) Math.pow(res2, 2.0);
		
		double resF = res + res2;
		resF = (double) Math.sqrt(resF);	
		
		System.out.println("\n Resultado Final é: "+resF);
	}
}
