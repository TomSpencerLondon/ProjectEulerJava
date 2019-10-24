import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class p003Test {
    @Test
    public void TestFirstPrime(){
        p003 p003 = new p003();
        assertEquals(600851475067L, p003.FirstPrime(600851475143L));

    }
}
