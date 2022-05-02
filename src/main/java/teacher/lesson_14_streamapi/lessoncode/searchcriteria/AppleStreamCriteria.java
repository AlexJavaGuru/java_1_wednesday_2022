package teacher.lesson_14_streamapi.lessoncode.searchcriteria;

import teacher.lesson_14_streamapi.lessoncode.Fruit;

import java.util.function.Predicate;

public class AppleStreamCriteria implements Predicate<Fruit> {

    @Override
    public boolean test(Fruit fruit) {
        return "apple".equals(fruit.getTitle());
    }
}
