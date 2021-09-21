package entities;

public class Banco {

	public int num;
	public String titular;
	public double deposito;
	
	public Banco(int num, String titular, double deposito) {
		this.num = num;
		this.titular = titular;
		this.deposito = deposito;
	}
	
	
	public double totalSaldo() {
		return deposito;
	}
	
	public void deposito(double deposito) {
		this.deposito += deposito;
	}
	
	public void saque(double deposito) {
		this.deposito -= deposito + 5;
	}
	
	public String toString() {
		return "Account "
			+ num
			+ ", Holder: "
			+ titular
			+ ", Balance: $ "
			+ String.format("%.2f", totalSaldo());
	}

	
}
