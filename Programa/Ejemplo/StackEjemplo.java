

public class StackEjemplo {
  public static void main(String[] args) {
    Stack<String> miStack = new StackVector<String>();
    miStack.push("Adios");  //1
	miStack.push("Hola");   //2
	
	
	System.out.println(miStack.size());
	System.out.println(miStack.empty());
	String cadena = miStack.peek();
    System.out.println(cadena);
    cadena = miStack.pop();
    System.out.println(cadena);
	cadena = miStack.pop();
	System.out.println(cadena);
  }
}