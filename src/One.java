import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class One {
    public static void main(String[] args) {
        int[] sequence = {10, 4, 3, 50, 23, 90};
        int[] result = findLargestElement(sequence);

        for (int i : result) {
            System.out.println(i);
        }

        System.out.println("Second Largest Number Is : " + findSecondLargestElement(sequence));
    }

    private static int[] findLargestElement(int[] data){
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < data.length; i++){
            for(int j = 0 ;j < data.length-1; j++){
                if (data[j] > data[j+1]){
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }

        for(int k = data.length;k > data.length-3;k--){
            result.add(data[k-1]);
        }

        return result.stream().mapToInt(i->i).toArray();
    }

    private static int findSecondLargestElement(int[] data){
        Arrays.sort(data);
        return data[data.length-2];
    }
}