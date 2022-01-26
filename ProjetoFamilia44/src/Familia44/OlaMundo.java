package Familia44;

import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double nota1,nota2,nota3,media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Entre com a nota1: ");
		nota1 = leia.nextFloat();
		System.out.println("\n Entre com a nota2: ");
		nota2 = leia.nextFloat();
		System.out.println("\n Entre com a nota3: ");
		nota3 = leia.nextFloat();
		
		media = (nota1+nota2+nota3) / 3;
		
		System.out.println("\n Média aritmética: " +media);
		System.out.printf("\n Média aritmética: %.2f", media );
		//posso usar 2.2 para aredondar nos dois lados da variavel
		
		nota1 = Math.sqrt(nota1);// Raiz
		nota2 = Math.pow(nota3, 3);// potencia 
		nota3 = Math.pow(nota2, 3);
	}

}
