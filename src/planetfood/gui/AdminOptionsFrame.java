/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theplanetfood.gui;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import theplanetfood.pojo.UserProfile;

/**
 *
 * @author ROYAL CHHORA
 */
public class AdminOptionsFrame extends javax.swing.JFrame {

    /**
     * Creates new form AdminOptionsFrame
     */
    public AdminOptionsFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
               lblUsername.setText("Hello "+UserProfile.getUsername());
                
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jrAddEmp = new javax.swing.JRadioButton();
        jrViewEmp = new javax.swing.JRadioButton();
        jrEditEmp = new javax.swing.JRadioButton();
        jrRemEmp = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jrRegCash = new javax.swing.JRadioButton();
        jrRemCash = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jrViewOrd = new javax.swing.JRadioButton();
        jrViewDate = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        jrAddCat = new javax.swing.JRadioButton();
        jrViewCat = new javax.swing.JRadioButton();
        jrEditCat = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        jrAddPrd = new javax.swing.JRadioButton();
        jrViewPrd = new javax.swing.JRadioButton();
        jrEditPrd = new javax.swing.JRadioButton();
        jrRemPrd = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnDoTask = new javax.swing.JButton();
        lblLogout = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setForeground(new java.awt.Color(0, 153, 153));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel2.setToolTipText("");
        jPanel2.setName(""); // NOI18N

        jrAddEmp.setBackground(new java.awt.Color(0, 153, 153));
        buttonGroup1.add(jrAddEmp);
        jrAddEmp.setForeground(new java.awt.Color(255, 255, 255));
        jrAddEmp.setText("Add Emp");

        jrViewEmp.setBackground(new java.awt.Color(0, 153, 153));
        buttonGroup1.add(jrViewEmp);
        jrViewEmp.setForeground(new java.awt.Color(255, 255, 255));
        jrViewEmp.setText("View Emp");

        jrEditEmp.setBackground(new java.awt.Color(0, 153, 153));
        buttonGroup1.add(jrEditEmp);
        jrEditEmp.setForeground(new java.awt.Color(255, 255, 255));
        jrEditEmp.setText("Edit Emp");
        jrEditEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrEditEmpActionPerformed(evt);
            }
        });

        jrRemEmp.setBackground(new java.awt.Color(0, 153, 153));
        buttonGroup1.add(jrRemEmp);
        jrRemEmp.setForeground(new java.awt.Color(255, 255, 255));
        jrRemEmp.setText("Remove Emp");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrAddEmp)
                    .addComponent(jrViewEmp)
                    .addComponent(jrEditEmp)
                    .addComponent(jrRemEmp))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jrAddEmp)
                .addGap(18, 18, 18)
                .addComponent(jrViewEmp)
                .addGap(26, 26, 26)
                .addComponent(jrEditEmp)
                .addGap(18, 18, 18)
                .addComponent(jrRemEmp)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jrRegCash.setBackground(new java.awt.Color(0, 153, 153));
        buttonGroup2.add(jrRegCash);
        jrRegCash.setForeground(new java.awt.Color(255, 255, 255));
        jrRegCash.setText("Register Cashier");

        jrRemCash.setBackground(new java.awt.Color(0, 153, 153));
        buttonGroup2.add(jrRemCash);
        jrRemCash.setForeground(new java.awt.Color(255, 255, 255));
        jrRemCash.setText("Remove Cashier");
        jrRemCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrRemCashActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrRemCash)
                    .addComponent(jrRegCash))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jrRegCash)
                .addGap(18, 18, 18)
                .addComponent(jrRemCash)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jrViewOrd.setBackground(new java.awt.Color(0, 153, 153));
        buttonGroup3.add(jrViewOrd);
        jrViewOrd.setForeground(new java.awt.Color(255, 255, 255));
        jrViewOrd.setText("View Orders");
        jrViewOrd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrViewOrdActionPerformed(evt);
            }
        });

        jrViewDate.setBackground(new java.awt.Color(0, 153, 153));
        buttonGroup3.add(jrViewDate);
        jrViewDate.setForeground(new java.awt.Color(255, 255, 255));
        jrViewDate.setText("View DateWise");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrViewOrd)
                    .addComponent(jrViewDate))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jrViewOrd)
                .addGap(18, 18, 18)
                .addComponent(jrViewDate)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(0, 153, 153));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jrAddCat.setBackground(new java.awt.Color(0, 153, 153));
        buttonGroup4.add(jrAddCat);
        jrAddCat.setForeground(new java.awt.Color(255, 255, 255));
        jrAddCat.setText("Add Category");

        jrViewCat.setBackground(new java.awt.Color(0, 153, 153));
        buttonGroup4.add(jrViewCat);
        jrViewCat.setForeground(new java.awt.Color(255, 255, 255));
        jrViewCat.setText("View Category");
        jrViewCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrViewCatActionPerformed(evt);
            }
        });

        jrEditCat.setBackground(new java.awt.Color(0, 153, 153));
        buttonGroup4.add(jrEditCat);
        jrEditCat.setForeground(new java.awt.Color(255, 255, 255));
        jrEditCat.setText("Edit Category");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrAddCat)
                    .addComponent(jrEditCat)
                    .addComponent(jrViewCat))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jrAddCat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrEditCat)
                .addGap(18, 18, 18)
                .addComponent(jrViewCat)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(0, 153, 153));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jrAddPrd.setBackground(new java.awt.Color(0, 153, 153));
        buttonGroup5.add(jrAddPrd);
        jrAddPrd.setForeground(new java.awt.Color(255, 255, 255));
        jrAddPrd.setText("Add Product");

        jrViewPrd.setBackground(new java.awt.Color(0, 153, 153));
        buttonGroup5.add(jrViewPrd);
        jrViewPrd.setForeground(new java.awt.Color(255, 255, 255));
        jrViewPrd.setText("View Product");

        jrEditPrd.setBackground(new java.awt.Color(0, 153, 153));
        buttonGroup5.add(jrEditPrd);
        jrEditPrd.setForeground(new java.awt.Color(255, 255, 255));
        jrEditPrd.setText("Edit Product");
        jrEditPrd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrEditPrdActionPerformed(evt);
            }
        });

        jrRemPrd.setBackground(new java.awt.Color(0, 153, 153));
        buttonGroup5.add(jrRemPrd);
        jrRemPrd.setForeground(new java.awt.Color(255, 255, 255));
        jrRemPrd.setText("Remove Product");
        jrRemPrd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrRemPrdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrRemPrd)
                    .addComponent(jrAddPrd)
                    .addComponent(jrViewPrd)
                    .addComponent(jrEditPrd))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jrAddPrd)
                .addGap(8, 8, 8)
                .addComponent(jrViewPrd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jrEditPrd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrRemPrd)
                .addGap(22, 22, 22))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/theplanetfood/gui/manager.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setBackground(new java.awt.Color(0, 153, 153));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Planet Food Admin Panel");

        jLabel3.setBackground(new java.awt.Color(0, 153, 153));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Make A Choice");

        jLabel5.setBackground(new java.awt.Color(0, 153, 153));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cashier Options");

        jLabel6.setBackground(new java.awt.Color(0, 153, 153));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Report Options");

        jLabel7.setBackground(new java.awt.Color(0, 153, 153));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Category Options");

        jLabel8.setBackground(new java.awt.Color(0, 153, 153));
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Product Options");

        btnBack.setBackground(new java.awt.Color(0, 153, 153));
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnDoTask.setBackground(new java.awt.Color(0, 153, 153));
        btnDoTask.setForeground(new java.awt.Color(255, 255, 255));
        btnDoTask.setText("DoTask");
        btnDoTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoTaskActionPerformed(evt);
            }
        });

        lblLogout.setForeground(new java.awt.Color(255, 255, 255));
        lblLogout.setText("Logout");
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLogoutMouseExited(evt);
            }
        });

        lblUsername.setText("jLabel9");

        jLabel4.setBackground(new java.awt.Color(0, 153, 153));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Emp Options");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(jLabel7)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addComponent(jLabel8))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(jLabel4)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(jLabel5)
                                .addGap(188, 188, 188)
                                .addComponent(jLabel6))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(btnDoTask)
                        .addGap(203, 203, 203)
                        .addComponent(btnBack))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(lblUsername)))
                        .addGap(91, 91, 91)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(162, 162, 162)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                                .addComponent(lblLogout)))))
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblLogout)))
                        .addGap(25, 25, 25)
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblUsername)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnDoTask))
                .addGap(17, 17, 17))
        );

        jPanel2.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrRemCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrRemCashActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrRemCashActionPerformed

    private void jrViewOrdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrViewOrdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrViewOrdActionPerformed

    private void jrEditPrdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrEditPrdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrEditPrdActionPerformed

    private void jrRemPrdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrRemPrdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrRemPrdActionPerformed

    private void jrEditEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrEditEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrEditEmpActionPerformed

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
       LoginFrame loginFrame=new LoginFrame();
       loginFrame.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void lblLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseEntered
              lblLogout.setForeground(Color.white);
    }//GEN-LAST:event_lblLogoutMouseEntered

    private void lblLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseExited
           lblLogout.setForeground(Color.yellow);
    }//GEN-LAST:event_lblLogoutMouseExited

    private void btnDoTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoTaskActionPerformed
String task=getOption();
if(task==null)
{
    JOptionPane.showMessageDialog(null,"Please Choose an Option","Error!",JOptionPane.ERROR_MESSAGE);
}
JFrame jf=null;
if(task.equals("Add Product"))
    jf=new AddProductFrame();
else if(task.equals("Edit Product"))
        {
            jf=new EditProductFrame();
            
        }
else if(task.equals("Remove Product"))
        {
            jf=new RemoveProductFrame();
            
        }
else if(task.equals("View Product"))
        {
            jf=new ViewProductFrame();
            
        }
        else if(task.equals("Register Cashier"))
        {
            jf=new RegisterCashierFrame();
        }
        else if(task.equals("Remove Cashier"))
        {
            jf=new RemoveCashierFrame();
        }
        else if(task.equals("View Orders"))
        {
            jf=new ViewAllOrdersFrame();
        }
        else if(task.equals("View DateWise"))
        {
            jf=new ViewAllDateOrdersFrame();
        }
        else if(task.equals("Add Category"))
        {
            jf=new AddCategoryFrame();
        }
        else if(task.equals("Edit Category"))
        {
            jf=new EditCategoryFrame();
        }
        else if(task.equals("View Category"))
        {
            jf=new ViewAllCategoriesFrame();
        }
        else if(task.equals("Add Emp"))
        {
            jf=new AddEmpFrame();
        }
        else if(task.equals("Edit Emp"))
        {
            jf=new EditEmpFrame();
        }
        else if(task.equals("Remove Emp"))
        {
            jf=new RemoveEmpFrame();
        }
        else if(task.equals("View Emp"))
        {
            jf=new ViewEmpFrame();
        }    

jf.setVisible(true);
this.dispose();
    }//GEN-LAST:event_btnDoTaskActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
       LoginFrame loginFrame=new LoginFrame();
       loginFrame.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void jrViewCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrViewCatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrViewCatActionPerformed

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
            java.util.logging.Logger.getLogger(AdminOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminOptionsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDoTask;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jrAddCat;
    private javax.swing.JRadioButton jrAddEmp;
    private javax.swing.JRadioButton jrAddPrd;
    private javax.swing.JRadioButton jrEditCat;
    private javax.swing.JRadioButton jrEditEmp;
    private javax.swing.JRadioButton jrEditPrd;
    private javax.swing.JRadioButton jrRegCash;
    private javax.swing.JRadioButton jrRemCash;
    private javax.swing.JRadioButton jrRemEmp;
    private javax.swing.JRadioButton jrRemPrd;
    private javax.swing.JRadioButton jrViewCat;
    private javax.swing.JRadioButton jrViewDate;
    private javax.swing.JRadioButton jrViewEmp;
    private javax.swing.JRadioButton jrViewOrd;
    private javax.swing.JRadioButton jrViewPrd;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblUsername;
    // End of variables declaration//GEN-END:variables

public String getOption()
{
    if(jrAddEmp.isSelected())
            return jrAddEmp.getText();
        else if(jrEditEmp.isSelected())
            return jrEditEmp.getText();
        else if(jrEditEmp.isSelected())
            return jrEditEmp.getText();
        else if(jrRemEmp.isSelected())
            return jrRemEmp.getText();
        else if(jrViewEmp.isSelected())
            return jrViewEmp.getText();
        else if(jrViewOrd.isSelected())
             return jrViewOrd.getText();
        else if(jrRegCash.isSelected())
            return jrRegCash.getText();
        else if(jrRemCash.isSelected())
             return jrRemCash.getText();
        else if(jrViewDate.isSelected())
            return jrViewDate.getText();
        else if(jrViewOrd.isSelected())
             return jrViewOrd.getText();
        else if(jrAddCat.isSelected())
             return jrAddCat.getText();
        else if(jrEditCat.isSelected())
            return jrEditCat.getText();
        else if(jrViewCat.isSelected())
             return jrViewCat.getText();
        else if(jrAddPrd.isSelected())
            return jrAddPrd.getText();
    
else if(jrEditPrd.isSelected())
            return jrEditPrd.getText();
else if(jrRemPrd.isSelected())
            return jrRemPrd.getText();
else if(jrViewPrd.isSelected())
return jrViewPrd.getText();
        return null;
}
}