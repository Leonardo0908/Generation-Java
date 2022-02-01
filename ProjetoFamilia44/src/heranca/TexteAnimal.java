package heranca;

public class TexteAnimal {
	public static void main(String[] args) {
		
		Cachorro cao = new Cachorro("Boby",5,true,true);
		Cavalo cal = new Cavalo("Alasão",2,true,false);
		Preguica pe = new Preguica("Side",3,false,true);
		
		cao.imprimiCao();
		cal.imprimiCavalo();
		pe.imprimiPre();
	}
	
}
