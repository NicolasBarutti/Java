package Poligonos;

public class Hexagono extends MinimoPoligono{

    private double l4, l5, l6;

    public Hexagono(double l3, double l2, double l1, double l4, double l5, double l6) {
        super(l3, l2, l1);
        this.l4 = l4;
        this.l5 = l5;
        this.l6 = l6;
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

    public double getL6() {
        return l6;
    }
}
