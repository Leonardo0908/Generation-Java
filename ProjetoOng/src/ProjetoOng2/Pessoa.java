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
