/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade4;

/**
 *
 * @author hahnm
 */
public class Atividade4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Produto p = new Produto("Notebook", 3500);

        p.entradaEstoque(10);
        p.saidaEstoque(3);

        System.out.println("Valor total em estoque: " + p.valorTotalEstoque());
    }
    
}
