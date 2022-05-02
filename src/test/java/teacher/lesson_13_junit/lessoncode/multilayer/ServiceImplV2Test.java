package teacher.lesson_13_junit.lessoncode.multilayer;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.doReturn;

@ExtendWith(MockitoExtension.class)
@RunWith(JUnitPlatform.class)
class ServiceImplV2Test {

    @Mock
    private DataBaseImpl dataBase;

    @InjectMocks
    private ServiceImpl service;

    @Test
    void readFromDB() {
        doReturn(Optional.of(100)).when(dataBase).read(anyInt());
        String actualResult = service.readFromDB(1);
        assertEquals("100", actualResult);
    }
}