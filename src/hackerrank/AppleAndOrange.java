package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppleAndOrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int t = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int nApple = sc.nextInt();
        int nOrange = sc.nextInt();
        List<Integer> apples = new ArrayList<>();
        List<Integer> oranges = new ArrayList<>();
        for (int i = 0; i < nApple; i++) {
            int n = sc.nextInt();
            apples.add(n);
        }

        for(int j = 0; j < nOrange; j++){
            int n = sc.nextInt();
            oranges.add(n);
        }
        countApplesAndOranges(s,t,a,b,apples,oranges);
    }


    private static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        int apple = 0;
        int orange = 0;
        for(int i = 0; i < apples.size(); i++){
            int sumres = apples.get(i) + a;
            if (sumres >= s && sumres <= t){
                apple++;
            }
        }

        for(int j = 0; j < oranges.size(); j++){
            int sumres = oranges.get(j) + b;
            if (sumres>= s && sumres <= t){
                orange++;
            }
        }

        System.out.println(apple);
        System.out.println(orange);
    }
}
