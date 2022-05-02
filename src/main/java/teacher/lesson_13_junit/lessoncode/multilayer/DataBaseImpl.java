package teacher.lesson_13_junit.lessoncode.multilayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DataBaseImpl implements DataBase {

    private List<Integer> database = new ArrayList<>();

    public void save(Integer data) {
        database.add(data);
    }

    public Optional<Integer> read(Integer data) {
        for (Integer integer : database) {
            if (data.equals(integer)) {
                return Optional.of(integer);
            }
        }
        return Optional.empty();
    }
}
