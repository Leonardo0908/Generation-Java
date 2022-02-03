package Familia44;

public class Excecao {
	
	public static void main(String[] args) {
		
		String frase = null;
		String novaFrase = null;
		
		try {// faz uma tentativa de execução para verificar o erro 
			
			//tenta colocar uma String para maiusculo
			novaFrase = frase.toUpperCase();
		// ela faz a correção de um valor null para um conteudo qualquer 
		}catch(NullPointerException e) {
			System.out.println("\n a frase inicial esta null, para selecinar tal problema,"
					+"foi lhe atribuido um valor default...");
			frase = "Frase Vazia";
			novaFrase = frase.toUpperCase();
		}
		System.out.println("\n Frase antiga: "+frase);
		System.out.println("\n Frase nova: "+novaFrase);
		
	}
}
