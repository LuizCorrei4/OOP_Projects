package com.empresa.funcionarios;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + 2000;
    }
}
