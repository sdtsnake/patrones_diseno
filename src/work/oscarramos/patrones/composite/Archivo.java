package work.oscarramos.patrones.composite;

public class Archivo extends Componente{
    public Archivo(String nombre) {
        super(nombre);
    }

    @Override
    public boolean buscar(String nombre) {
        return this.nombre.equals(nombre);
    }

    @Override
    public String mostrar(int nivel) {
        return "\t".repeat(nivel) + nombre;
    }
}
