package DifferentTests;

import SortingAlgorithm.Sorting;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertArrayEquals;

@RunWith(Parameterized.class)
public class TenCaseTesting {

    private Sorting sorting = new Sorting();
    private int[] maximumArray;
    private int[] expected;

    public TenCaseTesting(int[] maximumArray, int[] expected)
    {
        this.maximumArray = maximumArray;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection testCases() {
        return Arrays.asList(new int[][][] {
                {{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }},
                {{ 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }, { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }},
                {{ -1, 1, 2, 3, 4, 5, 6, 7, 8, 9 }, { -1, 1, 2, 3, 4, 5, 6, 7, 8, 9 }}
        });
    }

    @Test
    public void solveEquation() {
        sorting.bubbleSort(maximumArray);
        assertArrayEquals(maximumArray, expected);
    }

}
