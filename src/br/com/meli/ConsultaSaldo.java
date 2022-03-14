package br.com.meli;

public class ConsultaSaldo implements Transacao {
    @Override
    public void transacaoOk() {
        System.out.println("Saldo consultado com sucesso");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("Falha em consultar saldo");
    }
}
