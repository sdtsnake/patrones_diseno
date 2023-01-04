package work.oscarramos.patrones.factory.ejemplo;

import work.oscarramos.patrones.factory.PizzaProducto;
import work.oscarramos.patrones.factory.PizzeriaCaliformiaFactory;
import work.oscarramos.patrones.factory.PizzeriaNewYorkFactory;
import work.oscarramos.patrones.factory.PizzeriaZonaAbstractFactory;

public class EjemploFactory {
    public static void main(String[] args) {
        PizzeriaZonaAbstractFactory ny = new PizzeriaNewYorkFactory();
        PizzeriaZonaAbstractFactory califormia = new PizzeriaCaliformiaFactory();

        PizzaProducto pizza = califormia.ordenarPizza("queso");
        System.out.println("Oscar ordena la pizza " + pizza.getNombre());

        pizza = ny.ordenarPizza("peperoni");
        System.out.println("Paola ordeno la pizza " + pizza.getNombre());

        pizza = califormia.ordenarPizza("vegetariana");
        System.out.println("Cesar ordena la pizza " + pizza.getNombre());

        pizza = ny.ordenarPizza("vegetariana");
        System.out.println("Carolina ordena la pizza " + pizza.getNombre());

        pizza = califormia.ordenarPizza("peperoni");
        System.out.println("Fernando ordena la pizza " + pizza.getNombre());

        System.out.println("pizza = " + pizza);
    }
}
