package fundamentos;

import java.util.Scanner;

public class TipoStriingEquals {
	public static void main(String[] args) {
		
		System.out.println("2" == "2");
		
		String s = new String("2");
		
		System.out.println("2" == s);// demostrando false e true 
		System.out.println("2".equals(s));
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.next();//nextLine faz deixar os espa�os em brancos ao digitar 
		
		System.out.println("2" == s2.trim());
		System.out.println("2".equals(s2.trim()) );//trim tira os espa�os em branco
		
		entrada.close();
	}
}
