package heranca;

public class Cachorro extends Animal {
	
	private boolean deveCorrer;
	
	public Cachorro(String nome,int idade,boolean emitirSom,boolean deveCorrer) {
		super(nome,idade,emitirSom);
		this.deveCorrer = deveCorrer;
	}

	public boolean isDeveCorrer() {
		return deveCorrer;
	}

	public void setDeveCorrer(boolean deveCorrer) {
		this.deveCorrer = deveCorrer;
	}
	
	public void imprimiCao() {
		System.out.println("\n Nome: "+ getNome()+"\n Idade: "+getIdade()+"\n deve emitir som: "+getEmitirSom()
		+"\n deve correr: "+deveCorrer);
	}
	
	
}
