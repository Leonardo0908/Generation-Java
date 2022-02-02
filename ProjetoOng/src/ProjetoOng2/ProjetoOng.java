package ProjetoOng2;

import java.util.Scanner;

public class ProjetoOng {
	
	public static void main(String[] args) {
		
		int op = 0,num = 0;
		float ver,ver2,total = 1000000;
		String nome1,cpf1;
		int idade1,codigo1;
		
		Scanner entrada = new Scanner(System.in);
		//Pessoa Voluntario = new Pessoa();
		//Pessoa Parceiro = new Pessoa();
		//Pessoa Ong = new Pessoa();
	
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
				
				System.out.println("\n Digite o nome: ");
				nome1 = entrada.next();
				System.out.println("\n Digite o CPF: ");
				cpf1 = entrada.next();
				System.out.println("\n Digite a Idade: ");
				idade1 = entrada.nextInt();
				System.out.println("\n Digite o código: ");
				codigo1 = entrada.nextInt();
				
				Voluntario vol = new Voluntario(nome1,cpf1,idade1,codigo1);
				vol.imprimirVoluntario();
				break;
			case 2:
				System.out.println("\n --Cadastrar nova     Ong    -- digite 2");
				
				System.out.println("\n Digite o nome: ");
				nome1 = entrada.next();
				System.out.println("\n Digite o CPF: ");
				cpf1 = entrada.next();
				System.out.println("\n Digite a Idade: ");
				idade1 = entrada.nextInt();
				System.out.println("\n Digite o código: ");
				codigo1 = entrada.nextInt();
				
				Ong ong1 = new Ong("Amigos do Planeta","32165498701",5,54345);
				
				ong1.imprimirOng();
				break;
			case 3:
				System.out.println("\n --Cadastrar novo   Paceiro  -- digite 3");
				
				System.out.println("\n Digite o nome: ");
				nome1 = entrada.next();
				System.out.println("\n Digite o CPF: ");
				cpf1 = entrada.next();
				System.out.println("\n Digite a Idade: ");
				idade1 = entrada.nextInt();
				System.out.println("\n Digite o código: ");
				codigo1 = entrada.nextInt();
				
				Parceiros parceiro = new Parceiros("Keyla","98765432101",20,54322);
				
				parceiro.imprimirParceiro();
				break;
			case 4:	
				System.out.println("\n --Entrada e Saida de Verbas -- digite 4");
				System.out.println("\n Digite 0 para entrada \n \t ou \n Digite 1 para saida");
				// variavel num para poder cair no laço if entrada ou saida de verba.
				num = entrada.nextInt();
				
				if(num == 0) {
					
					System.out.println("\n Digite o nome: ");
					nome1 = entrada.next();
					System.out.println("\n Digite o CPF: ");
					cpf1 = entrada.next();
					System.out.println("\n Digite a Idade: ");
					idade1 = entrada.nextInt();
					System.out.println("\n Digite o código: ");
					codigo1 = entrada.nextInt();
					System.out.println("\n Digite o valor da Verba: ");
					ver = entrada.nextInt();
					
					Verbas verba = new Verbas("Lary","98765432102",18,54323,2000);
					//Adicionando verba ao total 
					total = total + ver;
					
					verba.imprimirVerba();
					System.out.println(total);
				}else if(num == 1) {
					
					System.out.println("\n Digite o nome: ");
					nome1 = entrada.next();
					System.out.println("\n Digite o CPF: ");
					cpf1 = entrada.next();
					System.out.println("\n Digite a Idade: ");
					idade1 = entrada.nextInt();
					System.out.println("\n Digite o código: ");
					codigo1 = entrada.nextInt();
					System.out.println("\n Digite o valor da Verba: ");
					ver2 = entrada.nextInt();
					
					Verbas verba2 = new Verbas("Leo","98765432103",40,54324,2005);
					//subtraindo verba do total
					total -=ver2;
					
					verba2.imprimirVerba2();
					System.out.println(total);
				}
				
				//verba.imprimirVerba();
				break;
			case 5:
				System.out.println("\n --Imprimir Informações      -- digite 5");
				
				
				//verba.imprimirVerba();
				//verba2.imprimirVerba2();
				break;
			default:
				if(op != 0) {
				System.out.println("\n Opção Inválida...");
				}
			}
		}while(op != 0 );
		
		System.out.println("\n Fim do Programa...");
	}
}
//Runtime.getRuntime().exec("clear");
//new ProcessBuilder("cls").inheritIO().start().waitFor();


