
//debo importar los elementos para el ejemplo de la diapositiva 18 ojo
import java.util.Arrays;
import java.util.List;

import archivoob.ElemenPersona;
import archivoob.Persona;
public class App {
    public static void main(String[] args) throws Exception {
        // var archivo=new Ejemplo4();
        // archivo.escribir("ejemplo44.txt");

        var ep=new ElemenPersona();
        //puedo generar personas.dat, personas.txt, personas.obj
        ep.guardarP("Personas.txt",
                // convertir a list
                Arrays.asList(
                new Persona("552871883","María", "Ruiz Ramos"),
                new Persona("403020104","Juan", "González López"),
                new Persona("441234789","Luis", "Perez")
                ));
        List<Persona> personas=ep.cargarPersonas("Personas.obj");
        personas.forEach(System.out::println);
        
        //Ejercicio1.run_Eje1();
}
}