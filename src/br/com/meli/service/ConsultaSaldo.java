package br.com.meli.service;

public class ConsultaSaldo implements Transacao {
    @Override
    public void transacao() {
        System.out.println("Saldo consultado com sucesso");
    }

}
