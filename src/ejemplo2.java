import java.io.*;
public class ejemplo2 
{
    public static void main(String args[]) 
    {
        
        byte[] buffer = new byte[255];// Reserver 255 caracteres
        System.out.println("\nEscribe el texto: ");
    try {
        // No leo elemento por elemento si no el total como un array
        // no existe el while por que tiene un lectura de tipo byte
        System.in.read(buffer, 0, 255);// leer desde 0 hasta el 255
    //Por ejemplo escribir elementos textos largos, para verificar cuando llega a 255 para 
    } catch (IOException e) 
        {
    System.err.println(e);
}
    System.out.println("\nLa línea escrita es: ");
    System.out.println(new String(buffer));
}
}
