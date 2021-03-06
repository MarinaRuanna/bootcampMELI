package pratica4Interfaces.exer2LeitorDoc;

public class Relatorio extends Documento {

    String text;
    int numPag;
    String autor;
    String revisor;

    public Relatorio(String text, int numPag, String autor, String revisor) {
        this.text = text;
        this.numPag = numPag;
        this.autor = autor;
        this.revisor = revisor;
    }

    @Override
    public String toString() {
        return "Relatório: " + "\n" +
                "Texto = " + text + "\n" +
                "Número de Páginas = " + numPag + "\n" +
                "Autor = " + autor + "\n" +
                "Revisor = " + revisor + "\n";
    }
}
