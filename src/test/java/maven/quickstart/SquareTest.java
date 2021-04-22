package maven.quickstart;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class SquareTest 
    extends TestCase
{
    // use word 'test' before each method defined
    // for testing functionality. This is needed 
    // when you use junit.framework.Test
    // To use annotation @Test instead of word
    // 'test' import org.junit.Test
    public void testSquare()
    {
       JunitTesting test = new JunitTesting();
       int output = test.square(5);
       assertEquals(25, output);
    }
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    /*public AppTest( String testName )
    {
        super( testName );
    }
    */
    /**
     * @return the suite of tests being tested
     */
    /*public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }
    */
    /**
     * Rigourous Test :-)
     */
    /*public void testApp()
    {
        assertTrue( true );
    }
    */
}
