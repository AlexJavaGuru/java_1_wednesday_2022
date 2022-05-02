package student_arturs_melnikovs.lesson_11.level_07;

class Game {
    private final Board board;
    private final Player player1;
    private final Player player2;
    private Player currentPlayer;

    Game() {
        this.board = new Board();
        this.player1 = new Player(1, "Player 1");
        this.player2 = new Player(2, "Player 2");
    }

    void play() {

        new Game();
        currentPlayer = player1;

        while (true) {
            board.printBoard();
            System.out.println("It is your turn " + currentPlayer.getName());
            Move move = currentPlayer.makeMove();
            if (board.isMoveLegal(move)) {
                board.executeMove(move, currentPlayer.getToken());
            } else {
                System.out.println("Move is not legal! Try again!");
                continue;
            }

            if (board.isWinPosition(currentPlayer.getToken())) {
                System.out.println(currentPlayer.getName() + " wins!");
                board.printBoard();
                break;
            } else if (board.isDrawPosition()) {
                System.out.println("Game ends in a Draw!");
                board.printBoard();
                break;
            }
            switchPlayer();
        }
    }

    private void switchPlayer() {
        if (currentPlayer.equals(player1)) {
            currentPlayer = player2;
        } else {
            currentPlayer = player1;
        }
    }


}
