package patternTest;

import org.junit.Test;
import pattern.BubbleSort;

import static org.junit.Assert.assertArrayEquals;

public class BubbleSortTest {

    @Test
    public void testSort() {
        int[] expected ={1,2,3,7,9};
        int[] actual = new BubbleSort().sort(new int[]{2, 7, 9, 1, 3});
        assertArrayEquals(expected, actual);
    }
}