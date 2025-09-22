package br.senai.sp.jandira.ds1m.comissoes.model;

import java.util.Scanner;

public class Vendendor {
    String nomeVendedor;
    double totalDeVendas;
    double percentualDaComissao;
    double valorDaComissaoEmReais;

    public void obterDados(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Calculadora de comissões");
        System.out.println("***************************");

       // Obtendo o nome do vendedor
        System.out.println("Qual o nome do vendedor?");
        nomeVendedor = leitor.nextLine();

        // Obtendo o
        System.out.println("Qual o total de vendas do(a) vendedor(a)" + nomeVendedor + "?");
        totalDeVendas = leitor.nextDouble();

        }
}
