package Poligonos;

public class Triangulo extends MinimoPoligono{


    public Triangulo(double l3, double l2, double l1) {
        super(l3, l2, l1);
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public String getTipo() {
        return null;
    }
}
