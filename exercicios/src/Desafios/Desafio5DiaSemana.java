package Desafios;

import java.util.Scanner;

public class Desafio5DiaSemana {
	
	public static void main(String[] args) {
		
		//Dimingo -> 1
		//Segunda -> 2
		//Terça   -> 3
		//Quarta  -> 4
		
		Scanner entrada = new Scanner(System.in);
		
		String semana ;
		
		System.out.println("\n Digite domingo, segunda, terça, quarta, quinta, sexta ou sabádo: ");
		semana = entrada.next();
		
		//if("domingo".equals(semana.toLowerCase() ) ) {
		//Adiciona a string a variavel semana e
		//transforma todas letras em minusculo e compara
		
		if(semana.equalsIgnoreCase("domingo")) {
			System.out.println("\n Domingo Dia 1");
		}else if("segunda".equalsIgnoreCase(semana)) {
			System.out.println(" Segunda Dia 2");
		}else if("terça".equalsIgnoreCase(semana) 
				|| "terca".equalsIgnoreCase(semana)) {
			System.out.println(" Teerça Dia 3");
		}else if("quarta".equalsIgnoreCase(semana)) {
			System.out.println(" Quarta Dia 4");
		}else if("quinta".equalsIgnoreCase(semana)) {
			System.out.println(" Quinta Dia 5");
		}else if("sexta".equalsIgnoreCase(semana)) {
			System.out.println(" Sexta Dia 6");
		}else if("sabado".equalsIgnoreCase(semana)
				|| "sábado".equalsIgnoreCase(semana)) {
			System.out.println(" Sabádo Dia 7");
		}else {
			System.out.println("Opção Invalida");
		}
		entrada.close();
	}
}
