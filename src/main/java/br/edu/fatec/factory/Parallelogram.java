package br.ed.fatec.factory;

import br.edu.fatec.factory.Calculable;

class Parallelogram implements Calculable {
    private double base, altura;

    Parallelogram(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}
