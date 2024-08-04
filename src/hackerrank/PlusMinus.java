package hackerrank;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusMinus {

    private static void plusMinus(List<Integer> arr) {
            int resPositive = 0;
            int resNegative = 0;
            int resZero = 0;

            for (int i : arr) {
                if (i > 0) {
                    resPositive++;
                } else if (i == 0) {
                    resZero++;
                }else{
                    resNegative++;
                }
            }

            NumberFormat formatter = NumberFormat.getNumberInstance();
            formatter.setMaximumFractionDigits(6);

            System.out.println(
                    formatter.format((double) resPositive / arr.size()) + " "
            );
            System.out.println(
                    formatter.format((double) resNegative / arr.size()) + " "
            );
            System.out.println(
                    formatter.format((double)resZero / arr.size()) + " "
            );
    }
}
