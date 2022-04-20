package student_andrejs_saldavs.lesson_03.level_7;

public class Mark {

    String name;
    int mark;
    double percentage;

    Mark(String name, int mark, double percentage) {
        this.name = name;
        this.mark = mark;
        this.percentage = percentage;
    }

    public String getName() {
        return name;
    }

    public int getMark() {
        return mark;
    }

    public double getPercentage() {
        return percentage;
    }

}
