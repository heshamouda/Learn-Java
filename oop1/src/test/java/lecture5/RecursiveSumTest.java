package lecture5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecursiveSumTest {

    @Test
    public void testRecursiveSum(){
        RecursiveSum sum = new RecursiveSum();

        int result = sum.recursiveSum(5);

        assertEquals(15, result);
    }
}
