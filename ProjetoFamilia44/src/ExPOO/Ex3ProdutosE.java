package ExPOO;

import java.util.Scanner;

public class Ex3ProdutosE {
	private String nome;
	private float valor;
	private int validade;
	
	float valor1;
	
	Scanner entrada = new Scanner(System.in);
	
	public Ex3ProdutosE (String nome,float valor,int validade) {
		this.nome = nome;
		this.valor = valor;
		this.validade = validade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public int getValidade() {
		return validade;
	}

	public void setValidade(int validade) {
		this.validade = validade;
	}
	
	public void ValorProduto() {
		System.out.println("\n Valor do Produto tem que ser maior que 0");
		System.out.println("\n Digite o valor do produto: ");
		valor1 = entrada.nextFloat();
		valor = valor1;
	}
	public void imprimirInfo() {
		System.out.println("\n nome: "+nome+"\n com valor de "+valor+"\n com validade de: "+validade);
	}
}
