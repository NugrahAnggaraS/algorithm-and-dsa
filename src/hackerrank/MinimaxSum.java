package hackerrank;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class MinimaxSum {
    public static void main(String[] args) {

    }

    private static void minimaxSum(List<Integer> arr){

        int minimum =0;
        int maximum = 0;
        int sumres;

        for(int i = 0 ; i < arr.size() ; i++){
            sumres = 0;
            for (int j = arr.size()-1;j>arr.size()-5;j--){
                sumres+= arr.get(j);
            }
            if(sumres > maximum){
                maximum = sumres;
            }else{
                minimum = sumres;
            }
        }
        System.out.println(minimum + " " +maximum);
    }
}
