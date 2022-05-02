package teacher.lesson_13_junit.lessoncode.multilayer;

public class v2ServiceImpl implements Service{


    @Override
    public void putIntoDB(Integer myString) {
        System.out.println("v2 service string saved: " + myString);
    }

    @Override
    public String readFromDB(Integer id) {
        return "id";
    }
}
