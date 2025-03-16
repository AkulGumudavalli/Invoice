public class Game {
    private Board board;
    private Player currentPlayer;
    private GUI gui;

    public Game() {
        board = new Board();
        gui = new GUI(this);
        currentPlayer = new Player("X");
    }

    public void makeMove(int row, int col, TTTTileButton button) {
        if (board.isCellEmpty(row, col)) {
            board.setCell(row, col, currentPlayer.getSymbol());
            button.setText(currentPlayer.getSymbol());
            if (board.checkWin(currentPlayer.getSymbol())) {
                gui.showWinner(currentPlayer.getSymbol());
                return;
            }
            switchPlayer();
        }
    }

    private void switchPlayer() {
        currentPlayer = new Player(currentPlayer.getSymbol().equals("X") ? "O" : "X");
    }

    public static void main(String[] args) {
        new Game();
    }
}