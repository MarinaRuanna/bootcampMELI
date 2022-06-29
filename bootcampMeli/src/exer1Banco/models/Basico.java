package exer1Banco.models;


import exer1Banco.utils.ConsultaSaldo;
import exer1Banco.utils.PagamentoServicos;
import exer1Banco.utils.SaqueEmDinheiro;

public class Basico extends Clientes implements ConsultaSaldo, PagamentoServicos, SaqueEmDinheiro {

    @Override
    public void consultarSaldo() {
        System.out.println("Saldo exibido");
    }

    @Override
    public void pagamentoservicos() {
        System.out.println("Pagamento realizado com sucesso");

    }

    @Override
    public void saqueEmDinheiro() {
        System.out.println("Saque realizado com sucesso");
    }

    @Override
    public void transacaoOk() {

    }

    @Override
    public void transacaoNaoOk() {

    }
}
