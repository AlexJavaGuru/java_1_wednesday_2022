package student_arturs_melnikovs.lesson_15.level_03;

import java.util.Objects;

public class TennisGame1 implements TennisGame {

    private int player1Score = 0;
    private int player2Score = 0;
    private final String player1Name;
    private final String player2Name;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (Objects.equals(playerName, "player1"))
            player1Score++;
        else
            player2Score++;
    }

    public String score() {
        String score = "";
        int tempScore = 0;
        if (player1Score == player2Score) {
            score = getEqualScore();
        } else if (player1Score >= 4 || player2Score >= 4) {
            score = getScoreAboveThree();
        } else {
            score = getScoreBelowFour(score);
        }
        return score;
    }

    private String getScoreBelowFour(String score) {
        int tempScore;
        for (int i = 1; i < 3; i++) {
            if (i == 1) {
                tempScore = player1Score;
            } else {
                score += "-";
                tempScore = player2Score;
            }
            switch (tempScore) {
                case 0 -> score += "Love";
                case 1 -> score += "Fifteen";
                case 2 -> score += "Thirty";
                case 3 -> score += "Forty";
            }
        }
        return score;
    }

    private String getScoreAboveThree() {
        String score;
        int minusResult = player1Score - player2Score;
        score = switch (minusResult) {
            case 1 -> "Advantage player1";
            case -1 -> "Advantage player2";
            default -> minusResult >= 2 ? "Win for player1" : "Win for player2";
        };
        return score;
    }

    private String getEqualScore() {
        return switch (player1Score) {
            case 0 -> "Love-All";
            case 1 -> "Fifteen-All";
            case 2 -> "Thirty-All";
            default -> "Deuce";
        };
    }
}
