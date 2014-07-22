import java.io.*;

public class Calculadora {
    private static Stack<Integer> datos;
    public static String strLinea;
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
            
            // Leer el archivo linea por linea
            while ((strLinea = buffer.readLine()) != null)   {
                
                
                // Imprimimos la lÃ­nea por pantalla
                System.out.println (strLinea);
                operaciones();
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
       int resultado=0;
       int num1 = datos.pop();
       int num2 = datos.pop();
       
       
       //System.out.println(dato);
       for(int i=0; i<strLinea.length(); i++){
                if(strLinea.charAt(i)=='+'){
                    num1 = datos.pop();
                    num2 = datos.pop();
                    resultado = num1 + num2;
                    datos.push(resultado);
                    System.out.println (resultado);
                }
                if(strLinea.charAt(i)=='-'){
                    num1 = datos.pop();
                    num2 = datos.pop();
                    resultado = num1 - num2;
                    datos.push(resultado);
                    System.out.println (strLinea);
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
                    resultado = num1 / num2;
                    datos.push(resultado);
                }
                 if(strLinea.charAt(i)==' '){
                    i++;
                }
                
                else
                {
                   int dato1=(int)strLinea.charAt(i);
                   int dato2= Character.getNumericValue(dato1);
                   datos.push(dato2);
                }
      
                }
                
    }     
}
