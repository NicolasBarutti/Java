package org.example.Poligonos;

public abstract class MinimoPoligono implements GeraisParaPoligonos {

    private double l3, l2, l1;

    public MinimoPoligono(double l3, double l2, double l1) {
        this.l3 = l3;
        this.l2 = l2;
        this.l1 = l1;
    }

    public abstract String getTipo();

    public double getL3() {
        return l3;
    }

    public double getL2() {
        return l2;
    }

    public double getL1() {
        return l1;
    }
}
