package Familia44;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



import java.util.List;

public class Colecoes {
	
	public static void main(String[] args) {
		// criando um list do tipo interu
		List <Integer> lista = new ArrayList<Integer>();
		
		lista.add(2);
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(1);
		lista.add(5);
		lista.add(2);
		
		//Criando um laço de repetição 
		for(Integer listaElementos: lista) {
			System.out.println(listaElementos);
		}
		
		System.out.println("\n Removendo em elemento da lista...");

		System.out.println();
		
		lista.remove(0);// remove um elemento do meu ArrayList
		
		for(Integer listaElementos:lista) {
			System.out.println(listaElementos);
		}
		
		int primeiroElemento = lista.get(0);//pega um elemento a partir do array
		System.out.println("\n O primeiro elemento é: "+primeiroElemento);
		System.out.println();
		
		for(int i = 0;i < lista.size();i++) {//metodo size: verifica o tamanho do meu array list
			System.out.println("\n Elemento: "+lista.get(i));
		}
		
		Collections.sort(lista);//ordena os elementos do meu ArrayList
		
		System.out.println("\n depois de orfenado");
		System.out.println(lista);
		
		Set <Integer> meuSet = new HashSet<Integer>();
		
		meuSet.add(3);
		meuSet.add(2);
		meuSet.add(6);
		meuSet.add(1);
		meuSet.add(2);
		meuSet.add(7);
		
		//meuSet.addAll(lista);adiciona
		
		Iterator <Integer> iMeuSet = meuSet.iterator();
		
		while(iMeuSet.hasNext()) { // percorre todos os elementos do iMeuSet até achar uma posição fazia
			System.out.println(iMeuSet.next());
		}
	}
}
