package Familia44;

public class TesteEmpregado {
	public static void main(String[] args) {
		
		Empregado[] emp = new Empregado[3];
		
		emp[0] = new Empregado("Lara", 2500);
		emp[1] = new Empregado("Tallyson Aureliano",5000);
		emp[2] = new Empregado("Sarah",7000);
		
		
		for(Empregado roda:emp) {
			roda.imprimir();
		}
		System.out.println("\n********************************************");
		
		for(Empregado roda:emp) {
			roda.aumentaSalario(10);
			roda.imprimir();
		}
	}
}
