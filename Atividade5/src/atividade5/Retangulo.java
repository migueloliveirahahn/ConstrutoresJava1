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
public class Retangulo {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {

        if (largura > 0) {
            this.largura = largura;
        } else {
            this.largura = 1;
        }

        if (altura > 0) {
            this.altura = altura;
        } else {
            this.altura = 1;
        }
    }

    public double calcularArea() {
        return largura * altura;
    }

    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }

    public boolean ehQuadrado() {
        return largura == altura;
    }
}
