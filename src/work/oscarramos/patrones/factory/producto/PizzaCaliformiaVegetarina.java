package work.oscarramos.patrones.factory.producto;

import work.oscarramos.patrones.factory.PizzaProducto;

import javax.swing.*;

public class PizzaCaliformiaVegetarina extends PizzaProducto {

    public PizzaCaliformiaVegetarina() {
        super();
        nombre = "Pizza Califormia Vegetariana";
        masa = "Masa delgada";
        salsa = "Salsa BBQ Light";
        ingredientes.add("Queso parmesano");
        ingredientes.add("Tomate cherry");
        ingredientes.add("Aceitunas");
        ingredientes.add("Ceborras cambray");
        ingredientes.add("Romero");
    }

    @Override
    public void cocinar() {
        System.out.println("Conicnaod por 20 min a 110°C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en rebanadas rectangulares");
    }
}
