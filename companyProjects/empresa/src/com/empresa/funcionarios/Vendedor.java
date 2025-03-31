package com.empresa.funcionarios;

public class Vendedor extends Funcionario {

    private double vendas; // valor total das vendas feitas pelo vendedor
    private double percentualComissao;

    public Vendedor(String nome, double salarioBase, double vendas, double percentualComissao) {
        super(nome, salarioBase);
        this.vendas = vendas;
        this.percentualComissao = percentualComissao;
    }

    @Override
    public double calcularSalario(){
        return super.calcularSalario() + (vendas*percentualComissao);
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }
    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }
    public double getVendas() {
        return vendas;
    }
    public void setVendas(double vendas) {
        this.vendas = vendas;
    }
}
