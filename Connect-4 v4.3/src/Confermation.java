/**Milad Mobini**/
// this is the page shown after the game is finished where gives you the option of a rematch where the game will remember your score and turn
// or a new game or going back to the main menu
import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
public class Confermation extends javax.swing.JFrame {
    public Confermation() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/confDraw.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jButton1.setText("Rematch");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 180, 70));

        jButton2.setText("New Game");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 180, 70));

        jButton3.setText("Mani Menu");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 170, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        SoundClass click = new SoundClass();
        click.clickSound();
        new Menu().setVisible(true);
        this.setVisible(false);
        Data.clearAllData();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //this create a new game and clears all the data saved
        SoundClass click =new SoundClass();
        click.clickSound();
        Data.clearAllData();
        this.setVisible(false);
        new GamePage().setVisible(true);
        Image img = null;
        Image img1 = null;
        try {
            img = ImageIO.read(getClass().getResource(Data.backG + ".png"));
            img1 = ImageIO.read(getClass().getResource(Data.backGround + ".png"));
        } catch (IOException ex) {
            Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
        }
        GamePage.jLabel43.setIcon(new ImageIcon(img));
        GamePage.jLabel44.setIcon(new ImageIcon(img1));
        GamePage.jTextField2.setText("player one : " + Data.Bscore + "    player two : " + Data.Rscore);
        if (Data.player == 'R') {
            GamePage.jTextField1.setText("It's Player One's Turn!");
        } else {
            GamePage.jTextField1.setText("It's Player Two's Turn!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       // this rematches the game, it will remeber the turn of the winner so the winner would start first and if it was a tie game 
       //it will pass the turn to the other player. it also keep score of the game
        SoundClass click =new SoundClass();
        click.clickSound();
        Data.clearData();
        this.setVisible(false);
        new GamePage().setVisible(true);
        Image img = null;
        Image img1 = null;
        try {
            img = ImageIO.read(getClass().getResource(Data.backG + ".png"));
            img1 = ImageIO.read(getClass().getResource(Data.backGround + ".png"));
        } catch (IOException ex) {
            Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
        }
        GamePage.jLabel43.setIcon(new ImageIcon(img));
        GamePage.jLabel44.setIcon(new ImageIcon(img1));
        GamePage.jTextField2.setText("player one : " + Data.Bscore + "    player two : " + Data.Rscore);
        if (Data.player == 'R') {
            GamePage.jTextField1.setText("It's Player One's Turn!");
        } else {
            GamePage.jTextField1.setText("It's Player Two's Turn!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Confermation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    public static javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
