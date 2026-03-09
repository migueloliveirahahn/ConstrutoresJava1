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
public class Atividade2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Ana", 3000, "Analista");

        f.exibirDados();

        f.aumentarSalario(10);

        System.out.println("\nApós aumento:");

        f.exibirDados();
    }
  
    
}
