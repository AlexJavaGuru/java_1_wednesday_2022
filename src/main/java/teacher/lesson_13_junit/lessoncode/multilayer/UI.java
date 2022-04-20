package teacher.lesson_13_junit.lessoncode.multilayer;

public class UI {

    private Service service;

    public UI(Service service) {
        this.service = service;
    }

    public void askUser(Integer input) {
        service.putIntoDB(input);
    }

    public String giveUserInfo(Integer userInt) {
        return service.readFromDB(userInt);
    }
}
