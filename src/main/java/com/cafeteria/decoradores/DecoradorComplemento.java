package main.java.com.cafeteria.decoradores;

import main.java.com.cafeteria.bff.Cafe;

public abstract class DecoradorComplemento extends Cafe {
    protected Cafe cafe;

    public DecoradorComplemento(Cafe cafe) {
        this.cafe = cafe;
    }

    @Override
    public String getTamano() {
        return cafe.getTamano();
    }
}