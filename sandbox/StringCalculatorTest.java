import org.junit.*;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.Collection;
import java.util.Arrays;

@RunWith(value=Parameterized.class)
public class StringCalculatorTest {
    private String input;
    private int expected;

    @Parameters
    public static Collection<Object[]> getInputAndExpected() {
        return Arrays.asList(new Object[][] {
            {"", 0},   // input, expected
            {"1", 1},  // input, expected
            {"1,2", 3} // input, expected
        });
    }

    public StringCalculatorTest(String input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void add_empty_defaultResults()
    {
        StringCalculator sc = new StringCalculator();
        int result = sc.add(input);
    
        assertEquals(expected, result);
    }
}