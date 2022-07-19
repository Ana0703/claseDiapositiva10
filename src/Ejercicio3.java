import javax.swing.JOptionPane;
import java.io.*;
 
public class Ejercicio3{
 
    public static void main(String[] args) {
 
        final String Ubic="C:\\Users\\Ana Maria\\Desktop\\MISIONTIC 2022\\Ruta 2\\CICLO 2\\Semana_4\\Ejemplos\\ejemplo1\\vehiculos.txt";
 
        String m=JOptionPane.showInputDialog("Matricula del Vehiculo");
        String mar=JOptionPane.showInputDialog("Marca del Vehiculo");
        String dep=JOptionPane.showInputDialog("Tamaño del deposito del Vehiculo");
        String mo=JOptionPane.showInputDialog("Modelo del Vehiculo");
        //Método para convertir una cadena en un doble
        double tamDep=Double.parseDouble(dep);
       
 
        try(DataOutputStream salida=new DataOutputStream(new FileOutputStream(Ubic,true));
                DataInputStream entrada=new DataInputStream(new FileInputStream(Ubic))){
 
            introduceDatos(salida, m, mar, tamDep, mo);
 
            muestraDatos(entrada);
        }catch(EOFException e){//Excepcion cuando se alcanza el final del archivo del objeto
 
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage() , "Error", JOptionPane.ERROR_MESSAGE);
        }
 
    }
 
    public static void introduceDatos(DataOutputStream salida,
                                        String m,
                                        String mar,
                                        double tamDep,
                                        String mo) throws IOException{
 
        salida.writeUTF(m);
        salida.writeUTF(mar);
        salida.writeDouble(tamDep);
        salida.writeUTF(mo);
 
    }
 
    public static void muestraDatos(DataInputStream entrada) throws IOException {
 
        //Cuando se acabe el fichero saltara la excepcion
        while(true){
            JOptionPane.showMessageDialog(null, "Vehiculo con matricula "+entrada.readUTF()+
            ", su marca es "+entrada.readUTF()+", tamaño del deposito es de "+entrada.readDouble()+" " +
            "y su modelo es "+entrada.readUTF());
        }
    }
 
}