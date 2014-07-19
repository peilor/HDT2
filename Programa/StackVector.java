/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bicimotoca
 */
import java.util.*;
public class StackVector<E>  implements Stack<E>{
	
    protected Vector<E> vector;
    private int cont=0;
    private E temporal;

	public StackVector()
	// post: constructs a new, empty stack
	{
		vector = new Vector<E>();
	}

	public void push(E item)
	// post: the value is added to the stack
	//          will be popped next if no intervening push
	{
                vector.insertElementAt(item,cont);
                cont++;
	}

	public E pop()
	// pre: stack is not empty
	// post: most recently pushed item is removed and returned
	{                
                temporal=vector.elementAt(cont-1);
                vector.removeElementAt(cont-1);
                cont--;
		return temporal;
	}

	public E peek()
	// pre: stack is not empty
	// post: top value (next to be popped) is returned
	{
		return vector.elementAt(cont-1);
	}
	
	public int size()
	// post: returns the number of elements in the stack
	{
		return cont;
	}
  
	public boolean empty()
	// post: returns true if and only if the stack is empty
	{
		return cont == 0;
	}
    
}
