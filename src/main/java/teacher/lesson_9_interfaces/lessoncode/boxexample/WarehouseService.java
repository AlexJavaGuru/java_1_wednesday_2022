package teacher.lesson_9_interfaces.lessoncode.boxexample;

public interface WarehouseService {

    boolean putIntoTheBox(Item item);

    default void sorting() {
        System.out.println("Not implemented yet");
    }
}
