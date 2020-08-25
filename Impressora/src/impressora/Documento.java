package impressora;

public class Documento implements Imprimivel {
    private String nome;
    private String tipo;

    public Documento(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    @Override
    public void imprimir() {
        System.out.println("Sou um documento do Word. - Nome: " + nome +   "." +  tipo);
    }
}