package main.java.com.cafeteria;

import main.java.com.cafeteria.bff.Cafe;
import main.java.com.cafeteria.bebidas.Expreso;
import main.java.com.cafeteria.bebidas.TostadoNegro;
import main.java.com.cafeteria.bebidas.Descafeinado;
import main.java.com.cafeteria.bebidas.Batido;
import main.java.com.cafeteria.decoradores.Leche;
import main.java.com.cafeteria.decoradores.Moca;
import main.java.com.cafeteria.decoradores.Soya;
import main.java.com.cafeteria.decoradores.Crema;

public class Main {
    public static void main(String[] args) {
        System.out.println("=========================================================");
        System.out.println("          SISTEMA DE ÓRDENES - CAFETERÍA NEGRITO         ");
        System.out.println("=========================================================\n");

        // ---------------------------------------------------------------------
        // CASO 1: Bebida simple (Sin complementos) - Tamaño Grande
        // ---------------------------------------------------------------------
        Cafe pedido1 = new Expreso();
        pedido1.setTamano("GRANDE"); // Extrae "1.50" del HashMap

        System.out.println("--- ORDEN #1: Bebida Simple ---");
        System.out.println("Descripción: " + pedido1.getDescripcion());
        System.out.println("Costo Total: $" + String.format("%.2f", pedido1.costo()));
        System.out.println();

        // ---------------------------------------------------------------------
        // CASO 2: Combinación Completa de Decoradores - Tamaño Chico
        // Un Tostado Negro chico con TODOS los complementos de la carta
        // ---------------------------------------------------------------------
        Cafe pedido2 = new TostadoNegro();
        pedido2.setTamano("CHICO"); // Extrae "0.50" del HashMap

        // Aplicamos el patrón Decorator envolviendo sucesivamente el objeto
        pedido2 = new Leche(pedido2);  // + $0.10
        pedido2 = new Moca(pedido2);   // + $0.20
        pedido2 = new Soya(pedido2);   // + $0.15
        pedido2 = new Crema(pedido2);  // + $0.10

        System.out.println("--- ORDEN #2: Combinación Máxima (Multi-Decorado) ---");
        System.out.println("Descripción: " + pedido2.getDescripcion());
        System.out.println("Costo Total: $" + String.format("%.2f", pedido2.costo()));
        System.out.println();

        // ---------------------------------------------------------------------
        // CASO 3: Otra variedad de café - Tamaño Mediano (Por defecto)
        // Probamos el Descafeinado con un par de condimentos repetidos o mezclados
        // ---------------------------------------------------------------------
        Cafe pedido3 = new Descafeinado();
        // Al no setear tamaño, se queda con "MEDIANO" por defecto (Extrae "1.00" del HashMap)
        pedido3 = new Moca(pedido3);
        pedido3 = new Moca(pedido3); // Doble Moca

        System.out.println("--- ORDEN #3: Café Especial con Doble Ingrediente ---");
        System.out.println("Descripción: " + pedido3.getDescripcion());
        System.out.println("Costo Total: $" + String.format("%.2f", pedido3.costo()));
        System.out.println();

        // ---------------------------------------------------------------------
        // CASO 4: Prueba de Seguridad del HashMap (Validación de errores)
        // ¿Qué pasa si el cajero escribe mal el tamaño? El código debe protegerse
        // ---------------------------------------------------------------------
        Cafe pedido4 = new Batido();
        System.out.println("--- ORDEN #4: Prueba de Validación de Tamaño ---");
        System.out.println("Intentando asignar un tamaño inválido ('EXTRA-GIGANTE')...");

        pedido4.setTamano("EXTRA-GIGANTE"); // No existe en el HashMap, el método lo ignorará

        pedido4 = new Crema(pedido4);

        System.out.println("Descripción final (Mantiene respaldo): " + pedido4.getDescripcion());
        System.out.println("Costo Total: $" + String.format("%.2f", pedido4.costo()));
        System.out.println("\n=========================================================");
    }
}