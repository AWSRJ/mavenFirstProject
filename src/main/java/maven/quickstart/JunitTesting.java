package maven.quickstart;

/**
 * Hello world!
 *
 */
public class JunitTesting
{
    public static void main( String[] args )
    {
	int sqr = square(6);
        System.out.println( "square of 6 = " + sqr );
    }

    public static int square(int x) {
        return x*x;
    }
}
