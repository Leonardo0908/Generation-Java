package ProjetoOng2;

import java.util.Scanner;

public class Voluntario extends Pessoa{
	
	private int codigoV;
	
	public Voluntario( String nome, String cpf, int idade ,int codigoV) {
		super(nome,cpf,idade);
		this.codigoV = codigoV;
	}
	String nome1,cpf1;
	int idade1,codigo1;
	
	Scanner entrada = new Scanner(System.in);
	
	
	public int getCodigoV() {
		return codigoV ;
	}

	public void setCodigoV(int codigoV) {
		this.codigoV = codigoV;
	}
	/*Apresentação do objeto vol ...
	 * sera se eu trocasse o get pot variaveis iria aparecer mas não ia usar mais a herança.	
	 */
	public void imprimirVoluntario() {
		System.out.println("\n Nome: "+getNome()+"\n CPF: "+getCpf()+"\n Idade: "+getIdade()+
				"\n Codigo do Voluntario: "+codigoV  );
	}
	/*public void validaCpf() {
		if(getCpf().length() !=11) {
			System.out.println("\n--CPF Inválido!!!--");
		}else {
			System.out.println("\n--CPF Válido!!!--");
		}
	}	
	public void validaIdade() {
		if(idade1 < 16 || idade1 > 60) {
			System.out.println("\n Idade Inválida...");
		}else {
			System.out.println("\n Idade válida...");
		}
	}
	*/
}
