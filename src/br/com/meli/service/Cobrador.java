package br.com.meli.service;

public class Cobrador extends Cliente {

    private final Transacao consultaSaldo;
    private final Transacao saqueDinheiro;

    public Cobrador(Transacao saqueDinheiro, Transacao consultaSaldo) {
        this.saqueDinheiro = saqueDinheiro;
        this.consultaSaldo = consultaSaldo;
    }

    public void sacarDinheiro() {
        saqueDinheiro.transacao();
    }

    public void consultarSaldo() {
        consultaSaldo.transacao();
    }


}
