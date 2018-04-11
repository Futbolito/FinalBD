/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

import MySQL.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Wilthouk
 */
public class ModificarEquipos extends javax.swing.JFrame {

    /**
     * Creates new form ModificarEquipos
     */
    public ModificarEquipos() throws SQLException, ClassNotFoundException{
        initComponents();
        setCombo();
    }
    
     public void setCombo()
    {
        
       try
        {
            Connection conexion;
            
            conexion=Conexion.obtener();
            
            PreparedStatement consulta = conexion.prepareStatement("Select Nombre_Equipo from equipo" );
            ResultSet resultado = consulta.executeQuery();
           // if(conexion.isClosed()){
           //Conexion.obtener();}
                //String dato=resultado.getString("SHOW TABLES");
                while(resultado.next())
            {
                cbxID.addItem(resultado.getString(1));                
            }
            //conexion.close();
            resultado.close();
        }
        catch(SQLException ex)
        {
            try {
                throw new SQLException(ex);
            } catch (SQLException ex1) {
                Logger.getLogger(Consultar.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Consultar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbxID = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nom = new javax.swing.JTextField();
        btnVolver1 = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(370, 250));
        setMinimumSize(new java.awt.Dimension(370, 250));
        setPreferredSize(new java.awt.Dimension(370, 250));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        cbxID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxIDActionPerformed(evt);
            }
        });
        getContentPane().add(cbxID);
        cbxID.setBounds(30, 50, 200, 20);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 153));
        jLabel1.setText("Equipo a modificar:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 30, 180, 15);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 153));
        jLabel2.setText("Nuevo nombre del equipo:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 80, 230, 15);
        getContentPane().add(nom);
        nom.setBounds(30, 100, 296, 30);

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
        btnVolver1.setBounds(40, 150, 90, 25);

        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/Media/BotonAceptar.png"))); // NOI18N
        btnAceptar.setBorder(null);
        btnAceptar.setBorderPainted(false);
        btnAceptar.setContentAreaFilled(false);
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAceptar);
        btnAceptar.setBounds(230, 150, 90, 25);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/Media/FondoTablas.jpg"))); // NOI18N
        getContentPane().add(fondo);
        fondo.setBounds(0, 0, 730, 490);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
         
       try
        {
            Connection conexion;
            conexion=Conexion.obtener();
            //if(conexion.isClosed()){
           //Conexion.obtener();}
            Statement consulta = conexion.createStatement();
            //if(conexion.isClosed()){
           //Conexion.obtener();}
            consulta.executeUpdate("update equipo set Nombre_Equipo = '"+nom.getText()+"' where Nombre_Equipo='"+cbxID.getSelectedItem().toString()+"';");
            //if(conexion.isClosed()){
           //Conexion.obtener();}
           //ResultSet resultado = consulta.executeQuery();
           //  conexion.close();
           // resultado.close();
           
           nom.setText("");
           cbxID.removeAllItems();
           setCombo();
            JOptionPane.showMessageDialog(null, "Se ha modificado correctamente el Equipo.");
        }
      
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Falla inesperada.");
            try {
                throw new SQLException(ex);
            } catch (SQLException ex1) {
                Logger.getLogger(Consultar.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Consultar.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnVolver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver1ActionPerformed
        Modificar v=new Modificar();
        v.setVisible(true);
        this.dispose();
        
        //LIMPIAR PANTALLA ANTES DE SALIR
        cbxID.removeAllItems();
        nom.setText("");
    }//GEN-LAST:event_btnVolver1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void cbxIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxIDActionPerformed
        
        
          
    }//GEN-LAST:event_cbxIDActionPerformed

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
            java.util.logging.Logger.getLogger(ModificarEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ModificarEquipos().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ModificarEquipos.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ModificarEquipos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnVolver1;
    private javax.swing.JComboBox<String> cbxID;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField nom;
    // End of variables declaration//GEN-END:variables
}
