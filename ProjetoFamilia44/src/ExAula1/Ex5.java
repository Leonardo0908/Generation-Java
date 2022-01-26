/*5. Faça um sistema que leia as 3 notas de um aluno e 
 *   calcule a média final destealuno. Considerar que a
 *   média é ponderada e que o peso das notas é: 2,3 e 5,
 *   respectivamente.*/

package ExAula1;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		float num1,num2,num3,res;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Digite a 1° nota: ");
		num1 = leia.nextFloat();
		
		System.out.println("\n Digite a 2° nota: ");
		num2 = leia.nextFloat();
		
		System.out.println("\n Digite a 3° nota: ");
		num3 = leia.nextFloat();
		
		res = num1 + num2 + num3; 
		
		System.out.println("\n A Média é: "+res / 3);
	}
}
