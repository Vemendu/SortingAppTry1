package DifferentTests;

import SortingAlgorithm.Sorting;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertArrayEquals;

@RunWith(Parameterized.class)
public class OneCaseTesting {

    private Sorting sorting = new Sorting();
    private int[] smallArray;
    private int[] expected;

    public OneCaseTesting(int[] smallArray, int[] expected)
    {
        this.smallArray = smallArray;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection testCases() {
        return Arrays.asList(new int[][][] {
                {{ 1 }, { 1 }},
                {{ 0 }, { 0 }},
                {{ -1 }, { -1 }}
        });
    }

    @Test
    public void solveEquation() {
        sorting.bubbleSort(smallArray);
        assertArrayEquals(smallArray, expected);
    }

}
