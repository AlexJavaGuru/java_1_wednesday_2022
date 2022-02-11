package student_jekaterina_soldatova;

import java.util.Scanner;

public class TestCodewars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int t = scanner.nextInt();

//        if (a > b) {
//            int z = b;
//            b = a;
//            a = z;

        int whole = t / (b - a);
        int rem = t % (b - a);
       // System.out.println(whole%2);

        if (whole % 2 > 0 || whole == 0) {
            System.out.println(b - rem);
        } else {
            System.out.println(b- rem);
        }
    }
}
