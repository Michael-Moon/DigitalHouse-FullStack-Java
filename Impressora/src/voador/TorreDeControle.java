package voador;

import java.util.ArrayList;
import java.util.List;

public class TorreDeControle {

	private List<Voador> listVoadores = new ArrayList<>();
	
	public void voemTodos() {
		for(int i=0; i < listVoadores.size(); i++) {
			listVoadores.get(i).voar();
		
		}
	}
	public void adicionarVoador(Voador voador) {
		listVoadores.add(voador);
	}
}
