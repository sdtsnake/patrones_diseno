package work.oscarramos.patrones.observer.ejemplo;

import work.oscarramos.patrones.observer.Corporacion;

public class EjemploObserverCorporacion {
    public static void main(String[] args) {
        Corporacion google = new Corporacion("Google",1000);

        google.addObserver((obs,obj )-> {
            System.out.println("jhon : " + obs);
        });
        google.addObserver((obs,obj) -> {
            System.out.println("juan : " + obs);
        });
        google.addObserver((obs,obj) -> {
            System.out.println("oscar : " + obs);
        });

        google.modificaPrecio(3000);

    }
}
