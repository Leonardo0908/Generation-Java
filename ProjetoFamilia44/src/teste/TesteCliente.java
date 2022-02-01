package teste;

import ExPOO.Cliente;

public class TesteCliente {
	 public static void main(String[] args) {
		
		 Cliente cliente1 = new Cliente("Graldo Vedrossi", 1234);
		 
		 cliente1.comprar();
		 
		 System.out.println(cliente1.getInfo());
	}
	 
}
