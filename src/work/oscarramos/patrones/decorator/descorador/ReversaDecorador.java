package work.oscarramos.patrones.decorator.descorador;

import work.oscarramos.patrones.decorator.Formateable;

public class ReversaDecorador extends TextoDecorador{

    public ReversaDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        StringBuilder sb = new StringBuilder(texto.darFormato());

        return sb.reverse().toString();
    }
}
