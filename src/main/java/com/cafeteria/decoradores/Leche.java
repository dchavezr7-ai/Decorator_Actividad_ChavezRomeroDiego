package main.java.com.cafeteria.decoradores;

import main.java.com.cafeteria.bff.Cafe;

public class Leche extends DecoradorComplemento {
    public Leche(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescripcion() {
        return cafe.getDescripcion() + ", Leche";
    }

    @Override
    public double costo() {
        return cafe.costo() + 0.10;
    }
}