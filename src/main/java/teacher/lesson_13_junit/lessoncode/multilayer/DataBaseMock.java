package teacher.lesson_13_junit.lessoncode.multilayer;

import java.util.Optional;

public class DataBaseMock implements DataBase {

    private boolean wasSaveTriggered;
    private Integer saveArgument;

    private boolean wasReadTriggered;
    private Integer readArgument;

    @Override
    public void save(Integer data) {
        saveArgument = data;
        wasSaveTriggered = true;
    }

    @Override
    public Optional<Integer> read(Integer data) {
        wasReadTriggered = true;
        readArgument = data;
        return Optional.empty();
    }

    public boolean isWasSaveTriggered() {
        return wasSaveTriggered;
    }

    public boolean isWasReadTriggered() {
        return wasReadTriggered;
    }

    public Integer getSaveArgument() {
        return saveArgument;
    }

    public Integer getReadArgument() {
        return readArgument;
    }
}
