package student_aleksandrs_korsaks.ak_lesson_10.level_2_3_4_5_6;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class UniqueWordFinder {

    Set<String> find(String text) {
        return new HashSet<>(List.of(text.toLowerCase()
                .replaceAll("[^a-zA-Z\s]", " ")
                .split("\s+")));
    }
}
