package br.com.meli;

public class Transferencia implements Transacao {
    @Override
    public void transacaoOk() {
        System.out.println("Transferência bem sucedidade");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("Transferência falhou");
    }
}
