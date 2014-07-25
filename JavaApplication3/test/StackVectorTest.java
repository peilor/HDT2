import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Pablo Argueta, Carnet: 13028
 * @author Aarón Girón, Carnet: 13042
 * @author Esteban Barrera, Carnet: 13 
 */

/*
 * Se prueban las propiedades de la pila, implementada con un vector
 */
public class StackVectorTest {
    
    public StackVectorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Probando el método push.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        int item = 1;
        StackVector<Integer> instance = new StackVector<Integer>();
        instance.push(item);
        System.out.println(instance.empty());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Probando el método pop.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        StackVector<Integer> instance = new StackVector<Integer>();
        int expResult = 1;
        instance.push(expResult);
        int result = instance.pop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Probando el método peek.
     */
    @Test
    public void testPeek() {
        System.out.println("pop");
        StackVector<Integer> instance = new StackVector<Integer>();
        int expResult = 3;
        instance.push(expResult);
        int result = instance.pop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Probando el método size.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        StackVector<String> instance = new StackVector<String>();
        int expResult = 2;
        instance.push("hola");
        instance.push("adios");
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Probando el método empty.
     */
    @Test
    public void testEmpty() {
        System.out.println("empty");
        StackVector instance = new StackVector();
        boolean expResult = true;
        boolean result = instance.empty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
