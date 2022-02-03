package fundamentos;

public class PrimeiroPrograma {

		public static void main(String[] args) {
			for(int linha = 0; linha < 15; linha++) {
				for(int coluna = 0; coluna < linha; coluna++) {
					if(coluna > linha) {
						break;
					}	
						System.out.print("*");					
				}
				System.out.println();
			}
			for(int linha = 15; linha > 0; linha--) {
				for(int coluna = 15; coluna > linha; coluna--) {
					if(coluna < linha) {
						break;
					}	
						System.out.print("*");					
				}
				System.out.println();
			}
			 for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
	                for(int contador = 0; contador <= 10; contador++) {
	                    System.out.print(multiplicador * contador);
	                    System.out.print(" ");
	                }
	                System.out.println();
	            }
			 for (int i = 1; i < 100; i++ ){
		            if (i % 3 == 0)    {
		                System.out.print(i);
		            }
		                System.out.print(" ");
		            
		}
}	
}