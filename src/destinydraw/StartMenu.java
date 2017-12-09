/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package destinydraw;
/**
 *
 * @author Piyaphol Wiengperm
 * @author Thanakrit Daowrueang
 */
import java.awt.Dimension;
public class StartMenu extends javax.swing.JFrame {

    /**
     * Creates new form StartMenu
     */
    public StartMenu() {
        this.setPreferredSize(new Dimension(720, 460));
        this.setMinimumSize(new Dimension(720, 460));
        this.setLocationRelativeTo(null);
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

        Title = new javax.swing.JLabel();
        ExitIcon = new javax.swing.JButton();
        StartIcon = new javax.swing.JButton();
        Version = new javax.swing.JLabel();
        BackGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(720, 460));
        setPreferredSize(new java.awt.Dimension(720, 460));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setFont(new java.awt.Font("Herculanum", 0, 48)); // NOI18N
        Title.setForeground(new java.awt.Color(240, 240, 240));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText(" Destiny Draw");
        Title.setToolTipText("");
        Title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 400, 64));

        ExitIcon.setFont(new java.awt.Font("Herculanum", 0, 36)); // NOI18N
        ExitIcon.setForeground(new java.awt.Color(255, 255, 255));
        ExitIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/exitbutton.png"))); // NOI18N
        ExitIcon.setText("  Exit");
        ExitIcon.setToolTipText("");
        ExitIcon.setBorderPainted(false);
        ExitIcon.setContentAreaFilled(false);
        ExitIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExitIcon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitIconActionPerformed(evt);
            }
        });
        getContentPane().add(ExitIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 230, 80));
        ExitIcon.getAccessibleContext().setAccessibleName("Start");

        StartIcon.setFont(new java.awt.Font("Herculanum", 1, 36)); // NOI18N
        StartIcon.setForeground(new java.awt.Color(255, 255, 255));
        StartIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/StartIcon.png"))); // NOI18N
        StartIcon.setText("  Start");
        StartIcon.setToolTipText("");
        StartIcon.setBorder(null);
        StartIcon.setBorderPainted(false);
        StartIcon.setContentAreaFilled(false);
        StartIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        StartIcon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartIconActionPerformed(evt);
            }
        });
        getContentPane().add(StartIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 230, 60));

        Version.setFont(new java.awt.Font("Herculanum", 0, 24)); // NOI18N
        Version.setForeground(new java.awt.Color(255, 51, 51));
        Version.setText("Version 1.0.1");
        Version.setToolTipText("");
        getContentPane().add(Version, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 160, 40));

        BackGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/menuBackground.jpg"))); // NOI18N
        getContentPane().add(BackGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitIconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitIconActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitIconActionPerformed

    private void StartIconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartIconActionPerformed
        new PlayInterface().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_StartIconActionPerformed

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
            java.util.logging.Logger.getLogger(StartMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackGround;
    private javax.swing.JButton ExitIcon;
    private javax.swing.JButton StartIcon;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel Version;
    // End of variables declaration//GEN-END:variables
}
