package br.senai.sp.jandira.ds1m.comissoes;

import br.senai.sp.jandira.ds1m.comissoes.model.Vendedor;

public class ComissoesApp {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor();
        vendedor.obterDados();
        vendedor.exibirResultados();
    }
}