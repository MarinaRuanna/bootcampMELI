package praticaStream;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Veiculos fordFiesta = new Veiculos("Ford", "Fiesta", 1000);
        Veiculos fordFocus = new Veiculos("Ford", "Focus", 1200);
        Veiculos fordExplorer = new Veiculos("Ford", "Explores", 2500);
        Veiculos fiatUno = new Veiculos("Fiat", "Uno", 500);
        Veiculos fiatCronos = new Veiculos("Fiat", "Cronos", 1000);
        Veiculos fiatTorino = new Veiculos("Fiat", "Torino", 1250);
        Veiculos chevroletAveo = new Veiculos("Chevrolet", "Aveo", 1250);
        Veiculos chevroletSpin = new Veiculos("Chevrolet", "Spin", 2500);
        Veiculos toyotaCorola = new Veiculos("Toyota", "Corola", 1200);
        Veiculos toyotaFortuner = new Veiculos("Toyota", "Fortuner", 3000);
        Veiculos renaultLogan = new Veiculos("Renault", "Logan", 950);

        List<Veiculos> listaVeiculos = Arrays.asList
                (
                fordFiesta,
                fordFocus,
                fordExplorer,
                fiatUno,
                fiatCronos,
                fiatTorino,
                chevroletAveo,
                chevroletSpin,
                toyotaCorola,
                toyotaFortuner,
                renaultLogan
                );

        Garagem garagem = new Garagem(1, listaVeiculos);

        garagem.listaDecrescente();

        listaVeiculos.stream().map(Veiculos::getPreco).sorted((v1, v2) -> Double.compare(v2, v1)).forEach(System.out::println);

    }
}
