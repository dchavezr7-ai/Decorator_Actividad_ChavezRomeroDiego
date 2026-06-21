# Sistema de Control de Órdenes - Cafetería Negrito

Este proyecto implementa un sistema informático para la automatización y cálculo de costos en el control de órdenes de la Cafetería Negrito. La solución aborda el problema de la combinación dinámica de bebidas base con múltiples complementos opcionales, evitando la explosión combinatoria de clases mediante la aplicación de patrones de diseño de software.

## Objetivos Académicos
- Implementar el patrón de diseño estructural Decorator para permitir la adición dinámica de responsabilidades a un objeto.
- Utilizar estructuras de datos dinámicas (`HashMap`) para la gestión y configuración de precios basados en atributos específicos como el tamaño de la bebida.
- Respetar los principios SOLID, específicamente el principio de Abierto/Cerrado (Open/Closed Principle), permitiendo que el sistema crezca en nuevas bebidas o complementos sin modificar el código existente.

## Patrón de Diseño Aplicado: Decorator

El patrón Decorator se compone de los siguientes elementos en esta solución:
1. **Componente (`Cafe`)**: Clase abstracta base que define la interfaz común para todas las bebidas y decoradores (descripción, tamaño y método abstracto de costo).
2. **Componente Concreto (`Expreso`, `TostadoNegro`, `Descafeinado`, `Batido`)**: Representan las bebidas base individuales que heredan de `Cafe`.
3. **Decorador (`DecoradorComplemento`)**: Clase abstracta que mantiene una referencia (composición) a un objeto de tipo `Cafe` que se encuentra envolviendo.
4. **Decoradores Concretos (`Leche`, `Moca`, `Soya`, `Crema`)**: Clases que extienden el decorador para añadir dinámicamente un costo adicional y modificar la descripción acumulada de la bebida envuelta.

### Uso del HashMap para la Gestión de Tamaños
Siguiendo las recomendaciones académicas, la clase abstracta `Cafe` incorpora un `HashMap<String, String>` estático para mapear las dimensiones de las bebidas ("CHICO", "MEDIANO", "GRANDE") hacia sus respectivos impactos económicos en texto, realizando la conversión de tipos en tiempo de ejecución a través de `Double.parseDouble()`. Esto desacopla el cálculo de las tarifas por tamaño de las implementaciones particulares de cada café.

## Estructura del Proyecto

La organización de paquetes dentro del directorio raíz se estructura de la siguiente manera para mitigar errores de vinculación en el entorno de desarrollo:

```text
src/
└── main/
    └── java/
        └── com.cafeteria/
            ├── bff/
            │   └── Cafe.java
            ├── bebidas/
            │   ├── Batido.java
            │   ├── Descafeinado.java
            │   ├── Expreso.java
            │   └── TostadoNegro.java
            ├── decoradores/
            │   ├── Crema.java
            │   ├── DecoradorComplemento.java
            │   ├── Leche.java
            │   ├── Moca.java
            │   └── Soya.java
            └── Main.java
