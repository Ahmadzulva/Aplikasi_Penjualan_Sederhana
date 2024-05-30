/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi_penjualan_sederhanaa;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.security.auth.Refreshable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

/**
 *
 * @author SMKN 4 BANDUNG
 */
public class barang extends javax.swing.JFrame {

    /**
     * Creates new form barang
     */
    
    private DefaultTableModel model= null;
    private PreparedStatement stat;
    private ResultSet rs;
    koneksi k = new koneksi();
    
    public barang() {
        initComponents();
        k.connect();
        refreshtable();
    }
    class Brg extends barang{
    int id_barang, harga;
    String nama_barang, status;
    
    public Brg(){
        this.nama_barang = text_nama_barang.getText();
        this.harga = Integer.parseInt(text_harga.getText());
        this.status = combo_status.getSelectedItem().toString();
        }
    }
    
    public void refreshtable(){
    model = new DefaultTableModel();
    model.addColumn("ID Barang");
    model.addColumn("Nama Barang");
    model.addColumn("Harga");
    model.addColumn("Status Barang");
    
    tbl_barang.setModel(model);
    
    try{
        this.stat = k.getCon().prepareStatement("Select * from barang");
        this.rs = this.stat.executeQuery();
        while(rs.next()){
            Object[] data = {
                rs.getInt("id_barang"),
                rs.getString("nama_barang"),
                rs.getInt("harga"),
                rs.getString("status")
            };
            model.addRow(data);
        }
    }catch (Exception e){
        JOptionPane.showMessageDialog(null, e.getMessage());
    }
    text_id_barang.setText("");
    text_nama_barang.setText("");
    text_harga.setText("");
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        brgbtn_mt = new javax.swing.JButton();
        combo_status = new javax.swing.JComboBox<>();
        brgbtn_in = new javax.swing.JButton();
        brgbtn_up = new javax.swing.JButton();
        brgbtn_del = new javax.swing.JButton();
        brgbtn_regis = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_barang = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        text_nama_barang = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        text_id_barang = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        text_harga = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        brgbtn_log = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        brgbtn_mt.setText("MENU TRANSAKSI");
        brgbtn_mt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brgbtn_mtActionPerformed(evt);
            }
        });

        combo_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tersedia", "Habis" }));
        combo_status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_statusActionPerformed(evt);
            }
        });

        brgbtn_in.setText("INPUT");
        brgbtn_in.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brgbtn_inActionPerformed(evt);
            }
        });

        brgbtn_up.setText("UPDATE");
        brgbtn_up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brgbtn_upActionPerformed(evt);
            }
        });

        brgbtn_del.setText("DELETE");
        brgbtn_del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brgbtn_delActionPerformed(evt);
            }
        });

        brgbtn_regis.setText("MENU REGISTER");
        brgbtn_regis.setToolTipText("");
        brgbtn_regis.setDoubleBuffered(true);
        brgbtn_regis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brgbtn_regisActionPerformed(evt);
            }
        });

        tbl_barang.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_barang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_barangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_barang);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("BARANG");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("ID Barang");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Nama Barang");

        text_id_barang.setEditable(false);
        text_id_barang.setActionCommand("<Not Set>");
        text_id_barang.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Harga");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Status");

        brgbtn_log.setText("LOGOUT");
        brgbtn_log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brgbtn_logActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(brgbtn_in, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 28, Short.MAX_VALUE)))
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(brgbtn_mt, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(combo_status, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(brgbtn_up, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(brgbtn_del, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(brgbtn_regis)
                                .addGap(16, 16, 16))
                            .addComponent(text_nama_barang)
                            .addComponent(text_id_barang)
                            .addComponent(text_harga)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(103, 103, 103)
                        .addComponent(brgbtn_log, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(brgbtn_log, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(brgbtn_mt))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(text_id_barang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_nama_barang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(brgbtn_del, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brgbtn_regis, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(brgbtn_in, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(brgbtn_up, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combo_statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_statusActionPerformed

    private void brgbtn_mtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brgbtn_mtActionPerformed
        Transaksi tran = new Transaksi();
        tran.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_brgbtn_mtActionPerformed

    private void brgbtn_regisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brgbtn_regisActionPerformed
        registrasi reg = new registrasi();
        reg.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_brgbtn_regisActionPerformed

    private void brgbtn_logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brgbtn_logActionPerformed
        login l = new login (); 
        l.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_brgbtn_logActionPerformed

    private void brgbtn_inActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brgbtn_inActionPerformed
        try{
            Brg b = new Brg();
            this.stat = k.getCon().prepareStatement("insert into barang values(?,?,?,?)");
            stat.setInt(1, 0);
            stat.setString(2, b.nama_barang);
            stat.setInt(3, b.harga);
            stat.setString(4, b.status);
            stat.executeUpdate();
            refreshtable();
        }catch (Exception e){
        JOptionPane.showMessageDialog(null, e.getMessage());
       }
    }//GEN-LAST:event_brgbtn_inActionPerformed

    private void tbl_barangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_barangMouseClicked
        text_id_barang.setText(model.getValueAt(tbl_barang.getSelectedRow(), 0).toString());
        text_nama_barang.setText(model.getValueAt(tbl_barang.getSelectedRow(), 1).toString());
        text_harga.setText(model.getValueAt(tbl_barang.getSelectedRow(), 2).toString()); 
    }//GEN-LAST:event_tbl_barangMouseClicked

    private void brgbtn_upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brgbtn_upActionPerformed
        try{
            Brg b = new Brg();
            this.stat = k.getCon().prepareStatement("update barang set nama_barang=?," + "harga=?, status=? where id_barang=?");
            stat.setString(1, b.nama_barang);
            stat.setInt(2, b.harga);
            stat.setString(3, b.status);
            stat.setInt(4, Integer.parseInt(text_id_barang.getText()));
            stat.executeUpdate();
            refreshtable();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_brgbtn_upActionPerformed

    private void brgbtn_delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brgbtn_delActionPerformed
        try{
            this.stat = k.getCon().prepareStatement("delete from barang where id_barang=?");
            stat.setInt(1, Integer.parseInt(text_id_barang.getText()));
            stat.executeUpdate();
            refreshtable();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_brgbtn_delActionPerformed

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
            java.util.logging.Logger.getLogger(barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new barang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton brgbtn_del;
    public javax.swing.JButton brgbtn_in;
    public javax.swing.JButton brgbtn_log;
    public javax.swing.JButton brgbtn_mt;
    public javax.swing.JButton brgbtn_regis;
    public javax.swing.JButton brgbtn_up;
    private javax.swing.JComboBox<String> combo_status;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_barang;
    private javax.swing.JTextField text_harga;
    private javax.swing.JTextField text_id_barang;
    private javax.swing.JTextField text_nama_barang;
    // End of variables declaration//GEN-END:variables
}