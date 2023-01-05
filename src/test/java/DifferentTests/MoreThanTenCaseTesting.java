package DifferentTests;

import SortingAlgorithm.Sorting;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class MoreThanTenCaseTesting {

    private Sorting sorting = new Sorting();
    private int[] hugeArray;

    public MoreThanTenCaseTesting(int[] hugeArray)
    {
        this.hugeArray = hugeArray;
    }

    @Parameterized.Parameters
    public static Collection testCases() {
        return Arrays.asList(new int[][] {
                { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 },
                { 0, 1, 2, 3, 4, 5, 6, 7, 8 , 9, 10 },
                { 0, 1, 2, 3, 4, 5, 6, 7, 8 , 9, 10, 11 },
        });
    }

    @Test(expected = IllegalArgumentException.class)
    public void solveEquation() {
        sorting.bubbleSort(hugeArray);
    }

}
