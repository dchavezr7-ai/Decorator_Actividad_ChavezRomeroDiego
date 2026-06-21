package main.java.com.cafeteria.bebidas;

import main.java.com.cafeteria.bff.Cafe;

public class Expreso extends Cafe {
    public Expreso() {
        descripcion = "Café Expreso";
    }

    @Override
    public double costo() {
        double precioTamano = Double.parseDouble(preciosTamano.get(getTamano()));
        return 1.99 + precioTamano;
    }
}
