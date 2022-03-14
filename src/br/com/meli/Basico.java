package br.com.meli;

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
        consultaSaldo.transacaoNaoOk();
    }

    public void saque() {
        saqueDinheiro.transacaoOk();
    }

    public void pagar() {
        pagamentoServico.transacaoOk();
    }
}
