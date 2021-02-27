
/** Milad Mobini* */
// This class is like the brain of my game 
//it checks the game whethere there is a winner or not, check the input from the user, change turns, send result to winning page
import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class WinnerCheck {

    static public int in;

    public static boolean isWinner(char player, char[][] grid) {
        //check for 4 across
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length - 3; col++) {
                if (grid[row][col] == player
                        && grid[row][col + 1] == player
                        && grid[row][col + 2] == player
                        && grid[row][col + 3] == player) {
                    return true;
                }
            }
        }
        //check for 4 up and down
        for (int row = 0; row < grid.length - 3; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                if (grid[row][col] == player
                        && grid[row + 1][col] == player
                        && grid[row + 2][col] == player
                        && grid[row + 3][col] == player) {
                    return true;
                }
            }
        }
        //check upward diagonal
        for (int row = 3; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length - 3; col++) {
                if (grid[row][col] == player
                        && grid[row - 1][col + 1] == player
                        && grid[row - 2][col + 2] == player
                        && grid[row - 3][col + 3] == player) {
                    return true;
                }
            }
        }
        //check downward diagonal
        for (int row = 0; row < grid.length - 3; row++) {
            for (int col = 0; col < grid[0].length - 3; col++) {
                if (grid[row][col] == player
                        && grid[row + 1][col + 1] == player
                        && grid[row + 2][col + 2] == player
                        && grid[row + 3][col + 3] == player) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean validate(int column, char[][] grid) {
        //valid column?
        if (column < 0 || column > grid[0].length) {
            return false;
        }
        //full column?
        if (grid[0][column] != ' ') {
            return false;
        }
        return true;
    }

    public static void takeTurn() {
        //play a turn
        if (Data.winner == false && Data.turn <= 42) {
            Data.play = in;
            //validate play
            Data.validPlay = WinnerCheck.validate(Data.play, Data.grid);
            if (Data.validPlay != false) {
                //drop the checker
                for (int row = Data.grid.length - 1; row >= 0; row--) {
                    if (Data.grid[row][Data.play] == ' ') {
                        Data.grid[row][Data.play] = Data.player;
                        Data.send = GamePage.setIcon(row, Data.play, Data.player);
                        break;
                    }
                }
                //determine if there is a winner
                Data.winner = WinnerCheck.isWinner(Data.player, Data.grid);
                //switch players
                if (Data.player == 'R') {
                    Data.player = 'B';
                } else {
                    Data.player = 'R';
                }
                Data.turn++;
            }
        }
    }

    public static void winMessage() {
        //if there is a winner, show a message
        if (Data.winner) {
            //check for the second player
            if (Data.player == 'R') {
                Data.Rscore++;
                Data.player = 'B';
                JOptionPane.showMessageDialog(null, "Player Two won");
                new Confermation().setVisible(true);
                WinnerCheck d = new WinnerCheck();
                d.confBackground("confTwo.png");
                SoundClass click = new SoundClass();
                click.victorySound();
                //check for first player
            } else {
                Data.Bscore++;
                Data.player = 'R';
                JOptionPane.showMessageDialog(null, "Player One won");
                new Confermation().setVisible(true);
                WinnerCheck d = new WinnerCheck();
                d.confBackground("confOne.png");
                SoundClass click = new SoundClass();
                click.victorySound();
            }
            //check whethere it's a tie game
        } else if (Data.turn == 43) {
            JOptionPane.showMessageDialog(null, "Tie game");
            new Confermation().setVisible(true);
            WinnerCheck d = new WinnerCheck();
            d.confBackground("confDraw.png");
            SoundClass click = new SoundClass();
            click.victorySound();
        }
    }
    public void confBackground(String name) {
        //set the background of the winner screen
        Image img = null;
        try {
            img = ImageIO.read(getClass().getResource(name));
        } catch (IOException ex) {
            Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
        }
        Confermation.jLabel2.setIcon(new ImageIcon(img));
    }
}
