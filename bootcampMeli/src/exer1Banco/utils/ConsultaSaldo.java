package exer1Banco.utils;


public interface ConsultaSaldo extends Transacoes {

    void consultarSaldo();

    @Override
    void transacaoOk();

    @Override
    void transacaoNaoOk();
}
