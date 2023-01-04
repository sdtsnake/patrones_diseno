package work.oscarramos.patrones.factory.producto;

import work.oscarramos.patrones.factory.PizzaProducto;

public class PizzaCaliformiaPeperoni extends PizzaProducto {
    public PizzaCaliformiaPeperoni() {
        super();
        nombre = "Pizza Califormia peperoni";
        masa = "Masa gruesa borde de queso";
        salsa = "Pesto italiano";
        ingredientes.add("Peperoni extra");
        ingredientes.add("Ricotta");
        ingredientes.add("Extra de queso doble crema");
        ingredientes.add("Pepinillos");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando a 60 min. a 45°C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en cuadrados");
    }
}
