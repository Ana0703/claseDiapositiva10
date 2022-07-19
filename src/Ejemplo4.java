import java.io.*;

public class Ejemplo4 {
    public void escribir(String archivo){
           int[][] numeros = { { 1, 2, 3, 4, 5},
                { 6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
            };
        try{
            var salida = new PrintWriter(archivo);
            // escritor de texto con el nombre que le envie

            // voy a recorrer cada elemento que esta en la matriz de numeros
            
            for (int i=0; i< numeros.length; i++) {
                for (int j=0; j< numeros[i].length; j++)
                {
                    // y se escribrir cada fila separada por comas
                salida.print(numeros[i][j] + ",");
                }
                //Cuando cambie linea cambio linea en el archivo
            salida.println(""); //hacer ejecución con el y sin el 
            }
            // cierro
            salida.close();
     
        }catch(FileNotFoundException e){
            //excepción cuando falla un intento de acceder a un archivo 
            //que no existe en el disco.
            System.err.println(e);;
        }

    }
}
