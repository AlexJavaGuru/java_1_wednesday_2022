package student_arturs_melnikovs.lesson_16.level_01;

public class Rover {
    private int posX;
    private int posY;
    private String heading;
    private final MarsMission mission;

    public Rover(int posX, int posY, String heading, MarsMission mission) {
        this.posX = posX;
        this.posY = posY;
        this.heading = heading;
        this.mission = mission;
    }

    public void move(String command, Rover otherRover) {
        char[] commands = command.toCharArray();
        for (char step : commands) {
            if (step == 'M') {
                moveForward(otherRover);
            }
            if (step == 'R') {
                turnRight();
            }
            if (step == 'L') {
                turnLeft();
            }
        }
    }

    private void moveForward(Rover otherRover) {
        switch (heading) {
            case "N" -> {
                if (posY != mission.getMaxY() && !isOccupiedN(otherRover)) {
                    posY++;
                }
            }
            case "E" -> {
                if (posX != mission.getMaxX() && !isOccupiedE(otherRover)) {
                    posX++;
                }
            }
            case "S" -> {
                if (posY != 0 && !isOccupiedS(otherRover)) {
                    posY--;
                }
            }
            case "W" -> {
                if (posX != 0 && !isOccupiedW(otherRover)) {
                    posX--;
                }
            }
        }
    }

    private boolean isOccupiedN(Rover otherRover) {
        return this.posY + 1 == otherRover.posY && this.posX == otherRover.posX;
    }
    private boolean isOccupiedE(Rover otherRover) {
        return this.posX + 1 == otherRover.posX && this.posY == otherRover.posY;
    }
    private boolean isOccupiedS(Rover otherRover) {
        return this.posY - 1 == otherRover.posY && this.posX == otherRover.posX;
    }
    private boolean isOccupiedW(Rover otherRover) {
        return this.posX - 1 == otherRover.posX && this.posY == otherRover.posY;
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
