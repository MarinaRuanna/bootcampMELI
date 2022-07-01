package pratica4Interfaces.exer1Banco;

import pratica4Interfaces.exer1Banco.models.Basico;
import pratica4Interfaces.exer1Banco.models.Cobrador;
import pratica4Interfaces.exer1Banco.models.Executivo;

public class Banco {
    public static void main(String[] args) {

        Basico b = new Basico();
        b.pagamentoservicos();
        b.consultarSaldo();
        b.saqueEmDinheiro();

        Cobrador c = new Cobrador();
        c.consultarSaldo();
        c.saqueEmDinheiro();

        Executivo e = new Executivo();
        e.deposito();
        e.tranferencia();


    }
}
