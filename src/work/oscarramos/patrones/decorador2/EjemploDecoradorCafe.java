package work.oscarramos.patrones.decorador2;

import work.oscarramos.patrones.decorador2.decorador.ConChocolateDecorador;
import work.oscarramos.patrones.decorador2.decorador.ConCremaDecorador;
import work.oscarramos.patrones.decorador2.decorador.ConLecheDecorador;

public class EjemploDecoradorCafe {
    public static void main(String[] args) {
        Configurable cafe = new Cafe(7, "Cafe Mocha");
        ConCremaDecorador conCrema = new ConCremaDecorador(cafe);
        ConLecheDecorador conLeche = new ConLecheDecorador(conCrema);
        ConChocolateDecorador conChocolate = new ConChocolateDecorador(conLeche);

        System.out.println("El precio del cafe moca es : "  + conChocolate.getPrecioBase());
        System.out.println("Los ingredientes son : " + conChocolate.getIngredientes());

        Configurable capuchino = new Cafe(4,"Cafe Capuchino");
        conCrema = new ConCremaDecorador(capuchino);
        conLeche = new ConLecheDecorador(conCrema);
        System.out.println("El precio del capuchino es: " + conLeche.getPrecioBase());
        System.out.println("Los ingredientes son : " + conLeche.getIngredientes());

        Configurable espresso = new Cafe(3,"Cafe Espresso");
        System.out.println("El precio del cafe espresso es : " + espresso.getPrecioBase());
        System.out.println("Los ingredientes son : " + espresso.getIngredientes());



    }

}
