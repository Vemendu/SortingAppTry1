package DifferentTests;

import SortingAlgorithm.Sorting;
import org.junit.Test;

public class ZeroCaseTesting {

    private Sorting sorting = new Sorting();

    @Test(expected = IllegalArgumentException.class)
    public void solveEquation() {
        sorting.bubbleSort(new int[]{});
    }

}
