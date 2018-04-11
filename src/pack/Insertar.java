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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.UIManager.getString;

/**
 *
 * @author Wilthouk
 */
public class Insertar extends javax.swing.JFrame {

public Insertar()
{
    initComponents(); 
}
   /* public Insertar()throws SQLException, ClassNotFoundException
            {
                initComponents(); 
                cargarcbx();
            }
   private void cargarcbx()  throws SQLException, ClassNotFoundException
    {
        
        try
        {
            Connection conexion;
            conexion=Conexion.obtener();
            PreparedStatement consulta = conexion.prepareStatement("SHOW TABLES" );
            ResultSet resultado = consulta.executeQuery();
            
                //String dato=resultado.getString("SHOW TABLES");
                while(resultado.next())
            {
                cbxI.addItem(resultado.getString(1));                
            }
            conexion.close();
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cbxI = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(314, 195));
        setMinimumSize(new java.awt.Dimension(314, 195));
        setPreferredSize(new java.awt.Dimension(314, 195));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        cbxI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbxIMouseClicked(evt);
            }
        });
        cbxI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxIActionPerformed(evt);
            }
        });
        getContentPane().add(cbxI);
        cbxI.setBounds(110, 80, 100, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 153));
        jLabel2.setText("Elija la tabla que quiere insertar datos: ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 40, 280, 15);

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/Media/BotonVolver.png"))); // NOI18N
        btnVolver.setBorder(null);
        btnVolver.setBorderPainted(false);
        btnVolver.setContentAreaFilled(false);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver);
        btnVolver.setBounds(40, 120, 100, 23);

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/Media/BotonAceptar.png"))); // NOI18N
        btnGuardar.setBorder(null);
        btnGuardar.setBorderPainted(false);
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar);
        btnGuardar.setBounds(190, 120, 91, 25);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/Media/FondoTablas.jpg"))); // NOI18N
        getContentPane().add(fondo);
        fondo.setBounds(0, 0, 730, 490);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxIActionPerformed
    
        
    }//GEN-LAST:event_cbxIActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        Inicio ab=new Inicio();
        ab.setVisible(true);
        this.dispose();
        
        //LIMPIAR PANTALLA ANTES DE SALIR
        cbxI.removeAllItems();
        
        
    }//GEN-LAST:event_btnVolverActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       
    }//GEN-LAST:event_formWindowActivated

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
       String opcion=cbxI.getSelectedItem().toString();
        switch(opcion)
        {
            case "equipo":
        {
            InsertarEquipos v = new InsertarEquipos();
            v.setVisible(true);
            this.setVisible(false);
        }
         break;
            
            case "estadios":
              {
                  InsertarEstadios v = new InsertarEstadios();
                  v.setVisible(true);
                  this.setVisible(false);
        }
              break;
            case "jornada":
                {
                    InsertarJornadas v = new InsertarJornadas();
                    v.setVisible(true);
                    this.setVisible(false);
                }
            break;
            
            case "jugadores":
                 {
                     InsertarJugadores v = new InsertarJugadores();
                     v.setVisible(true);
                     this.setVisible(false);
                }
                 break;
            case "Torneo":
                 {
                     InsertarTorneo v = new InsertarTorneo();
                     v.setVisible(true);
                     this.setVisible(false);
                }
                 break;
            case "partidos":
                InsertarPartidos v = new InsertarPartidos();
                     v.setVisible(true);
                     this.setVisible(false);
                break;
                default:
                    JOptionPane.showMessageDialog(null, "Andas perdido carnal");
                break;
            
        
        }
       
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cbxIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxIMouseClicked
       
    }//GEN-LAST:event_cbxIMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try
        {
            Connection conexion;
            conexion=Conexion.obtener();
            PreparedStatement consulta = conexion.prepareStatement("SHOW TABLES" );
            ResultSet resultado = consulta.executeQuery();
            cbxI.removeAllItems();
                //String dato=resultado.getString("SHOW TABLES");
                while(resultado.next())
            {
                cbxI.addItem(resultado.getString(1));                
            }
           // conexion.close();
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
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Insertar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Insertar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Insertar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Insertar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Insertar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cbxI;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
