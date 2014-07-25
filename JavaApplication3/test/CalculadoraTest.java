
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
 * Para esta prueba no se modificaron las pruebas, ya que no hay métodos por probar. 
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
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
     * Test of main method, of class Calculadora.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Calculadora.main(args);
        fail("The test case is a prototype.");
    }
}
