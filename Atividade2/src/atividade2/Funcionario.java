/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade2;

/**
 *
 * @author hahnm
 */
public class Funcionario {
    private String nome;
    private double salario;
    private String cargo;

    public Funcionario(String nome, double salario, String cargo) {
        this.nome = nome;
        this.cargo = cargo;

        if (salario >= 0) {
            this.salario = salario;
        } else {
            this.salario = 0;
        }
    }

    public void aumentarSalario(double percentual) {
        salario += salario * (percentual / 100);
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: " + salario);
    }
}
