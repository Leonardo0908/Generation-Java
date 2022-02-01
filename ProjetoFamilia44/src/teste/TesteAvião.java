package teste;

import ExPOO.Aviao;
import Familia44.Empregado;

public class TesteAvião {
	public static void main(String[] args) {
		
		 Aviao[] aviao = new Aviao[3];
		
		aviao[0] = new Aviao( "Bold", "Latan", "Brasil", 50  );
		aviao[1] = new Aviao( "Bold2", "Bomm", "Bolivia", 70 );
		aviao[2] = new Aviao( "Bold3", "Bran", "Argentina", 90 );
		
		for(Aviao roda:aviao) {
	    	roda.imprimir();
		}	
	}
}
