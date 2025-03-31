package com.empresa.funcionarios;

public class Main {
    public static void main(String[] args) {
        Funcionario estagiario = new Estagiario("Fulano", 700.0);
        Funcionario gerente = new Gerente("Ciclano", 4000.0);
        Funcionario vendedor = new Vendedor("Vendedor", 1500.0, 4500, 0.1);

        System.out.println("Salário do estagiário: " + estagiario.calcularSalario());
        System.out.println("Salário do gerente: " + gerente.calcularSalario());
        System.out.println("Salário do vendedor: " + vendedor.calcularSalario());
    }
}