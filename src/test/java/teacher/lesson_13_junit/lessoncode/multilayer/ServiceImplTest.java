package teacher.lesson_13_junit.lessoncode.multilayer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceImplTest {

    private Service service;
    private DataBaseMock dataBase;

    @BeforeEach
    void setUp() {
        dataBase = new DataBaseMock();
        service = new ServiceImpl(dataBase);
    }

    @Test
    void readFromDB() {
        String result = service.readFromDB(100);
        assertTrue(dataBase.isWasReadTriggered(), "Method must be triggered");
        assertEquals(100, dataBase.getReadArgument(), "Method was triggered with value");
    }
}