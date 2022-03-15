package br.com.meli.service;

public class Transferencia implements Transacao {
    @Override
    public void transacao() {
        System.out.println("Transferência bem sucedidade");
    }

}
