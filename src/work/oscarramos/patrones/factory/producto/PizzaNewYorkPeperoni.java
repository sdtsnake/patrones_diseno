package work.oscarramos.patrones.factory.producto;

import work.oscarramos.patrones.factory.PizzaProducto;

public class PizzaNewYorkPeperoni extends PizzaProducto {
    public PizzaNewYorkPeperoni() {
        super();
        nombre = "Pizza Peperoni New York";
        masa = "Masa Tradicional con borde de queso";
        salsa = "Pasta de tomate";
        ingredientes.add("Peperoni");
        ingredientes.add("Queso Mozzarella");
        ingredientes.add("Anchoas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 35 min a 100°C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en triangulos");
    }
}
