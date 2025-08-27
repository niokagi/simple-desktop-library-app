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
import javax.swing.DefaultComboBoxModel;


/**
 * @author nioka666
 */
public class FormBuku extends javax.swing.JFrame {
    
    private final Connection conn = new koneksi().connect();
    private Statement query;
    private ResultSet result;
    
    public FormBuku() {
        initComponents();
        table_value();
        enabb();
    }

    public void enabb(){
        txt_idbuku.setVisible(true);
        txt_idbuku.setEnabled(false);
        txt_kodebuku.setEnabled(true);
//      buttons
        
        btnReset.setEnabled(false);
        btnDelete.setEnabled(false);
        btnUpdate.setEnabled(false);
        btnSave.setEnabled(false);
    }
    
    public void table_value(){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Book ID");
        tbl.addColumn("Book Code");
        tbl.addColumn("Book Title");
        tbl.addColumn("Author");
        tbl.addColumn("Publisher");
        tbl.addColumn("Year");
        tbl.addColumn("Stock");
        tbl.addColumn("Book Shelf");
        
       
        j_table.setModel(tbl);
        
        try {
            query = conn.createStatement();
            result = query.executeQuery("SELECT * FROM buku");
            while(result.next()){
                tbl.addRow(new Object[]{
                    result.getString("id_buku"),
                    result.getString("kode_buku"),
                    result.getString("judul_buku"),
                    result.getString("penulis_buku"),
                    result.getString("penerbit_buku"),
                    result.getString("tahun_penerbit"),
                    result.getString("stok"),
                    result.getString("rak_buku"),
                });
                j_table.setModel(tbl);
            }
        } catch (Exception e) {
        }
    }
    
    private void openFormRak(){
        FormPeminjaman formRak = new FormPeminjaman();
        formRak.setVisible(true);
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
        txt_idbuku = new javax.swing.JTextField();
        txt_kodebuku = new javax.swing.JTextField();
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
        btnToMember = new javax.swing.JButton();
        txtkodeanggota_label1 = new javax.swing.JLabel();
        txt_author = new javax.swing.JTextField();
        txtkodeanggota_label2 = new javax.swing.JLabel();
        txt_judulbuku = new javax.swing.JTextField();
        txtidanggota_label1 = new javax.swing.JLabel();
        txt_year = new javax.swing.JTextField();
        txtidanggota_label2 = new javax.swing.JLabel();
        txt_publisher = new javax.swing.JTextField();
        txt_stock = new javax.swing.JTextField();
        txtidanggota_label3 = new javax.swing.JLabel();
        txtkodeanggota_label3 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
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
        jLabel1.setText("Books Form");

        jLabel2.setBackground(new java.awt.Color(243, 243, 243));
        jLabel2.setFont(new java.awt.Font("Poppins", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(234, 234, 234));
        jLabel2.setText("Simple CRUD Member Programs ");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtidanggota_label.setBackground(new java.awt.Color(0, 0, 0));
        txtidanggota_label.setFont(new java.awt.Font("Poppins", 1, 17)); // NOI18N
        txtidanggota_label.setForeground(new java.awt.Color(0, 0, 0));
        txtidanggota_label.setText("Book ID");

        txt_idbuku.setBackground(new java.awt.Color(232, 232, 232));
        txt_idbuku.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_idbuku.setForeground(new java.awt.Color(51, 51, 51));
        txt_idbuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idbukuActionPerformed(evt);
            }
        });

        txt_kodebuku.setBackground(new java.awt.Color(232, 232, 232));
        txt_kodebuku.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_kodebuku.setForeground(new java.awt.Color(51, 51, 51));
        txt_kodebuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kodebukuActionPerformed(evt);
            }
        });

        j_table.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        j_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Book ID", "Book Code", "Book Title", "Author", "Publisher", "Year", "Stock", "Book Shelf"
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
        txtkodeanggota_label.setText("Book Code");

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
        btnToMember.setText("< Member Form");
        btnToMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToMemberActionPerformed(evt);
            }
        });

        txtkodeanggota_label1.setBackground(new java.awt.Color(0, 0, 0));
        txtkodeanggota_label1.setFont(new java.awt.Font("Poppins", 1, 17)); // NOI18N
        txtkodeanggota_label1.setForeground(new java.awt.Color(0, 0, 0));
        txtkodeanggota_label1.setText("Author");

        txt_author.setBackground(new java.awt.Color(232, 232, 232));
        txt_author.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_author.setForeground(new java.awt.Color(51, 51, 51));
        txt_author.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_authorActionPerformed(evt);
            }
        });

        txtkodeanggota_label2.setBackground(new java.awt.Color(0, 0, 0));
        txtkodeanggota_label2.setFont(new java.awt.Font("Poppins", 1, 17)); // NOI18N
        txtkodeanggota_label2.setForeground(new java.awt.Color(0, 0, 0));
        txtkodeanggota_label2.setText("Book Title");

        txt_judulbuku.setBackground(new java.awt.Color(232, 232, 232));
        txt_judulbuku.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_judulbuku.setForeground(new java.awt.Color(51, 51, 51));
        txt_judulbuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_judulbukuActionPerformed(evt);
            }
        });

        txtidanggota_label1.setBackground(new java.awt.Color(0, 0, 0));
        txtidanggota_label1.setFont(new java.awt.Font("Poppins", 1, 17)); // NOI18N
        txtidanggota_label1.setForeground(new java.awt.Color(0, 0, 0));
        txtidanggota_label1.setText("Year");

        txt_year.setBackground(new java.awt.Color(232, 232, 232));
        txt_year.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_year.setForeground(new java.awt.Color(51, 51, 51));
        txt_year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_yearActionPerformed(evt);
            }
        });

        txtidanggota_label2.setBackground(new java.awt.Color(0, 0, 0));
        txtidanggota_label2.setFont(new java.awt.Font("Poppins", 1, 17)); // NOI18N
        txtidanggota_label2.setForeground(new java.awt.Color(0, 0, 0));
        txtidanggota_label2.setText("Publisher");

        txt_publisher.setBackground(new java.awt.Color(232, 232, 232));
        txt_publisher.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_publisher.setForeground(new java.awt.Color(51, 51, 51));
        txt_publisher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_publisherActionPerformed(evt);
            }
        });

        txt_stock.setBackground(new java.awt.Color(232, 232, 232));
        txt_stock.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_stock.setForeground(new java.awt.Color(51, 51, 51));
        txt_stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_stockActionPerformed(evt);
            }
        });

        txtidanggota_label3.setBackground(new java.awt.Color(0, 0, 0));
        txtidanggota_label3.setFont(new java.awt.Font("Poppins", 1, 17)); // NOI18N
        txtidanggota_label3.setForeground(new java.awt.Color(0, 0, 0));
        txtidanggota_label3.setText("Stock");

        txtkodeanggota_label3.setBackground(new java.awt.Color(0, 0, 0));
        txtkodeanggota_label3.setFont(new java.awt.Font("Poppins", 1, 17)); // NOI18N
        txtkodeanggota_label3.setForeground(new java.awt.Color(0, 0, 0));
        txtkodeanggota_label3.setText("Book Shelf");

        try {
            DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();

            String query = "SELECT id_rak, nama_rak FROM rak";
            PreparedStatement pst = conn.prepareStatement(query);
            ResultSet rs = pst.executeQuery();

            model.addElement("Pilih Rak Buku");

            while (rs.next()) {
                // Mengambil nilai dari kolom "nama_rak" dan menambahkannya ke dalam model ComboBox
                //        int idRak = rs.getInt("id_rak");
                String namaRak = rs.getString("nama_rak");
                model.addElement(namaRak);

                //        String rakFormat = idRak + " " + namaRak;

                //        model.addElement(rakFormat);
            }

            // Menutup ResultSet dan PreparedStatement
            rs.close();
            pst.close();
            jComboBox3.setModel(model);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
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
                        .addComponent(btnToMember)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete)
                        .addGap(18, 18, 18)
                        .addComponent(btnExit))
                    .addComponent(jScrollPane1)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtkodeanggota_label)
                                        .addComponent(txtidanggota_label))
                                    .addGap(69, 69, 69))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtkodeanggota_label2)
                                    .addGap(76, 76, 76)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtkodeanggota_label3)
                                .addGap(70, 70, 70)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_judulbuku, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txt_kodebuku, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                .addComponent(txt_idbuku, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(188, 188, 188)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtidanggota_label3)
                            .addComponent(txtidanggota_label1)
                            .addComponent(txtidanggota_label2)
                            .addComponent(txtkodeanggota_label1))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_author)
                            .addComponent(txt_publisher)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txt_stock, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                    .addComponent(txt_year, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 200, Short.MAX_VALUE)))))
                .addGap(56, 56, 56))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_idbuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtidanggota_label)
                    .addComponent(txt_author, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtkodeanggota_label1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_kodebuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtkodeanggota_label))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_judulbuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtkodeanggota_label2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtkodeanggota_label3)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                        .addGap(23, 23, 23)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnToMember, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_publisher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtidanggota_label2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtidanggota_label1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtidanggota_label3))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(41, 41, 41)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)))
                    .addComponent(jLabel4))
                .addContainerGap(687, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
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

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        txt_idbuku.setText("auto");
        txt_kodebuku.setText("");
        txt_judulbuku.setText("");
        txt_author.setText("");
        txt_publisher.setText("");
        txt_year.setText("");
        txt_stock.setText("");
        try {
            DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();

            String query = "SELECT id_rak, nama_rak FROM rak";
            PreparedStatement pst = conn.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
    
            model.addElement("Pilih Rak Buku");

            while (rs.next()) {
                // Mengambil nilai dari kolom "nama_rak" dan menambahkannya ke dalam model ComboBox
                String namaRak = rs.getString("nama_rak");
                model.addElement(namaRak);
            }

            // Menutup ResultSet dan PreparedStatement
            rs.close();
            pst.close();
            jComboBox3.setModel(model);
            
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        
        btnSave.setEnabled(true);
        btnReset.setEnabled(true);
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        txt_idbuku.setText("auto");
        txt_kodebuku.setText("");
        txt_judulbuku.setText("");
        txt_author.setText("");
        txt_publisher.setText("");
        txt_year.setText("");
        txt_stock.setText("");
        try {
            DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();

            String query = "SELECT id_rak, nama_rak FROM rak";
            PreparedStatement pst = conn.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
    
            model.addElement("Pilih Rak Buku");

            while (rs.next()) {
                // Mengambil nilai dari kolom "nama_rak" dan menambahkannya ke dalam model ComboBox
                String namaRak = rs.getString("nama_rak");
                model.addElement(namaRak);
            }

            // Menutup ResultSet dan PreparedStatement
            rs.close();
            pst.close();
            jComboBox3.setModel(model);
            
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        
        btnReset.setEnabled(false);
        btnDelete.setEnabled(false);
        btnUpdate.setEnabled(false);
//      btnSave.setEnabled(false);
        btnNew.setEnabled(true);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "INSERT INTO buku (kode_buku, judul_buku, penulis_buku, penerbit_buku, tahun_penerbit, stok, rak_buku) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            String selectedRak = jComboBox3.getSelectedItem().toString();
            
            stmt.setString(1, txt_kodebuku.getText());
            stmt.setString(2, txt_judulbuku.getText());
            stmt.setString(3, txt_author.getText());
            stmt.setString(4, txt_publisher.getText());
            stmt.setString(5, txt_year.getText());
            stmt.setString(6, txt_stock.getText());
            stmt.setString(7, selectedRak);
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Save Successfully");
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
        String id_buku = txt_idbuku.getText();
        
        try {
            query.executeUpdate("DELETE FROM buku WHERE id_buku = '" + id_buku + "'");
            JOptionPane.showMessageDialog(null, "Delete Succesfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Delete Failed");
        }
        
        txt_idbuku.setText(""); // !!
        txt_kodebuku.setText("");
        txt_judulbuku.setText("");
        txt_author.setText("");
        txt_publisher.setText("");
        txt_year.setText("");
        txt_stock.setText("");
                try {
            DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();

            String query = "SELECT id_rak, nama_rak FROM rak";
            PreparedStatement pst = conn.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
    
            model.addElement("Pilih Rak Buku");

            while (rs.next()) {
                // Mengambil nilai dari kolom "nama_rak" dan menambahkannya ke dalam model ComboBox
                String namaRak = rs.getString("nama_rak");
                model.addElement(namaRak);
            }

            // Menutup ResultSet dan PreparedStatement
            rs.close();
            pst.close();
            jComboBox3.setModel(model);
            
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        
        btnUpdate.setEnabled(false);
        btnDelete.setEnabled(true);
        btnReset.setEnabled(false);
        btnNew.setEnabled(true);
        
        table_value();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void j_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_tableMouseClicked
        // TODO add your handling code here:
        int tableData = j_table.getSelectedRow();
        txt_idbuku.setText(j_table.getValueAt(tableData, 0).toString());
        txt_kodebuku.setText(j_table.getValueAt(tableData, 1).toString());
        txt_judulbuku.setText(j_table.getValueAt(tableData, 2).toString());
        txt_author.setText(j_table.getValueAt(tableData, 3).toString());
        txt_publisher.setText(j_table.getValueAt(tableData, 4).toString());
        txt_year.setText(j_table.getValueAt(tableData, 5).toString());
        txt_stock.setText(j_table.getValueAt(tableData, 6).toString());
        jComboBox3.setSelectedItem(j_table.getValueAt(tableData, 7).toString());
        
        // button visibility
        btnUpdate.setEnabled(true);
        btnDelete.setEnabled(true);
        btnNew.setEnabled(true);
        btnReset.setEnabled(true);
        btnSave.setEnabled(false);
    }//GEN-LAST:event_j_tableMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String id_buku = txt_idbuku.getText();
        String kode_buku = txt_kodebuku.getText();
        String judul_buku  = txt_judulbuku.getText();
        String penulis_buku  = txt_author.getText();
        String penerbit_buku  = txt_publisher.getText();
        String tahun_penerbit  = txt_year.getText();
        String stok_buku  = txt_stock.getText();
        String rak_buku = jComboBox3.getSelectedItem().toString();
        
        try {
            String sql = "UPDATE buku SET kode_buku = '" + kode_buku + "', judul_buku = '" + judul_buku + "', penulis_buku = '" + penulis_buku + "', penerbit_buku = '" + penerbit_buku + "', tahun_penerbit = '" + tahun_penerbit + "', stok = '" + stok_buku + "', rak_buku = '" + rak_buku + "' WHERE id_buku = '" + id_buku + "'";
            Statement statement = conn.createStatement();
            statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Data Update Successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        // button visibility
        btnUpdate.setEnabled(true);
        btnDelete.setEnabled(false);
        btnNew.setEnabled(true);
        btnReset.setEnabled(false);
        
        table_value();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txt_idbukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idbukuActionPerformed
        // TODO add your handling code here:
        String id_buku = txt_idbuku.getText();

        try {
            result = query.executeQuery("SELECT * FROM buku WHERE id_buku = '" + id_buku + "'");
            while(result.next()){
                txt_kodebuku.setText(result.getString("kode_buku"));
                txt_judulbuku.setText(result.getString("judul_buku"));
                txt_author.setText(result.getString("penulis_buku"));
                txt_publisher.setText(result.getString("penerbit_buku"));
                txt_year.setText(result.getString("tahun_penerbit"));
                txt_stock.setText(result.getString("stok"));
                jComboBox3.getSelectedItem().toString();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_txt_idbukuActionPerformed

    
    private void txt_kodebukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_kodebukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_kodebukuActionPerformed

    private void btnToMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToMemberActionPerformed
        // TODO add your handling code here:
        openFormRak();
    }//GEN-LAST:event_btnToMemberActionPerformed

    private void txt_authorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_authorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_authorActionPerformed

    private void txt_judulbukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_judulbukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_judulbukuActionPerformed

    private void txt_yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_yearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_yearActionPerformed

    private void txt_publisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_publisherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_publisherActionPerformed

    private void txt_stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_stockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_stockActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

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
            java.util.logging.Logger.getLogger(FormBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormBuku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnToMember;
    private javax.swing.JButton btnUpdate;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JComboBox<String> jComboBox3;
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
    private javax.swing.JTextField txt_author;
    private javax.swing.JTextField txt_idbuku;
    private javax.swing.JTextField txt_judulbuku;
    private javax.swing.JTextField txt_kodebuku;
    private javax.swing.JTextField txt_publisher;
    private javax.swing.JTextField txt_stock;
    private javax.swing.JTextField txt_year;
    private javax.swing.JLabel txtidanggota_label;
    private javax.swing.JLabel txtidanggota_label1;
    private javax.swing.JLabel txtidanggota_label2;
    private javax.swing.JLabel txtidanggota_label3;
    private javax.swing.JLabel txtkodeanggota_label;
    private javax.swing.JLabel txtkodeanggota_label1;
    private javax.swing.JLabel txtkodeanggota_label2;
    private javax.swing.JLabel txtkodeanggota_label3;
    // End of variables declaration//GEN-END:variables
}
