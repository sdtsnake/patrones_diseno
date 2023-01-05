package work.oscarramos.patrones.composite.ejemplo;

import work.oscarramos.patrones.composite.Archivo;
import work.oscarramos.patrones.composite.Directorio;

public class EjemploCompositeBuscar {
    public static void main(String[] args) {
        Directorio doc = new Directorio("Documento");
        Directorio java = new Directorio("Java");

        java.addComponente(new Archivo("patron-composite.docx"));
        Directorio stream = new Directorio("Api Stream");
        stream.addComponente(new Archivo("stream-map.docx"));

        java.addComponente(stream);

        doc.addComponente(java);
        doc.addComponente(new Archivo("cv.docx"));
        doc.addComponente(new Archivo("logo.jpeg"));

        boolean encontrado = doc.buscar("patron-composite.docx");
        System.out.println("Encontrado : \"patron-composite.docx\" : " + encontrado);

        encontrado = doc.buscar("Api Stream");
        System.out.println("Encontrado Api stream : " + encontrado);

        encontrado = doc.buscar("cv.doc");
        System.out.println("Encontrado cv.docx : " + encontrado);
    }
}
