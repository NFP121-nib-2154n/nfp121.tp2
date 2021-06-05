package question1;





/**
 * The test class test_raphael.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class test_raphael extends junit.framework.TestCase {
    /**
     * Default constructor for test class test_raphael
     */
    public test_raphael()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    //@BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    //@AfterEach
    public void tearDown()
    {
    }
    
    public void test_fahrenheitEnCelsius() {
        assertEquals("    500 °F -> 260 °C ? ", 260, question1.FahrenheitCelsius.fahrenheitEnCelsius(500), 0.1);
        assertEquals("  327 °F -> 163.8 °C ? ", 163.8, question1.FahrenheitCelsius.fahrenheitEnCelsius(327), 0.1);
        assertEquals(" 12 °F -> -11.1 °C ?", -11.1, question1.FahrenheitCelsius.fahrenheitEnCelsius(12), 0.1);
        assertEquals("   7 °F -> -13.8 °C ?", -13.8, question1.FahrenheitCelsius.fahrenheitEnCelsius(7), 0.1);
    }
}
