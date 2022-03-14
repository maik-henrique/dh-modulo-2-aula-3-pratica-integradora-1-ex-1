package br.com.meli;

public class Cobrador extends Cliente {

    private final Transacao consultaSaldo;
    private final Transacao saqueDinheiro;

    public Cobrador(Transacao saqueDinheiro, Transacao consultaSaldo) {
        this.saqueDinheiro = saqueDinheiro;
        this.consultaSaldo = consultaSaldo;
    }

    public void sacarDinheiro() {
        saqueDinheiro.transacaoOk();
    }

    public void consultarSaldo() {
        consultaSaldo.transacaoOk();
    }


}
