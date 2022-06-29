package exer1Banco.utils;


public interface Transferencia extends Transacoes {

    void tranferencia();

    @Override
    void transacaoOk();

    @Override
    void transacaoNaoOk();
}
