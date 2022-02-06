package student_jekaterina_soldatova.lesson_3.senior;

import java.util.Scanner;

class Kettle {
    Scanner scanner = new Scanner(System.in);
    boolean kettleMode;
    int kettleWaterAmount;
    boolean kettleHot;

    Kettle(boolean kettleMode, int kettleWaterAmount, boolean kettleHot) {
        this.kettleMode = kettleMode;
        this.kettleWaterAmount = kettleWaterAmount;
        this.kettleHot = kettleHot;
    }

     void changeKettleMode() throws InterruptedException {
         kettleMode = !kettleMode;
         if (kettleMode) {
             System.out.print("Water is being heated");
             for (int i = 0; i < 5; i++) {
                 Thread.sleep(500);
                 System.out.print(" . ");
             }
             System.out.println();
             kettleHot = kettleMode;
             kettleMode = !kettleMode;
             System.out.println("Water is boiling, kettle has switched off");
         }
     }

     void addWater() {
        System.out.println("How much ml should we add?");
         kettleWaterAmount += scanner.nextInt();
     }

     void takeWater() {
        System.out.println("How much ml do you want to pour from kettle?");
       int cup = scanner.nextInt();
        if (kettleWaterAmount - cup >= 0) {
            kettleWaterAmount -= cup;
            System.out.println("Enjoy your drink!");
        }
        else {
            System.out.println("There was not enough water, you only get " + kettleWaterAmount + "ml in your cup");
            kettleWaterAmount = 0;
        }
     }

}
