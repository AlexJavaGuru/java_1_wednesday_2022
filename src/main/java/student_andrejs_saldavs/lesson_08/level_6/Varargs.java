package student_andrejs_saldavs.lesson_08.level_6;

class Varargs {

    public int sumNumber(int ... args){
        System.out.println("argument length: " + args.length);
        int sum = 0;
        for(int i: args){
            sum += i;
        }
        return sum;
    }

    public static void main( String[] args ) {
        Varargs test = new Varargs();

        int sum2 = test.sumNumber(2, 4);
        System.out.println("sum2 = " + sum2);

        int sum3 = test.sumNumber(1, 3, 5);
        System.out.println("sum3 = " + sum3);

        int sum4 = test.sumNumber(1, 3, 5, 7);
        System.out.println("sum4 = " + sum4);
    }
}
