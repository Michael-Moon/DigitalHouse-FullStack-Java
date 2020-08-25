package delivery;

import java.util.List;

public class Sanduiche extends Lanche {


	private List<String> ingredientes;
	
	public Sanduiche() {
		
	}
	
	
	public Sanduiche(Double preco, List<String> ingredientes) {
		super(preco);
		this.ingredientes = ingredientes;
	}



	public Double tempoPreparo(double distancia) {
		return 15 + super.tempolocalMinutos(distancia);
	}
	
}
