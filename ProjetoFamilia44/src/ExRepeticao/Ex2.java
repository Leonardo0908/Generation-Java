/*2- Ler 10 números e imprimir quantos são 
 *   pares e quantos são ímpares. (FOR)
 */

package ExRepeticao;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		
		int  numero, par = 0, impar = 0;
		
		Scanner entrada = new Scanner(System.in);
	
		for(int i = 1; i <= 10; i++) {
			System.out.println("\n Digite o "+i+"° valor: ");
			numero = entrada.nextInt();
			if(numero % 2 == 0 ) {
				par++;
			}else { 
				impar++;
			}
		}
		System.out.println("\n Números par são: "+ par);
		System.out.println("\n Números impar são: "+impar);
	}
}