/*  Uma empresa desenvolveu uma pesquisa para saber 
 *  as caracter?sticas psicol?gicas dos indiv?duos de 
 *  uma regi?o. Para tanto, a cada uma das pessoas era 
 *  perguntado: idade, sexo (1-feminino / 2-masculino / 
 *  3-Outros), e as op??es (1, se a pessoa era calma; 
 *  2, se a pessoa era nervosa e 3, se a pessoa era agressiva).
 *  Pede-se para elaborar um sistema que permita ler os dados de 
 *  150 pessoas, calcule e mostre: (WHILE)
 *  o n?mero de pessoas calmas; 
 *	o n?mero de mulheres nervosas; 
 *	o n?mero de homens agressivos; 
 *	o n?mero de outros calmos;
 *	o n?mero de pessoas nervosas com mais de 40 anos; 
 *	o n?mero de pessoas calmas com menos de 18 anos. 
 */

package ExRepeticao;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		
		int op;
		String sex ;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("\n Digite 0 para: ");
		System.out.println("\n Ou ");
		System.out.println("\n Digite 1 continuar:");
		
		op = entrada.nextInt();
		
		while(op == 1) {
			System.out.println("\n Digite se ");
			System.out.println("\n Masculino = M");
			System.out.println("\n Feminino = F ");
			System.out.println("\n Outro = O ");
			sex = entrada.next();	
			
			
		}
	}
}
