package teacher.lesson_13_junit.lessoncode.multilayer;

public class Demo {

    public static void main(String[] args) {
        DataBaseImpl databaseImpl = new DataBaseImpl();
        ServiceImpl service = new ServiceImpl(databaseImpl);
        UI myUI = new UI(service);

        myUI.askUser(123);

        String result = myUI.giveUserInfo(10);
        System.out.println(result);
    }
}
