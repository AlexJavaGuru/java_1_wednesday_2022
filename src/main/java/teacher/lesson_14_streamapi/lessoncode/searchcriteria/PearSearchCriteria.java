package teacher.lesson_14_streamapi.lessoncode.searchcriteria;

import teacher.lesson_14_streamapi.lessoncode.FilterSearchCriteria;
import teacher.lesson_14_streamapi.lessoncode.Fruit;

public class PearSearchCriteria implements FilterSearchCriteria {

    @Override
    public boolean test(Fruit fruit) {
        return "pear".equals(fruit.getTitle());
    }

}
