package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class GradingStudent {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> result = new ArrayList<Integer>();

        for(int grade: grades){
            double hasil = (int) (Math.ceil(((double) grade) / 5) * 5);

            if ((hasil - grade) < 3){
                result.add((int) (grade + (hasil - grade)));
            }else{
                result.add(grade);
            }
        }

        return result;
    }
}
