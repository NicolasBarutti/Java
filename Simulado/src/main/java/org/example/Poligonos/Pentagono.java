package org.example.Poligonos;

public class Pentagono extends MinimoPoligono {

    private double l4, l5;


    public Pentagono(double l3, double l2, double l1, double l5, double l4) {
        super(l3, l2, l1);
        this.l5 = l5;
        this.l4 = l4;
    }

    @Override
    public String getTipo() {
        return "";
    }

    @Override
    public double getArea() {
        return 0;
    }

    public double getL4() {
        return l4;
    }

    public double getL5() {
        return l5;
    }
}
