package teacher.lesson_14_streamapi.lessoncode;

@FunctionalInterface
public interface FilterSearchCriteria {

    boolean test(Fruit fruit);

}
