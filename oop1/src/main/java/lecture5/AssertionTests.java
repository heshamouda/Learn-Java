package lecture5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AssertionTests {

    @Test
    public void assertTests(){
        int i = 3*3;
        assertEquals(9,i);

        int j = (int)3.9;
        assertEquals(4,j);

//        boolean b = isPrime(8);
//        assertTrue(b);
    }
}
