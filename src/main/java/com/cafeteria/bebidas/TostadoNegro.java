package main.java.com.cafeteria.bebidas;

import main.java.com.cafeteria.bff.Cafe;

public class TostadoNegro extends Cafe {
    public TostadoNegro() {
        descripcion = "Café Tostado Negro";
    }

    @Override
    public double costo() {
        double precioTamano = Double.parseDouble(preciosTamano.get(getTamano()));
        return 0.99 + precioTamano;
    }
}