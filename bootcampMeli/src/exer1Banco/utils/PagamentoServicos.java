package exer1Banco.utils;

public interface PagamentoServicos extends Transacoes{

    void pagamentoservicos();

    @Override
    void transacaoOk();

    @Override
    void transacaoNaoOk();
}
