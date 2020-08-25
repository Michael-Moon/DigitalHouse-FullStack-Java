package dados;

public class ContaPoupanca extends Conta {

	private Double taxaJuros;
	
	public ContaPoupanca() {
		super();
		// TODO Auto-generated constructor stub
	}	

	public ContaPoupanca(Double taxaJuros,Double saldo) {
		super(saldo);
		this.taxaJuros = taxaJuros;
	}

	public Double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(Double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	
	@Override
	public void saqueDinheiro(double saque) {
		double limite = getSaldo() - saque;
		if(limite >= 0) {
			super.saqueDinheiro(saque);
		}else {
			System.out.println("Valor maior que saldo disponivel");
		}
	}
	@Override
	public void recolherjuros() {
		double valor = getSaldo() * this.taxaJuros;
		super.depositarDinheiro(valor);
	}

	@Override
	public String toString() {
		return "Conta Poupança [taxaJuros=" + taxaJuros + ", Saldo= " + getSaldo() + "]";
	}

	
}
