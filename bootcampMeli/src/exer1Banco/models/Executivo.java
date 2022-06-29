package exer1Banco.models;


import exer1Banco.utils.Deposito;
import exer1Banco.utils.Transferencia;

public class Executivo extends Clientes implements Deposito, Transferencia {


    @Override
    public void deposito() {
        System.out.println("Fazendo déposito");
    }

    @Override
    public void tranferencia() {
        System.out.println("Fazendo transferência");
    }

    @Override
    public void transacaoOk() {

    }

    @Override
    public void transacaoNaoOk() {

    }
}
