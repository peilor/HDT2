

import java.io.*;

public class Calculadora {
    private static Stack<Integer> datos;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        datos= new StackVector<Integer>();
        //Inicia codigo tomado de internet para la lectura de un archivo .txt
        try{
            // Abrimos el archivo
            FileInputStream fstream = new FileInputStream("C:\\Users\\Acer\\Documents\\UVG\\4to semestre\\Alg Estructura Datos\\HDT2\\HDT2\\calculadora.txt");
            // Creamos el objeto de entrada
            DataInputStream entrada = new DataInputStream(fstream);
            // Creamos el Buffer de Lectura
            BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
            String strLinea;
            // Leer el archivo linea por linea
            while ((strLinea = buffer.readLine()) != null)   {
                datos.push(Integer.parseInt(strLinea));
                // Imprimimos la línea por pantalla
                System.out.println (strLinea);
            }
            // Cerramos el archivo
            entrada.close();
        }
        catch (Exception e){ //Catch de excepciones
            System.err.println("Ocurrio un error: " + e.getMessage());
        } 
        //Termina codigo tomado de internet
        
        while (!datos.empty()){
            System.out.println(datos.pop());
            operaciones();
        }
    }
    
    
    private static void operaciones(){
       int dato=datos.pop();
       int resultado;
       //System.out.println(dato);
       char[] arreglo= dato.toCharArray();
       for(int i=0; i<arreglo.length; i++){
           char result = dato.charAt(i);
             
           try{
               datos.push(Integer.parseInt(result));
           }catch(){
                if(result=='+'){
                    datos.pop();
      
                }
                if(result=='-'){
                    
                }
                if(result=='*'){
                    
                }
                if(result=='/'){
                    
                }
           }     
        }
    }   
   
}
