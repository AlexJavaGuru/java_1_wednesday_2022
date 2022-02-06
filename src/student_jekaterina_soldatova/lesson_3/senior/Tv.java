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
        if (tvChannel == 1) {
            return "Discovery Channel";
        }
        if (tvChannel == 2) {
            return "MTV";
        }
        if (tvChannel == 3) {
            return "BBC One";
        }
        if (tvChannel == 4) {
            return "HBO";
        }
        if (tvChannel == 5) {
            return "Fuji TV";
        } else {
            return "no channel";
        }
    }

}
