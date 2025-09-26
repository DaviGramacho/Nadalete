package br.ed.fatec.factory;

import br.edu.fatec.factory.Calculable;

class Hexagon implements Calculable {
    private double lado;

    Hexagon(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return ((3 * Math.sqrt(3)) / 2) * lado * lado;
    }
}
