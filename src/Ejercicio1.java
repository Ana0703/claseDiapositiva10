import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

// en el app esta la ejecucion de este ejercicoEjercicio1.run_Eje1();

public class Ejercicio1 {
    public static void run_Eje1() {
        //leo el archivo
        //Recordar poner doble \ y la extension del archivo, ojo el archivo debe estar donde esta el documento Ejercicio1,
        //carpeta src
       
        var archivo=("C:\\Users\\Ana Maria\\Desktop\\MISIONTIC 2022\\Ruta 2\\CICLO 2\\Semana_4\\Ejemplos\\ejemplo1\\src\\ejercicio1.txt");
    
    try {
        // creamos una if para saber si el documento existe
            var file= new File(archivo);
            if(!file.exists())
            {
                System.err.println("El documento no Existe");
                return;
            }
        //flujo de entrada es byte por byte 
        // el datainput stream, que es y lo va a leer de un archivo
        var by_ar=new DataInputStream(new FileInputStream(archivo));
        char carac;

        //mientras al leer el caracter es diferente de nulo, es decir caracter cero
        //Recordar que en java esta en unicode
        
        //lee un byte y lo convierta a char
        while ((carac=(char)by_ar.readByte())!= '\0')
        {
            if(carac==' ')
                {
                    continue;
                }
            System.out.print(carac);
        }
        //cerramos el flujo de entrada
        by_ar.close();
    } catch (Exception e) 
        {
        
        }
        
    }
    
}


