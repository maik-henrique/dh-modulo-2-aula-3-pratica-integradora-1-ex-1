package br.com.meli.service;

public class Deposito implements Transacao {
    @Override
    public void transacao() {
        System.out.println("Depositado com sucesso");
    }

}
