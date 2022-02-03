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
		
		Voluntario vol2 = new Voluntario("","",0,0);
		Ong ong2 = new Ong("","",0,0);
		Parceiros par2 = new Parceiros("","",0,0);
		Verbas ve = new Verbas("","",0,0,0);
		Verbas ve2 = new Verbas("","",0,0,0);
		
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
				vol2 = vol;
				
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
				
				Ong ong = new Ong(nome1,cpf1,idade1,codigo1);
				ong2 = ong;
				
				ong.imprimirOng();
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
				
				Parceiros par = new Parceiros(nome1,cpf1,idade1,codigo1);;
				par2 = par;
				
				par.imprimirParceiro();
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
					
					Verbas verba = new Verbas(nome1,cpf1,idade1,codigo1,ver);
					ve = verba;
					
					//Adicionando verba ao total 
					total = total + ver;
					
					System.out.println("\n Valor total em caixa é R$ "+total);
					
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
					
					Verbas verba2 = new Verbas(nome1,cpf1,idade1,codigo1,ver2);
					ve2 = verba2;
					
					//subtraindo verba do total
					total -=ver2;
					
					System.out.println("\n Valor total em caixa é R$: "+total);
					
					verba2.imprimirVerba2();
					System.out.println(total);
				}
				
				//verba.imprimirVerba();
				break;
			case 5:
				System.out.println("\n --Imprimir Informações      -- digite 5");
				
				System.out.println("\n voluntario ");
				vol2.imprimirVoluntario();
				
				System.out.println("\n  Ong  ");
				ong2.imprimirOng();
				
				System.out.println("\n Parceiro");
				par2.imprimirParceiro();
				
				System.out.println("\n Verba de Entrada... ");
				ve.imprimirVerba();
				
				System.out.println("\n Verba de Saída... ");
				ve2.imprimirVerba2();
				
				System.out.println("\n Valor total em caixa é R$ \n"+total);
				
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


