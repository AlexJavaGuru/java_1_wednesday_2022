package teacher.lesson_13_junit.lessoncode.multilayer;

import java.util.Optional;

public class ServiceImpl implements Service {

    private DataBase db;

    public ServiceImpl(DataBase db) {
        this.db = db;
    }

    @Override
    public void putIntoDB(Integer input) {
        db.save(input);
    }

    @Override
    public String readFromDB(Integer id) {
        Optional<Integer> read = db.read(id);
        if (read.isPresent()) {
            return read.get().toString();
        }
        return "Not Found";
    }
}
