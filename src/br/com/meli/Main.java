package br.com.meli;

import br.com.meli.service.*;

public class Main {
    public static void main(String[] args) {

        Basico basico = new Basico(new SaqueDinheiro(), new ConsultaSaldo(), new PagamentoServico());
        Executivo executivo = new Executivo(new Transferencia(), new Deposito());
        Cobrador cobrador = new Cobrador(new SaqueDinheiro(), new ConsultaSaldo());

        basico.consultarSaldo();
        basico.pagar();
        basico.saque();

        executivo.depositar();
        executivo.transferir();

        cobrador.consultarSaldo();
        cobrador.sacarDinheiro();

    }
}
