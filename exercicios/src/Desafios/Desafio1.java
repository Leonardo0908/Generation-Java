package Desafios;

import java.util.Scanner;

public class Desafio1 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informa o 1° salário: ");
		String valor1 = entrada.next().replace("," , ".");
		
		System.out.println("Informa o 2° salário: ");
		String valor2 = entrada.next().replace("," , ".");
		
		System.out.println("Informa o 3° salário: ");
		String valor3 = entrada.next().replace("," , ".");
		
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double media = (salario1 + salario2 + salario3) /3;
		System.out.println("A média dos salários é " + media);
		
		entrada.close();
	}
}
