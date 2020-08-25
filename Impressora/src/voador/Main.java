package voador;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aviao aviao = new Aviao(0);
		Pato pato = new Pato(15);
		SuperHomem superHoem = new SuperHomem(100);
		
		TorreDeControle torreDeControle = new TorreDeControle();
		
		torreDeControle.adicionarVoador(aviao);
		torreDeControle.adicionarVoador(pato);
		torreDeControle.adicionarVoador(superHoem);
		
		
		torreDeControle.voemTodos();
	}

}
