package voador;

public class SuperHomem implements Voador {

	private Integer experiencia;
	
	
	
	public SuperHomem() {
		
	}
	
	public SuperHomem(Integer experiencia) {
		super();
		this.experiencia = experiencia;
	}

	public void perdeExperiencia() {
		this.experiencia -= 3;
	}
	
	@Override
	public void voar() {
		perdeExperiencia();
		// TODO Auto-generated method stub
		System.out.println("“Estou voando como um campeão”");
	}

}
