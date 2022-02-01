package ProjetoOng2;

public class Verbas extends Pessoa{
		
	private int codigoVerba;
	private int verba;
	
	public Verbas(  String nome, String cpf, int idade ,int codigoVerba,int verba) {
		super(nome,cpf,idade);
		this.codigoVerba = codigoVerba;
		this.verba = verba;
	}

	public int getCodigoVerba() {
		return codigoVerba;
	}

	public void setCodigoVerba(int codigoVerba) {
		this.codigoVerba = codigoVerba;
	}
	
	
	public int getVerba() {
		return verba;
	}

	public void setVerba(int verba) {
		this.verba = verba;
	}

	public void imprimirVerba() {
		System.out.println("\n Nome: "+getNome()+"\n CPF: "+getCpf()+"\n Idade: "+getIdade()+
				"\n Codigo do Voluntario: "+codigoVerba+"\n com Valor de entrade de: "+verba  );
	}
	public void imprimirVerba2() {
		System.out.println("\n Nome: "+getNome()+"\n CPF: "+getCpf()+"\n Idade: "+getIdade()+
				"\n Codigo do Voluntario: "+codigoVerba+"\n com Valor de Saida de: "+verba  );
	}
}

