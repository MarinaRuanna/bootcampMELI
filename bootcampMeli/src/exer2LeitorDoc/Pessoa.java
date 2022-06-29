package exer2LeitorDoc;
import java.util.List;

public class Pessoa {

    String nome;
    int idade;
    List<Habilidade> habilidades;

    public Pessoa(String nome, int idade, List<Habilidade> habilidades) {
        this.nome = nome;
        this.idade = idade;
    }

    public String programar(){
        return  "Sabe Programar em Java";
    }

    public String falaIngles(){
        return "Inglês Avançado";
    }

    @Override
    public String toString() {
        return "nome = " + nome + "\n" +
                "idade = " + idade + "\n" +
                "habilidades = " + habilidades + "\n";
    }
}
