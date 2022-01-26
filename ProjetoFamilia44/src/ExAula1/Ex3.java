/*3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.
package Exercicios;
*/
package ExAula1;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		
		int totalSegundos, segundos, minutos,horas,res;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Digite o Total de segundos: ");
		totalSegundos = leia.nextInt();
		
		horas = (totalSegundos / 60) /60 ;
		
		res = (horas* 60) * 60;
		
		minutos = (totalSegundos - res) / 60;
		segundos = (totalSegundos % 60) % 60;
		
		System.out.println("\n Horas: "+horas);
		System.out.println("\n minutos: "+minutos);
		System.out.println("\n segundos: "+segundos);
	}
}
