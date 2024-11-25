/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import javax.swing.*;
import java.awt.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mateo
 */
public class Juego extends javax.swing.JPanel {
    private pbThead t1;
    private Player mp3Player;

    public Juego() {
        initComponents();
        t1 = new pbThead(Pro_Bar);
        t1.start();
    }

    class pbThead extends Thread {
        JProgressBar pbar;

        pbThead(JProgressBar pbar) {
            this.pbar = pbar;
        }

        public void run() {
            int max = 15;
            int min = 0;
            int durationInSeconds = 15;
            int sleepTime = durationInSeconds * 1000 / max;

            pbar.setMaximum(max);
            pbar.setMinimum(min);
            pbar.setValue(max);

            for (int i = max; i >= min; i--) {
                pbar.setValue(i);
                System.out.println(i);
                try {
                    Thread.sleep(sleepTime);
                    if (i == 12) {
                        playSound();
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    private void playSound() {
        new Thread(() -> {
            try {
                FileInputStream fis = new FileInputStream("C:\\Users\\melcu\\Downloads\\y2mate (mp3cut.net).mp3");
                mp3Player = new Player(fis);
                mp3Player.play();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                System.out.println("Archivo no encontrado: " + e.getMessage());
            } catch (JavaLayerException e) {
                e.printStackTrace();
                System.out.println("Error al reproducir el archivo MP3: " + e.getMessage());
            }
        }).start();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        Pro_Bar = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setText("jTextField1");
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 150, 30));

        jTextField2.setText("jTextField1");
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 150, 30));

        jTextField3.setText("jTextField1");
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 210, 150, 30));

        jTextField4.setText("jTextField1");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 150, 30));

        jTextField5.setText("jTextField1");
        jPanel2.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, 150, 30));

        jTextField6.setText("jTextField1");
        jPanel2.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 320, 150, 30));

        jTextField7.setText("jTextField1");
        jPanel2.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, 150, 30));

        jTextField8.setText("jTextField1");
        jPanel2.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, 150, 30));

        jTextField9.setText("jTextField1");
        jPanel2.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 420, 150, 30));

        jTextField10.setText("jTextField1");
        jPanel2.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 510, 150, 30));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/bton2.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 580, 190, 70));

        jLabel12.setText("jLabel3");
        jLabel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 470, 150, 30));

        jLabel11.setText("jLabel3");
        jLabel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 380, 150, 30));

        jLabel10.setText("jLabel3");
        jLabel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, 150, 30));

        jLabel9.setText("jLabel3");
        jLabel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 150, 30));

        jLabel8.setText("jLabel3");
        jLabel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 270, 150, 30));

        jLabel7.setText("jLabel3");
        jLabel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, 150, 30));

        jLabel6.setText("jLabel3");
        jLabel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 150, 30));

        jLabel5.setText("jLabel3");
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 160, 150, 30));

        jLabel4.setText("jLabel3");
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 150, 30));

        jLabel3.setText("jLabel3");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 150, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 210, 470));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/timer_20dp_FILL0_wght400_GRAD0_opsz20.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 570, -1, -1));

        Pro_Bar.setBackground(new java.awt.Color(255, 153, 51));
        Pro_Bar.setForeground(new java.awt.Color(255, 255, 255));
        Pro_Bar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(Pro_Bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 590, 400, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/fondo_1.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar Pro_Bar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
