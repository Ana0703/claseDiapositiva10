import java.io.*;

// las herramientas de entrada y salida, 
//* todas las clases de java.io

public class Ejemplo1
{
public static void main(String args[]) 
{
    int numBytes = 0;// variable de entrada entera
    char caracter; //
    System.out.println("\nEscribe el texto: ");
try {// dentro del bloque de las llaves puede existir una excepcion
    do {
        caracter = (char)System.in.read();//Hola chicos\n
        //convertir la lectura de bytes, a un caracter
        //caracter =H o l a   c h i c o  s  \n
        //          1 2 3 4 5 6 7 8 9 10 11  12
                // lo imprime
        System.out.println(caracter);// si le ponemos ln los caracteres salen uno debajo del otro
        //System.out.println(caracter);// si le ponemos ln los caracteres salen uno debajo del otro
        //aumenta la cantidad de bytes
        numBytes++;
        } while (caracter != '\n');// lo hace hasta que se 
                                    //sea diferente a salto de linea
	//usar el System.error por ejemplo al cachar una exception es
	//acá actua igual que system.out
    System.err.printf("%d bytes leidos %n", numBytes-2);
    } catch (IOException e) //IOException captura todas las excepciones de IO 
    {
    System.err.println(e);
    }
    }// cuenta dos bytes de mas por el enter, esto pasa en windows
}
