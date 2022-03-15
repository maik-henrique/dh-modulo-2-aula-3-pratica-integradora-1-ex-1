package br.com.meli.service;

public class Executivo extends Cliente {
    private final Transacao transferencia;
    private final Transacao deposito;

    public Executivo(Transacao transferencia, Transacao deposito) {
        this.transferencia = transferencia;
        this.deposito = deposito;
    }

    public void transferir() {
        transferencia.transacao();
    }

    public void depositar() {
        deposito.transacao();
    }
}
