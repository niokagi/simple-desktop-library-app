package nioka_perpus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.Color;
import java.sql.Statement;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * @author nioka666
 */
public class FormPeminjaman extends javax.swing.JFrame {
    
    private final Connection conn = new koneksi().connect();
    private Statement query;
    private ResultSet result;
    
    public FormPeminjaman() {
        initComponents();
        enabb();
    }

    public void enabb(){
        txtBorrowPeriod.setVisible(true);
        txtBorrowPeriod.setEnabled(false);
        txtBookTitle.setEnabled(true);
        // buttons
        
        btnReset.setEnabled(false);
        btnCheck.setEnabled(false);
        btnSave.setEnabled(false);
    }
    
    private void openFormAnggota(){
        FormAnggota formAnggota = new FormAnggota();
        formAnggota.setVisible(true);
        this.dispose();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtidanggota_label = new javax.swing.JLabel();
        txtBorrowPeriod = new javax.swing.JTextField();
        txtBookTitle = new javax.swing.JTextField();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnCheck = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        txtkodeanggota_label = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnToMember = new javax.swing.JButton();
        txtkodeanggota_label1 = new javax.swing.JLabel();
        txtMemberName = new javax.swing.JTextField();
        txtkodeanggota_label2 = new javax.swing.JLabel();
        txtMemberID = new javax.swing.JTextField();
        txtkodeanggota_label3 = new javax.swing.JLabel();
        txtBookID = new javax.swing.JTextField();
        btnToMember1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Member Entry Form");
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setSize(new java.awt.Dimension(1920, 1080));

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Poppins", 1, 52)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Borrowing Book");

        jLabel2.setBackground(new java.awt.Color(243, 243, 243));
        jLabel2.setFont(new java.awt.Font("Poppins", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(234, 234, 234));
        jLabel2.setText("Simple CRUD Member Programs ");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtidanggota_label.setBackground(new java.awt.Color(0, 0, 0));
        txtidanggota_label.setFont(new java.awt.Font("Poppins", 1, 17)); // NOI18N
        txtidanggota_label.setForeground(new java.awt.Color(0, 0, 0));
        txtidanggota_label.setText("Borrow Period (day)");

        txtBorrowPeriod.setBackground(new java.awt.Color(232, 232, 232));
        txtBorrowPeriod.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtBorrowPeriod.setForeground(new java.awt.Color(51, 51, 51));
        txtBorrowPeriod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBorrowPeriodActionPerformed(evt);
            }
        });

        txtBookTitle.setBackground(new java.awt.Color(232, 232, 232));
        txtBookTitle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtBookTitle.setForeground(new java.awt.Color(51, 51, 51));
        txtBookTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBookTitleActionPerformed(evt);
            }
        });

        btnNew.setBackground(new java.awt.Color(89, 64, 192));
        btnNew.setFont(new java.awt.Font("Poppins", 1, 16)); // NOI18N
        btnNew.setForeground(new java.awt.Color(255, 255, 255));
        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(89, 64, 192));
        btnSave.setFont(new java.awt.Font("Poppins", 1, 16)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCheck.setBackground(new java.awt.Color(89, 64, 192));
        btnCheck.setFont(new java.awt.Font("Poppins", 1, 16)); // NOI18N
        btnCheck.setForeground(new java.awt.Color(255, 255, 255));
        btnCheck.setText("Check");
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(153, 0, 0));
        btnExit.setFont(new java.awt.Font("Poppins", 1, 16)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        txtkodeanggota_label.setBackground(new java.awt.Color(0, 0, 0));
        txtkodeanggota_label.setFont(new java.awt.Font("Poppins", 1, 17)); // NOI18N
        txtkodeanggota_label.setForeground(new java.awt.Color(0, 0, 0));
        txtkodeanggota_label.setText("Book Title");

        btnReset.setBackground(new java.awt.Color(89, 64, 192));
        btnReset.setFont(new java.awt.Font("Poppins", 1, 16)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnToMember.setBackground(new java.awt.Color(255, 255, 255));
        btnToMember.setFont(new java.awt.Font("Poppins", 1, 16)); // NOI18N
        btnToMember.setForeground(new java.awt.Color(0, 0, 0));
        btnToMember.setText("< Member Data");
        btnToMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToMemberActionPerformed(evt);
            }
        });

        txtkodeanggota_label1.setBackground(new java.awt.Color(0, 0, 0));
        txtkodeanggota_label1.setFont(new java.awt.Font("Poppins", 1, 17)); // NOI18N
        txtkodeanggota_label1.setForeground(new java.awt.Color(0, 0, 0));
        txtkodeanggota_label1.setText("Member Name");

        txtMemberName.setBackground(new java.awt.Color(232, 232, 232));
        txtMemberName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtMemberName.setForeground(new java.awt.Color(51, 51, 51));
        txtMemberName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemberNameActionPerformed(evt);
            }
        });

        txtkodeanggota_label2.setBackground(new java.awt.Color(0, 0, 0));
        txtkodeanggota_label2.setFont(new java.awt.Font("Poppins", 1, 17)); // NOI18N
        txtkodeanggota_label2.setForeground(new java.awt.Color(0, 0, 0));
        txtkodeanggota_label2.setText("Member ID");

        txtMemberID.setBackground(new java.awt.Color(232, 232, 232));
        txtMemberID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtMemberID.setForeground(new java.awt.Color(51, 51, 51));
        txtMemberID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemberIDActionPerformed(evt);
            }
        });

        txtkodeanggota_label3.setBackground(new java.awt.Color(0, 0, 0));
        txtkodeanggota_label3.setFont(new java.awt.Font("Poppins", 1, 17)); // NOI18N
        txtkodeanggota_label3.setForeground(new java.awt.Color(0, 0, 0));
        txtkodeanggota_label3.setText("Book ID");

        txtBookID.setBackground(new java.awt.Color(232, 232, 232));
        txtBookID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtBookID.setForeground(new java.awt.Color(51, 51, 51));
        txtBookID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBookIDActionPerformed(evt);
            }
        });

        btnToMember1.setBackground(new java.awt.Color(255, 255, 255));
        btnToMember1.setFont(new java.awt.Font("Poppins", 1, 16)); // NOI18N
        btnToMember1.setForeground(new java.awt.Color(0, 0, 0));
        btnToMember1.setText("< Book Data");
        btnToMember1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToMember1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtkodeanggota_label1)
                            .addComponent(txtkodeanggota_label)
                            .addComponent(txtidanggota_label))
                        .addGap(107, 107, 107)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtMemberName)
                            .addComponent(txtBookTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBorrowPeriod, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtkodeanggota_label3)
                            .addComponent(txtkodeanggota_label2))
                        .addGap(79, 79, 79)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtBookID, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(txtMemberID)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                        .addComponent(btnToMember1)
                        .addGap(18, 18, 18)
                        .addComponent(btnToMember)
                        .addGap(18, 18, 18)
                        .addComponent(btnExit)))
                .addGap(83, 83, 83))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBorrowPeriod, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtidanggota_label)
                        .addComponent(txtBookID, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtkodeanggota_label3)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBookTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtkodeanggota_label)
                    .addComponent(txtMemberID, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtkodeanggota_label2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMemberName, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtkodeanggota_label1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnToMember, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnToMember1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nioka_perpus/img/digital-library.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel3)
                        .addComponent(jLabel4))
                    .addComponent(jLabel5))
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnToMember1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToMember1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnToMember1ActionPerformed

    private void txtBookIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBookIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBookIDActionPerformed

    private void txtMemberIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemberIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberIDActionPerformed

    private void txtMemberNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemberNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberNameActionPerformed

    private void btnToMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToMemberActionPerformed
        // TODO add your handling code here:
        openFormAnggota();
    }//GEN-LAST:event_btnToMemberActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        txtBorrowPeriod.setText("auto");
        txtBookTitle.setText("");

        btnReset.setEnabled(false);
        btnCheck.setEnabled(false);
        btnCheck.setEnabled(false);
        //        btnSave.setEnabled(false);
        btnNew.setEnabled(true);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed
        // TODO add your handling code here:
        String id_rak = txtBorrowPeriod.getText();
        String nama_rak  = txtBookTitle.getText();

        try {
            String sql = "UPDATE rak SET nama_rak = '" + nama_rak + "' WHERE id_rak = '" + id_rak + "'";

            query.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Data Update Successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        // button visibility
        btnCheck.setEnabled(false);
        btnNew.setEnabled(true);
        btnReset.setEnabled(false);

    }//GEN-LAST:event_btnCheckActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "INSERT INTO rak (nama_rak) VALUES (?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, txtBookTitle.getText());
            stmt.executeUpdate();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

        btnSave.setEnabled(false);
        btnCheck.setEnabled(false);
        btnReset.setEnabled(false);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        txtBorrowPeriod.setText("auto");
        txtBookTitle.setText("");

        btnSave.setEnabled(true);
        btnReset.setEnabled(true);
    }//GEN-LAST:event_btnNewActionPerformed

    private void txtBookTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBookTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBookTitleActionPerformed

    private void txtBorrowPeriodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBorrowPeriodActionPerformed
        // TODO add your handling code here:
        String id_rak = txtBorrowPeriod.getText();

        try {
            result = query.executeQuery("SELECT * FROM rak WHERE id_rak = '" + id_rak + "'");
            while(result.next()){
                txtBookTitle.setText(result.getString("nama_rak"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_txtBorrowPeriodActionPerformed

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
            java.util.logging.Logger.getLogger(FormPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPeminjaman().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCheck;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnToMember;
    private javax.swing.JButton btnToMember1;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtBookID;
    private javax.swing.JTextField txtBookTitle;
    private javax.swing.JTextField txtBorrowPeriod;
    private javax.swing.JTextField txtMemberID;
    private javax.swing.JTextField txtMemberName;
    private javax.swing.JLabel txtidanggota_label;
    private javax.swing.JLabel txtkodeanggota_label;
    private javax.swing.JLabel txtkodeanggota_label1;
    private javax.swing.JLabel txtkodeanggota_label2;
    private javax.swing.JLabel txtkodeanggota_label3;
    // End of variables declaration//GEN-END:variables
}
