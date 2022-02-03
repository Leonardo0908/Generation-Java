package Desafios;

public class Desafio3 {
	 public static void main(String[] args) {
		
		/* double numA = Math.pow( 6 * (3 + 2) , 2) / (3*2);
		 double numB = Math.pow( (1 - 5) * (2 - 7) , 2) / 2;
		 double inferior = Math.pow(10, 3);
		 double num = 0, numF = 0;
		 
		 num = numA - numB / inferior;
		 
		 numF = Math.pow(num, 3);
		 
		 System.out.println(numF);
		 */
		 
		 double numA = Math.pow(6 * (3+2), 2);
		 double denA = 3 * 2;
		 
		 double numB = (1 - 5) * (2 - 7);
		 double denB = 2;
		 
		 double superiorA = numA / denA;
		 double superiorB = Math.pow(numB/ denB, 2);
		 
		 double superior = Math.pow(superiorA - superiorB, 3);
		 double inferior = Math.pow(10, 3);
		 
		 double resultado = superior / inferior;
		 
		 System.out.println("O resultado é " + resultado );
	}
}
