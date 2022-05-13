package student_arturs_melnikovs.lesson_15.level_03;

class TennisGameImpl implements TennisGame {

    private int player1Points = 0;
    private int player2Points = 0;
    private final String player1Name;
    private final String player2Name;

    TennisGameImpl(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    @Override
    public void wonPoint(String playerName) {
        if (playerName.equals(player1Name)) {
            player1Points++;
        } else if (playerName.equals(player2Name)) {
            player2Points++;
        } else {
            System.out.println("Incorrect name");
        }
    }

    @Override
    public String score() {
        if (gameStart()) {
            return getScore();
        }

        if (Deuce()) {
            return "Deuce";
        }

        if (advantagePlayer1()) {
            return "Advantage " + player1Name;
        } else if (advantagePlayer2()) {
            return "Advantage " + player2Name;
        }

        if (winPlayer1()) {
            return "Win " + player1Name;
        } else if (winPlayer2()) {
            return "Win " + player2Name;
        }
        return "Game finished";
    }

    private boolean gameStart() {
        return player1Points <= 2 && player2Points <= 2 || player1Points != player2Points && (player1Points < 4 && player2Points < 4);
    }

    private boolean winPlayer2() {
        return player2Points >= 4 && player2Points - player1Points > 1;
    }

    private boolean winPlayer1() {
        return player1Points >= 4 && player1Points - player2Points > 1;
    }

    private boolean advantagePlayer2() {
        return player2Points >= 4 && player2Points - player1Points == 1;
    }

    private boolean advantagePlayer1() {
        return player1Points >= 4 && player1Points - player2Points == 1;
    }

    private boolean Deuce() {
        return player1Points >= 3 && player1Points == player2Points;
    }

    private String getScore() {
        String player1Score;
        String player2Score;
        switch (player1Points) {
            case 0 -> player1Score = "Love";
            case 1 -> player1Score = "Fifteen";
            case 2 -> player1Score = "Thirty";
            default -> player1Score =  "Forty";
        }
        switch (player2Points) {
            case 0 -> player2Score = "Love";
            case 1 -> player2Score = "Fifteen";
            case 2 -> player2Score = "Thirty";
            default -> player2Score =  "Forty";
        }
        return player1Score + " - " + player2Score;
    }
}
