package Desafios;

public class Desafio2 {
	public static void main(String[] args) {
		
		/*int a = 3 * 4 - 10;
		int b = (int) Math.pow(a ,  3);
		double c = Math.pow(a , 3);
		
		System.out.println(b);
		System.out.println(c); */
		int valor = 10;
		int valor1 = 6 * (3+2);
		
		int valor2 = (int) Math.pow(valor1, 2);
		
		// Valor final da primeira parte
		int valor3 = valor2 / (3*2);
		
		int valor4 = (1-5) * (2-7) /2;
		
		// Valor final da segunda parte
		int valor5 = (int) Math.pow(valor4, 2);
		
		int valor6 = valor3 - valor5;
		System.out.println(valor6);
		
		int valor7 = (int) Math.pow(valor6, 3);
		System.out.println(valor7);
		
		int valor8 = (int) Math.pow(valor, 3);
		System.out.println(valor8);
		
		int valor9 = valor7 / valor8;
		System.out.println(valor9);
		
		
		
		
	}
}
