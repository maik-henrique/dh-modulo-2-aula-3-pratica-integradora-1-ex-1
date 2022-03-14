package br.com.meli;

public class PagamentoServico implements Transacao {
    @Override
    public void transacaoOk() {
        System.out.println("Serviço pago com sucesso");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("Falha ao pagar serviço");
    }
}
