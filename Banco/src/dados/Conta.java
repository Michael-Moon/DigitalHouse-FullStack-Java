package dados;

public abstract class Conta {
	
	private Double saldo;
		
	public Conta() {
	}

	public Conta(Double saldo) {
		
		this.saldo = saldo;		
	}

	
	public Double getSaldo() {
		return saldo;
	}

	
	public String depositarDinheiro(double deposito) {
		this.saldo += deposito;
		return "Deposito no valor: " + deposito + " Feito com sucesso, novo saldo: " + this.saldo;
	}
	
	public void saqueDinheiro(double saque) {
				
		this.saldo -= saque;
		
	}
	public String consultarSaldo() {
		return "Saldo: " + this.saldo;
	}
	
	public void depositarCheques(Cheque cheque) {

	}
	public void recolherjuros() {
		
	}

	@Override
	public String toString() {
		return "Conta [saldo: " + saldo + "]";
	}

	
	
	
}
