package controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("\n Informe a m�dia: ");
		double media = entrada.nextDouble();
		
		if(media >= 7.0 && media <= 10) {
			System.out.println("Aprovado! ");
		}	
		if(media >= 4.5 && media < 7) {
			System.out.println("\n Recupera��o ");
		}
		//usando so uma variavel no IF
		boolean criterioReprovado = 
				media < 4.5 && media >= 0;
		if(criterioReprovado) {
			System.out.println("\n Reprovado ");
		}
		entrada.close();
	}
}
