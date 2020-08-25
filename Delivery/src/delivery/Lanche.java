package delivery;

public abstract class Lanche {

	private Double preco;
	//private Double distancia;

	public Lanche() {
		
	}

	public Lanche(Double preco) {
		
		this.preco = preco;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public Double tempolocalMinutos(Double distancia) {
		
		return distancia*10;
	}

}
