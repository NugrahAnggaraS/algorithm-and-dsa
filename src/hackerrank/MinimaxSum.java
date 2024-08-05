package hackerrank;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class MinimaxSum {
    public static void main(String[] args) {

    }

    private static void minimaxSum(List<Integer> arr){
        long maximum = arr.get(0);
        long minimum = arr.get(0);
        long sumres = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > maximum){
                maximum = arr.get(i);
            }
            if (arr.get(i) < minimum){
                minimum = arr.get(i);
            }
        }

        for(int i : arr){
            sumres+= i;
        }

        System.out.println((sumres-maximum) + " " + (sumres-minimum));
    }
}
