package br.com.meli.service;

public class PagamentoServico implements Transacao {
    @Override
    public void transacao() {
        System.out.println("Serviço pago com sucesso");
    }

}
