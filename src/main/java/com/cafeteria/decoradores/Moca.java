package main.java.com.cafeteria.decoradores;

import main.java.com.cafeteria.bff.Cafe;

public class Moca extends DecoradorComplemento {
    public Moca(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescripcion() {
        return cafe.getDescripcion() + ", Moca";
    }

    @Override
    public double costo() {
        return cafe.costo() + 0.20;
    }
}