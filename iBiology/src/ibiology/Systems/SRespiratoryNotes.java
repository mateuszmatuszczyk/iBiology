/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ibiology;

/**
 *
 * @author x14500057
 */
public class SRespiratoryNotes extends javax.swing.JFrame {

    /**
     * Creates new form HomePageGUI
     */
    public SRespiratoryNotes() {
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

        MiniB = new javax.swing.JLabel();
        CloseB = new javax.swing.JLabel();
        MuteB = new javax.swing.JLabel();
        TopBar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        HomeBtn = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        MuteB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(MuteB, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 510, 65, 65));

        TopBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                TopBarMouseDragged(evt);
            }
        });
        getContentPane().add(TopBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 22));

        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 430, 320, 120));

        HomeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeBtnMouseClicked(evt);
            }
        });
        getContentPane().add(HomeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 70));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ibiology/graphics/OOP_GUI_Template.png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 600));

        setSize(new java.awt.Dimension(861, 603));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CloseBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseBMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CloseBMouseClicked

    private void MiniBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MiniBMouseClicked
        this.setState(SRespiratoryNotes.ICONIFIED);
    }//GEN-LAST:event_MiniBMouseClicked

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseDragged

    private void TopBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TopBarMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x,y);
    }//GEN-LAST:event_TopBarMouseDragged

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        SRespiratoryDiagram GUI = new SRespiratoryDiagram();
        GUI.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void HomeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeBtnMouseClicked
        HomePageGUI GUI = new HomePageGUI();
        GUI.setVisible(true);
        dispose();
    }//GEN-LAST:event_HomeBtnMouseClicked

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
            java.util.logging.Logger.getLogger(SRespiratoryNotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SRespiratoryNotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SRespiratoryNotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SRespiratoryNotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SRespiratoryNotes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel CloseB;
    private javax.swing.JLabel HomeBtn;
    private javax.swing.JLabel MiniB;
    private javax.swing.JLabel MuteB;
    private javax.swing.JLabel TopBar;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
