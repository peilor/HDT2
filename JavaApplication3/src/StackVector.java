/**
 *
 * @author Pablo Argueta, Carnet: 13028
 * @author Aarón Girón, Carnet: 13
 * @author Esteban Barrera, Carnet: 13
 * 
 */

import java.util.*;
/**
 * Clase que implementa la intefaz Stack
 * @param <E>, que define el tipo de datos que recibe la pila
 */
public class StackVector<E>  implements Stack<E>{
	
    protected Vector<E> vector;
    private int cont=0;
    private E temporal;
    
        /**
         * Método que inicializa el objeto de tipo vector
         */
	public StackVector()
	{
		vector = new Vector<E>();
	}
        
        /**
         * 
         * @param item 
         * Recibe un valor y lo coloca en la posición de un contador
         */
	public void push(E item)
	{
                vector.insertElementAt(item,cont);
                cont++;
	}
        
        /**
         * 
         * @return  el dato que se eliminó de la pila (siempre es el último que se ingresó)
         */
	public E pop()
	{                
                temporal=vector.elementAt(cont-1);
                vector.removeElementAt(cont-1);
                cont--;
		return temporal;
	}
        
        /**
         * 
         * @return el último valor que se ingresó
         */
	public E peek()
	{
		return vector.elementAt(cont-1);
	}
        
	/**
         * 
         * @return tamaño de la pila
         */
	public int size()
	{
		return cont;
	}
        
        /**
         * 
         * @return si la pila está vacía o no
         */
	public boolean empty()
	{
		return cont == 0;
	}
    
}
