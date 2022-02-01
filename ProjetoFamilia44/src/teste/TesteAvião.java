package teste;

import ExPOO.Ex2Aviao;

public class TesteAvião {
	public static void main(String[] args) {
		
		 Ex2Aviao[] aviao = new Ex2Aviao[3];
		
		aviao[0] = new Ex2Aviao( "Bold", "Latan", "Brasil", 50  );
		aviao[1] = new Ex2Aviao( "Bold2", "Bomm", "Bolivia", 70 );
		aviao[2] = new Ex2Aviao( "Bold3", "Bran", "Argentina", 90 );
		
		for(Ex2Aviao roda:aviao) {
	    	roda.imprimir();
		}	
	}
}
