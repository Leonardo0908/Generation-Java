package fundamentos;

import javax.swing.JOptionPane;

public class ConvrsaoStringNumero {
	public static void main(String[] args) {
		
		String valor1 = JOptionPane.showInputDialog(
				"Digite o primeiro valor: ");
		String valor2 = JOptionPane.showInputDialog(
				"Digite o segundo valor: ");
		
		System.out.println(valor1 + valor2);
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		double soma = numero1 +  numero2;
		System.out.println("Soma" + soma);
		System.out.println("meida é " + soma / 2);
		
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
		
		int num2 = 10000;
		System.out.println(Integer.toString(num2).length());
		
		System.out.println(("" + num1).length ());
		System.out.println(("" + num2).length ());
	}
}
