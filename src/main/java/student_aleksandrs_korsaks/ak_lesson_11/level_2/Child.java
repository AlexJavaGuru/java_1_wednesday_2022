package student_aleksandrs_korsaks.ak_lesson_11.level_2;

class Child extends Base{
    Child(){
        super();
        System.out.println("And default child constructor");
    }

    @Override
    public String toString() {
        return "Child{}";
    }
}
