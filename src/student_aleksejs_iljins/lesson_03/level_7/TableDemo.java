package student_aleksejs_iljins.lesson_03.level_7;
//Task 29
class TableDemo {
    public static void main(String[] args) {
        Table table = new Table(85,60,90);
        table.setHeight();
        table.setWidth();
        table.setLength();

        int area = table.getResult();
        System.out.println("Площадь столешницы: " + area + " см");
    }
}
