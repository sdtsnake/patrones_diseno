package work.oscarramos.patrones.factory;

abstract public class PizzeriaZonaAbstractFactory {
    public PizzaProducto ordenarPizza(String tipo){
        PizzaProducto pizza = crearPizza(tipo);
        System.out.println("---------------Fabricando la pizza de " + pizza.getNombre() + "---------------");
        pizza.preparar();
        pizza.cocinar();
        pizza.empaquetar();
        return pizza;
    }
    abstract PizzaProducto crearPizza(String tipo);

}
