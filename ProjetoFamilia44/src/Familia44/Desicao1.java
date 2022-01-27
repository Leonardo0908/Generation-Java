package Familia44;

import java.util.Scanner;

public class Desicao1 {
	public static void main(String[] args) {
		
		float n1,n2,n3,media;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("\n Entre com a 1° nota: ");
		n1 = entrada.nextFloat();
		System.out.println("\n Entre com a 2° nota: ");
		n2 = entrada.nextFloat();
		System.out.println("\n Entre com a 3° nota: ");
		n3 = entrada.nextFloat();
		
		media = (n1+n2+n3) / 3;
		System.out.printf("\n Sua média foi de: %2.2f",media);
		
		if(media >= 7 && media <= 10) {
			System.out.println("\n Aluno Aprovado... ");
		}
		else if(media >=5 &&  media <7) {
			System.out.println("\n Aluno de Exame... ");
		}
		else {
			System.out.println("\n Aluno Reprovado... ");
		}
	}
}
