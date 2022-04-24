package student_alex_stranger.lesson_3.level_7;

public class SpinningDemo {

    public static void main(String[] args) {
        Spinning spinning = new Spinning("Acara magista", 2.1, 125, "Test","Medium-Fast");
       String name = spinning.getName();
       double length = spinning.getLength();
      int weight = spinning.getWeight();
      String test = spinning.getTest();
      String action = spinning.getAction();
        System.out.println("Technical characteristics of the spinning:");
        System.out.println("Name:" + name);
        System.out.println("Length:" + length);
        System.out.println("Weight:" + weight);
        System.out.println("Test: 5,5-28" );
        System.out.println("Action:" + action);


    }

}
