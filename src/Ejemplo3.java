import java.io.*;
public class Ejemplo3 {
    public static void main(String arg[]) {
    String línea=null;
    //BufferedReader  clase de Java para leer el texto de una
    // secuencia de entrada (como un archivo, arreglo) almacenando en 
    //el búfer caracteres que leen de manera correcta,pueden ser variables,matrices o líneas.
    var entrada = new BufferedReader(new InputStreamReader(System.in));
    //lo que esta en ()es un objeto lo convierte en reader para pasarlo al buffer
    
    //PrintWriter da acceso a los métodos de printXXX como println (). 
    //se puede usar un PrintWriter para escribir en un archivo
    //tal como lo haría con System.out para imprimir en pantalla
    // todo lo que este en salida lo va a pasar a system.out
    //esto es un Flujo de salida, tambien puedo cambiarlo por un
    // texto, una impresora, otro medio
    var salida = new PrintWriter(System.out, true);
    
    salida.println("\nEscribe el texto: ");
    try {
        //Lea una linea, todo se debe escribir en una sola
        línea = entrada.readLine();
    } catch (Exception e) {
        System.err.println(e);
    }
    salida.println("\nLa linea escrita es: ");
    salida.println(línea);
    }
    }
