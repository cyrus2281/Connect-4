/**Cyrus Mobini**/
//this the menu of the game where the user can explore different options
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class Menu extends javax.swing.JFrame {
    public Menu() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MENUback.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, -1));

        jButton1.setBackground(new java.awt.Color(102, 255, 0));
        jButton1.setFont(new java.awt.Font("Vampire Bride", 1, 48)); // NOI18N
        jButton1.setText("Start");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 280, 110));

        jButton2.setBackground(new java.awt.Color(255, 0, 51));
        jButton2.setFont(new java.awt.Font("Vampire Bride", 0, 24)); // NOI18N
        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 160, 80));

        jButton3.setBackground(new java.awt.Color(0, 51, 204));
        jButton3.setFont(new java.awt.Font("Vampire Bride", 1, 36)); // NOI18N
        jButton3.setText("Options");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 290, 90));

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Wide Latin", 0, 11)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("info");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, 100, 50));

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Wide Latin", 0, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("rules");
        jButton5.setToolTipText("");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, 120, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       //starts the game 
        SoundClass click = new SoundClass();
        click.clickSound();
        Data.initializeArray();
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
        this.setVisible(false);
        GamePage.jTextField2.setText("player one : " + Data.Bscore + "    player two : " + Data.Rscore);
        if (Data.player == 'R') {
            GamePage.jTextField1.setText("It's Player One's Turn!");
        } else {
            GamePage.jTextField1.setText("It's Player Two's Turn!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //exit the game
        SoundClass click = new SoundClass();
        click.clickSound();
        if (JOptionPane.showConfirmDialog(this, "Are You Sure?", "Exit Game", WIDTH) == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // open the option menu
        SoundClass click = new SoundClass();
        click.clickSound();
        new option().setVisible(true);
        Image img = null;
        Image img1 = null;
        try {
            img = ImageIO.read(getClass().getResource(Data.musicIcon));
            img1 = ImageIO.read(getClass().getResource(Data.soundIcon));
        } catch (IOException ex) {
            Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
        }
        option.jButton1.setIcon(new ImageIcon(img));
        option.jButton15.setIcon(new ImageIcon(img1));
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // about the developer
        SoundClass click = new SoundClass();
        click.clickSound();
        JOptionPane.showMessageDialog(null, "THIS GAME WAS CREADTED BY MILAD MOBINI. HOPE YOU LIKE IT.\nYou can support me by following me on instagram @cyrus1mbn", "About the Developer", WIDTH);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       //rules of the game and how to play
        SoundClass click = new SoundClass();
        click.clickSound();
        JOptionPane.showMessageDialog(null, "THE GAME\ntwo players play against each other\non a suspended board which consists\nof seven columns and six rows. Each\nplayer has 21 pieces of the same color.\n\nGAMEPLAY\nThe two players alternate turns dropping\n one of their pieces at a time into an unfilled\ncolumn.\n\nGAME END\nThe player who first achieved to connect \nfour of his pieces in a horizontal, vertical, \nor diagonal line wins the game.", "Game Rules", WIDTH);
    }//GEN-LAST:event_jButton5ActionPerformed
   
    public static void main ( String args[])  {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new Menu().setVisible(true);
                URL soundPath;
                soundPath = getClass().getResource("music3.wav");
                SoundClass obj = new SoundClass();
                Data.act = obj.playMusic(soundPath, true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
