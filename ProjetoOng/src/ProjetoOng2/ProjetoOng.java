package ProjetoOng2;

import java.util.Scanner;

public class ProjetoOng {
	public static void main(String[] args) {
		
		int op = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		 Voluntario vol = new Voluntario("Mayara","12345678901",30,54321);
		 Ong ong1 = new Ong("Amigos do Planeta","32165498701",5,54345);
		 Parceiros parceiro = new Parceiros("Keyla","98765432101",20,54322);
		 Verbas verba = new Verbas("Lary","98765432102",18,54323,2000);
		 Verbas verba2 = new Verbas("Leo","98765432103",40,54324,2005);
		
		do {
			System.out.println("\n\n\t   Menu de Opções... ");
			System.out.println("\n --Cadastrar novo voluntario -- digite 1");
			System.out.println("\n --Cadastrar nova     Ong    -- digite 2");
			System.out.println("\n --Cadastrar novo   Paceiro  -- digite 3");
			System.out.println("\n --Entrada e Saida de Verbas -- digite 4");
			System.out.println("\n --Imprimir Informações      -- digite 5");
			System.out.println("\n       -- DIGITE 0 PARA FINALIZAR  --");
			op = entrada.nextInt();
			
			
			
			switch (op) {
			
			case 1:
				System.out.println("\n --Cadastrar novo voluntario -- digite 1");
				vol.imprimirVoluntario();
				break;
			case 2:
				System.out.println("\n --Cadastrar nova     Ong    -- digite 2");
				ong1.imprimirOng();
				break;
			case 3:
				System.out.println("\n --Cadastrar novo   Paceiro  -- digite 3");
				parceiro.imprimirParceiro();
				break;
			case 4:	
				System.out.println("\n --Entrada e Saida de Verbas -- digite 4");
				verba.imprimirVerba();
				break;
			case 5:
				System.out.println("\n --Imprimir Informações      -- digite 5");
				vol.imprimirVoluntario();
				ong1.imprimirOng();
				parceiro.imprimirParceiro();
				verba.imprimirVerba();
				verba2.imprimirVerba2();
				break;
			default:
				if(op != 0) {
				System.out.println("\n Opção Inválida...");
				}
			}
		}while(op != 0 );
	}
}
//Runtime.getRuntime().exec("clear");
//new ProcessBuilder("cls").inheritIO().start().waitFor();


