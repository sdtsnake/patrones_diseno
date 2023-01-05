package work.oscarramos.patrones.decorator.descorador;

import work.oscarramos.patrones.decorator.Formateable;

public class MayusculasDecorador extends TextoDecorador{

    public MayusculasDecorador(Formateable texto){
        super(texto);
    }

    @Override
    public String darFormato() {
        return texto.darFormato().toUpperCase();
    }
}
