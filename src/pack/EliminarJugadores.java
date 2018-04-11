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
 * @author lenovo-pc
 */
public class EliminarJugadores extends javax.swing.JFrame {

    
    /**
     * Creates new form EliminarJugadores
     * @throws java.sql.SQLException
     * @throws java.lang.ClassNotFoundException
     */
    public EliminarJugadores() throws SQLException, ClassNotFoundException {
        initComponents();
        setCombo();
    }

    /**
     *
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public final void setCombo() throws SQLException, ClassNotFoundException
    {
        Connection conexion;
            
            conexion=Conexion.obtener();
            
            PreparedStatement consulta = conexion.prepareStatement("Select Nombre_Jugador from jugadores" );
            ResultSet resultado = consulta.executeQuery();          
                while(resultado.next())
            {
                jComboBox1.addItem(resultado.getString(1)); 
                
            }          
    }
    public void setVentana()
    {
        try
        {
            Connection conexion ;
            conexion=Conexion.obtener();
            
            PreparedStatement consulta = conexion.prepareStatement("Select id_Jugador from jugadores where Nombre_Jugador= '"+jComboBox1.getSelectedItem().toString()+"';" );           
            ResultSet resultado = consulta.executeQuery();
            
            while(resultado.next())
            {
                String dato=resultado.getString("id_Jugador");                
                jTextField1.setText(dato);          
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
        
        try
        {
            Connection conexion;
            conexion=Conexion.obtener();
            PreparedStatement consulta = conexion.prepareStatement("Select id_Equipo from jugadores where Nombre_Jugador = '"+jComboBox1.getSelectedItem().toString()+"';" );           
            ResultSet resultado = consulta.executeQuery();
            
            while(resultado.next())
            {
                String dato=resultado.getString("id_Equipo");                
                jTextField2.setText(dato);          
            }          
        }
        catch(SQLException ex)
        {
            try {
                throw new SQLException(ex);
            } catch (SQLException ex1) {
                Logger.getLogger(EliminarJugadores.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EliminarJugadores.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Que paso carnal jejeje");
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnVolver1 = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(407, 308));
        setMinimumSize(new java.awt.Dimension(407, 308));
        setPreferredSize(new java.awt.Dimension(407, 308));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 102));
        jLabel2.setText("ID del Equipo:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 130, 100, 17);

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 102));
        jLabel3.setText("Seleccione el nombre del jugador  a eliminar");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 30, 280, 17);

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 102));
        jLabel4.setText("ID del Jugador:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 100, 100, 17);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(130, 100, 140, 20);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(130, 130, 140, 20);

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
        btnVolver.setBounds(260, 190, 90, 25);

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(130, 60, 141, 20);

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
        btnVolver1.setBounds(70, 190, 90, 25);

        fondo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        fondo.setForeground(new java.awt.Color(0, 204, 153));
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/Media/FondoTablas.jpg"))); // NOI18N
        getContentPane().add(fondo);
        fondo.setBounds(10, 0, 472, 330);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        try
        {
            Connection conexion;
            conexion=Conexion.obtener();
            
            Statement consulta = conexion.createStatement();
            consulta.executeUpdate("Delete from jugadores where Nombre_Jugador='"+jComboBox1.getSelectedItem().toString()+"';");
            jTextField1.setText("");
            jTextField2.setText("");

            jComboBox1.removeAllItems();

        }

        catch(SQLException ex)
        {
            try {
                throw new SQLException(ex);
            } catch (SQLException ex1) {
                Logger.getLogger(Consultar.class.getName()).log(Level.SEVERE, null, ex1);
                JOptionPane.showMessageDialog(null, "La instruccion no se concreto debido a que el dato esta conectado a otra tabla de la BD");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Consultar.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolverActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        setVentana();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnVolver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver1ActionPerformed
        Eliminar v=new Eliminar ();
        v.setVisible(true);
        this.setVisible(false);

        //LIMPIAR PANTALLA ANTES DE SALIR
        jComboBox1.removeAllItems();
        jTextField1.setText("");
        jTextField2.setText("");
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
            java.util.logging.Logger.getLogger(EliminarJugadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EliminarJugadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EliminarJugadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EliminarJugadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new EliminarJugadores().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(EliminarJugadores.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(EliminarJugadores.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton btnVolver1;
    private javax.swing.JLabel fondo;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
