package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
//	(°F - 32) * 5/9 = °C	
		double f = 86;
		final int x = 32;
		
		final double n1 = 5.0 / 9.0;
		
 		
		double c1 = (f - x ) * n1;    
		
		System.out.printf("O valor em °C é " + c1);
		
	}
}
