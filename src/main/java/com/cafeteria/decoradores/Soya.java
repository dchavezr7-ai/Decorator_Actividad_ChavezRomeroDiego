package main.java.com.cafeteria.decoradores;

import main.java.com.cafeteria.bff.Cafe;

public class Soya extends DecoradorComplemento {
    public Soya(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescripcion() {
        return cafe.getDescripcion() + ", Soya";
    }

    @Override
    public double costo() {
        return cafe.costo() + 0.15;
    }
}