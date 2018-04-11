/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;
import MySQL.Conexion;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.logging.*;
/**
 *
 * @author Wilthouk
 */
public class ConsultarPartidos extends javax.swing.JFrame {

    DefaultTableModel modeloPartido;
     MySQL.Conexion con = new MySQL.Conexion();
    public ConsultarPartidos() throws SQLException, ClassNotFoundException {
        modeloPartido = new DefaultTableModel (null, getColumnas());
        setFilas();
        initComponents();
        
    }
    private String[] getColumnas(){
        String columna[]= new String[]{"id Partido","id Jornada","Equipo Local","Equipo Visitante","Marcador Local","Marcador Visitante","id Equipo Local","id Equipo Visitante","Fecha","id Estadio" };
        return columna;
    }
    private void setFilas() throws SQLException, ClassNotFoundException
    {
        try{
            Connection conexion;
            conexion=Conexion.obtener();
            PreparedStatement consulta = conexion.prepareStatement("Select id_Partido, id_Jornada, equipo_local, equipo_visitante, marcador_local, marcador_visitante, id_EquipoL, id_EquipoV, fecha, id_Estadio  from partidos");
            ResultSet r = consulta.executeQuery();
            Object datos[]=new Object[10];
            while(r.next()){
                for(int i = 0;i<10;i++)
                {
                    datos[i]=r.getObject(i+1);
                }
                modeloPartido.addRow(datos);
            }
            r.close();
        }
        catch (SQLException ex)
        {
            Logger.getLogger(ConsultarEquipos.class.getName()).log(Level.SEVERE, null, ex);
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(724, 485));
        setMinimumSize(new java.awt.Dimension(724, 485));
        setPreferredSize(new java.awt.Dimension(724, 485));
        setResizable(false);
        getContentPane().setLayout(null);

        jTable2.setModel(modeloPartido);
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 44, 693, 389);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setText("TABLA PARTIDOS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(290, 20, 150, 19);

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/Media/BotonVolver.png"))); // NOI18N
        btnVolver.setBorder(null);
        btnVolver.setBorderPainted(false);
        btnVolver.setContentAreaFilled(false);
        getContentPane().add(btnVolver);
        btnVolver.setBounds(614, 451, 100, 25);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/Media/FondoTablas.jpg"))); // NOI18N
        getContentPane().add(fondo);
        fondo.setBounds(0, 0, 730, 490);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ConsultarPartidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarPartidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarPartidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarPartidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ConsultarPartidos().setVisible(true);
                } catch (SQLException | ClassNotFoundException ex) {
                    Logger.getLogger(ConsultarPartidos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
