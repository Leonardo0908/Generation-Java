/*8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
consumidor.*/

package ExAula1;

import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {
		float custoFabrica,distribuidor = 28,imposto = 45,custoFinal;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Digite o valor de Fabrica do carro: ");
		custoFabrica = leia.nextFloat();
		
		distribuidor = (custoFabrica / 100) *distribuidor;
		imposto =(custoFabrica / 100) * imposto;
		
		custoFinal = custoFabrica + distribuidor + imposto;
		
		System.out.println("\n Custo ao consumidor é: "+custoFinal);
		
	}
}
