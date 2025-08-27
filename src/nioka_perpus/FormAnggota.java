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
 * @author Adhim Niokagi
 */
public class FormAnggota extends javax.swing.JFrame {
    
    private final Connection conn = new koneksi().connect();
    private Statement query;
    private ResultSet result;
    
    public FormAnggota() {
        initComponents();
        table_value();
        enabb();
    }

    public void enabb(){
        txtidanggota.setVisible(true);
        txtidanggota.setEnabled(false);
        txtkodeanggota.setEnabled(true);
        txtnama_anggota.setEnabled(true);
        txtjurusan_anggota.setEnabled(true);
        txt_notelepon.setEnabled(true);
        txt_alamat.setEnabled(true);
        
        btnReset.setEnabled(false);
        btnDelete.setEnabled(false);
        btnUpdate.setEnabled(false);
        btnSave.setEnabled(false);
    }
    
    private void openFormRak() {
        FormBuku FormRak = new FormBuku();
        FormRak.setVisible(true);
        this.dispose();
    }
    
    public void table_value(){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Member ID");
        tbl.addColumn("Member Code");
        tbl.addColumn("Member Name");
        tbl.addColumn("Member Majors");
        tbl.addColumn("Phone Number");
        tbl.addColumn("Address");
        j_table.setModel(tbl);
        
        try {
            query = conn.createStatement();
            result = query.executeQuery("SELECT * FROM anggota");
            while(result.next()){
                tbl.addRow(new Object[]{
                    result.getString("id_anggota"),
                    result.getString("kode_anggota"),
                    result.getString("nama_anggota"),
                    result.getString("jurusan_anggota"),
                    result.getString("no_telp_anggota"),
                    result.getString("alamat_anggota"),
                });
                j_table.setModel(tbl);
            }
        } catch (Exception e) {
        }
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
        txtnama_anggota_label = new javax.swing.JLabel();
        txtidanggota_label = new javax.swing.JLabel();
        txtjurusan_anggota_label = new javax.swing.JLabel();
        txt_notelepon_label = new javax.swing.JLabel();
        txt_alamat_label = new javax.swing.JLabel();
        txtidanggota = new javax.swing.JTextField();
        txtnama_anggota = new javax.swing.JTextField();
        txtkodeanggota = new javax.swing.JTextField();
        txt_alamat = new javax.swing.JTextField();
        txt_notelepon = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        j_table = new javax.swing.JTable();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        txtkodeanggota_label = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        txtjurusan_anggota = new javax.swing.JComboBox<>();
        btnToRak = new javax.swing.JButton();
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
        jLabel1.setFont(new java.awt.Font("Poppins", 1, 47)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MEMBERS ENTRY FORM");

        jLabel2.setBackground(new java.awt.Color(243, 243, 243));
        jLabel2.setFont(new java.awt.Font("Poppins", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(234, 234, 234));
        jLabel2.setText("Simple CRUD Member Programs ");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtnama_anggota_label.setBackground(new java.awt.Color(0, 0, 0));
        txtnama_anggota_label.setFont(new java.awt.Font("Poppins", 1, 17)); // NOI18N
        txtnama_anggota_label.setForeground(new java.awt.Color(0, 0, 0));
        txtnama_anggota_label.setText("MEMBER NAME");

        txtidanggota_label.setBackground(new java.awt.Color(0, 0, 0));
        txtidanggota_label.setFont(new java.awt.Font("Poppins", 1, 17)); // NOI18N
        txtidanggota_label.setForeground(new java.awt.Color(0, 0, 0));
        txtidanggota_label.setText("MEMBER ID");

        txtjurusan_anggota_label.setBackground(new java.awt.Color(0, 0, 0));
        txtjurusan_anggota_label.setFont(new java.awt.Font("Poppins", 1, 17)); // NOI18N
        txtjurusan_anggota_label.setForeground(new java.awt.Color(0, 0, 0));
        txtjurusan_anggota_label.setText("MEMBER MAJORS");

        txt_notelepon_label.setBackground(new java.awt.Color(0, 0, 0));
        txt_notelepon_label.setFont(new java.awt.Font("Poppins", 1, 17)); // NOI18N
        txt_notelepon_label.setForeground(new java.awt.Color(0, 0, 0));
        txt_notelepon_label.setText("PHONE NUMBER");

        txt_alamat_label.setBackground(new java.awt.Color(0, 0, 0));
        txt_alamat_label.setFont(new java.awt.Font("Poppins", 1, 17)); // NOI18N
        txt_alamat_label.setForeground(new java.awt.Color(0, 0, 0));
        txt_alamat_label.setText("ADDRESS");

        txtidanggota.setBackground(new java.awt.Color(232, 232, 232));
        txtidanggota.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtidanggota.setForeground(new java.awt.Color(51, 51, 51));
        txtidanggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidanggotaActionPerformed(evt);
            }
        });

        txtnama_anggota.setBackground(new java.awt.Color(232, 232, 232));
        txtnama_anggota.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtnama_anggota.setForeground(new java.awt.Color(51, 51, 51));

        txtkodeanggota.setBackground(new java.awt.Color(232, 232, 232));
        txtkodeanggota.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtkodeanggota.setForeground(new java.awt.Color(51, 51, 51));

        txt_alamat.setBackground(new java.awt.Color(232, 232, 232));
        txt_alamat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_alamat.setForeground(new java.awt.Color(51, 51, 51));

        txt_notelepon.setBackground(new java.awt.Color(232, 232, 232));
        txt_notelepon.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_notelepon.setForeground(new java.awt.Color(51, 51, 51));

        j_table.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        j_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Member ID", "Member Code", "Member Name", "Member Majors", "Phone Number", "Address"
            }
        ));
        j_table.setRowHeight(25);
        j_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(j_table);

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

        btnUpdate.setBackground(new java.awt.Color(89, 64, 192));
        btnUpdate.setFont(new java.awt.Font("Poppins", 1, 16)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(153, 0, 0));
        btnDelete.setFont(new java.awt.Font("Poppins", 1, 16)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
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
        txtkodeanggota_label.setText("MEMBER CODE");

        btnReset.setBackground(new java.awt.Color(89, 64, 192));
        btnReset.setFont(new java.awt.Font("Poppins", 1, 16)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        txtjurusan_anggota.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtjurusan_anggota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RPL", "DKV", "APHP", "CULINARY", "PS" }));
        txtjurusan_anggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjurusan_anggotaActionPerformed(evt);
            }
        });

        btnToRak.setBackground(new java.awt.Color(255, 255, 255));
        btnToRak.setFont(new java.awt.Font("Poppins", 1, 16)); // NOI18N
        btnToRak.setForeground(new java.awt.Color(0, 0, 0));
        btnToRak.setText("Book Shelf >");
        btnToRak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToRakActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNew)
                        .addGap(29, 29, 29)
                        .addComponent(btnSave)
                        .addGap(29, 29, 29)
                        .addComponent(btnReset)
                        .addGap(29, 29, 29)
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnToRak)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete)
                        .addGap(18, 18, 18)
                        .addComponent(btnExit))
                    .addComponent(jScrollPane1)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnama_anggota_label)
                            .addComponent(txtkodeanggota_label)
                            .addComponent(txtidanggota_label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 171, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtkodeanggota, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtidanggota, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnama_anggota, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 171, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_notelepon_label)
                            .addComponent(txt_alamat_label)
                            .addComponent(txtjurusan_anggota_label))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_alamat)
                            .addComponent(txt_notelepon)
                            .addComponent(txtjurusan_anggota, 0, 247, Short.MAX_VALUE))))
                .addGap(59, 59, 59))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtjurusan_anggota_label)
                            .addComponent(txtjurusan_anggota, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_notelepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_notelepon_label))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_alamat_label)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtidanggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtidanggota_label))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtkodeanggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtkodeanggota_label))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnama_anggota_label)
                            .addComponent(txtnama_anggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnToRak, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nioka_perpus/img/digital-library.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(10, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(25, 25, 25)))
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

    private void txtidanggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidanggotaActionPerformed
        // TODO add your handling code here:
        String id_anggota = txtidanggota.getText();
        
        try {
            result = query.executeQuery("SELECT * FROM anggota WHERE id_anggota = '" + id_anggota + "'");
            while(result.next()){
                txtkodeanggota.setText(result.getString("kode_anggota"));
                txtnama_anggota.setText(result.getString("nama_anggota"));
                
                String jurusan = result.getString("jurusan_anggota");
                txtjurusan_anggota.setSelectedItem(jurusan);
                
                txt_notelepon.setText(result.getString("no_telp_anggota"));
                txt_alamat.setText(result.getString("alamat_anggota"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_txtidanggotaActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        txtidanggota.setText("auto");
        txtkodeanggota.setText("");
        txtnama_anggota.setText("");
        txtjurusan_anggota.setSelectedItem("Pilih Jurusan");
        txt_notelepon.setText("");
        txt_alamat.setText("");
        
        btnSave.setEnabled(true);
        btnReset.setEnabled(true);
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        txtidanggota.setText("auto");
        txtkodeanggota.setText("");
        txtnama_anggota.setText("");
        txtjurusan_anggota.setSelectedItem("Pilih Jurusan");
        txt_notelepon.setText("");
        txt_alamat.setText("");
        
        btnReset.setEnabled(false);
        btnDelete.setEnabled(false);
        btnUpdate.setEnabled(false);
        // btnSave.setEnabled(false);
        btnNew.setEnabled(true);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "INSERT INTO anggota (kode_anggota, nama_anggota, jurusan_anggota, no_telp_anggota, alamat_anggota) VALUES (?,?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, txtkodeanggota.getText());
            stmt.setString(2, txtnama_anggota.getText());
            stmt.setString(3, txtjurusan_anggota.getSelectedItem().toString());
            stmt.setString(4, txt_notelepon.getText());
            stmt.setString(5, txt_alamat.getText());
            stmt.executeUpdate();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        table_value();
        btnSave.setEnabled(false);
        btnDelete.setEnabled(false);
        btnUpdate.setEnabled(false);
        btnReset.setEnabled(false);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        String id_anggota = txtidanggota.getText();
        
        try {
            query.executeUpdate("DELETE FROM anggota WHERE id_anggota = '" + id_anggota + "'");
            JOptionPane.showMessageDialog(null, "Delete Succesfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Delete Failed");
        }
        
        txtidanggota.setText("");
        txtkodeanggota.setText("");
        txtnama_anggota.setText("");
        txtjurusan_anggota.setSelectedItem("Pilih Jurusan");
        txt_notelepon.setText("");
        txt_alamat.setText("");
        
        btnUpdate.setEnabled(false);
        btnDelete.setEnabled(false);
        btnReset.setEnabled(false);
        btnNew.setEnabled(false);
        
        table_value();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void j_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_tableMouseClicked
        // TODO add your handling code here:
        int tableData = j_table.getSelectedRow();
        txtidanggota.setText(j_table.getValueAt(tableData, 0).toString());
        txtkodeanggota.setText(j_table.getValueAt(tableData, 1).toString());
        txtnama_anggota.setText(j_table.getValueAt(tableData, 2).toString());
        
        String jurusanValue = j_table.getValueAt(tableData, 3).toString();
        txtjurusan_anggota.setSelectedItem(jurusanValue);
        
        txt_notelepon.setText(j_table.getValueAt(tableData, 4).toString());
        txt_alamat.setText(j_table.getValueAt(tableData, 5).toString());
        // button visibility
        btnUpdate.setEnabled(true);
        btnDelete.setEnabled(true);
        btnNew.setEnabled(true);
        btnReset.setEnabled(true);
        btnSave.setEnabled(false);
    }//GEN-LAST:event_j_tableMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String id_anggota = txtidanggota.getText();
        String kode_anggota = txtkodeanggota.getText();
        String nama_anggota = txtnama_anggota.getText();
        String jurusan_anggota = txtjurusan_anggota.getSelectedItem().toString();
        String no_telp_anggota = txt_notelepon.getText();
        String alamat = txt_alamat.getText();
        
        try {
            String sql = "UPDATE anggota SET kode_anggota = '" + kode_anggota + "', "
                        + "nama_anggota = '" + nama_anggota + "', "
                        + "jurusan_anggota = '" + jurusan_anggota + "', "
                        + "no_telp_anggota = '" + no_telp_anggota + "', "
                        + "alamat_anggota = '" + alamat + "' "
                        + "WHERE id_anggota = '" + id_anggota + "'";
            
            query.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Data Update Successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        // button visibility
        btnUpdate.setEnabled(false);
        btnDelete.setEnabled(false);
        btnNew.setEnabled(true);
        btnReset.setEnabled(false);
        
        table_value();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtjurusan_anggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjurusan_anggotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjurusan_anggotaActionPerformed

    private void btnToRakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToRakActionPerformed
        // TODO add your handling code here:
        openFormRak();
    }//GEN-LAST:event_btnToRakActionPerformed

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
            java.util.logging.Logger.getLogger(FormAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAnggota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnToRak;
    private javax.swing.JButton btnUpdate;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable j_table;
    private javax.swing.JTextField txt_alamat;
    private javax.swing.JLabel txt_alamat_label;
    private javax.swing.JTextField txt_notelepon;
    private javax.swing.JLabel txt_notelepon_label;
    private javax.swing.JTextField txtidanggota;
    private javax.swing.JLabel txtidanggota_label;
    private javax.swing.JComboBox<String> txtjurusan_anggota;
    private javax.swing.JLabel txtjurusan_anggota_label;
    private javax.swing.JTextField txtkodeanggota;
    private javax.swing.JLabel txtkodeanggota_label;
    private javax.swing.JTextField txtnama_anggota;
    private javax.swing.JLabel txtnama_anggota_label;
    // End of variables declaration//GEN-END:variables
}
