package student_arturs_melnikovs.lesson_16.level_01;

public class Rover {
    private int posX;
    private int posY;
    private String heading;
    private MarsMission mission;

    public Rover(int posX, int posY, String heading, MarsMission mission) {
        this.posX = posX;
        this.posY = posY;
        this.heading = heading;
        this.mission = mission;
    }

    public void move(String command) {
        char[] commands = command.toCharArray();
        for (char step : commands) {
            if (step == 'M') {
                moveForward();
            }
            if (step == 'R') {
                turnRight();
            }
            if (step == 'L') {
                turnLeft();
            }
        }
    }

    private void moveForward() {
        switch (heading) {
            case "N" -> {
                if (posY != mission.getMaxY()) {
                    posY++;
                }
            }
            case "E" -> {
                if (posX != mission.getMaxX()) {
                    posX++;
                }
            }
            case "S" -> {
                if (posY != 0) {
                    posY--;
                }
            }
            case "W" -> {
                if (posX != 0) {
                    posX--;
                }
            }
        }
    }
    private void turnRight() {
        switch (heading) {
            case "N" -> heading = "E";
            case "E" -> heading = "S";
            case "S" -> heading = "W";
            case "W" -> heading = "N";
        }
    }
    private void turnLeft() {
        switch (heading) {
            case "N" -> heading = "W";
            case "E" -> heading = "N";
            case "S" -> heading = "E";
            case "W" -> heading = "S";
        }
    }

    public String getLocation() {
        return posX + " " + posY + " " + heading;
    }
}
