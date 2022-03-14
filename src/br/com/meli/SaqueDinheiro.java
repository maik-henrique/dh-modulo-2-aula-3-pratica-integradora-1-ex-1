package br.com.meli;

public class SaqueDinheiro implements Transacao {
    @Override
    public void transacaoOk() {
        System.out.println("Saque bem sucedido");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("Saque mal sucedido");
    }
}
