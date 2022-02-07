package Lista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Colecoes {
	
	public static void main(String[] args) {
		
		//criando um list do tiipo ArrayList instanciado com um objeto chamado lista
		List <Integer> lista = new ArrayList<Integer>();
		
		//adicionando elemento para o meu ArrayList
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(1);
		lista.add(2);
		lista.add(5);
		
		//estou criando um laço de repetição para percorrer o meu ArrayList
		for(Integer listaElementos:lista) {
			
			//vai imprimir todos os elementos do meu ArrayList
			System.out.println(listaElementos);
		}
		System.out.println("\n Removendo um elemento fa lista...");
		
		System.out.println();
		
		//remove um elemento do meu ArrayList
		lista.remove(0);
		
		for(Integer listaElementos:lista) {
			System.out.println(listaElementos);
		}
		//pegar um elemento a partir da posição do meu ArrayList
		int primeiroElemento = lista.get(0);
		
		System.out.println("\n O primeiro elemento é: "+primeiroElemento );
		
		System.out.println();
		
		//método size: verifica o tamanho do ArrayList
		for(int i = 0;i < lista.size();i++) {
			System.out.println("\n Elemento: "+lista.get(i));
		}
		//ordena os elementos do meu ArrayList
		Collections.sort(lista);
		
			System.out.println("\n Depois de ordenado...");
			
			System.out.println(lista);
			
			//criação da minha interface Set do tipo HashSet
			Set <Integer> meuSet = new HashSet<Integer>();
			
				meuSet.add(3);
				meuSet.add(1);
				meuSet.add(6);
				meuSet.add(1);
				meuSet.add(2);
				meuSet.add(7);
			
			//meuSet.addAll(lista);
				
			//	API para modificar o hashSet criado
			Iterator <Integer> iMeuSet = meuSet.iterator();	
			
			//percorre todos os elementos do iMeuSet até encontrar uma posição vazia,
			//com isso, ele sai do laço de repetição
			while(iMeuSet.hasNext()) {
				//imprime sempre o próximo elemento
				System.out.println(iMeuSet.next());
			}		
	}
}
