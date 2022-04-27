package teacher.lesson_14_streamapi.lessoncode.searchcriteria;

import teacher.lesson_14_streamapi.lessoncode.FilterSearchCriteria;
import teacher.lesson_14_streamapi.lessoncode.Fruit;

public class RedAppleSearchCriteria implements FilterSearchCriteria {

    @Override
    public boolean test(Fruit fruit) {
        return "apple".equals(fruit.getTitle()) &&
                "red".equals(fruit.getColor());
    }

}
