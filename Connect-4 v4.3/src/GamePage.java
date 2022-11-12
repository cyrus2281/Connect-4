
/** Cyrus Mobini* */
//This where the user see the visuals of the game and enter the inputs then the game sends it to all the needed classes
import java.awt.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;

public class GamePage extends javax.swing.JFrame {

    public GamePage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 51));
        setForeground(new java.awt.Color(102, 255, 102));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Vampire Bride", 1, 24)); // NOI18N
        jTextField1.setToolTipText("");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 710, 338, -1));

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Worm Cuisine", 0, 24)); // NOI18N
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 370, 45));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 580, 80, 80));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, -1, -1));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 480, 80, 80));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, -1, -1));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, -1));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 580, -1, -1));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 490, -1, -1));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, -1, -1));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, -1, -1));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, -1, -1));
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, -1, -1));
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 580, -1, -1));
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 490, -1, -1));
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, -1, -1));
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, -1, -1));
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, -1, -1));
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, -1));
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 580, -1, -1));
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 490, -1, -1));
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, -1, -1));
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, -1, -1));
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, -1, -1));
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, -1, -1));
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 580, -1, -1));
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 490, -1, -1));
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 390, -1, -1));
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, -1, -1));
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, -1, -1));
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, -1, -1));

        jLabel31.setToolTipText("");
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 580, -1, -1));
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 490, -1, -1));
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 390, -1, -1));
        getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, -1, -1));
        getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, -1, -1));
        getContentPane().add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, -1, -1));
        getContentPane().add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 580, -1, -1));
        getContentPane().add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 490, -1, -1));
        getContentPane().add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 390, -1, -1));
        getContentPane().add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 300, -1, -1));
        getContentPane().add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 200, -1, -1));
        getContentPane().add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 110, -1, -1));

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/woodBack.png"))); // NOI18N
        getContentPane().add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        jButton8.setBackground(new java.awt.Color(255, 0, 0));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exit.2.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 40, -1));

        jButton7.setText("column7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 100, 100, 570));

        jButton6.setText("column6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 100, 570));

        jButton5.setText("column5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 90, 570));

        jButton4.setText("column4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 90, 570));

        jButton3.setText("column3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 100, 570));

        jButton2.setText("column2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 100, 570));

        jButton1.setText("column1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 90, 570));

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bgroundCement.png"))); // NOI18N
        getContentPane().add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
// shows the player turn
    }//GEN-LAST:event_jTextField1ActionPerformed
    // next seven buttons : set the input column, change turns , check for the winner
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        WinnerCheck.in = 6;
        WinnerCheck.takeTurn();
        icons(Data.send);
        SoundClass click = new SoundClass();
        click.gameClickSound();
        WinnerCheck.winMessage();
        playerTurn();
        checkToCloseWindow();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        WinnerCheck.in = 5;
        WinnerCheck.takeTurn();
        icons(Data.send);
        SoundClass click = new SoundClass();
        click.gameClickSound();
        WinnerCheck.winMessage();
        playerTurn();
        checkToCloseWindow();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        WinnerCheck.in = 4;
        WinnerCheck.takeTurn();
        icons(Data.send);
        SoundClass click = new SoundClass();
        click.gameClickSound();
        WinnerCheck.winMessage();
        playerTurn();
        checkToCloseWindow();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        WinnerCheck.in = 3;
        WinnerCheck.takeTurn();
        icons(Data.send);
        SoundClass click = new SoundClass();
        click.gameClickSound();
        WinnerCheck.winMessage();
        playerTurn();
        checkToCloseWindow();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        WinnerCheck.in = 2;
        WinnerCheck.takeTurn();
        icons(Data.send);
        SoundClass click = new SoundClass();
        click.gameClickSound();
        WinnerCheck.winMessage();
        playerTurn();
        checkToCloseWindow();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        WinnerCheck.in = 1;
        WinnerCheck.takeTurn();
        icons(Data.send);
        SoundClass click = new SoundClass();
        click.gameClickSound();
        WinnerCheck.winMessage();
        playerTurn();
        checkToCloseWindow();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        WinnerCheck.in = 0;
        WinnerCheck.takeTurn();
        icons(Data.send);
        SoundClass click = new SoundClass();
        click.gameClickSound();
        WinnerCheck.winMessage();
        playerTurn();
        checkToCloseWindow();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // goes to main menu and clear all data
        SoundClass click = new SoundClass();
        click.clickSound();
        if (JOptionPane.showConfirmDialog(this, "Are You Sure You want to Leave Game?\nAll Data Will Be Lost.", "Main Menu", WIDTH) == 0) {
            new Menu().setVisible(true);
            this.setVisible(false);
            Data.clearAllData();
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    public void playerTurn() {
        // writes the players turn
        if (Data.player == 'R') {
            jTextField1.setText("It's Player One's Turn!");
        } else {
            jTextField1.setText("It's Player Two's Turn!");
        }
    }

    public void icons(int number) {
        // set the beads when the colmun is selected
        char player = Data.player;
        switch (number) {
            case 1:
                if (player == 'R') {
                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.rIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel1.setIcon(new ImageIcon(img));
                } else if (player == 'B') {

                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.bIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel1.setIcon(new ImageIcon(img));
                }
                break;
            case 2:
                if (player == 'R') {
                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.rIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel2.setIcon(new ImageIcon(img));
                } else if (player == 'B') {

                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.bIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel2.setIcon(new ImageIcon(img));
                }
                break;
            case 3:
                if (player == 'R') {
                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.rIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel3.setIcon(new ImageIcon(img));
                } else if (player == 'B') {

                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.bIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel3.setIcon(new ImageIcon(img));
                }
                break;
            case 4:
                if (player == 'R') {
                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.rIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel4.setIcon(new ImageIcon(img));
                } else if (player == 'B') {

                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.bIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel4.setIcon(new ImageIcon(img));
                }
                break;
            case 5:
                if (player == 'R') {
                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.rIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel5.setIcon(new ImageIcon(img));
                } else if (player == 'B') {

                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.bIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel5.setIcon(new ImageIcon(img));
                }
                break;
            case 6:
                if (player == 'R') {
                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.rIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel6.setIcon(new ImageIcon(img));
                } else if (player == 'B') {

                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.bIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel6.setIcon(new ImageIcon(img));
                }
                break;
            case 7:
                if (player == 'R') {
                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.rIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel7.setIcon(new ImageIcon(img));
                } else if (player == 'B') {

                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.bIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel7.setIcon(new ImageIcon(img));
                }
                break;
            case 8:
                if (player == 'R') {
                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.rIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel8.setIcon(new ImageIcon(img));
                } else if (player == 'B') {

                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.bIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel8.setIcon(new ImageIcon(img));
                }
                break;
            case 9:
                if (player == 'R') {
                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.rIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel9.setIcon(new ImageIcon(img));
                } else if (player == 'B') {

                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.bIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel9.setIcon(new ImageIcon(img));
                }
                break;
            case 10:
                if (player == 'R') {
                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.rIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel10.setIcon(new ImageIcon(img));
                } else if (player == 'B') {

                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.bIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel10.setIcon(new ImageIcon(img));
                }
                break;
            case 11:
                if (player == 'R') {
                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.rIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel11.setIcon(new ImageIcon(img));
                } else if (player == 'B') {

                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.bIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel11.setIcon(new ImageIcon(img));
                }
                break;
            case 12:
                if (player == 'R') {
                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.rIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel12.setIcon(new ImageIcon(img));
                } else if (player == 'B') {

                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.bIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel12.setIcon(new ImageIcon(img));
                }
                break;
            case 13:
                if (player == 'R') {
                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.rIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel13.setIcon(new ImageIcon(img));
                } else if (player == 'B') {

                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.bIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel13.setIcon(new ImageIcon(img));
                }
                break;
            case 14:
                if (player == 'R') {
                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.rIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel14.setIcon(new ImageIcon(img));
                } else if (player == 'B') {

                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.bIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel14.setIcon(new ImageIcon(img));
                }
                break;
            case 15:
                if (player == 'R') {
                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.rIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel15.setIcon(new ImageIcon(img));
                } else if (player == 'B') {

                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.bIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel15.setIcon(new ImageIcon(img));
                }
                break;
            case 16:
                if (player == 'R') {
                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.rIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel16.setIcon(new ImageIcon(img));
                } else if (player == 'B') {

                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.bIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel16.setIcon(new ImageIcon(img));
                }
                break;
            case 17:
                if (player == 'R') {
                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.rIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel17.setIcon(new ImageIcon(img));
                } else if (player == 'B') {

                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.bIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel17.setIcon(new ImageIcon(img));
                }
                break;
            case 18:
                if (player == 'R') {
                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.rIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel18.setIcon(new ImageIcon(img));
                } else if (player == 'B') {

                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.bIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel18.setIcon(new ImageIcon(img));
                }
                break;
            case 19:
                if (player == 'R') {
                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.rIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel19.setIcon(new ImageIcon(img));
                } else if (player == 'B') {

                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.bIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel19.setIcon(new ImageIcon(img));
                }
                break;
            case 20:
                if (player == 'R') {
                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.rIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel20.setIcon(new ImageIcon(img));
                } else if (player == 'B') {

                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.bIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel20.setIcon(new ImageIcon(img));
                }
                break;
            case 21:
                if (player == 'R') {
                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.rIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel21.setIcon(new ImageIcon(img));
                } else if (player == 'B') {

                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.bIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel21.setIcon(new ImageIcon(img));
                }
                break;
            case 22:
                if (player == 'R') {
                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.rIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel22.setIcon(new ImageIcon(img));
                } else if (player == 'B') {

                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.bIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel22.setIcon(new ImageIcon(img));
                }
                break;
            case 23:
                if (player == 'R') {
                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.rIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel23.setIcon(new ImageIcon(img));
                } else if (player == 'B') {

                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.bIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel23.setIcon(new ImageIcon(img));
                }
                break;
            case 24:
                if (player == 'R') {
                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.rIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel24.setIcon(new ImageIcon(img));
                } else if (player == 'B') {

                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.bIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel24.setIcon(new ImageIcon(img));
                }
                break;
            case 25:
                if (player == 'R') {
                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.rIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel25.setIcon(new ImageIcon(img));
                } else if (player == 'B') {

                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.bIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel25.setIcon(new ImageIcon(img));
                }
                break;
            case 26:
                if (player == 'R') {
                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.rIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel26.setIcon(new ImageIcon(img));
                } else if (player == 'B') {

                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.bIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel26.setIcon(new ImageIcon(img));
                }
                break;
            case 27:
                if (player == 'R') {
                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.rIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel27.setIcon(new ImageIcon(img));
                } else if (player == 'B') {

                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.bIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel27.setIcon(new ImageIcon(img));
                }
                break;
            case 28:
                if (player == 'R') {
                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.rIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel28.setIcon(new ImageIcon(img));
                } else if (player == 'B') {

                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.bIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel28.setIcon(new ImageIcon(img));
                }
                break;
            case 29:
                if (player == 'R') {
                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.rIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel29.setIcon(new ImageIcon(img));
                } else if (player == 'B') {

                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.bIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel29.setIcon(new ImageIcon(img));
                }
                break;
            case 30:
                if (player == 'R') {
                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.rIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel30.setIcon(new ImageIcon(img));
                } else if (player == 'B') {

                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.bIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel30.setIcon(new ImageIcon(img));
                }
                break;
            case 31:
                if (player == 'R') {
                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.rIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel31.setIcon(new ImageIcon(img));
                } else if (player == 'B') {

                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.bIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel31.setIcon(new ImageIcon(img));
                }
                break;
            case 32:
                if (player == 'R') {
                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.rIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel32.setIcon(new ImageIcon(img));
                } else if (player == 'B') {

                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.bIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel32.setIcon(new ImageIcon(img));
                }
                break;
            case 33:
                if (player == 'R') {
                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.rIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel33.setIcon(new ImageIcon(img));
                } else if (player == 'B') {

                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.bIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel33.setIcon(new ImageIcon(img));
                }
                break;
            case 34:
                if (player == 'R') {
                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.rIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel34.setIcon(new ImageIcon(img));
                } else if (player == 'B') {

                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.bIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel34.setIcon(new ImageIcon(img));
                }
                break;
            case 35:
                if (player == 'R') {
                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.rIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel35.setIcon(new ImageIcon(img));
                } else if (player == 'B') {

                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.bIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel35.setIcon(new ImageIcon(img));
                }
                break;
            case 36:
                if (player == 'R') {
                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.rIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel36.setIcon(new ImageIcon(img));
                } else if (player == 'B') {

                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.bIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel36.setIcon(new ImageIcon(img));
                }
                break;
            case 37:
                if (player == 'R') {
                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.rIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel37.setIcon(new ImageIcon(img));
                } else if (player == 'B') {

                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.bIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel37.setIcon(new ImageIcon(img));
                }
                break;
            case 38:
                if (player == 'R') {
                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.rIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel38.setIcon(new ImageIcon(img));
                } else if (player == 'B') {

                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.bIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel38.setIcon(new ImageIcon(img));
                }
                break;
            case 39:
                if (player == 'R') {
                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.rIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel39.setIcon(new ImageIcon(img));
                } else if (player == 'B') {

                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.bIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel39.setIcon(new ImageIcon(img));
                }
                break;
            case 40:
                if (player == 'R') {
                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.rIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel40.setIcon(new ImageIcon(img));
                } else if (player == 'B') {

                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.bIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel40.setIcon(new ImageIcon(img));
                }
                break;
            case 41:
                if (player == 'R') {
                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.rIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel41.setIcon(new ImageIcon(img));
                } else if (player == 'B') {

                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.bIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel41.setIcon(new ImageIcon(img));
                }
                break;
            case 42:
                if (player == 'R') {
                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.rIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel42.setIcon(new ImageIcon(img));
                } else if (player == 'B') {

                    Image img = null;
                    try {
                        img = ImageIO.read(getClass().getResource(Data.bIcon + ".png"));
                    } catch (IOException ex) {
                        Logger.getLogger(GamePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jLabel42.setIcon(new ImageIcon(img));
                }
                break;
        }
    }

    public static int setIcon(int row, int column, char player) {
        //finds the location of the selected place
        int iconNumber = 0;
        switch (column) {
            case 0:
                switch (row) {
                    case 5:
                        iconNumber = 1;

                        break;
                    case 4:
                        iconNumber = 2;
                        break;
                    case 3:
                        iconNumber = 3;
                        break;
                    case 2:
                        iconNumber = 4;
                        break;
                    case 1:
                        iconNumber = 5;
                        break;
                    case 0:
                        iconNumber = 6;
                        break;
                }
                break;
            case 1:
                switch (row) {
                    case 5:
                        iconNumber = 7;
                        break;
                    case 4:
                        iconNumber = 8;
                        break;
                    case 3:
                        iconNumber = 9;
                        break;
                    case 2:
                        iconNumber = 10;
                        break;
                    case 1:
                        iconNumber = 11;
                        break;
                    case 0:
                        iconNumber = 12;
                        break;
                }
                break;
            case 2:
                switch (row) {
                    case 5:
                        iconNumber = 13;
                        break;
                    case 4:
                        iconNumber = 14;
                        break;
                    case 3:
                        iconNumber = 15;
                        break;
                    case 2:
                        iconNumber = 16;
                        break;
                    case 1:
                        iconNumber = 17;
                        break;
                    case 0:
                        iconNumber = 18;
                        break;
                }
                break;
            case 3:
                switch (row) {
                    case 5:
                        iconNumber = 19;
                        break;
                    case 4:
                        iconNumber = 20;
                        break;
                    case 3:
                        iconNumber = 21;
                        break;
                    case 2:
                        iconNumber = 22;
                        break;
                    case 1:
                        iconNumber = 23;
                        break;
                    case 0:
                        iconNumber = 24;
                        break;
                }
                break;
            case 4:
                switch (row) {
                    case 5:
                        iconNumber = 25;
                        break;
                    case 4:
                        iconNumber = 26;
                        break;
                    case 3:
                        iconNumber = 27;
                        break;
                    case 2:
                        iconNumber = 28;
                        break;
                    case 1:
                        iconNumber = 29;
                        break;
                    case 0:
                        iconNumber = 30;
                        break;
                }
                break;
            case 5:
                switch (row) {
                    case 5:
                        iconNumber = 31;
                        break;
                    case 4:
                        iconNumber = 32;
                        break;
                    case 3:
                        iconNumber = 33;
                        break;
                    case 2:
                        iconNumber = 34;
                        break;
                    case 1:
                        iconNumber = 35;
                        break;
                    case 0:
                        iconNumber = 36;
                        break;
                }
                break;
            case 6:
                switch (row) {
                    case 5:
                        iconNumber = 37;
                        break;
                    case 4:
                        iconNumber = 38;
                        break;
                    case 3:
                        iconNumber = 39;
                        break;
                    case 2:
                        iconNumber = 40;
                        break;
                    case 1:
                        iconNumber = 41;
                        break;
                    case 0:
                        iconNumber = 42;
                        break;
                }
                break;

        }
        return iconNumber;

    }

    public void checkToCloseWindow() {
        //to close the page
        if (Data.winner) {
            this.setVisible(false);
        } else if (Data.turn == 43) {
            this.setVisible(false);
        }
    }

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GamePage().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton jButton1;
    public static javax.swing.JButton jButton2;
    public static javax.swing.JButton jButton3;
    public static javax.swing.JButton jButton4;
    public static javax.swing.JButton jButton5;
    public static javax.swing.JButton jButton6;
    public static javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    public static javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    public static javax.swing.JLabel jLabel43;
    public static javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JTextField jTextField1;
    public static javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
