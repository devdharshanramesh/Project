/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic.tac.toe.game;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author GODS
 */
public class TIC_TAC_TOE_GAME extends javax.swing.JFrame {
    
    
    private String startGame = "X";
    private int XCount = 0;
    private int OCount = 0;
   
    /**
     * Creates new form TIC_TAC_TOE_GAME
     */
    public TIC_TAC_TOE_GAME() {
        initComponents();
    }
    private void gameScore()
    {
        Playerxxx.setText(String.valueOf(XCount));
        Playerooo.setText(String.valueOf(OCount));
    }
    
    private void choose_a_Player()
    {
        if(startGame.equalsIgnoreCase("x"))
        {
            startGame = "O";
        }
        else
        {
            startGame = "X";
        }
    }
    
    
    private void WinningGame()
    {
        String b1=B1.getText();
        String b2=B2.getText();
        String b3=B3.getText();
        
        String b4=B4.getText();
        String b5=B5.getText();
        String b6=B6.getText();
        
        String b7=B7.getText();
        String b8=B8.getText();
        String b9=B9.getText();
        
        //Player X coding
        
        if(b1==("X")&& b2 == ("X") && b3 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Win","Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE );
            XCount++;
            gameScore();
            
            B1.setBackground(Color.ORANGE);
            B2.setBackground(Color.ORANGE);
            B3.setBackground(Color.ORANGE);
        }
        
        if(b4==("X")&& b5 == ("X") && b6 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Win","Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE );
            XCount++;
            gameScore();
            
            B4.setBackground(Color.ORANGE);
            B5.setBackground(Color.ORANGE);
            B6.setBackground(Color.ORANGE);
        }
        
        if(b7==("X")&& b8 == ("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Win","Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE );
            XCount++;
            gameScore();
            
            B7.setBackground(Color.ORANGE);
            B8.setBackground(Color.ORANGE);
            B9.setBackground(Color.ORANGE);
        }
        
        if(b1==("X")&& b4 == ("X") && b7 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Win","Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE );
            XCount++;
            gameScore();
            
            B1.setBackground(Color.ORANGE);
            B4.setBackground(Color.ORANGE);
            B7.setBackground(Color.ORANGE);
        }
        
        if(b2==("X")&& b5 == ("X") && b8 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Win","Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE );
            XCount++;
            gameScore();
            
            B2.setBackground(Color.ORANGE);
            B5.setBackground(Color.ORANGE);
            B8.setBackground(Color.ORANGE);
        }
        
        if(b3==("X")&& b6 == ("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Win","Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE );
            XCount++;
            gameScore();
            
            B3.setBackground(Color.ORANGE);
            B6.setBackground(Color.ORANGE);
            B9.setBackground(Color.ORANGE);
        }
        
        if(b1==("X")&& b5 == ("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Win","Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE );
            XCount++;
            gameScore();
            
            B1.setBackground(Color.ORANGE);
            B5.setBackground(Color.ORANGE);
            B9.setBackground(Color.ORANGE);
        }
        
        if(b3==("X")&& b5 == ("X") && b7 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Win","Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE );
            XCount++;
            gameScore();
            
            B3.setBackground(Color.ORANGE);
            B5.setBackground(Color.ORANGE);
            B7.setBackground(Color.ORANGE);
        }
        
        //Player O coding
        
        if(b1==("O")&& b2 == ("O") && b3 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player X Win","Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE );
            OCount++;
            gameScore();
            
            B1.setBackground(Color.ORANGE);
            B2.setBackground(Color.ORANGE);
            B3.setBackground(Color.ORANGE);
        }
        
        if(b4==("O")&& b5 == ("O") && b6 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O Win","Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE );
            OCount++;
            gameScore();
            
            B4.setBackground(Color.ORANGE);
            B5.setBackground(Color.ORANGE);
            B6.setBackground(Color.ORANGE);
        }
        
        if(b7==("O")&& b8 == ("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O Win","Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE );
            OCount++;
            gameScore();
            
            B7.setBackground(Color.ORANGE);
            B8.setBackground(Color.ORANGE);
            B9.setBackground(Color.ORANGE);
        }
        
        if(b1==("O")&& b4 == ("O") && b7 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O Win","Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE );
            OCount++;
            gameScore();
            
            B1.setBackground(Color.ORANGE);
            B4.setBackground(Color.ORANGE);
            B7.setBackground(Color.ORANGE);
        }
        
        if(b2==("O")&& b5 == ("O") && b8 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O Win","Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE );
            OCount++;
            gameScore();
            
            B2.setBackground(Color.ORANGE);
            B5.setBackground(Color.ORANGE);
            B8.setBackground(Color.ORANGE);
        }
        
        if(b3==("O")&& b6 == ("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O Win","Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE );
            OCount++;
            gameScore();
            
            B3.setBackground(Color.ORANGE);
            B6.setBackground(Color.ORANGE);
            B9.setBackground(Color.ORANGE);
        }
        
        if(b1==("O")&& b5 == ("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O Win","Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE );
            OCount++;
            gameScore();
            
            B1.setBackground(Color.ORANGE);
            B5.setBackground(Color.ORANGE);
            B9.setBackground(Color.ORANGE);
        }
        
        if(b3==("O")&& b5 == ("O") && b7 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O Win","Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE );
            OCount++;
            gameScore();
            
            B3.setBackground(Color.ORANGE);
            B5.setBackground(Color.ORANGE);
            B7.setBackground(Color.ORANGE);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        B1 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B7 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        B9 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        RESET = new javax.swing.JButton();
        EXIT = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        PlayerX = new javax.swing.JLabel();
        PlayerO = new javax.swing.JLabel();
        Playerxxx = new javax.swing.JLabel();
        Playerooo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIC TAC TOE");

        jPanel1.setBackground(new java.awt.Color(255, 0, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("TIC TAC TOE GAME");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(274, 274, 274))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        B1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        B1.setForeground(new java.awt.Color(51, 255, 255));
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        B2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        B3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        B6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });

        B5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });

        B7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });

        B8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });

        B9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B9ActionPerformed(evt);
            }
        });

        B4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });

        RESET.setBackground(new java.awt.Color(0, 204, 204));
        RESET.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        RESET.setText("RESET");
        RESET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESETActionPerformed(evt);
            }
        });

        EXIT.setBackground(new java.awt.Color(255, 0, 0));
        EXIT.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        EXIT.setText("EXIT");
        EXIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXITActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.red, java.awt.Color.red));

        PlayerX.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        PlayerX.setText("Player X:");

        PlayerO.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        PlayerO.setText("Player O:");

        Playerxxx.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Playerxxx.setForeground(new java.awt.Color(255, 0, 204));
        Playerxxx.setText("XXXXXXXXX");

        Playerooo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Playerooo.setForeground(new java.awt.Color(255, 0, 204));
        Playerooo.setText("XXXXXXXXX");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PlayerO)
                    .addComponent(PlayerX))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Playerxxx)
                    .addComponent(Playerooo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PlayerX)
                    .addComponent(Playerxxx))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Playerooo)
                    .addComponent(PlayerO))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(399, 399, 399)
                        .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(RESET, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(EXIT, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(123, 123, 123))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(RESET, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(EXIT, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RESETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESETActionPerformed
        // TODO add your handling code here:
        B1.setText(null);
        B2.setText(null);
        B3.setText(null);
        
        B4.setText(null);
        B5.setText(null);
        B6.setText(null);
        
        B7.setText(null);
        B8.setText(null);
        B9.setText(null);
        
        B1.setBackground(Color.LIGHT_GRAY);
        B2.setBackground(Color.LIGHT_GRAY);
        B3.setBackground(Color.LIGHT_GRAY);
        
        B4.setBackground(Color.LIGHT_GRAY);
        B5.setBackground(Color.LIGHT_GRAY);
        B6.setBackground(Color.LIGHT_GRAY);
        
        B7.setBackground(Color.LIGHT_GRAY);
        B8.setBackground(Color.LIGHT_GRAY);
        B9.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_RESETActionPerformed

    private void EXITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXITActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame("Exit");
        
        if(JOptionPane.showConfirmDialog(frame, "do you want to Exit",
                "Tic Tac Toe" , JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
            
        
    }//GEN-LAST:event_EXITActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        // TODO add your handling code here:
        B1.setText(startGame);
        if(startGame.equalsIgnoreCase("x"))
        {
            B1.setForeground(Color.RED);
        }
        else
        {
            B1.setForeground(Color.MAGENTA);
        }
        choose_a_Player();
        WinningGame();
    }//GEN-LAST:event_B1ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        // TODO add your handling code here:
        B2.setText(startGame);
        if(startGame.equalsIgnoreCase("x"))
        {
            B2.setForeground(Color.RED);
        }
        else
        {
            B2.setForeground(Color.MAGENTA);
        }
        choose_a_Player();
        WinningGame();
    }//GEN-LAST:event_B2ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        // TODO add your handling code here:
         B3.setText(startGame);
        if(startGame.equalsIgnoreCase("x"))
        {
            B3.setForeground(Color.RED);
        }
        else
        {
            B3.setForeground(Color.MAGENTA);
        }
        choose_a_Player();
        WinningGame();
    }//GEN-LAST:event_B3ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
        // TODO add your handling code here:
         B4.setText(startGame);
        if(startGame.equalsIgnoreCase("x"))
        {
            B4.setForeground(Color.RED);
        }
        else
        {
            B4.setForeground(Color.MAGENTA);
        }
        choose_a_Player();
        WinningGame();
    }//GEN-LAST:event_B4ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        // TODO add your handling code here:
         B5.setText(startGame);
        if(startGame.equalsIgnoreCase("x"))
        {
            B5.setForeground(Color.RED);
        }
        else
        {
            B5.setForeground(Color.MAGENTA);
        }
        choose_a_Player();
        WinningGame();
    }//GEN-LAST:event_B5ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
        // TODO add your handling code here:
         B6.setText(startGame);
        if(startGame.equalsIgnoreCase("x"))
        {
            B6.setForeground(Color.RED);
        }
        else
        {
            B6.setForeground(Color.MAGENTA);
        }
        choose_a_Player();
        WinningGame();
    }//GEN-LAST:event_B6ActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
        // TODO add your handling code here:
         B7.setText(startGame);
        if(startGame.equalsIgnoreCase("x"))
        {
            B7.setForeground(Color.RED);
        }
        else
        {
            B7.setForeground(Color.MAGENTA);
        }
        choose_a_Player();
        WinningGame();
    }//GEN-LAST:event_B7ActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
        // TODO add your handling code here:
         B8.setText(startGame);
        if(startGame.equalsIgnoreCase("x"))
        {
            B8.setForeground(Color.RED);
        }
        else
        {
            B8.setForeground(Color.MAGENTA);
        }
        choose_a_Player();
        WinningGame();
    }//GEN-LAST:event_B8ActionPerformed

    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B9ActionPerformed
        // TODO add your handling code here:
         B9.setText(startGame);
        if(startGame.equalsIgnoreCase("x"))
        {
            B9.setForeground(Color.RED);
        }
        else
        {
            B9.setForeground(Color.MAGENTA);
        }
        choose_a_Player();
        WinningGame();
    }//GEN-LAST:event_B9ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE_GAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE_GAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE_GAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE_GAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TIC_TAC_TOE_GAME().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton B9;
    private javax.swing.JButton EXIT;
    private javax.swing.JLabel PlayerO;
    private javax.swing.JLabel PlayerX;
    private javax.swing.JLabel Playerooo;
    private javax.swing.JLabel Playerxxx;
    private javax.swing.JButton RESET;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
