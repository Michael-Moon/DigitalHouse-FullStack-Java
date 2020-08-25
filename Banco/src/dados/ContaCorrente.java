package dados;

public class ContaCorrente extends Conta {

	private Double limiteChequeEspecial;
	private Cheque cheque;

	public ContaCorrente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContaCorrente(Double limiteChequeEspecial, Double saldo ) {
		super(saldo);
		this.limiteChequeEspecial = limiteChequeEspecial;
	}

	public Double getLimiteChequeEspecial() {
		return limiteChequeEspecial;
	}

	public void setLimiteChequeEspecial(Double limiteChequeEspecial) {
		this.limiteChequeEspecial = limiteChequeEspecial;
	}
	
	@Override
	public void saqueDinheiro(double saque) {
		double limite = getSaldo() - saque; 
		if(limite + limiteChequeEspecial >= 0) {
			super.saqueDinheiro(saque);
			if(limite < 0) {
				 limiteChequeEspecial += limite;
				
			}
		}else {
			System.out.println("Valor maior que saldo disponivel");
		}
	}
	@Override
	public void depositarCheques(Cheque cheque) {
		
		super.depositarDinheiro(cheque.getValor());
		this.cheque = cheque;
	}

	@Override
	public String toString() {
		return "ContaCorrente [limite Cheque Especial: " + limiteChequeEspecial + ", Saldo: " + getSaldo() + "\nCheque depositado: " + cheque +"]";
	}

	
	
}
