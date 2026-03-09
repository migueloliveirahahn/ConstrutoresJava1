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
public class Produto {
     private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco) {
        this.nome = nome;

        if (preco >= 0) {
            this.preco = preco;
        } else {
            this.preco = 0;
        }

        this.quantidade = 0;
    }

    public void entradaEstoque(int qtd) {
        if (qtd > 0) {
            quantidade += qtd;
        }
    }

    public void saidaEstoque(int qtd) {
        if (qtd > 0 && qtd <= quantidade) {
            quantidade -= qtd;
        }
    }

    public double valorTotalEstoque() {
        return preco * quantidade;
    }
}
