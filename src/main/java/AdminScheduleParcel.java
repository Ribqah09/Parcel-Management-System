package smartparcelmanagement;

import java.sql.*;
import javax.swing.*;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;
import javax.swing.table.DefaultTableModel;
import java.util.Random;
import javax.swing.JOptionPane;
import java.util.*;
import javax.swing.JTextField;

public class AdminScheduleParcel extends javax.swing.JFrame {

    public AdminScheduleParcel() {
        initComponents();
        setLocation(200,0);
        btnAssign.setEnabled(false);
       // add(new JScrollPane(table));
       

        try {
            Connection c=new Connection();
            ResultSet rs = c.s.executeQuery("SELECT * FROM parcels WHERE  assigned = 'Not Assigned'and status='pending' ORDER BY priority");

            table.setModel(DbUtils.resultSetToTableModel(rs));
            
        } 
        catch (Exception e) {
              JOptionPane.showMessageDialog(null,"Table Exception:"+e);
        }
        try {
            Connection c=new Connection();
            ResultSet rs=c.s.executeQuery("select * from riderlogin");
            table1.setModel(DbUtils.resultSetToTableModel(rs));
        } 
          catch (Exception e) {
              JOptionPane.showMessageDialog(null,"Table Exception:"+e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btnAssign = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        BTNbACK = new javax.swing.JButton();
        txtPID = new javax.swing.JLabel();
        txtRID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ScheduleParcel Window");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(207, 223, 220));

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
        jLabel12.setText("ASSIGN PARCEL TO RIDER");
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

        btnAssign.setText("ASSIGN ");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel1.setText("This Parcel ");

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 22)); // NOI18N
        jLabel2.setText("ASSIGN");

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel3.setText("This Rider");

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 22)); // NOI18N
        jLabel4.setText("TO");

        table.setBackground(new java.awt.Color(189, 208, 194));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        table1.setBackground(new java.awt.Color(189, 208, 194));
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table1);

        jLabel13.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("SELECT PARCEL ");
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel14.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("SELECT RIDER ");
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        BTNbACK.setText("BACK");
        BTNbACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNbACKActionPerformed(evt);
            }
        });

        txtPID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtRID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(382, 382, 382)
                                .addComponent(btnAssign))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(320, 320, 320)
                                .addComponent(jLabel13))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(324, 324, 324)
                                .addComponent(jLabel14))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(255, 255, 255)
                                .addComponent(jLabel12)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 184, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPID, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtRID, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(BTNbACK)))))
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(txtRID)
                            .addComponent(txtPID)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BTNbACK)))
                .addGap(18, 18, 18)
                .addComponent(btnAssign)
                .addGap(33, 33, 33)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(578, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 1230));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
        try{
            Connection conn=new Connection();
            String parcelID=txtPID.getText();
            int riderID=Integer.parseInt(txtRID.getText());
            int selectedIndex = table.getSelectedRow();
            
            String fetchParcelQuery = "SELECT * FROM parcels WHERE id = '" + parcelID + "'"; 
            ResultSet rs = conn.s.executeQuery(fetchParcelQuery);   
            if (rs.next()) {
                String senderName = rs.getString("senderName");
                String senderContact = rs.getString("senderContact");
                String senderAddress = rs.getString("senderAddress");
                String senderEmail = rs.getString("senderEmail");
                String receiverName = rs.getString("receiverName");
                String receiverContact = rs.getString("receiverContact");
                String receiverAddress = rs.getString("receiverAddress");
                String receiverEmail = rs.getString("receiverEmail");
                double weight = rs.getDouble("weight");
                int priority = rs.getInt("priority");
                String city = rs.getString("city");
                String status = rs.getString("status");
                double deliveryCharges = rs.getDouble("DeliveryCharges");
                
                String insertQuery = "INSERT INTO assignedparcels (parcel_id, rider_id, senderName, senderContact, senderAddress, senderEmail, "
                        + "receiverName, receiverContact, receiverAddress, receiverEmail, weight, priority, city, status, DeliveryCharges) "
                        + "VALUES ('" + parcelID + "', " + riderID + ", '" + senderName + "', '" + senderContact + "', '" + senderAddress + "', '" 
                        + senderEmail + "', '" + receiverName + "', '" + receiverContact + "', '" + receiverAddress + "', '" + receiverEmail 
                        + "', " + weight + ", " + priority + ", '" + city + "', '" + status + "',  " + deliveryCharges + ")";

                int rowsInserted = conn.s.executeUpdate(insertQuery);
                

            if (rowsInserted > 0) {
                // Update the assigned column to 'Assigned'
                String updateAssignedQuery = "UPDATE parcels SET assigned = 'Assigned' WHERE id = '" + parcelID + "'";
                int rowsUpdated = conn.s.executeUpdate(updateAssignedQuery);
                
                if (rowsUpdated > 0) {
                    JOptionPane.showMessageDialog(null, "Parcel successfully assigned to Rider!");
                    
                    if (selectedIndex >= 0) { 
                        DefaultTableModel model = (DefaultTableModel) table.getModel();
                        model.removeRow(selectedIndex); // Remove row from JTable
                    } 
                    else {
                        JOptionPane.showMessageDialog(null, "Please select a parcel from the table.", "Selection Error", JOptionPane.ERROR_MESSAGE);
                    }
                    
                    txtPID.setText(" ");
                    txtRID.setText(" ");
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Failed to update parcel status.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Failed to assign parcel.");
            }                
        }      
            
            else 
            {
                JOptionPane.showMessageDialog(null, "Parcel not found!");
            }

            rs.close();
            
        }
        
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Exception in Assigned Button: " + e.getMessage());
        }
        
    }//GEN-LAST:event_btnAssignActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        int selectedIndex = table.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        txtPID.setText(model.getValueAt(selectedIndex, 0).toString());
        enableAssignButtonIfFieldsAreFilled();
    }//GEN-LAST:event_tableMouseClicked

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
        // TODO add your handling code here:
        int selectedIndex = table1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) table1.getModel();
        txtRID.setText(model.getValueAt(selectedIndex, 0).toString());
        enableAssignButtonIfFieldsAreFilled();

    }//GEN-LAST:event_table1MouseClicked

    private void BTNbACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNbACKActionPerformed
        // TODO add your handling code here:
        AdminDashboard u=new AdminDashboard();
        u.setVisible(true);
        dispose();
    }//GEN-LAST:event_BTNbACKActionPerformed

    private void enableAssignButtonIfFieldsAreFilled() {
    // Check if both fields (Parcel ID and Rider ID) are not empty
    if (!txtPID.getText().trim().isEmpty() && !txtRID.getText().trim().isEmpty()) {
        btnAssign.setEnabled(true); // Enable the Assign button
    } else {
        btnAssign.setEnabled(false); // Disable the Assign button
    }
}
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
            java.util.logging.Logger.getLogger(AdminScheduleParcel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminScheduleParcel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminScheduleParcel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminScheduleParcel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminScheduleParcel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNbACK;
    private javax.swing.JButton btnAssign;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table;
    private javax.swing.JTable table1;
    private javax.swing.JLabel txtPID;
    private javax.swing.JLabel txtRID;
    // End of variables declaration//GEN-END:variables
}
