package work.oscarramos.patrones.observer.ejemplo;

import work.oscarramos.patrones.observer.UsuarioRepositorio;

public class EjemploObserverUsuario {
    public static void main(String[] args) {
        UsuarioRepositorio repo = new UsuarioRepositorio();
        repo.addObserver((o, u)->System.out.println("Enviando un email al usuario " + u));
        repo.addObserver((o, u)->System.out.println("Enviando un email al administrador "));
        repo.addObserver((o, u)->System.out.println("Guardando informacion en los logs de " + u));


        repo.crearUsuario("Oscar");

    }
}
