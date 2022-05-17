package teacher.lesson_14_streamapi.lessoncode.searchcriteria;

import teacher.lesson_14_streamapi.lessoncode.FilterSearchCriteria;
import teacher.lesson_14_streamapi.lessoncode.Fruit;


public class AppleSearchCriteria implements FilterSearchCriteria {

    @Override
    public boolean test(Fruit fruit) {
        return "apple".equals(fruit.getTitle());
    }
}
