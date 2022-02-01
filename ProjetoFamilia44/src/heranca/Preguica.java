package heranca;

public class Preguica extends Animal{
	
	private boolean deveSubirA;
		
	public Preguica(String nome,int idade,boolean emitirSom,boolean deveSubirA) {
		super(nome,idade,emitirSom);
		
		this.deveSubirA = deveSubirA;
	}

	public boolean getDeveSubirA() {
		return deveSubirA;
	}

	public void setDeveSubirA(boolean deveSubirA) {
		this.deveSubirA = deveSubirA;
	}
	
	public void imprimiPre() {
		System.out.println("\n Nome: "+ getNome()+"\n Idade: "+getIdade()+"\n deve emitir som: "+getEmitirSom()
		+"\n deve subir: "+deveSubirA);
	}
	

}
