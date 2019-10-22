import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GaussTest {
    @Test
    public void TestSum(){
        Gauss gauss = new Gauss();
        assertEquals(21, gauss.sum(6));
    }
}
