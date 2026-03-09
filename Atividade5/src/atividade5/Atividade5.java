/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade5;

/**
 *
 * @author hahnm
 */
public class Atividade5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Retangulo r = new Retangulo(5, 5);

        System.out.println("Área: " + r.calcularArea());
        System.out.println("Perímetro: " + r.calcularPerimetro());

        if (r.ehQuadrado()) {
            System.out.println("É um quadrado.");
        } else {
            System.out.println("Não é um quadrado.");
        }
    }
    
    
}
