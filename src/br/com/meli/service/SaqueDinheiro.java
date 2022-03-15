package br.com.meli.service;

public class SaqueDinheiro implements Transacao {
    @Override
    public void transacao() {
        System.out.println("Saque bem sucedido");
    }

}
