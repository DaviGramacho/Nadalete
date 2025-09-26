package br.ed.fatec.factory;

import br.edu.fatec.factory.Calculable;

class Diamond implements Calculable {
    private double diagonalMaior, diagonalMenor;

    Diamond(double diagonalMaior, double diagonalMenor) {
        this.diagonalMaior = diagonalMaior;
        this.diagonalMenor = diagonalMenor;
    }

    @Override
    public double calcularArea() {
        return (diagonalMaior * diagonalMenor) / 2;
    }
}
