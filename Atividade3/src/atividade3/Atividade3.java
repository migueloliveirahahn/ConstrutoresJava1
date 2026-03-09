/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade3;

/**
 *
 * @author hahnm
 */
public class Atividade3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente(1234, "João");

        conta.depositar(500);
        conta.sacar(200);

        System.out.println("Saldo atual: " + conta.consultarSaldo());
    }
    
}
