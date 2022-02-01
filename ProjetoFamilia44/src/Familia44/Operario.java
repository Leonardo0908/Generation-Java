package Familia44;

public class Operario extends Pessoa{
	
	private double valorProducao;
	private double comissao;
	
	public Operario(String  nome,String endereco,String cpf,int telefone,int idade,
			double valorProducao, double comissao) {
		super(nome, endereco,cpf,telefone,idade);
		
		this.valorProducao = valorProducao;
		this.comissao =comissao;

	}

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	public void imprimirInfo() {
		System.out.println("\n Nome do empregado: "+getNome()+ "\n CPF: "+getCpf()+
				"\n Idade: "+getIdade()+"\n Telefone: "+getTelefone()+"\n Endereco: "+getEndereco()+
				"\n Valor monetário total dos artigos produzidos por:"+ getNome()+" : "+valorProducao
				+"\n Porcentagem (sem o %) da comissão deste artigo: "+comissao);
	}
	
	public void calcularValorArtigo() {
		double valorTotal = valorProducao + (valorProducao * (comissao/100));
		System.out.println("\n O valor total a ser recebido peço operário "+getNome()+ 
				" será de: "+valorTotal );
	}
}
