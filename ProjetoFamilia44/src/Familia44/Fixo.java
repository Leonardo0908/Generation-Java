package Familia44;

public class Fixo extends Telefone{

		public Fixo() {
			super("Telefone Fixo");
		}
		@Override
		public void toca(int numToques) {
			for(int i = 0;i < numToques;i++) {
				System.out.println("\n Toque..."+i);
			}
		}
		@Override
		public void disca(String numero) {
			System.out.println("\n Discando: "+numero);
		}
}
