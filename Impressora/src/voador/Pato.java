package voador;

public class Pato implements Voador {

	private  Integer energia;
	
	
	
	public Pato() {
		
	}
	
	public Pato(Integer energia) {
		super();
		this.energia = energia;
	}
	
	public  void perdeEnergia () {
		this.energia -= 5;
	}


	@Override
	public void voar() {
		perdeEnergia();
		// TODO Auto-generated method stub
		System.out.println("“Estou voando como um pato” ");
	}

}
