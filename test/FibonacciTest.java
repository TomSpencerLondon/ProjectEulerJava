import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {
    @Test
    public void TestSequence(){
        Fibonacci fibonacci = new Fibonacci();
        assertEquals(8, fibonacci.Sequence(6));
    }
}
