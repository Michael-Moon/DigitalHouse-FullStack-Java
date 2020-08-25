package impressora;

public class Main {

	public static void main(String[] args){

        Contrato contrato = new Contrato("ContratoImobiliario", "pdf");
        Foto foto = new Foto("GatinhoFofinho", "jpg");
        Documento documento = new Documento("AulaGit","docx");

        Impressora impressora = new Impressora();
        impressora.adicionarImprimivel(contrato);
        impressora.adicionarImprimivel(foto);
        impressora.adicionarImprimivel(documento);

        impressora.imprimirTudo();

    }

}
