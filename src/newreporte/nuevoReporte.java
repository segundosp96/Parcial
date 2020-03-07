
package newreporte;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import static newreporte.NewReporte.conectar;

public class nuevoReporte extends javax.swing.JFrame {
    NewReporte con =  new NewReporte ();
    Connection  cn = NewReporte.conectar();
    
    public nuevoReporte() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        txtmonto = new javax.swing.JTextField();
        btnreporte = new javax.swing.JButton();
        btnregistrar = new javax.swing.JButton();
        kbkmulta = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cbomulta = new javax.swing.JComboBox<String>();
        txtdni = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("CORREO");

        btnreporte.setText("REPORTE");
        btnreporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreporteActionPerformed(evt);
            }
        });

        btnregistrar.setText("REGISTRAR");
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });

        kbkmulta.setText("MULTA");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("DNI");

        cbomulta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Alta Velocidad", "Pico Placa", "Pasar Luz Roja" }));

        jLabel2.setText("MONTO");

        txtcorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcorreoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(kbkmulta, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtcorreo)
                                    .addComponent(txtmonto)
                                    .addComponent(txtdni, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cbomulta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(215, 215, 215))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(btnreporte)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnregistrar)))
                        .addGap(32, 32, 32))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kbkmulta, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbomulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnreporte)
                    .addComponent(btnregistrar))
                .addGap(62, 62, 62)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnreporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreporteActionPerformed
        try {
            JasperReport jr = (JasperReport)
            JRLoader.loadObject(NewReporte.class.getResource("./Reporte.jasper"));
            Map parametros = new HashMap<String, Object>();
            parametros.put ("PARAMETRO_NOMBRE", "Hola Mundo");
            JasperPrint jp = JasperFillManager.fillReport(jr, parametros, cn);

            JasperViewer jv = new JasperViewer(jp);
            jv.show ();

        } catch (Exception e) {
            System.err.print(e);
        }
    }//GEN-LAST:event_btnreporteActionPerformed

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
        try {
            PreparedStatement pps = cn.prepareStatement("INSERT INTO usuario(dni,multa,monto,correo) VALUES(?,?,?,?)");
            pps.setString(1, txtdni.getText());
            pps.setString(2, (String) cbomulta.getSelectedItem());
            pps.setString(3, txtmonto.getText());
            pps.setString(4, txtcorreo.getText());
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos Guardados");

        } catch (SQLException ex) {
            Logger.getLogger(NewReporte.class.getName()).log(Level.SEVERE, null, ex);

        }

    }//GEN-LAST:event_btnregistrarActionPerformed

    private void txtcorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcorreoActionPerformed

   
    public static void main(String args[]) throws SQLException {
        JFrame f;
        Statement statement = conectar().createStatement();
        String query = "SELECT * FROM reporte";
        ResultSet resultSet = statement.executeQuery(query);
        DefaultTableModel model = new DefaultTableModel(new String[]{"DNI", "MULTA", "MONTO", "CORREO"}, 0);
           while(resultSet.next()) {
           int dni = resultSet.getInt("dni");
           String multa = resultSet.getString("multa");
           int monto = resultSet.getInt("monto");
           int correo = resultSet.getInt("correo");
           model.addRow(new Object[]{dni, multa, monto, correo});
}
           JTable table = new JTable(model);
         
        f = new nuevoReporte();
        f.setTitle("JTable Example");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new nuevoReporte().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnregistrar;
    private javax.swing.JButton btnreporte;
    private javax.swing.JComboBox<String> cbomulta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel kbkmulta;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtdni;
    private javax.swing.JTextField txtmonto;
    // End of variables declaration//GEN-END:variables
}
