package ProjetoOng2;

public class Pessoa {
	
	private String nome;
	private String cpf;
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
}
