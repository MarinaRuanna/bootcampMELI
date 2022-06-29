package exer1Banco;

import exer1Banco.models.Basico;
import exer1Banco.models.Colaborador;
import exer1Banco.models.Executivo;

public class Banco {
    public static void main(String[] args) {

        Basico b = new Basico();
        b.pagamentoservicos();
        b.consultarSaldo();
        b.saqueEmDinheiro();

        Colaborador c = new Colaborador();
        c.consultarSaldo();
        c.saqueEmDinheiro();

        Executivo e = new Executivo();
        e.deposito();
        e.tranferencia();


    }
}
