package student_arturs_melnikovs.lesson_15.level_03;

import java.util.Objects;

public class TennisGame3 implements TennisGame {

    private int p2Score;
    private int p1Score;
    private final String p1Name;
    private final String p2Name;

    public TennisGame3(String p1N, String p2N) {
        this.p1Name = p1N;
        this.p2Name = p2N;
    }

    public String score() {
        String name;
        if (p1Score < 4 && p2Score < 4 && !(p1Score + p2Score == 6)) {
            return pointsBelowFourNotDeuce();
        } else {
            if (p1Score == p2Score)
                return "Deuce";
            name = p1Score > p2Score ? p1Name : p2Name;
            return ((p1Score - p2Score) * (p1Score - p2Score) == 1) ? ("Advantage " + name) : ("Win for " + name);
        }
    }

    private String pointsBelowFourNotDeuce() {
        String[] scores = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
        String score = scores[p1Score];
        return (p1Score == p2Score) ? score + "-All" : score + "-" + scores[p2Score];
    }

    public void wonPoint(String playerName) {
        if (Objects.equals(playerName, "player1"))
            this.p1Score += 1;
        else
            this.p2Score += 1;

    }

}