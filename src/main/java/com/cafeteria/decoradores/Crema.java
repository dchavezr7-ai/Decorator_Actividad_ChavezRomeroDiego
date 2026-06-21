package main.java.com.cafeteria.decoradores;

import main.java.com.cafeteria.bff.Cafe;

public class Crema extends DecoradorComplemento {
    public Crema(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescripcion() {
        return cafe.getDescripcion() + ", Crema";
    }

    @Override
    public double costo() {
        return cafe.costo() + 0.10;
    }
}