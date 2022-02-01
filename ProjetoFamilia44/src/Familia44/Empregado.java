package Familia44;

import java.text.NumberFormat;

public class Empregado {
	
	private String nome;
	private float salario;
	
	public Empregado(String n,float s) {
		this.setNome(n);
		this.setSalario(s);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public void aumentaSalario(float percentual) {
		salario *= 1 + percentual/100;
	}
	
	public String formatarMoeda() {
		// pega a moeda corrente 
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		//n�mero de casas depois da virgula 
		nf.setMinimumFractionDigits(2);
		//formata o atributo com uma formata��o monetaria 
		String formatoMoeda = nf.format(salario);
		return formatoMoeda;
	}
	
	public void imprimir() {
		System.out.println(nome+"\t\t"+ "sal�rio: "+this.formatarMoeda());
	}
}
