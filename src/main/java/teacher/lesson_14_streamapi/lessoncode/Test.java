package teacher.lesson_14_streamapi.lessoncode;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;

public class Test {

    public static void main(String[] args) {
        FruitStreamApi streamApi = new FruitStreamApi();

        streamApi.findAnyApple().ifPresent(fruit -> System.out.println(fruit.getWeight()));

        Map<Integer, List<Fruit>> result = streamApi.groupByWeight();
        Set<String> test = streamApi.test();
        int a = 1;
    }
}
