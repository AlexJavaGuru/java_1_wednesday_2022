package student_konstantin_kolesnik.lesson4.level_1;

import java.util.Scanner;

class Task3 {

    public static void main(String[] args) {

        System.out.println("Enter number (1-7):");
        Scanner whatNumberIs = new Scanner(System.in);
        int number = whatNumberIs.nextInt();

            switch (number) {
                case 1:
                    System.out.println("Number 1:" + "\n" + "Esmaspäev");
                    break;
                case 2:
                    System.out.println("Number 2:" + "\n" + "Teisipäev");
                    break;
                case 3:
                    System.out.println("Number 3:" + "\n" + "Kolmapäev");
                    break;
                case 4:
                    System.out.println("Number 4:" + "\n" + "Neljapäev");
                    break;
                case 5:
                    System.out.println("Number 5:" + "\n" + "Reede");
                    break;
                case 6:
                    System.out.println("Number 6:" + "\n" + "Laupäev");
                    break;
                case 7:
                    System.out.println("Number 7:" + "\n" + "Pühapäev");
                    break;
                default:
                    System.out.println("Error: Please try again. Enter number (1-7): ");
            }
    }
}


