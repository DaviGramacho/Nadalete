package br.ed.fatec.factory;

import br.edu.fatec.factory.Calculable;

class Circle implements Calculable {
    private double raio;

    Circle(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}
