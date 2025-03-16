import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TTTTileButton extends JButton implements ActionListener {
    private int row, col;
    private Game game;

    public TTTTileButton(int row, int col, Game game) {
        this.row = row;
        this.col = col;
        this.game = game;
        setFont(new Font("Arial", Font.BOLD, 40));
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        game.makeMove(row, col, this);
    }
}
