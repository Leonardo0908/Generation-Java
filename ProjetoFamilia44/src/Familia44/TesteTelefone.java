package Familia44;

public class TesteTelefone {
	
	public static void main(String[] args) {
		
		Celular celular = new Celular();
		Fixo fixo = new Fixo();
		Publico publico = new Publico();
		
		Telefone telefone = null;
		
		int n = (int) (Math.random()*3.0);
		
		System.out.println("\n P n�mero escolhido foi: "+n);
		
		switch(n) {
			case 0: telefone = celular; break;
			case 1: telefone = fixo; break;
			case 2: telefone = publico; break;
			default: System.out.println("\n Erro inesperado...");
		}
		
		if(telefone != null) {
			telefone.disca("92324544");
			telefone.toca(2);
		}
		
		
	}
}
