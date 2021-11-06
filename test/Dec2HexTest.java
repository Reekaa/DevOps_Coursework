import org.junit.Test;

/**
 * Dec2Hex Tester.
 *
 * @author Reka Forgacs
 * @version 1.0
 * @since <pre>Nov 3, 2021</pre>
 */
public class Dec2HexTest {
    /**
     * Method: main(String args[])
     */
    @Test
    public void testWithCorrectInput() {
        Dec2Hex.main(new String[] {"100"});
    }

    @Test
    public void testNoInput() {
        Dec2Hex.main(new String[]{});
    }

    @Test
    public void testWithNonIntegerInput() {
        Dec2Hex.main(new String[] {"sometext"});
    }
}