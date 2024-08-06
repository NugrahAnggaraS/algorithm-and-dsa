package hackerrank;

import java.util.Scanner;

public class NumberLineJumps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int v1 = sc.nextInt();
        int x2 = sc.nextInt();
        int v2 = sc.nextInt();
        System.out.println(kangaroo(x1,v1,x2,v2));
    }

    private static String kangaroo(int x1, int v1, int x2, int v2) {
        int counter = 10000;
        String res = "NO";
        while(x1 <= counter || x2 <= counter){

            x1+= v1;
            x2+= v2;

            if (x1 == x2){
                res = "YES";
                break;
            }
        }
        return res;
    }
}
