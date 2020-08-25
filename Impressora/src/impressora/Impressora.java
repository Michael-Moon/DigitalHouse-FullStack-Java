package impressora;

import java.util.ArrayList;
import java.util.List;

public class Impressora {
    private List <Imprimivel> listaImprimivel = new ArrayList<>();

    public void imprimirTudo(){

        for (int i=0; i < listaImprimivel.size(); i++){
            listaImprimivel.get(i).imprimir();
        }
    }

    public void adicionarImprimivel(Imprimivel umImprimivel){
        listaImprimivel.add(umImprimivel);
    }

}