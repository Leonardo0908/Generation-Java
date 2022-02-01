package ExPOO;

public class Ex4Funcionario {
	
	private String nome;
	private String area;
	private int idade;
	private float salario;
	private int codigoF;
	
	Ex4Funcionario(String nome, String area,int idade,float salario, int codigo){
		this.nome = nome;
		this.area = area;
		this.idade = idade;
		this.salario = salario;
		this.codigoF = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public int getCodigoF() {
		return codigoF;
	}

	public void setCodigoF(int codigoF) {
		this.codigoF = codigoF;
	}
	public void imprimirFuncionario() {
		System.out.println("\n nome: "+nome+"\n area: "+area+"\n idade: "+idade+"\n salario: "
				+salario+"\n codigo: "+codigoF);
	}
}
