import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import javax.swing.*;
public class GamePanel {
    //The 4 variables below are used to
    private JFrame frame = new JFrame("Minesweeper");
    private JLabel textLabel = new JLabel();
    private JPanel textPanel = new JPanel();
    private JPanel boardPanel = new JPanel();
    private boolean object = false;

    public GamePanel(){
    }

    public JPanel getBoardPanel() {
        return boardPanel;
    }
    public GamePanel(int boardWidth, int boardHeight, int numRows, int numCols, String username){
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        textLabel.setFont(new Font("Arial", Font.BOLD, 25));
        textLabel.setHorizontalAlignment(JLabel.CENTER);
        textLabel.setText(username);
        textLabel.setOpaque(true);

        textPanel.setLayout(new BorderLayout());
        textPanel.add(textLabel);
        frame.add(textPanel, BorderLayout.NORTH);

        boardPanel.setLayout(new GridLayout(numRows, numCols)); //8x8
        frame.add(boardPanel);
    }
    public void editFrame(boolean determine){
        if(determine) {
                frame.setVisible(true);
        }
    }
    public void editBoard(int r, int c){
        MineTile tile = new MineTile(r, c);
        boardPanel.add(tile);
    }
    public void editText(String text){
            textLabel.setText(text);
    }
}