package entities;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(String numero) {
		super(numero);
	}
	
		public void renderJuros(double Taxa) {
			creditar(getSaldo()*Taxa);
		}
	
}