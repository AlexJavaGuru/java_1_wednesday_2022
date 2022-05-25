package student_arturs_melnikovs.lesson_16.level_05;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class TwoSumProblem {

//    public String findIndices(int[] numbers, int target) {
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = 1 + i; j < numbers.length ; j++) {
//                if (numbers[i] + numbers[j] == target) {
//                    return "[" + i + ", " + j + "]";
//                }
//            }
//        }
//        return "No solution";
//    }

    public int[] findIndices(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            map.put(numbers[i], i);
            int dif = target - numbers[i];
            if (map.containsKey(dif) && map.get(dif) != i) {
                return new int[]{map.get(dif), i};
            }
        }
        return null;
    }
}
