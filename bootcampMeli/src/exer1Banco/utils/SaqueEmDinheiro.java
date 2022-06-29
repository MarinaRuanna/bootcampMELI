package exer1Banco.utils;

public interface SaqueEmDinheiro extends Transacoes{

    void saqueEmDinheiro();

    @Override
    void transacaoOk();

    @Override
    void transacaoNaoOk();
}
