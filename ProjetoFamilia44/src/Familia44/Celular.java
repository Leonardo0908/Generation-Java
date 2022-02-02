package Familia44;

public class Celular extends Telefone {
	
	public Celular() {
		super("Telefone Celular");
	}
	@Override
	public void toca(int codigoToque) {
		switch(codigoToque) {
		case 1:
			System.out.println("\n Tanãnãnã tanãnãnã...");
			break;
		case 2:
			System.out.println("\n Panãnãnã panãnanã");
			break;
		default:
			System.out.println("\n Tinãnã...nãnini");
			break;
		}
	}
	@Override
	public void disca(String numero) {
		System.out.println("\n O número: "+numero+" é um celular...");
	}
}
