package br.ed.fatec.factory;

import br.edu.fatec.factory.Calculable;

class Trapezoid implements Calculable {
    private double baseMaior, baseMenor, altura;

    Trapezoid(double baseMaior, double baseMenor, double altura) {
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return ((baseMaior + baseMenor) * altura) / 2;
    }
}
