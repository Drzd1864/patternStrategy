package patternTest;

import org.junit.Test;
import pattern.SelectionSort;

import static org.junit.Assert.*;

public class SelectionSortTest {

    @Test
    public void TestSort() {
        int[] expected = {1, 2, 3, 7, 9, 12, 14};
        int[] actual = new SelectionSort().sort(new int[]{2, 14, 7, 9, 12, 1, 3});
        assertArrayEquals(expected, actual);
    }
}