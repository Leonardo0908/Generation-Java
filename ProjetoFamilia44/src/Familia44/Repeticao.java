package Familia44;

public class Repeticao {
	public static void main(String[] args) {
		
		int numero = 0, numero2 = 0;
		
		//enquanto - faca enquanto - para
	
		while(numero < 3  ) {
			System.out.println("\n Olá mundo ");
			numero++;
		}
		System.out.println("\n Boa tarde.. ");
		
		do {
			System.out.println("\n Testando o meu faca enquanto: ");
			numero2++;
		}while(numero2 < 2);
		
		//para (i = 0; i < algo; i++)
		for(int x = 0;x <= 10; x++) {
			System.out.println("\n O numero 5 X "+x+" = "+ x * 5);
			
		}
	}
}
