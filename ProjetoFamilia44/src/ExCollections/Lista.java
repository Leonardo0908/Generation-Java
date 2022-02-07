package ExCollections;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int op;
		Scanner entrada = new Scanner(System.in);
		
		ArrayList <String> estoque = new ArrayList();
		
		
		
		estoque.add("laranja");
		estoque.add("banana");
		estoque.add("BomDia Meu Povooooo!!!!!");
		
		
		
		do
		{
			System.out.println("\n-----------------------------------------------------");
			System.out.println("\n(1) Deseja adicionar um produto no estoque?");
			System.out.println("\n(2) Deseja remover um produto do estoque?");
			System.out.println("\n(3) Deseja atualizar um produto no estoque?");
			System.out.println("\n(4) Deseja mostrar todos os produtos do estoque");
			System.out.println("\n(0) Deseja encerrar o programa?");
			System.out.println("\n-----------------------------------------------------");
			System.out.println("\nDigite sua opção: ");
			op = entrada.nextInt();
			
			switch(op)
			{
			case 1:
				entrada.nextLine();
				System.out.println("\nDigite o produto para adicionar ao estoque: ");
				String produto = entrada.nextLine();
				estoque.add(produto);
				break;
				
			case 2:
				entrada.nextLine();
				System.out.println("\nDigite o produto para remover do estoque: ");
				String produtor = entrada.nextLine();
				if(estoque.contains(produtor))
				{
					estoque.remove(produtor);
				}
				else
				{
					System.out.println("\nProduto não existe!!!");
				}
				System.out.println(estoque);
				break;
				
			case 3: 
				entrada.nextLine();
				System.out.println("\nDigite o produto que deseja atualizar: ");
				String verifica = entrada.nextLine();
				System.out.println("\nDigite o produto que entrará no lugar do(a) "+verifica+ " : ");
				String novo = entrada.nextLine();
				
				if(estoque.contains(verifica))//V
				{
					estoque.remove(verifica);
					estoque.add(novo);
				}
				else
				{
					System.out.println("\nProduto não existe!!!");
				}
				System.out.println(estoque);
				break;
				
			case 4:
				System.out.println("\nOs produtos que temos no estoque são: ");
				
				for(int i = 0;i < estoque.size();i++) {
					System.out.println("\n Item: "+estoque.get(i));
				}
				
				
			default:
					if(op==0)
					{
						System.out.println("\nMuito obrigado por utilizar o nosso sistema...");
					}
					else
					{
						System.out.println("\nOpção inexistente, por favor digite a opção correta...");
					}
			}
			
		}
		while(op!=0);
	}

}

