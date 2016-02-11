import org.junit.*;
import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class StringCalculatorTest {

    private static final Object[] getInputAndExpected() {
        return new Object[] {
            new Object[] {"", 0},
            new Object[] {"1", 1},
            new Object[] {"1,2", 3}
        };
    }

    @Test
    @Parameters(method="getInputAndExpected")
    public void add_empty_defaultResults(String input, int expected)
    {
        StringCalculator sc = new StringCalculator();
        int result = sc.Add(input);
    
        assertEquals(result, expected);
    }
}