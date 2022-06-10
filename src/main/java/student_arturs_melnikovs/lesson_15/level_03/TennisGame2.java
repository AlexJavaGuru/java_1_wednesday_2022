package student_arturs_melnikovs.lesson_15.level_03;

import java.util.Objects;

public class TennisGame2 implements TennisGame {
    public int p1Points = 0;
    public int p2Points = 0;

    public String p1Result = "";
    public String p2Result = "";

    public TennisGame2(String player1Name, String player2Name) {
    }

    public String score() {
        String score = "";
        if (p1Points == p2Points && p1Points < 4) {
            score = getEqualResult(score);
        }
        if (p1Points == p2Points && p1Points >= 3)
            score = "Deuce";

        if (p1Points > 0 && p2Points == 0) {
            switch (p1Points) {
                case 1 -> p1Result = "Fifteen";
                case 2 -> p1Result = "Thirty";
                case 3 -> p1Result = "Forty";
            }

            p2Result = "Love";
            score = p1Result + "-" + p2Result;
        }
        if (p2Points > 0 && p1Points == 0) {
            switch (p2Points) {
                case 1 -> p2Result = "Fifteen";
                case 2 -> p2Result = "Thirty";
                case 3 -> p2Result = "Forty";
            }

            p1Result = "Love";
            score = p1Result + "-" + p2Result;
        }

        if (p1Points > p2Points && p1Points < 4) {
            score = player1Ahead();
        }
        if (p2Points > p1Points && p2Points < 4) {
            score = player2Ahead();
        }

        if (p1Points > p2Points && p2Points >= 3) {
            score = "Advantage player1";
        }

        if (p2Points > p1Points && p1Points >= 3) {
            score = "Advantage player2";
        }

        if (p1Points >= 4 && p2Points >= 0 && (p1Points - p2Points) >= 2) {
            score = "Win for player1";
        }
        if (p2Points >= 4 && p1Points >= 0 && (p2Points - p1Points) >= 2) {
            score = "Win for player2";
        }
        return score;
    }

    private String player2Ahead() {
        String score;
        switch (p2Points) {
            case 2 -> p2Result = "Thirty";
            case 3 -> p2Result = "Forty";
        }
        switch (p1Points) {
            case 1 -> p1Result = "Fifteen";
            case 2 -> p1Result = "Thirty";
        }
        score = p1Result + "-" + p2Result;
        return score;
    }

    private String player1Ahead() {
        String score;
        switch (p1Points) {
            case 2 -> p1Result = "Thirty";
            case 3 -> p1Result = "Forty";
        }
        switch (p2Points) {
            case 1 -> p2Result = "Fifteen";
            case 2 -> p2Result = "Thirty";
        }
        score = p1Result + "-" + p2Result;
        return score;
    }

    private String getEqualResult(String score) {
        if (p1Points == 0) {
            score = "Love";
        }
        if (p1Points == 1) {
            score = "Fifteen";
        }
        if (p1Points == 2) {
            score = "Thirty";
        }
        score += "-All";
        return score;
    }

    public void P1Score() {
        p1Points++;
    }

    public void P2Score() {
        p2Points++;
    }

    public void wonPoint(String player) {
        if (Objects.equals(player, "player1"))
            P1Score();
        else
            P2Score();
    }
}
