/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ibiology.Cells;

import ibiology.Cells.CellsGUI;
import ibiology.HomePageGUI;

/**
 *
 * @author x14500057
 */
public class Platelet_GUI extends javax.swing.JFrame {

    /**
     * Creates new form HomePageGUI
     */
    public Platelet_GUI() {
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

        PlateletsInfo = new javax.swing.JScrollPane();
        Platelets_Info = new javax.swing.JTextPane();
        Plateles_Header = new javax.swing.JTextField();
        backBtn = new javax.swing.JLabel();
        MiniB = new javax.swing.JLabel();
        CloseB = new javax.swing.JLabel();
        TopBar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        HomeBtn = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Platelets_Info.setBackground(new java.awt.Color(255, 165, 99));
        Platelets_Info.setBorder(null);
        Platelets_Info.setFont(new java.awt.Font("Calibri", 0, 26)); // NOI18N
        Platelets_Info.setText("The main function of thrombocytes is to stop the loss of blood from wounds. To this purpose, they aggregate and release factors which promote the blood coagulation. Among them, there are the serotonin which reduces the diameter of lesioned vessels and slows down the hematic flux and the fibrin which trap cells and forms the clotting.");
        Platelets_Info.setToolTipText("");
        PlateletsInfo.setViewportView(Platelets_Info);

        getContentPane().add(PlateletsInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 510, 290));

        Plateles_Header.setEditable(false);
        Plateles_Header.setBackground(new java.awt.Color(155, 66, 0));
        Plateles_Header.setFont(new java.awt.Font("Thonburi", 1, 36)); // NOI18N
        Plateles_Header.setForeground(new java.awt.Color(255, 255, 255));
        Plateles_Header.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Plateles_Header.setText("PLATELETS");
        Plateles_Header.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Plateles_HeaderActionPerformed(evt);
            }
        });
        getContentPane().add(Plateles_Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 560, 50));

        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ibiology/graphics/BackB.png"))); // NOI18N
        backBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBtnMouseClicked(evt);
            }
        });
        getContentPane().add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, 170, -1));

        MiniB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MiniB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MiniBMouseClicked(evt);
            }
        });
        getContentPane().add(MiniB, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 10, 22, 20));

        CloseB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CloseB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseBMouseClicked(evt);
            }
        });
        getContentPane().add(CloseB, new org.netbeans.lib.awtextra.AbsoluteConstraints(821, 10, 22, 20));

        TopBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                TopBarMouseDragged(evt);
            }
        });
        getContentPane().add(TopBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 22));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 60, 60));

        HomeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HomeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeBtnMouseClicked(evt);
            }
        });
        getContentPane().add(HomeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 70));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ibiology/graphics/OOP_GUI_Template.png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 600));

        setSize(new java.awt.Dimension(857, 598));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CloseBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseBMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CloseBMouseClicked

    private void MiniBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MiniBMouseClicked
        this.setState(BloodCellGUI.ICONIFIED);
    }//GEN-LAST:event_MiniBMouseClicked

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseDragged

    private void TopBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TopBarMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x,y);
    }//GEN-LAST:event_TopBarMouseDragged

    private void HomeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeBtnMouseClicked
        HomePageGUI GUI = new HomePageGUI();
        GUI.setVisible(true);
        dispose();
    }//GEN-LAST:event_HomeBtnMouseClicked

    private void backBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseClicked
       WBC_GUI GUI = new WBC_GUI();
       GUI.setVisible(true);
       dispose();
    }//GEN-LAST:event_backBtnMouseClicked

    private void Plateles_HeaderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Plateles_HeaderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Plateles_HeaderActionPerformed

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
            java.util.logging.Logger.getLogger(BloodCellGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BloodCellGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BloodCellGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BloodCellGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BloodCellGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel CloseB;
    private javax.swing.JLabel HomeBtn;
    private javax.swing.JLabel MiniB;
    private javax.swing.JTextField Plateles_Header;
    private javax.swing.JScrollPane PlateletsInfo;
    private javax.swing.JTextPane Platelets_Info;
    private javax.swing.JLabel TopBar;
    private javax.swing.JLabel backBtn;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
