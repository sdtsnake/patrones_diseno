package work.oscarramos.patrones.decorator;

import work.oscarramos.patrones.decorator.descorador.MayusculasDecorador;
import work.oscarramos.patrones.decorator.descorador.ReemplazarEspaciosDecorador;
import work.oscarramos.patrones.decorator.descorador.ReversaDecorador;
import work.oscarramos.patrones.decorator.descorador.SubrayadoDecorador;

public class EjemploDecorador {
    public static void main(String[] args) {
        Formateable texto = new Texto("Hola que tal Andres!");

        MayusculasDecorador mayusculas = new MayusculasDecorador(texto);
        ReversaDecorador reversa = new ReversaDecorador(mayusculas);
        SubrayadoDecorador subrayar = new SubrayadoDecorador(reversa);
        ReemplazarEspaciosDecorador reemplazar = new ReemplazarEspaciosDecorador(subrayar);

        System.out.println(reemplazar.darFormato());
    }
}
