package archivoob;
import java.io.*;
// import java.io.FileInputStream;
// import java.io.FileOutputStream;
// import java.io.IOException;
// import java.io.ObjectInputStream;
// import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ElemenPersona {
    //Creamos dos metodos uno para guardar
    //otro para cargar
    public void guardarP(String archivo, List<Persona> personas)
    {
        // como crear un archivo de objetos flujo de salida
        // 
        try {
            //flujo de salida objeto internamente file, lo va a enviar por una salida de archivo
            // new FileOutputStream(archivo) creamos un fujo de salida a disco, 
            //pasándole el nombre del archivo en disco o un objeto de la clase File
            // ObjectOutputStream El flujo de salida es el que procesa los datos 
            var obs=new ObjectOutputStream(new FileOutputStream(archivo));
            //por cada uno de los elementos de la lista de Persona
            //se obtiene el objeto, se lo paso al flujo de salida para escribir
            for (Persona persona: personas)
                {
                    obs.writeObject(persona);
                }  
            // se debe cerrar
            obs.close();
        } catch (IOException e){//Captura cualquier clase de excepcion
            System.err.println(e);
        }
    }

    public List<Persona> cargarPersonas(String archivo)
    {
        List<Persona> personas=new ArrayList<>();
        Persona persona;
        try {
            //elementos de salida, flujo de entrada
            //// new FileOutputStream(archivo) creamos un fujo de entrada a disco, 
            //pasándole el nombre del archivo en disco o un objeto de la clase File
            // ObjectInputStream es el que procesa los datos 
                ObjectInputStream ois=new ObjectInputStream(new FileInputStream(archivo));
                //realiza la deserialización de los objetos de una clase. Este método lee 
                //el flujo de entrada y reconstruye los objetos de dicha clase.
                while ((persona=(Persona) ois.readObject())!= null){
                    personas.add(persona);
                }
                ois.close();
            } catch (ClassNotFoundException e)
                //curre cuando al cargador de clases no pudo encontrarla 
                //por lo cual se debe verificar su ruta y agregar.
                {
                System.err.println(e);
                }
                catch(IOException e){

                }
            
                return personas;
        }

    }

