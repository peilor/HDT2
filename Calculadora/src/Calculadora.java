

import java.io.*;

public class Calculadora {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack<String> calculos = new StackVector<String>();
        Stack<Integer> datos = new StackVector<Integer>();
      
        try{
            // Abrimos el archivo
            FileInputStream fstream = new FileInputStream("C:\\Users\\Acer\\Documents\\UVG\\4to semestre\\Alg Estructura Datos\\HDT2\\HDT2\\calculadora.txt");
            // Creamos el objeto de entrada
            DataInputStream entrada = new DataInputStream(fstream);
            // Creamos el Buffer de Lectura
            BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
            String strLinea;
            int cont=0;
            // Leer el archivo linea por linea
            while ((strLinea = buffer.readLine()) != null)   {
                calculos.push(strLinea);
                // Imprimimos la línea por pantalla
                System.out.println (strLinea);
            }
            // Cerramos el archivo
            entrada.close();
        }
        catch (Exception e){ //Catch de excepciones
            System.err.println("Ocurrio un error: " + e.getMessage());
        }        
    }
}
