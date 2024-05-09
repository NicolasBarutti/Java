package Poligonos;

public class Quadrilatero extends MinimoPoligono {

    private  double l4;

    public Quadrilatero(double l3, double l2, double l1, double l4) {
        super(l3, l2, l1);
        this.l4 = l4;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public String getTipo() {
        return null;
    }

    public double getL4() {
        return l4;
    }
}
