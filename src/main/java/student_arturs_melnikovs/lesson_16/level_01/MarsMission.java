package student_arturs_melnikovs.lesson_16.level_01;

import java.util.Random;
import java.util.Scanner;

public class MarsMission {
    private final int maxX;
    private final int maxY;
    private Rover rover1;
    private Rover rover2;

    public MarsMission(int maxX, int maxY) {
        this.maxX = maxX;
        this.maxY = maxY;
    }

    public void deployRovers() {
        Random random = new Random();
        rover1 = new Rover(random.nextInt(maxX), random.nextInt(maxY), "N", this);
        rover2 = new Rover(random.nextInt(maxX), random.nextInt(maxY), "N", this);
    }
    public void start() {
        while (true) {
            System.out.println("Rover 1 location: " + rover1.getLocation());
            System.out.println("Rover 2 location: " + rover2.getLocation());
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter command for rover 1");
            String command1 = scanner.nextLine();
            scanner.reset();
            System.out.println("Enter command for rover 2");
            String command2 = scanner.nextLine();
            scanner.reset();
            rover1.move(command1);
            rover2.move(command2);
        }
    }

    public int getMaxX() {
        return maxX;
    }

    public int getMaxY() {
        return maxY;
    }
}
