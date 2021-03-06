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
public class ModificarJornadas extends javax.swing.JFrame {

    /**
     * Creates new form ModificarJornadas
     */
    public ModificarJornadas() {
        initComponents();
        setCombo();
        setVentana();
        
    }

    public void setCombo()
    {
        
       try
        {
            Connection conexion;
            
            conexion=Conexion.obtener();
            
            PreparedStatement consulta = conexion.prepareStatement("Select id_Jornada from jornada" );
            ResultSet resultado = consulta.executeQuery();          
                while(resultado.next())
            {
                cbxID.addItem(resultado.getString(1)); 
                
            }          
            //resultado.close();
            
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
         
    public void setVentana(){
      
        // PRIMER CONSULTA
       try
        {
            Connection conexion;
            conexion=Conexion.obtener();
            PreparedStatement consulta = conexion.prepareStatement("Select id_Torneo from jornada where id_Jornada= '"+cbxID.getSelectedItem().toString()+"';" );           
            ResultSet resultado = consulta.executeQuery();
            
            while(resultado.next())
            {
                String dato=resultado.getString("id_Torneo");                
                ID.setText(dato);          
            }          
        }
        catch(SQLException ex)
        {
            try {
                throw new SQLException(ex);
            } catch (SQLException ex1) {
                Logger.getLogger(ModificarEstadios.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ModificarEstadios.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel1 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbxID = new javax.swing.JComboBox<>();
        btnVolver1 = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(357, 221));
        setMinimumSize(new java.awt.Dimension(357, 221));
        setPreferredSize(new java.awt.Dimension(357, 221));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 153));
        jLabel1.setText("ID del Torneo: ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 80, 130, 15);
        getContentPane().add(ID);
        ID.setBounds(170, 80, 165, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 153));
        jLabel2.setText("ID de la jornada a modificar:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 40, 190, 15);

        cbxID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxIDActionPerformed(evt);
            }
        });
        getContentPane().add(cbxID);
        cbxID.setBounds(236, 40, 100, 20);

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
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
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
        Modificar v=new Modificar ();
        v.setVisible(true);
        this.setVisible(false);
        
        //LIMPIAR PANTALLA ANTES DE SALIR
        cbxID.removeAllItems();
        ID.setText("");
    }//GEN-LAST:event_btnVolver1ActionPerformed

    private void cbxIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxIDActionPerformed
        setVentana();
    }//GEN-LAST:event_cbxIDActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
         try
        {
            Connection conexion;
            conexion=Conexion.obtener();
            //if(conexion.isClosed()){
           //Conexion.obtener();}
            Statement consulta = conexion.createStatement();
            //if(conexion.isClosed()){
           //Conexion.obtener();}
            consulta.executeUpdate("update jornada set id_Torneo = '"+ID.getText()+"' where id_Jornada='"+cbxID.getSelectedItem().toString()+"';");
            //if(conexion.isClosed()){
           //Conexion.obtener();}
           //ResultSet resultado = consulta.executeQuery();
           //  conexion.close();
           // resultado.close();
           
           ID.setText("");
           cbxID.removeAllItems();
           setCombo();
           JOptionPane.showMessageDialog(null, "Se ha modificado correctamente la Jornada.");
        }
      
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Falla Inesperada");
            try {
                throw new SQLException(ex);
            } catch (SQLException ex1) {
                Logger.getLogger(Consultar.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Consultar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnVolverActionPerformed

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
            java.util.logging.Logger.getLogger(ModificarJornadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarJornadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarJornadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarJornadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarJornadas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton btnVolver1;
    private javax.swing.JComboBox<String> cbxID;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
