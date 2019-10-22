import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class p002Test {
    @Test
    public void TestSumEvens(){
        p002 p002 = new p002();
        assertEquals(2, p002.SumEvens(3));
    }
}
