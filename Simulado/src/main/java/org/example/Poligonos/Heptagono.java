package org.example.Poligonos;

public class Heptagono extends  MinimoPoligono{


    private  double l4, l5, l6, l7;

    public Heptagono(double l3, double l2, double l1, double l4, double l5, double l6, double l7) {
        super(l3, l2, l1);
        this.l4 = l4;
        this.l5 = l5;
        this.l6 = l6;
        this.l7 = l7;
    }


    @Override
    public String getTipo() {
        return "";
    }

    @Override
    public double getArea() {
        return 0;
    }


}
