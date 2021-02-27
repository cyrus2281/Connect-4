
/** Milad Mobini* */
// this is where all the data and varieble of the game located, also where the grid of the game is created
import javax.sound.sampled.Clip;
public class Data {
    static public int Rscore; // keep the score of player two
    static public int Bscore;// keep the score of player one
    static public char[][] grid = new char[6][7];// create the grid for the game
    static public int turn = 0;// keep tracks of the number of the turns played in a match
    static public char player = 'R';// initialize player 
    static public boolean winner = false;// status of the winner
    static public boolean validPlay;// validity of the inout
    static public int play;// the selected column
    static public int send;// numer of the column
    static public String rIcon = "icon1three";//player two bead icon
    static public String bIcon = "icon2three";//player one bead icon
    static public String backG = "navyBack";// board color
    static public String backGround = "bgroundCement";//background
    static public String musicIcon = "sound.png";//music icon
    static public String soundIcon = "sound.png";//sound icon
    static public boolean soundActive = true;// state of the sounds
    static public boolean musicCheck = false;//state of the music
    static public GamePage txt = new GamePage();
    public static Clip act = null;
    static public void initializeArray() {
        //initialize array
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                grid[row][col] = ' ';
            }
        }
    }
    static public void clearData() {
        // clear data for a rematch
        initializeArray();
        turn = 1;
        winner = false;
        validPlay = false;
        play = 0;
    }
    static public void clearAllData() {
        // clear data for a new game
        Rscore = 0;
        Bscore = 0;
        initializeArray();
        turn = 1;
        player = 'R';
        winner = false;
        validPlay = false;
        play = 0;
    }
}
