package Familia44;

import java.util.ArrayList;
import java.util.Scanner;

public class Colecoes2 {
	
	public static void main(String[] args) {
		
		int op;
		Scanner entrada = new Scanner(System.in);
		
		ArrayList <String> estoque = new ArrayList();
		
		do {
			
			System.out.println("\n --------------------------------------------");
			System.out.println("\n 1° Deseja adicionar um produto do estoque? ");
			System.out.println("\n 2° Deseja remove um produto do estoque? ");
			System.out.println("\n 3° Deseja atualizar um produto do estoque? ");
			System.out.println("\n 4° Deseja mostrar todos os produtos do estoque? ");
			System.out.println("\n 0° deseja encerrar o Programa? ");
			System.out.println("\n --------------------------------------------");
			System.out.println("\n Digite sua Opção: ");
			op = entrada.nextInt();
			
			switch(op) {
			case 1:
				entrada.nextLine();
				System.out.println("\n Digite o produto para adicionar ao estoque: ");
				String produto = entrada.nextLine();
				estoque.add(produto);
				break;
			case 2:
				System.out.println("\n Digite o produto para remover ao estoque: ");
				String produtor = entrada.nextLine();
				
				if(estoque.contains(produtor)) {
					estoque.remove(produtor);
				}
				else {
					System.out.println("\n Produto não existe!!! ");
				}
				System.out.println(estoque);
				break;
			case 3:
				System.out.println("\n Digite o produto que deseja atualizar: ");
				String verifica = entrada.nextLine();
				System.out.println("\n Digite o produto que estrará no lugar do(a) "+estoque);
				String novo = entrada.nextLine();
				
				if(estoque.contains(verifica)) {
					estoque.remove(verifica);
					estoque.add(novo);
				}
				else {
					System.out.println("\n Produto não existe!!! ");
				}
				System.out.println(estoque);
				break;
			case 4:
				System.out.println("\n Os produtos que temos no estoque são: ");
				System.out.println(estoque);
				break;
			default:
				if(op == 0) {
					System.out.println("\n Muito obrigado por ultilizar nosso sistema:");
				}
				else {
					System.out.println("\n Opção inválida digite ou opção válida.....");
				}
			}
				
		}while(op != 0);
	}
}
