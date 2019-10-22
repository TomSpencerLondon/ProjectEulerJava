import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {
    @Test
    public void TestAdd(){
        Factorial factorial = new Factorial();
        assertEquals(6, factorial.Add(3));
    }
}
