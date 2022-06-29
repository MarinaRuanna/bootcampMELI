package exer1Banco.utils;


public interface Deposito extends Transacoes{

    void deposito();

    @Override
    void transacaoOk();

    @Override
    void transacaoNaoOk();
}
