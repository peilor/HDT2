

import java.io.*;

public class Calculadora {
    private static Stack<String> datos;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        datos= new StackVector<String>();
        //Stack<String> datos = new StackVector<String>();
        //Stack<Integer> datos = new StackVector<Integer>();
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
                datos.push(strLinea);
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
       String dato=datos.pop();
       int result=0;
       //System.out.println(dato);
       char[] signo=dato.toCharArray();

       for(int i=0; i<signo.length; i++){
           int num1=Integer.parseInt(datos.pop());
           int num2=Integer.parseInt(datos.pop());
           if(signo[i]=='+'){            
               result=num1+num2;
               datos.push(Integer.toString(result));
           }
           if(signo[i]=='-'){            
               result=num1-num2;
               datos.push(Integer.toString(result));
           }
           if(signo[i]=='*'){            
               result=num1*num2;
               datos.push(Integer.toString(result));
           }
           if(signo[i]=='/'){            
               result=num1/num2;
               datos.push(Integer.toString(result));
           }
        }   
   }
}
