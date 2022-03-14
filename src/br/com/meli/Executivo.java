package br.com.meli;

public class Executivo extends Cliente {
    private final Transacao transferencia;
    private final Transacao deposito;

    public Executivo(Transacao transferencia, Transacao deposito) {
        this.transferencia = transferencia;
        this.deposito = deposito;
    }

    public void transferir() {
        transferencia.transacaoOk();
    }

    public void depositar() {
        deposito.transacaoOk();
    }
}
