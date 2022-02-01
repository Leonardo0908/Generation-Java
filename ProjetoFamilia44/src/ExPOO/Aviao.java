package ExPOO;

import java.util.Scanner;

public class Aviao {
	
	private String nome;
	private String marca;
	private String voo;
	private int tamanhoM;
	
	
	Scanner entrada = new Scanner(System.in);
	
	public Aviao (String nome,String mar,String voo,int tam ) {
		this.nome = nome;
		this.marca = mar;
		this.voo = voo;
		this.tamanhoM = tam;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getVoo() {
		return voo;
	}

	public void setVoo(String voo) {
		this.voo = voo;
	}

	public int getTamanho() {
		return tamanhoM;
	}

	public void setTamanho(int tamanho) {
		this.tamanhoM = tamanho;
	}

	public Scanner getEntrada() {
		return entrada;
	}

	public void setEntrada(Scanner entrada) {
		this.entrada = entrada;
	}
	public String getInfor() {
		String Infor = nome+ " " +marca+" "+voo+" "+tamanhoM;
		return Infor;
	}
	public void imprimir() {
		System.out.println(" Avião: "+nome+ "\n Modelo: " +marca+"\n Destino: "+voo+"\n Comprimento: "+tamanhoM+"\n\n");
	}
}
