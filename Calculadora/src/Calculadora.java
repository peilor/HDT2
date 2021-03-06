

import java.io.*;

public class Calculadora {
    private static Stack<Integer> datos;
    //public static String strLinea;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        datos= new StackVector<Integer>();
        String strLinea1=" ";
        String strLinea= " ";		
        //Inicia codigo tomado de internet para la lectura de un archivo .txt
        try{
            // Abrimos el archivo
            FileInputStream fstream = new FileInputStream("texto.txt");
            // Creamos el objeto de entrada
            DataInputStream entrada = new DataInputStream(fstream);
            // Creamos el Buffer de Lectura
            BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
            
            // Leer el archivo linea por linea
            while ((strLinea1 = buffer.readLine()) != null)   {
              
                // Imprimimos la línea por pantalla
				strLinea = strLinea1;
                System.out.println ("Operacion ingresada: "+strLinea);
                
            }
            // Cerramos el archivo
            entrada.close();
        }
        catch (Exception e){ //Catch de excepciones
            System.err.println("Ocurrio un error: " + e.getMessage());
        } 
        //Termina codigo tomado de internet
        
       
        
       int resultado=0;
       int num1 = 0;
       int num2 = 0;   
       for(int i=0; i<strLinea.length(); i++){
                if(strLinea.charAt(i)=='+'){
                    num1 = datos.pop();
                    num2 = datos.pop();
                    resultado = num1 + num2;
                    datos.push(resultado);
                }
                if(strLinea.charAt(i)=='-'){
                    num1 = datos.pop();
                    num2 = datos.pop();
                    resultado = num2 - num1;
                    datos.push(resultado);
                }
                if(strLinea.charAt(i)=='*'){
                    num1 = datos.pop();
                    num2 = datos.pop();
                    resultado = num1 * num2;
                    datos.push(resultado);
                }
                if(strLinea.charAt(i)=='/'){
                    num1 = datos.pop();
                    num2 = datos.pop();
                    resultado = num2 / num1;
                    datos.push(resultado);
                }
                if (Character.getNumericValue(strLinea.charAt(i))>=0)
                {
				   int dato=Character.getNumericValue(strLinea.charAt(i));
                   datos.push(dato);
                }      
        }
       System.out.println ("El resultado de las operaciones es: "+datos.pop()); 
    }
}