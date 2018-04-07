/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

/**
 *
 * @author Wilthouk
 */
public class ModificarEstadios extends javax.swing.JFrame {

    /**
     * Creates new form ModificarEstadios
     */
    public ModificarEstadios() {
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

        jLabel1 = new javax.swing.JLabel();
        cbxID = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        nom = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ubi = new javax.swing.JTextField();
        btnVolver1 = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(391, 215));
        setMinimumSize(new java.awt.Dimension(391, 215));
        setPreferredSize(new java.awt.Dimension(391, 215));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 153));
        jLabel1.setText("ID del estadios a modificar:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 30, 180, 15);

        cbxID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cbxID);
        cbxID.setBounds(200, 30, 56, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 153));
        jLabel2.setText("Nombre del estadio:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 70, 140, 15);
        getContentPane().add(nom);
        nom.setBounds(200, 70, 164, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 153));
        jLabel3.setText("Ubicacion del estadio:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 110, 150, 15);
        getContentPane().add(ubi);
        ubi.setBounds(200, 110, 164, 20);

        btnVolver1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/Media/BotonVolver.png"))); // NOI18N
        btnVolver1.setBorder(null);
        btnVolver1.setBorderPainted(false);
        btnVolver1.setContentAreaFilled(false);
        btnVolver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver1);
        btnVolver1.setBounds(80, 160, 90, 25);

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/Media/BotonAceptar.png"))); // NOI18N
        btnVolver.setBorder(null);
        btnVolver.setBorderPainted(false);
        btnVolver.setContentAreaFilled(false);
        getContentPane().add(btnVolver);
        btnVolver.setBounds(220, 160, 90, 25);

        fondo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        fondo.setForeground(new java.awt.Color(0, 204, 153));
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/Media/FondoTablas.jpg"))); // NOI18N
        getContentPane().add(fondo);
        fondo.setBounds(0, 0, 730, 490);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver1ActionPerformed
        Modificar v=new Modificar();
        v.setVisible(true);
        this.setVisible(false);
        
        //LIMPIAR PANTALLA ANTES DE SALIR
        cbxID.removeAllItems();
        nom.setText("");
        ubi.setText("");
    }//GEN-LAST:event_btnVolver1ActionPerformed

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
            java.util.logging.Logger.getLogger(ModificarEstadios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarEstadios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarEstadios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarEstadios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarEstadios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton btnVolver1;
    private javax.swing.JComboBox<String> cbxID;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField nom;
    private javax.swing.JTextField ubi;
    // End of variables declaration//GEN-END:variables
}
