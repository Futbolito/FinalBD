/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

import java.applet.AudioClip;
import java.net.URL;

/**
 *
 * @author user
 */
public class EasterEgg extends javax.swing.JFrame {

    /**
     * Creates new form EasterEgg
     */
    public EasterEgg() {
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

        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(789, 502));
        setMinimumSize(new java.awt.Dimension(789, 502));
        setPreferredSize(new java.awt.Dimension(789, 502));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/Media/gifsEasterEgg/8.gif"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(180, 240, 320, 240);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/Media/gifsEasterEgg/5.gif"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-20, 170, 300, 180);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/Media/gifsEasterEgg/niño1.gif"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-20, 320, 230, 230);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/Media/gifsEasterEgg/niño2.gif"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(460, 10, 330, 220);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/Media/gifsEasterEgg/definitivo.gif"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(410, 290, 360, 190);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/Media/gifsEasterEgg/3.gif"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(-50, 0, 380, 190);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/Media/gifsEasterEgg/7.gif"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(210, 0, 320, 250);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/Media/gifsEasterEgg/6.gif"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(400, 180, 390, 330);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/Media/FondoEasterEgg.png"))); // NOI18N
        getContentPane().add(fondo);
        fondo.setBounds(0, 0, 800, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        AudioClip sonido;
        URL url=this.getClass().getResource("/musica/Benny Benassi - Satisfaction.wav");
        sonido=java.applet.Applet.newAudioClip(url);
        
        sonido.play();
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(EasterEgg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EasterEgg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EasterEgg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EasterEgg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EasterEgg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
