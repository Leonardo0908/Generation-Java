/*2- Ler 10 n�meros e imprimir quantos s�o 
 *   pares e quantos s�o �mpares. (FOR)
 */

package ExRepeticao;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		
		int  numero, par = 0, impar = 0;
		
		Scanner entrada = new Scanner(System.in);
	
		for(int i = 1; i <= 10; i++) {
			System.out.println("\n Digite o "+i+"� valor: ");
			numero = entrada.nextInt();
			if(numero % 2 == 0 ) {
				par++;
			}else { 
				impar++;
			}
		}
		System.out.println("\n N�meros par s�o: "+ par);
		System.out.println("\n N�meros impar s�o: "+impar);
	}
}