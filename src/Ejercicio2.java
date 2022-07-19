import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
//Clase que muestra ventanas y pedir información a los usuarios. 
//Estas ventanas son llamadas Dialogs,
import javax.swing.JOptionPane;
public class Ejercicio2 {
 
    public static void main(String[] args) {
        //cuadros de dialogo para pedir por teclado
        // en el cuadro copiar la ruta con la que se quiere trabajar 
        //y el nombre que se le dará al archivo
        String ubicacion=JOptionPane.showInputDialog("Introduce la ruta del fichero");
        String cadena=JOptionPane.showInputDialog("Introduce el texto que quieras escribir en el fichero");
        //Metodo para escribir
        escribirDocumento(ubicacion, cadena);
        //Metodo para mostrar y cambiar las letras
        mostrarDocumento(ubicacion);
    }
 
    public static void escribirDocumento(String ubic, String cad){
        //Vamos a utilizar el try con recurso
    
        try(FileWriter arcs=new FileWriter(ubic);){
            //Escribimos el texto en el fichero
            arcs.write(cad);
 
        }catch(IOException e){
            System.out.println(e);
        }
    }
 
    public static void mostrarDocumento(String ubic){
        try(FileReader arcl=new FileReader (ubic)){
            //Lee un solo carácter.
            //El carácter leído, o -1 si se ha llegado al final
            int v=arcl.read();
            while(v!=-1){
 
                //Solo cambia el caracter si es una minuscula o una mayuscula
                char caracter=(char)v;
                // Las letras tiene el ascii desde 97 a 122, son minusculas, mirar tabla
                if(caracter>=97 && caracter<=122){
                    caracter-=32;
                }else if(caracter>=65 && caracter<=90)
                //mayusculas van desde e 65 al 90
                    caracter+=32;
                System.out.print(caracter);
                v=arcl.read();
            }
 
        }catch(IOException e){
            System.out.println(e);
        }
    }
 
}
