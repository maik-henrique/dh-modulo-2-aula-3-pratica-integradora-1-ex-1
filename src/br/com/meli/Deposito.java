package br.com.meli;

public class Deposito implements Transacao {
    @Override
    public void transacaoOk() {
        System.out.println("Depositado com sucesso");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("Depósito falhou");
    }
}
