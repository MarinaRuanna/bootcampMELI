package praticaStream;

import java.util.Comparator;
import java.util.List;

public class Garagem {

    int id;
    List<Veiculos> listaVeiculos;

    public Garagem(int id, List<Veiculos> listaVeiculos) {
        this.id = id;
        this.listaVeiculos = listaVeiculos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Veiculos> getListaVeiculos() {
        return listaVeiculos;
    }

    @Override
    public String toString() {
        return "id =" + id +
                "listaVeiculos = " + listaVeiculos
                ;
    }

    public void setListaVeiculos(List<Veiculos> listaVeiculos) {
        this.listaVeiculos = listaVeiculos;
    }
    public void listaDecrescente() {
        listaVeiculos.stream()
                .sorted(Comparator.comparing(Veiculos::getPreco))
                .forEach(System.out::println);

    }

    public void listaDecrescenteV2() {
        listaVeiculos.stream()
                .sorted((v1,v2) -> Double.compare(v2.getPreco(), v1.getPreco()))
                .forEach(System.out::println);
    }
}
