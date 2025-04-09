package com.empresa.funcionarios;

public class Main {
    public static void main(String[] args) {
        Funcionario estagiario = new Estagiario("Fulano", 700.0);
        Funcionario gerente = new Gerente("Ciclano", 4000.0);
        Funcionario vendedor = new Vendedor("Beltrano", 1500.0, 4500, 0.1);

        System.out.println("Salário do estagiário chamado " + estagiario.getNome() + ": " + estagiario.calcularSalario() );
        System.out.println("Salário do gerente chamado " + gerente.getNome() + ": " + gerente.calcularSalario() );
        System.out.println("Salário do Vendedor chamado " + vendedor.getNome() + ": " + vendedor.calcularSalario() );
        //System.out.println("Olá!")

    }
}