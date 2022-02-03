package ProjetoOng2;

public class Verbas extends Pessoa{
		
	private int codigoVerba;
	private float verba;

	public Verbas(  String nome, String cpf, int idade ,int codigoVerba,float verba) {
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
	
	
	public float getVerba() {
		return verba;
	}

	public void setVerba(float verba) {
		this.verba = verba;
	}
	
	public void imprimirVerba() {
		System.out.println("\n Nome: "+getNome()+"\n CPF: "+getCpf()+"\n Idade : "+getIdade()+
				"\n Codigo do Voluntario: "+codigoVerba+"\n com Valor de entrade de R$: "+verba);
	}
	public void imprimirVerba2() {
		System.out.println("\n Nome: "+getNome()+"\n CPF: "+getCpf()+"\n Idade : "+getIdade()+
				"\n Codigo do Voluntario: "+codigoVerba+"\n com Valor de Saida de R$: "+verba);
	}
}

