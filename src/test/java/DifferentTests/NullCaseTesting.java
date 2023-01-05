package DifferentTests;

import SortingAlgorithm.Sorting;
import org.junit.Test;

public class NullCaseTesting {

    private Sorting sorting = new Sorting();

    @Test(expected = NullPointerException.class)
    public void solveEquation() {
        sorting.bubbleSort(null);
    }

}
