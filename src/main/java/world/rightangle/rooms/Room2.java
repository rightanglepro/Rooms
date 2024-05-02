/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package world.rightangle.rooms;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.image.BufferedImage;
import java.awt.Image;

import java.io.File;
import java.io.IOException;


/**
 *
 * @author rightanglepro
 */
public class Room2 extends javax.swing.JFrame {

    private static String photographImgPath = "src/main/resources/sky.jpg";
    
    /**
     * Creates new form Room2
     */
    public Room2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRoomNum = new javax.swing.JLabel();
        btnQuitGame = new javax.swing.JButton();
        btnReturnHallway = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        photograph = new javax.swing.JLabel(getImage());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblRoomNum.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        lblRoomNum.setText("Room 2");

        btnQuitGame.setText("Quit Game");
        btnQuitGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitGameActionPerformed(evt);
            }
        });

        btnReturnHallway.setText("Return to Hallway");
        btnReturnHallway.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnHallwayActionPerformed(evt);
            }
        });

        jLabel1.setText("Just a painting. Nothing else to see here.");

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));

        photograph.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                photographMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                photographMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                photographMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                photographMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(photograph, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(photograph, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnQuitGame)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnReturnHallway))
                            .addComponent(lblRoomNum)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(154, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRoomNum)
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQuitGame)
                    .addComponent(btnReturnHallway))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuitGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitGameActionPerformed
        // quit game, exits program
        System.exit(0);
    }//GEN-LAST:event_btnQuitGameActionPerformed

    private void btnReturnHallwayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnHallwayActionPerformed
        // closes current window (returns to hallway window)
        System.out.println("Room 2: Return to Hallway");
        this.dispose();
    }//GEN-LAST:event_btnReturnHallwayActionPerformed

    private void photographMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_photographMouseEntered
        photographImgPath = "src/main/resources/storm.jpg";
        photograph.setIcon(getImage());
        
        System.out.println("Room 2: Change photograph to storm.jpg");
    }//GEN-LAST:event_photographMouseEntered

    private void photographMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_photographMouseExited
        photographImgPath = "src/main/resources/sky.jpg";
        photograph.setIcon(getImage());
        
        System.out.println("Room 2: Change photograph to sky.jpg");
    }//GEN-LAST:event_photographMouseExited

    private void photographMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_photographMousePressed
        photographImgPath = "src/main/resources/parchment.png";
        photograph.setIcon(getImage());
        
        System.out.println("Room 2: Change photograph to parchment.png");
    }//GEN-LAST:event_photographMousePressed

    private void photographMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_photographMouseReleased
        photographImgPath = "src/main/resources/storm.jpg";
        photograph.setIcon(getImage());
        
        System.out.println("Room 2: Change photograph to storm.jpg");
    }//GEN-LAST:event_photographMouseReleased

    
    private ImageIcon getImage(){ // get an ImageIcon for the photograph from its file path, then scale it
        ImageIcon ico = new ImageIcon(photographImgPath);
        
        ico = new ImageIcon(ico.getImage().getScaledInstance(320, 240, Image.SCALE_DEFAULT)); // scale image down to photograph jLabel size (320x240)
        
        return ico;
    }
    
    
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
            java.util.logging.Logger.getLogger(Room2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Room2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Room2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Room2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Room2().setVisible(true);
            }
        });
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQuitGame;
    private javax.swing.JButton btnReturnHallway;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblRoomNum;
    private static javax.swing.JLabel photograph;
    // End of variables declaration//GEN-END:variables
}
