package teacher.lesson_13_junit.lessoncode.multilayer;

import java.util.Optional;

public interface DataBase {

    void save(Integer data);

    Optional<Integer> read(Integer data);
}
