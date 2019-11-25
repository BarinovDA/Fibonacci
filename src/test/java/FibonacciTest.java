
import org.hamcrest.CoreMatchers;
import org.hamcrest.Matcher;
import ru.Fibonacci.*;
import org.junit.jupiter.api.Test;
import ru.Fibonacci.main.FibonacciMain;

import static org.hamcrest.MatcherAssert.assertThat;


public class FibonacciTest {
    @Test
    public static void fibonacciTest (){
        assertThat(FibonacciMain.zeroInFibonacci(10000), CoreMatchers.is(190));
    }
}
