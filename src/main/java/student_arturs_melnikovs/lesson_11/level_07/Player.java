package student_arturs_melnikovs.lesson_11.level_07;

import java.util.Objects;
import java.util.Scanner;

class Player {

    private final String name;
    private final int token;

    Player(int token, String name) {
        this.name = name;
        this.token = token;
    }

    Move makeMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter column number(0-6): ");
        int columnNum = Integer.parseInt(scanner.nextLine());
        return new Move(columnNum);
    }

    public int getToken() {
        return token;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return token == player.token && Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, token);
    }
}
