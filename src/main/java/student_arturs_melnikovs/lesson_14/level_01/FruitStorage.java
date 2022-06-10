package student_arturs_melnikovs.lesson_14.level_01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class FruitStorage {
    private List<Apple> apples;

    FruitStorage() {
        apples = getAllApples();
    }

    public List<Apple> getAllApples() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        apples.add(new Apple("green", 200));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 50));
        apples.add(new Apple("yellow", 50));
        apples.add(new Apple("yellow", 170));
        return apples;
    }

    public List<Apple> getGreenApples() {
        return apples.stream()
                .filter(apple -> apple.getColor().equals("green"))
                .collect(Collectors.toList());
    }


}
