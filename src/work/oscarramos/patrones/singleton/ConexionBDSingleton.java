package work.oscarramos.patrones.singleton;

public class ConexionBDSingleton {

    private static ConexionBDSingleton instancia;

    private ConexionBDSingleton(){
        System.out.println("Conectando a alguna base de datos");
    }

    public static ConexionBDSingleton getInstance(){
        if(instancia==null){
            instancia = new ConexionBDSingleton();
        }
        return instancia;
    }
}
