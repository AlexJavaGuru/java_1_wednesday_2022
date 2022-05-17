package student_arturs_melnikovs.lesson_11.level_01;

class SafeThatIsSaveDemo {
    public static void main(String[] args) {
        SafeThatIsSave safe = new SafeThatIsSave("password", 1000);
        safe.putMoney("password", 1000);
        System.out.println(safe.getMoney("password"));
    }
}
