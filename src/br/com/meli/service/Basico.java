package br.com.meli.service;

public class Basico extends Cliente {

    private final Transacao consultaSaldo;
    private final Transacao saqueDinheiro;
    private final Transacao pagamentoServico;

    public Basico(Transacao saqueDinheiro, Transacao consultaSaldo, Transacao pagamentoServico) {
        this.saqueDinheiro = saqueDinheiro;
        this.consultaSaldo = consultaSaldo;
        this.pagamentoServico = pagamentoServico;
    }

    public void consultarSaldo() {
        consultaSaldo.transacao();
    }

    public void saque() {
        saqueDinheiro.transacao();
    }

    public void pagar() {
        pagamentoServico.transacao();
    }
}
