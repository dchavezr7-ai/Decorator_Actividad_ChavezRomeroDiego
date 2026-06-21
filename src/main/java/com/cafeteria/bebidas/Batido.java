package main.java.com.cafeteria.bebidas;

import main.java.com.cafeteria.bff.Cafe;

public class Batido extends Cafe {
    public Batido() {
        descripcion = "Café Batido";
    }

    @Override
    public double costo() {
        double precioTamano = Double.parseDouble(preciosTamano.get(getTamano()));
        return 0.89 + precioTamano;
    }
}