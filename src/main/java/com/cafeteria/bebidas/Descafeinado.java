package main.java.com.cafeteria.bebidas;

import main.java.com.cafeteria.bff.Cafe;

public class Descafeinado extends Cafe {
    public Descafeinado() {
        descripcion = "Café Descafeinado";
    }

    @Override
    public double costo() {
        double precioTamano = Double.parseDouble(preciosTamano.get(getTamano()));
        return 1.05 + precioTamano;
    }
}