package impressora;

public class Contrato implements Imprimivel {
    private String nome;
    private String tipo;

    public Contrato(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    @Override
    public void imprimir() {
        System.out.println("Sou um contrato muito legal. - Nome: " + nome +  "." + tipo);
    }
}