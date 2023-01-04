package work.oscarramos.patrones.factory;

import work.oscarramos.patrones.factory.producto.*;

public class PizzeriaCaliformiaFactory extends PizzeriaZonaAbstractFactory{
    @Override
    PizzaProducto crearPizza(String tipo) {
        PizzaProducto producto = null;
        switch (tipo){
            case "vegetariana":
                producto = new PizzaCaliformiaVegetarina();
                break;
            case "peperoni":
                producto = new PizzaCaliformiaPeperoni();
                break;
            case "queso":
                producto = new PizzaCaliformiaQueso();
                break;
        }
        return producto;
    }
}
