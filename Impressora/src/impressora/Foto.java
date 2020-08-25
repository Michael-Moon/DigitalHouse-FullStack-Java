package impressora;

public class Foto implements Imprimivel {
    private String nome;
    private String tipo;

    public Foto(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    @Override
    public void imprimir() {
        System.out.println("Sou uma Selfie. - Nome: " + nome+  "." + tipo);
    }
}