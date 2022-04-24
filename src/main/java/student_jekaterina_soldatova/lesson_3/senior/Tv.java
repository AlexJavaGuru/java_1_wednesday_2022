package student_jekaterina_soldatova.lesson_3.senior;

import java.util.Scanner;

class Tv {
    boolean tvMode;
    int tvVolume;
    int tvChannel;
    Scanner scanner = new Scanner(System.in);

    Tv(boolean tvMode, int tvVolume, int tvChannel) {
        this.tvMode = tvMode;
        this.tvVolume = tvVolume;
        this.tvChannel = tvChannel;
    }

    void changeMode() {
        tvMode = !tvMode;
    }

    void changeVolume() {
        System.out.println("Please enter new volume:");
        tvVolume = scanner.nextInt();
    }

    void changeChannel() {
        System.out.println("Please enter new channel (from 1 to 5):");
        tvChannel = scanner.nextInt();
    }

    String getChannelName() {
        switch (tvChannel) {
            case 1: 
                return "Discovery Channel";
            case 2: 
                return "MTV";
            case 3: 
                return "BBC One";
            case 4: 
                return "HBO";
            case 5: 
                return "Fuji TV";
            default: 
                return "no channel";
        }
    }

}
