import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class p001Test {
    @Test
    public void testSumMultiples(){
        p001 p001 = new p001();
        assertEquals(233168, p001.SumMultiples(1000));
    }
}
