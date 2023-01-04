package work.oscarramos.patrones.factory.producto;

import work.oscarramos.patrones.factory.PizzaProducto;

public class PizzaCaliformiaQueso extends PizzaProducto {
    public PizzaCaliformiaQueso() {
        super();
        nombre = "Pizza Califormia extra queso";
        masa = "Masa tradicional";
        salsa = "Pasta de tomate con especias dulces";
        ingredientes.add("Queso doble crema");
        ingredientes.add("Queso azul");
        ingredientes.add("Queso parmesano");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando a 25 min a 160°C");

    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en pequeños trosos");
    }
}
