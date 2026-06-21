package main.java.com.cafeteria.bff;

import java.util.HashMap;

public abstract class Cafe {
    protected String descripcion = "Bebida Desconocida";
    protected String tamano = "MEDIANO"; // Tamaño por defecto

    // El HashMap<String, String> recomendado por tu profesor
    protected static final HashMap<String, String> preciosTamano = new HashMap<>();

    static {
        preciosTamano.put("CHICO", "0.50");
        preciosTamano.put("MEDIANO", "1.00");
        preciosTamano.put("GRANDE", "1.50");
    }

    public String getDescripcion() {
        return descripcion + " (" + tamano + ")";
    }

    public void setTamano(String tamano) {
        if (preciosTamano.containsKey(tamano.toUpperCase())) {
            this.tamano = tamano.toUpperCase();
        }
    }

    public String getTamano() {
        return tamano;
    }

    public abstract double costo();
}