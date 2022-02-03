package Familia44;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excecao2 {
	
	public static int quociente(int numerador, int denominador) throws ArithmeticException{
		return numerador / denominador;
	}
	
	public static void main(String[] args) {
	
		
		Scanner entrada = new Scanner(System.in);
		
		boolean continueLoop = true; //detarmina se mais entradas são necessárias
		
		do {
			
			try {//ler dois números e calcular o quociente
				
				System.out.println("\n Entre com o numerador: ");
				int numerador = entrada.nextInt();
				System.out.println("\n Entre com o denominador: ");
				int denominador = entrada.nextInt();
				
				int resultado = quociente(numerador,denominador);
				System.out.printf("\n Resultado: %d   /   %d =  %d",numerador,denominador,resultado);
				continueLoop = false;
			}
			catch(InputMismatchException inputMismatchExceptio) {//exceção de entrada de 
				
				System.err.printf("\n Exception: %s ", inputMismatchExceptio);
				entrada.nextLine();
				System.out.println("\n Você deve entrar com um valor do tipo inteiro. \n Por favor tente novamente...");
				
			}
			
			catch(ArithmeticException arithmeticException ) {
				System.err.printf("\n Exception: %s ", arithmeticException);
				
				System.out.println("\n Zero é um denominador inválido. \n Por favor tente novamente...");
			
			}
				
		}while(continueLoop);
		
	}
}
