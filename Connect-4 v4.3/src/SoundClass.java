/**Milad Mobini**/
//This class has the role of all the sounds you hear in the game
import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
public class SoundClass {
    Clip clip1;
    URL soundPath;
    public static Clip playMusic(URL musicLocation, boolean status) {
        //this is for the background music
        Clip ret = null;
        //put the file in a new clip and play it in a loop
        try {
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicLocation);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInput);
            clip.start();
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            ret = clip;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        //returns the clip file, so the user be able to puase and play the music
        return ret;
    }
    public void gameClickSound() {
        //this is for the sounds of the game page(the beads)
        if (Data.soundActive) {
            URL soundPath = getClass().getResource("gameClick.wav");
            Clip clip;
            try {
                AudioInputStream sound = AudioSystem.getAudioInputStream(soundPath);
                clip = AudioSystem.getClip();
                clip.open(sound);
                clip.start();
            } catch (Exception ex) {
            }
        }
    }
    public void victorySound() {
        //this is for the sound we the game is finished
        if (Data.soundActive) {
            URL soundPath = getClass().getResource("victory.wav");
            Clip clip;
            try {
                AudioInputStream sound = AudioSystem.getAudioInputStream(soundPath);
                clip = AudioSystem.getClip();
                clip.open(sound);
                clip.start();
            } catch (Exception ex) {
            }
        }
    }
    public void clickSound() {
        // this is the sound when user click on any button
        if (Data.soundActive) {
            URL soundPath = getClass().getResource("click.wav");
            Clip clip;
            try {
                AudioInputStream sound = AudioSystem.getAudioInputStream(soundPath);
                clip = AudioSystem.getClip();
                clip.open(sound);
                clip.start();
            } catch (Exception ex) {
            }
        }
    }
}
