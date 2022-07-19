import java.io.File;
import java.util.StringTokenizer;
//separa una cadena de caracteres en elementos o tokens.
//Token cadena de caracteres que tiene un significado coherente 
//Ejemplos de tokens, palabras clave (if, while, int,...), identificadores, números, signos.
import java.util.Scanner;
import java.io.IOException;

public class Ejemplo5 {
   public static void leer(String narchivo)
   {
        var archivo = new File(narchivo);
        if (archivo.exists()) {
            try{          
                var lector = new Scanner(archivo);
                System.out.println("Números del archivo");
                while (lector.hasNext()) {
                    var numeros = new StringTokenizer(lector.next(),",");
                    //hasMoreTokens() devuelve true si hay más tokens que obtener en la cadena.
                    //nextToken() devuelve un String con el siguiente token. Lanza una excepción 
                    //del tipo NoSuchElementException si no hay más tokens.            
                    while (numeros.hasMoreTokens()) {
                        System.out.print(numeros.nextToken() + "\t");
                    }
                System.out.println("");
                }
                lector.close();
            }   catch(IOException e)
            {
              System.err.println(e);
           }
        }else 
        {
            System.out.println("¡El fichero no existe!");
        }
   } 
public static void main(String[] args) throws IOException{
    //leer("C:\\Users\\Ana Maria\\Documents\\UTP_MINTIC\\Ciclo 2\\Unidad 4\\Ejemplos\\Clase10\\ejemplo1.txt");
    leer("C:\\Users\\Ana Maria\\Desktop\\MISIONTIC 2022\\Ruta 2\\CICLO 2\\Semana_4\\Ejemplos\\ejemplo1\\ejemploG50.txt");
}
}
