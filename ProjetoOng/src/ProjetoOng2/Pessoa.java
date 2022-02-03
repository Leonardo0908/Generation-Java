package ProjetoOng2;

import java.util.Scanner;

public class Pessoa {
	
	Scanner leia = new Scanner(System.in);
	
	private String nome;
	private String cpf;
	private String email;
	private int idade;
	
	public Pessoa(String nome, String cpf, int idade) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}






/*
package ProjetoOng2;

import java.util.Scanner;

public class Pessoa {

	private String nome;
	private String cpf;
	private String email;
	private int idade;
	
	Scanner leia = new Scanner(System.in);
	
	public Pessoa() {
		super();
	} 
	
	public void imprimirInfo() {
		System.out.println("Nome: "+nome+"\n CPF/CNPJ: "+cpf+"\nIdade: "+idade+"\nEmail: "+email);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Scanner getLeia() {
		return leia;
	}

	public void setLeia(Scanner leia) {
		this.leia = leia;
	}

	public void validaCpf() {
		if(getCpf().length() !=11) {
			System.out.println("\n--CPF Inválido!!!--");
		}else {
			System.out.println("\n--CPF Válido!!!--");
		}
	}	
	public void validaIdade() {
		if(idade < 16 || idade > 60) {
			System.out.println("\n Idade Inválida...");
		}else {
			System.out.println("\n Idade válida...");
		}
	}
	public void info() {
		System.out.println("Nome Completo: ");
		nome = leia.next();
		System.out.println("CPF/CNPJ: ");
		cpf = leia.next();
		System.out.println("Idade: ");
		idade = leia.nextInt();
		System.out.println("Email: ");
		email = leia.next();
	}
}

*/