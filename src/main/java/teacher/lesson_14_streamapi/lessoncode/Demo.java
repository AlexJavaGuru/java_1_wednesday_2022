package teacher.lesson_14_streamapi.lessoncode;

import student_arturs_melnikovs.lesson_10.level_02.Book;
import teacher.lesson_5_arrays_for_loop.lessoncode.loops.ForExample;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class Demo {

    public static void main(String[] args) {
        FruitStore fruitStore = new FruitStore();

        FilterSearchCriteria filterSearchCriteria = fruit -> "red".equals(fruit.getColor());
        List<Fruit> fruitsByCriteria = fruitStore.findFruitsByCriteria(filterSearchCriteria);
        System.out.println(fruitsByCriteria);


        FruitStreamApi fruitStreamApi = new FruitStreamApi();

        Optional<Fruit> anyApple = fruitStreamApi.findAnyApple();

        anyApple.orElseThrow(() -> new IllegalArgumentException());

        fruitStreamApi.test();

        something("DE", Book::getTitle);
    }

    public static String something(String language, Function<Book, String> function) {
        String result = "";
        if (language.equals("DE")) {
            Book book = new Book("any", "any");
            result = function.apply(book);
        }
        return result;
    }
}
