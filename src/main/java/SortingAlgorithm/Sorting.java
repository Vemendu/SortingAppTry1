package SortingAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {

    public int[] getArrayAndSort()
    {
        int[] givenArray;
        int step = 0;
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] split = input.split("\\s+");
        givenArray = new int[split.length];
        for(String arrayCell : split)
        {
            givenArray[step] = Integer.parseInt(arrayCell);
            step++;
        }
        bubbleSort(givenArray);
        System.out.println(Arrays.toString(givenArray));
        return givenArray;
    }

    public void bubbleSort(int[] unorderedArray) {

        int temp;

        if(unorderedArray.length == 0 || unorderedArray.length > 10)
        {
            throw new IllegalArgumentException("Wrong number of arguments!");
        }

        for(int i = 0; i < unorderedArray.length - 1; i++)
        {
            if(unorderedArray[i]>unorderedArray[i+1])
            {
                temp = unorderedArray[i];
                unorderedArray[i] = unorderedArray[i+1];
                unorderedArray[i+1] = temp;
            }
        }

    }

}
