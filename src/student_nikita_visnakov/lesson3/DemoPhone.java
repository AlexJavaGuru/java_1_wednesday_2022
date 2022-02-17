package student_nikita_visnakov.lesson3;

public class DemoPhone {

    public static void main(String[] args) {

        Phone myPhone = new Phone("Huawei");
        String phoneModel = myPhone.getModel();
        System.out.println("Phone model = " + phoneModel);
    }
}
