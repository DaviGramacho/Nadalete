package br.ed.fatec.factory;

import br.edu.fatec.factory.Calculable;

class Rectangle implements Calculable {
    private double base, altura;

    Rectangle(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}
