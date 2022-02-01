package ExPOO;

import java.util.Scanner;

public class Cliente {
	
	double vp,vt;
	
	Scanner leia = new Scanner(System.in);
	
	private String nomeCliente;
	private int codigoCliente;
	
	public Cliente (String nome, int codigo) {
		this.nomeCliente = nome;
		this.codigoCliente = codigo;
	}

	public double getVp() {
		return vp;
	}

	public void setVp(double vp) {
		this.vp = vp;
	}

	public double getVt() {
		return vt;
	}

	public void setVt(double vt) {
		this.vt = vt;
	}

	public Scanner getLeia() {
		return leia;
	}

	public void setLeia(Scanner leia) {
		this.leia = leia;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	
	public double valorTotal(double vt) {
		System.out.println("\n O Valor de cada produto deve ser inserido "
				+"individualmente\n Para finalizar entre com 0 ou algum número negativo: ");
		
		do {
			
			System.out.println("\n Entre com o Valor: ");
			vp = leia.nextDouble();
			if(vp > 0) {
			vt = vt + vp;
			}
		}while(vp > 0);
		return vt;
	}
	
	public String getInfo() {
		String info = nomeCliente + "\t\t" + codigoCliente;
		return info;
	}
	
	public void comprar() {
		System.out.printf("\n Total: %.2f \n",this.valorTotal(0.0));
	}
}
