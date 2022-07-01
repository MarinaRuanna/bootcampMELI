package praticaStream;

public class Veiculos implements Comparable<Veiculos>{

    private String modelo;
    private String marca;
    private double preco;

    public Veiculos(String modelo, String marca, double preco) {
        this.modelo = modelo;
        this.marca = marca;
        this.preco = preco;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return  "Modelo = " + modelo + "\n" +
                "Marca = " + marca + "\n" +
                "Preco = " + preco + "\n";
    }

    @Override
    public int compareTo(Veiculos o) {
        if(this.preco < o.getPreco())
            return -1;
        else if(o.getPreco() < this.preco)
            return 1;
        return 0;
    }
}
