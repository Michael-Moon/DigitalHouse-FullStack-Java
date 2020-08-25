package delivery;

public class Massa  extends Lanche {

	private String molho;
	private TiposMassa tipo;

	public Massa() {
		super();		
	}

	public Massa(Double preco, String molho, TiposMassa tipo) {
		super(preco);
		this.molho = molho;
		this.tipo = tipo;
	}




	public String getMolho() {
		return molho;
	}

	public void setMolho(String molho) {
		this.molho = molho;
	}

	public TiposMassa getTipo() {
		return tipo;
	}

	public void setTipo(TiposMassa tipo) {
		this.tipo = tipo;
	}

	public Double tempoPreparo(double distancia) {
		return 30 + super.tempolocalMinutos(distancia);
	}
	
}
