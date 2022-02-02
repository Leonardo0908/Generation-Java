package Familia44;

public class Celular extends Telefone {
	
	public Celular() {
		super("Telefone Celular");
	}
	@Override
	public void toca(int codigoToque) {
		switch(codigoToque) {
		case 1:
			System.out.println("\n Tan�n�n� tan�n�n�...");
			break;
		case 2:
			System.out.println("\n Pan�n�n� pan�nan�");
			break;
		default:
			System.out.println("\n Tin�n�...n�nini");
			break;
		}
	}
	@Override
	public void disca(String numero) {
		System.out.println("\n O n�mero: "+numero+" � um celular...");
	}
}
