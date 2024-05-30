/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi_penjualan_sederhanaa;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.lang.Integer;

/**
 *
 * @author SMKN 4 BANDUNG
 */
public class registrasi extends javax.swing.JFrame {

    /**
     * Creates new form registrasi
     */
    private DefaultTableModel model = null;
    private PreparedStatement stat;
    private ResultSet rs;
    koneksi k = new koneksi();
    public registrasi() {
        initComponents();
        k.connect();
        refreshTable();
    }
    
    class user extends registrasi{
    int id_user, id_level;
    String username, password, nama_user;
    
    public user(){
        username = text_username.getText();
        password = text_password.getText();
        nama_user = text_nama_user.getText();
        id_level = Integer.parseInt(combo_id_level.getSelectedItem().toString());
        }
    }
    
    public void refreshTable(){
        model = new DefaultTableModel();
        model.addColumn("id_user");
        model.addColumn("username");
        model.addColumn("password");
        model.addColumn("nama User");
        model.addColumn("id_level");
        regis_tbl.setModel(model);
        
        try{
            this.stat = k.getCon().prepareStatement("select * from user");
            this.rs = this.stat.executeQuery();
            
            while (rs.next()){
                Object[]data ={
                    rs.getString("id_user"),
                    rs.getString("username"),
                    rs.getString("password"),
                    rs.getString("nama_user"),
                    rs.getString("id_level")
                };
                model.addRow(data);
            }
        }catch (Exception e){
        JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        text_id_user.setText("");
        text_username.setText("");
        text_password.setText("");
        text_nama_user.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        text_username = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        text_password = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        text_nama_user = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        combo_id_level = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        delete_btn = new javax.swing.JButton();
        menu_barang_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        regis_tbl = new javax.swing.JTable();
        update_btn = new javax.swing.JButton();
        input_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        text_id_user = new javax.swing.JTextField();
        regbtn_log = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("ID User");

        jLabel3.setText("USERNAME");

        jLabel4.setText("PASSWORD");

        combo_id_level.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));

        jLabel5.setText("NAMA USER");

        jLabel6.setText("ID Level");

        delete_btn.setText("DELETE");
        delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btnActionPerformed(evt);
            }
        });

        menu_barang_btn.setText("MENU BARANG");
        menu_barang_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_barang_btnActionPerformed(evt);
            }
        });

        regis_tbl.setModel(new javax.swing.table.DefaultTableModel(
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
        regis_tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regis_tblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(regis_tbl);

        update_btn.setText("UPDATE");
        update_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_btnActionPerformed(evt);
            }
        });

        input_btn.setText("INPUT");
        input_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_btnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("REGISTRASI");

        text_id_user.setEnabled(false);

        regbtn_log.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        regbtn_log.setText("LOGOUT");
        regbtn_log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regbtn_logActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(input_btn)
                                .addGap(36, 36, 36)
                                .addComponent(update_btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(delete_btn)
                                .addGap(28, 28, 28))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(39, 39, 39)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(menu_barang_btn)
                                .addGap(18, 18, 18))
                            .addComponent(regbtn_log, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(combo_id_level, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(text_nama_user))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(text_password))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(text_username))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(text_id_user, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(regbtn_log, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(text_id_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(text_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(text_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(text_nama_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(combo_id_level, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(update_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(delete_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menu_barang_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(input_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btnActionPerformed
        try {
        int idUser = Integer.parseInt(text_id_user.getText());
        this.stat = k.getCon().prepareStatement("delete from user where id_user=?");
        stat.setInt(1, idUser);
        
        stat.executeUpdate();
        refreshTable();
        }catch (Exception e){
            JOptionPane.showMessageDialog((null), e.getMessage());
        }
    }//GEN-LAST:event_delete_btnActionPerformed

    private void menu_barang_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_barang_btnActionPerformed
        barang barang = new barang();
        barang.setVisible(true);
        barang.brgbtn_in.setEnabled(true);
        barang.brgbtn_del.setEnabled(true);
        barang.brgbtn_up.setEnabled(true);
        barang.brgbtn_regis.setEnabled(true);
        this.setVisible(false);

    }//GEN-LAST:event_menu_barang_btnActionPerformed

    private void input_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_btnActionPerformed
        try{
            user u = new user();
            this.stat = k.getCon().prepareStatement("insert into user values(?,?,?,?,?)");
            stat.setInt(1, 0);
            
            stat.setString(2, u.username);
            stat.setString(3, u.password);
            stat.setString(4,u.nama_user);
            stat.setInt(5, u.id_level);
            
            stat.executeUpdate();
            refreshTable();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_input_btnActionPerformed

    private void regbtn_logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regbtn_logActionPerformed
        login l = new login (); 
        l.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_regbtn_logActionPerformed

    private void regis_tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regis_tblMouseClicked
        text_id_user.setText(model.getValueAt(regis_tbl.getSelectedRow(),0).toString());
        text_username.setText(model.getValueAt(regis_tbl.getSelectedRow(),1).toString());
        text_password.setText(model.getValueAt(regis_tbl. getSelectedRow(), 0).toString());
        text_nama_user.setText(model.getValueAt(regis_tbl. getSelectedRow(), 0).toString());
    }//GEN-LAST:event_regis_tblMouseClicked

    private void update_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_btnActionPerformed
        try {
        this.stat = k.getCon().prepareStatement("update user set username=?, password=?, nama_user=?, id_level=? where id_user=?");
        stat.setInt(1,0);
        stat.setString(2, text_username.getText());
        stat.setString(3, text_password.getText());
        stat.setString(4, text_nama_user.getText());
        stat.setInt(5, Integer.parseInt(combo_id_level.getSelectedItem().toString()));
        // Sesuaikan dengan kolom id_user di database.
        
        stat.executeUpdate();
        refreshTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
}

    }//GEN-LAST:event_update_btnActionPerformed

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
            java.util.logging.Logger.getLogger(registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registrasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combo_id_level;
    private javax.swing.JButton delete_btn;
    private javax.swing.JButton input_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton menu_barang_btn;
    private javax.swing.JButton regbtn_log;
    private javax.swing.JTable regis_tbl;
    public javax.swing.JTextField text_id_user;
    private javax.swing.JTextField text_nama_user;
    private javax.swing.JTextField text_password;
    private javax.swing.JTextField text_username;
    private javax.swing.JButton update_btn;
    // End of variables declaration//GEN-END:variables
}
