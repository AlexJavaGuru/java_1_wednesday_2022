package student_aleksandrs_jakovenko.lesson_3.level_7;

class Shop {
    int workTime;
    String name;

    void workTime(int workTime){
        this.workTime = workTime;
        System.out.println("Shop works " + workTime + " hours.");
    }
    void shopName(String name){
        this.name = name;
        System.out.println("Shop name is: " + name);
    }
}
