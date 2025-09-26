package br.edu.fatec.model;

import br.edu.fatec.factory.Calculable;

class Triangle implements Calculable {
    private double base, altura;

    Triangle(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}
