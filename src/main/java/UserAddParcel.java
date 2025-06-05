package smartparcelmanagement;

import java.util.Random;
import javax.swing.JOptionPane;
import java.util.*;
import javax.swing.JTextField;


public class UserAddParcel extends javax.swing.JFrame {

    Random ran=new Random();
    int number=ran.nextInt(99999);
    public UserAddParcel() {
        initComponents();
        txtParcelID.setText("" + number);
        setLocation(250,0);
        txtadd.setEnabled(false);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtParcelID = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtCn = new javax.swing.JTextField();
        txtmail = new javax.swing.JTextField();
        spweight = new javax.swing.JSpinner();
        cbpriority = new javax.swing.JComboBox<>();
        cbCity = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAdd = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        txtp = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtName1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtCn1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtmail1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAdd1 = new javax.swing.JTextArea();
        btncal = new javax.swing.JButton();
        txtadd = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(207, 223, 220));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SEND PARCEL");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel3.setBackground(new java.awt.Color(207, 223, 220));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(207, 223, 220));

        jPanel4.setBackground(new java.awt.Color(207, 223, 220));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        jLabel12.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("SEND PARCEL");
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel6.setBackground(new java.awt.Color(207, 223, 220));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(189, 208, 194));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Your Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 2, 18))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Parcel ID :");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Address(From Karachi Only) :");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Contact Number :");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("E-mail :");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Parcel's Weight :");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Priority :");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("City To Deliver:");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setText("Name :");

        txtParcelID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        cbpriority.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----------", "within 24 hours", "within 1-2 days", "within 3-4 days", " ", " ", " ", " " }));

        cbCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Karachi", "Hyderabad", "Sukkur", "Lahore", "Islamabad", "Multan", "Peshawar", "Quetta", " " }));

        txtAdd.setColumns(20);
        txtAdd.setRows(5);
        jScrollPane1.setViewportView(txtAdd);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("Delivery Charges :");

        txtp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel15)
                    .addComponent(jLabel13))
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtName)
                    .addComponent(txtCn)
                    .addComponent(txtmail)
                    .addComponent(txtParcelID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spweight)
                    .addComponent(cbpriority, 0, 172, Short.MAX_VALUE)
                    .addComponent(cbCity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(78, 78, 78)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtp, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtParcelID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9))
                    .addComponent(jLabel18))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(txtCn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(spweight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(cbpriority, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txtp, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(cbCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        jPanel7.setBackground(new java.awt.Color(189, 208, 194));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Receiver's Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 2, 18))); // NOI18N

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel21.setText("E-mail :");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel22.setText("Address :");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setText("Contact NO :");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setText("Name :");

        txtAdd1.setColumns(20);
        txtAdd1.setRows(5);
        jScrollPane2.setViewportView(txtAdd1);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtName1, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                    .addComponent(txtCn1)
                    .addComponent(txtmail1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtCn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtmail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btncal.setText("CALCULATE");
        btncal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalActionPerformed(evt);
            }
        });

        txtadd.setText("ADD");
        txtadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaddActionPerformed(evt);
            }
        });

        btnclear.setText("CLEAR");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });

        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(jLabel12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btncal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtadd, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnclear, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(165, 165, 165))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(8, 8, 8)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncal)
                    .addComponent(txtadd)
                    .addComponent(btnclear)
                    .addComponent(jButton1))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaddActionPerformed
       // TODO add your handling code here:
      PriorityQueue<Parcel> priorityQueue = new PriorityQueue<>((p1, p2) -> Integer.compare(p1.getPriority(), p2.getPriority()));
      LinkedList<Parcel> fifoQueue = new LinkedList<>();

        try{
           String senderName = txtName.getText();
           String senderContact = txtCn.getText();
           String senderAddress = txtAdd.getText();
           String senderEmail = txtmail.getText();
           
           String receiverName = txtName1.getText();
           String receiverContact = txtCn1.getText();
           String receiverAddress = txtAdd1.getText();
           String receiverEmail = txtmail1.getText();
           
           double weight = ((Number) spweight.getValue()).doubleValue();
           String priority = (String) cbpriority.getSelectedItem();
           String city = (String) cbCity.getSelectedItem();
           String id = txtParcelID.getText();
           
           String text = txtp.getText();
           double price = Double.parseDouble(text);
           
           if (senderName.isEmpty() || senderContact.isEmpty() || senderAddress.isEmpty() || senderEmail.isEmpty() ||
                receiverName.isEmpty() || receiverContact.isEmpty() || receiverAddress.isEmpty() || receiverEmail.isEmpty() ||
                city == null || city.isEmpty() || priority == null || priority.isEmpty()) {
                JOptionPane.showMessageDialog(null, "All fields must be filled!", "Validation Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
     
           if (!senderContact.matches("\\d{11}")) {
                JOptionPane.showMessageDialog(null, "Sender's contact number must be exactly 11 digits.", "Validation Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
           if (!receiverContact.matches("\\d{11}")) {
                JOptionPane.showMessageDialog(null, "Receiver's contact number must be exactly 11 digits.", "Validation Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        
           if (!senderEmail.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$")) {
                JOptionPane.showMessageDialog(null, "Invalid sender email format.", "Validation Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
           if (!receiverEmail.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$")) {
                JOptionPane.showMessageDialog(null, "Invalid receiver email format.", "Validation Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

           
           if (weight <= 0) {
                JOptionPane.showMessageDialog(null, "Parcel weight must be greater than 0.", "Validation Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

           int priorityValue;
           if ("within 24 hours".equalsIgnoreCase(priority)) {
                priorityValue = 1; 
            } 
           else if ("within 1-2 days".equalsIgnoreCase(priority)) {
                priorityValue = 2; 
            } 
           else if ("within 3-4 days".equalsIgnoreCase(priority)) {
                priorityValue = 3; 
            } 
           else {
                priorityValue = 4; 
            }
        
           Parcel parcel = new Parcel(id, senderName, senderContact, senderAddress, senderEmail,receiverName, receiverContact, receiverAddress, receiverEmail,weight, priorityValue,city);

           if (priorityValue == 4) {
                fifoQueue.add(parcel); 
                JOptionPane.showMessageDialog(null,"Parcel added to Queue.");
            } 
           else {
                priorityQueue.add(parcel); 
                JOptionPane.showMessageDialog(null,"Parcel added to PriorityQueue with priority: " + priorityValue);
            }

            Connection conn=new Connection();
            int userId = UserLogin.loggedInUserId; 
            if (userId == 0) {
                JOptionPane.showMessageDialog(null, "No user is logged in. Please log in to add a parcel.");
                UserLogin l=new UserLogin();
                l.setVisible(true);
                return;
                            
            }
//            while (!fifoQueue.isEmpty()) {
//                 
//                Parcel fifoParcel = fifoQueue.poll(); // Remove parcel from the queue
//                String query = "INSERT INTO parcels VALUES ('" + fifoParcel.getId() + "', '" + fifoParcel.getSenderName() + "', '" +
//                fifoParcel.getSenderContact() + "', '" + fifoParcel.getSenderAddress() + "', '" +
//                fifoParcel.getSenderEmail() + "', '" + fifoParcel.getReceiverName() + "', '" +
//                fifoParcel.getReceiverContact() + "', '" + fifoParcel.getReceiverAddress() + "', '" +
//                fifoParcel.getReceiverEmail() + "', '" + fifoParcel.getWeight() + "', '" +
//                fifoParcel.getPriority() + "', '" + fifoParcel.getCity() + "', 'pending', '" + userId + "', '" + price + "','Not Assigned')";
//                conn.s.executeUpdate(query);
//                
//            }
//
//            while (!priorityQueue.isEmpty()) {
//                Parcel priorityParcel = priorityQueue.poll(); // Remove parcel from the priority queue
//                String query = "INSERT INTO parcels VALUES ('" + priorityParcel.getId() + "', '" + priorityParcel.getSenderName() + "', '" +
//                priorityParcel.getSenderContact() + "', '" + priorityParcel.getSenderAddress() + "', '" +
//                priorityParcel.getSenderEmail() + "', '" + priorityParcel.getReceiverName() + "', '" +
//                priorityParcel.getReceiverContact() + "', '" + priorityParcel.getReceiverAddress() + "', '" +
//                priorityParcel.getReceiverEmail() + "', '" + priorityParcel.getWeight() + "', '" +
//                priorityParcel.getPriority() + "', '" + priorityParcel.getCity() + "', 'pending', '" + userId + "', '" + price + "','Not Assigned')";
//                conn.s.executeUpdate(query);
//   
//            }
             while (!fifoQueue.isEmpty()) {
    Parcel fifoParcel = fifoQueue.poll(); // Remove parcel from the queue

    String query = "INSERT INTO parcels (id, senderName, senderContact, senderAddress, senderEmail, " +
        "receiverName, receiverContact, receiverAddress, receiverEmail, weight, priority, city, status, " +
        "user_id, DeliveryCharges, assigned, assigned_time, expire_time,deliverd_time) VALUES ('" + 
        fifoParcel.getId() + "', '" + fifoParcel.getSenderName() + "', '" + fifoParcel.getSenderContact() + "', '" +
        fifoParcel.getSenderAddress() + "', '" + fifoParcel.getSenderEmail() + "', '" + fifoParcel.getReceiverName() +
        "', '" + fifoParcel.getReceiverContact() + "', '" + fifoParcel.getReceiverAddress() + "', '" +
        fifoParcel.getReceiverEmail() + "', " + fifoParcel.getWeight() + ", " + fifoParcel.getPriority() + ", '" +
        fifoParcel.getCity() + "', 'pending', " + userId + ", " + price + ", 'Not Assigned', CURRENT_TIMESTAMP, " +
        "CASE " +
        "WHEN " + fifoParcel.getPriority() + " = 1 THEN DATE_ADD(CURRENT_TIMESTAMP, INTERVAL 1 DAY) " +
        "WHEN " + fifoParcel.getPriority() + " = 2 THEN DATE_ADD(CURRENT_TIMESTAMP, INTERVAL 2 DAY) " +
        "WHEN " + fifoParcel.getPriority() + " = 3 THEN DATE_ADD(CURRENT_TIMESTAMP, INTERVAL 4 DAY) " +
        "ELSE DATE_ADD(CURRENT_TIMESTAMP, INTERVAL 7 DAY) " +
        "END, NULL)";

    conn.s.executeUpdate(query);
}

             while (!priorityQueue.isEmpty()) {
                  Parcel priorityParcel = priorityQueue.poll(); // Remove parcel from the priority queue
                  String query = "INSERT INTO parcels (id, senderName, senderContact, senderAddress, senderEmail, " +
        "receiverName, receiverContact, receiverAddress, receiverEmail, weight, priority, city, status, " +
        "user_id, DeliveryCharges, assigned, assigned_time,expire_time, delivered_time) VALUES ('" + 
        priorityParcel.getId() + "', '" + priorityParcel.getSenderName() + "', '" + priorityParcel.getSenderContact() + "', '" +
        priorityParcel.getSenderAddress() + "', '" + priorityParcel.getSenderEmail() + "', '" + priorityParcel.getReceiverName() +
        "', '" + priorityParcel.getReceiverContact() + "', '" + priorityParcel.getReceiverAddress() + "', '" +
        priorityParcel.getReceiverEmail() + "', " + priorityParcel.getWeight() + ", " + priorityParcel.getPriority() + ", '" +
        priorityParcel.getCity() + "', 'pending', " + userId + ", " + price + ", 'Not Assigned', CURRENT_TIMESTAMP, " +
        "CASE " +
        "WHEN " + priorityParcel.getPriority() + " = 1 THEN DATE_ADD(CURRENT_TIMESTAMP, INTERVAL 1 DAY) " +
        "WHEN " + priorityParcel.getPriority() + " = 2 THEN DATE_ADD(CURRENT_TIMESTAMP, INTERVAL 2 DAY) " +
        "WHEN " + priorityParcel.getPriority() + " = 3 THEN DATE_ADD(CURRENT_TIMESTAMP, INTERVAL 4 DAY) " +
        "ELSE DATE_ADD(CURRENT_TIMESTAMP, INTERVAL 7 DAY) " +
        "END, NULL)";

    conn.s.executeUpdate(query);
}

        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Add Button Exception:"+e);
        }
        UserThankYou h=new  UserThankYou();
        h.setVisible(true);
        dispose();

    }//GEN-LAST:event_txtaddActionPerformed

    private void btncalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalActionPerformed
        // TODO add your handling code here:
        try {   
            String senderAddress = txtAdd.getText();
            double weight = ((Number) spweight.getValue()).doubleValue();
            String priority = (String) cbpriority.getSelectedItem();
            String city = (String) cbCity.getSelectedItem();

            if (senderAddress.isEmpty() || city == null || priority == null || weight <= 0) {
                JOptionPane.showMessageDialog(null, "Please fill all required fields and ensure weight is greater than 0.", "Validation Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        
            int priorityValue;
            if ("within 24 hours".equalsIgnoreCase(priority)) {
                priorityValue = 1; 
            } 
            else if ("within 1-2 days".equalsIgnoreCase(priority)) {
                priorityValue = 2; 
            } 
            else if ("within 3-4 days".equalsIgnoreCase(priority)) {
                priorityValue = 3;
            } 
            else {
                priorityValue = 4; 
            }

            Parcel parcel = new Parcel(
            "ID", "TEMP_SENDER", "TEMP_CONTACT", "senderAddress", "TEMP_EMAIL",
            "TEMP_RECEIVER", "TEMP_RECEIVER_CONTACT", "TEMP_RECEIVER_ADDRESS", "TEMP_RECEIVER_EMAIL",
            weight, priorityValue, city
            );
            double calculatedPrice = parcel.calculatePrice();
            txtp.setText(String.valueOf(calculatedPrice));
            JOptionPane.showMessageDialog(null, "The delivery charges for this parcel is: " + calculatedPrice + " PKR.");
       } 
       catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An error occurred during price calculation: " + e.getMessage());
        }
       txtadd.setEnabled(true);        
    }//GEN-LAST:event_btncalActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        // TODO add your handling code here:
        txtName.setText("");
        txtCn.setText("");
        txtAdd.setText("");
        txtmail.setText("");
        txtName1.setText("");
        txtCn1.setText("");
        txtAdd1.setText("");
        txtmail1.setText("");
        spweight.setValue(0);
        cbpriority.setSelectedIndex(0);
        cbCity.setSelectedIndex(0);
        txtp.setText("");
    }//GEN-LAST:event_btnclearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        UserDashboard u=new UserDashboard();
        u.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(UserAddParcel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserAddParcel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserAddParcel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserAddParcel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserAddParcel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncal;
    private javax.swing.JButton btnclear;
    private javax.swing.JComboBox<String> cbCity;
    private javax.swing.JComboBox<String> cbpriority;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner spweight;
    private javax.swing.JTextArea txtAdd;
    private javax.swing.JTextArea txtAdd1;
    private javax.swing.JTextField txtCn;
    private javax.swing.JTextField txtCn1;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtName1;
    private javax.swing.JLabel txtParcelID;
    private javax.swing.JButton txtadd;
    private javax.swing.JTextField txtmail;
    private javax.swing.JTextField txtmail1;
    private javax.swing.JLabel txtp;
    // End of variables declaration//GEN-END:variables
}
