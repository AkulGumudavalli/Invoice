import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {
    private TTTTileButton[][] buttons;
    private Game game;

    public GUI(Game game) {
        this.game = game;
        buttons = new TTTTileButton[3][3];
        setTitle("Tic Tac Toe");
        setSize(300, 300);
        setLayout(new GridLayout(3, 3));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j] = new TTTTileButton(i, j, game);
                add(buttons[i][j]);
            }
        }

        setVisible(true);
    }

    public void showWinner(String winner) {
        JOptionPane.showMessageDialog(this, "Player " + winner + " wins!");
        System.exit(0);
    }
}