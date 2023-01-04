package work.oscarramos.patrones.factory.producto;

import work.oscarramos.patrones.factory.PizzaProducto;

public class PizzaNewYorkItaliana extends PizzaProducto {

    public PizzaNewYorkItaliana() {
        super();
        nombre="Pizza italiana New York";
        masa="Gruesa";
        salsa="Salsa napolitana";
        ingredientes.add("Tomastes");
        ingredientes.add("Champiñones");
        ingredientes.add("Queso doble crema");
        ingredientes.add("Aceitunas");
        ingredientes.add("Especies aromaticas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando la pizza por 40 min a 130°C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en triangulos grandes");
    }
}
