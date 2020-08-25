package voador;

public class Aviao implements Voador {

	private  Integer hrsVoo;
	
	
	public Aviao() {
		
	}

	public Aviao(Integer hrsVoo) {
		super();
		this.hrsVoo = hrsVoo;
	}

	public  void somaHrsVoo() {
		this.hrsVoo += 13 ;		
	}


	@Override
	public void voar() {
		somaHrsVoo();
		// TODO Auto-generated method stub
		System.out.println("“Estou voando como um avião”");
	}

}
