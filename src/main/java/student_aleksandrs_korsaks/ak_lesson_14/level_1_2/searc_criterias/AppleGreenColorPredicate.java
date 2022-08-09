package student_aleksandrs_korsaks.ak_lesson_14.level_1_2.searc_criterias;

import student_aleksandrs_korsaks.ak_lesson_14.level_1_2.Apple;
import student_aleksandrs_korsaks.ak_lesson_14.level_1_2.ApplePredicate;

public class AppleGreenColorPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals("green");
    }
}
