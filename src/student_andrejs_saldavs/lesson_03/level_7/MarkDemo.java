package student_andrejs_saldavs.lesson_03.level_7;

public class MarkDemo {

    public static void main(String[] args) {
        Mark testMark = new Mark("John Smith", 8, 83.55);

        String markName = testMark.getName();
        System.out.println("Test's been written by " + markName);

        int markResult = testMark.getMark();
        System.out.println(markName + "'s result is " + markResult);

        double percentageResult = testMark.getPercentage();
        System.out.println(markName + "'s result in percentage is " + percentageResult);
    }

}
