/*7. Um sistema de equações lineares do tipo:
*    pode ser resolvido segundo mostrado abaixo :
*    Escreva um sistema que lê os coeficientes a,b,c,d,e e f e 
*    calcula e mostra os
*    valores de x e y.*/

package ExAula1;

import java.util.Scanner;

public class Ex7 {
	 public static void main(String[] args) {
		int a,b,c,d,e,f;
		float x,y;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Digite o valor de A");
		a = leia.nextInt();
		System.out.println("\n Digite o valor de B");
		b = leia.nextInt();
		System.out.println("\n Digite o valor de C");
		c = leia.nextInt();
		System.out.println("\n Digite o valor de D");
		d = leia.nextInt();
		System.out.println("\n Digite o valor de E");
		e = leia.nextInt();
		System.out.println("\n Digite o valor de F");
		f = leia.nextInt();
		
		x = (c + e - b + f) / (a + e - b + d);
		y = (a + f - c + d) / (a + e - b + d);
		
		System.out.printf("\n resultado X: " +x);
		System.out.printf("\n resultado Y: " +y);
	}
}
