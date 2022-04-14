package student_arturs_melnikovs.lesson_12.level_04;

class StackOverflowErrorExample {

    void print(int num){
        System.out.println(num);
        print(num);
    }

    public static void main(String[] args) {
        StackOverflowErrorExample errorExample = new StackOverflowErrorExample();
        errorExample.print(0);
    }
}
