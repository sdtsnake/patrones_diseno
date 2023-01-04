package work.oscarramos.patrones.factory.producto;

import work.oscarramos.patrones.factory.PizzaProducto;

public class PizzaNewYorkVegetariana extends PizzaProducto {
    public PizzaNewYorkVegetariana() {
        super();
        nombre = "Pizza vegetariana New York";
        masa = "Masa integral";
        salsa = "Pasta de tomate";
        ingredientes.add("Tomate");
        ingredientes.add("Aceitunas");
        ingredientes.add("Espinacas");
        ingredientes.add("Berengenas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 25. min a 150°C");

    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en rebanadas cuadradas");

    }
}
