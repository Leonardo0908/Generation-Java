/*5. Fa�a um sistema que leia as 3 notas de um aluno e 
 *   calcule a m�dia final destealuno. Considerar que a
 *   m�dia � ponderada e que o peso das notas �: 2,3 e 5,
 *   respectivamente.*/

package ExAula1;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		float num1,num2,num3,res;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Digite a 1� nota: ");
		num1 = leia.nextFloat();
		
		System.out.println("\n Digite a 2� nota: ");
		num2 = leia.nextFloat();
		
		System.out.println("\n Digite a 3� nota: ");
		num3 = leia.nextFloat();
		
		res = num1 + num2 + num3; 
		
		System.out.println("\n A M�dia �: "+res / 3);
	}
}
