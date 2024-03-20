
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Reakkidingg_
 */
public class EditData extends javax.swing.JFrame {

    /**
     * Creates new form EditData
     */
    public EditData() {
        initComponents();
    }
//    JTable editData;
//    
//    public EditData(JTable editData) {
//        initComponents();
//        this.editData = editData;
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtEditId = new javax.swing.JTextField();
        txtEditAddress = new javax.swing.JTextField();
        txtEditName = new javax.swing.JTextField();
        txtEditGender = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableEdit = new javax.swing.JTable();
        btnRemove = new java.awt.Button();
        EditBtn = new java.awt.Button();
        btnBack = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtEditId.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtEditId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEditIdKeyTyped(evt);
            }
        });

        txtEditAddress.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        txtEditName.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtEditName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEditNameKeyTyped(evt);
            }
        });

        txtEditGender.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtEditGender.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEditGenderKeyTyped(evt);
            }
        });

        tableEdit.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tableEdit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Gender", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableEdit.setRowHeight(30);
        tableEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableEditMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableEdit);

        btnRemove.setFont(new java.awt.Font("Segoe UI Historic", 0, 16)); // NOI18N
        btnRemove.setLabel("Remove");
        btnRemove.setName(""); // NOI18N
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        EditBtn.setFont(new java.awt.Font("Segoe UI Historic", 0, 16)); // NOI18N
        EditBtn.setLabel("Edit");
        EditBtn.setName(""); // NOI18N
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Segoe UI Historic", 0, 16)); // NOI18N
        btnBack.setLabel("Back");
        btnBack.setName(""); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtEditId, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEditName, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEditGender, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEditAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEditId, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEditName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEditAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEditGender, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRemove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EditBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(44, 44, 44))
        );

        setSize(new java.awt.Dimension(721, 402));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tableEdit.getModel();

        if (tableEdit.getSelectedRowCount() == 1) {
            model.removeRow(tableEdit.getSelectedRow());
            JOptionPane.showMessageDialog(this, "Data has been removed.", "Success", JOptionPane.INFORMATION_MESSAGE);
            // clear textbox when deleted
            txtEditId.setText("");
            txtEditName.setText("");
            txtEditGender.setText("");
            txtEditAddress.setText("");
        } else {
            if (model.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Table is empty!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Please select a row for delete!", "Error", JOptionPane.ERROR_MESSAGE);
            }

        }

    }//GEN-LAST:event_btnRemoveActionPerformed

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = tableEdit.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tableEdit.getModel();

        if (selectedRow >= 0) {
            String newId = txtEditId.getText();
            String newName = txtEditName.getText();
            String newGender = txtEditGender.getText();
            String newAddress = txtEditAddress.getText();

            // Check if any of the fields is empty
            if (newId.isEmpty() || newName.isEmpty() || newGender.isEmpty() || newAddress.isEmpty()) {
                JOptionPane.showMessageDialog(this, "All fields must be filled in.", "Error", JOptionPane.ERROR_MESSAGE);
                return; // Stop further processing
            }

            // Check for duplicate ID
            for (int i = 0; i < model.getRowCount(); i++) {
                if (i != selectedRow && newId.equals(model.getValueAt(i, 0))) {
                    JOptionPane.showMessageDialog(this, "Duplicate ID found. Please use a unique ID.", "Error", JOptionPane.ERROR_MESSAGE);
                    return; // Stop further processing
                }
            }

            // Update the data in the selected row
            model.setValueAt(newId, selectedRow, 0);
            model.setValueAt(newName, selectedRow, 1);
            model.setValueAt(newGender, selectedRow, 2);
            model.setValueAt(newAddress, selectedRow, 3);
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row to edit.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Clear the text fields after updating or if there was an error
        txtEditId.setText("");
        txtEditName.setText("");
        txtEditGender.setText("");
        txtEditAddress.setText("");

    }//GEN-LAST:event_EditBtnActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        TableModel model2 = tableEdit.getModel();

        InforTable frm1 = new InforTable();
        DefaultTableModel model1 = (DefaultTableModel) frm1.table.getModel();

        int columnCount = model2.getColumnCount();
        for (int i = 0; i < model2.getRowCount(); i++) {
            Object[] row = new Object[columnCount];
            for (int j = 0; j < columnCount; j++) {
                row[j] = model2.getValueAt(i, j);
            }
            model1.addRow(row);
        }
        frm1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void tableEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableEditMouseClicked
        // TODO add your handling code here:
        int selectedRow = tableEdit.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tableEdit.getModel();
        txtEditId.setText(model.getValueAt(selectedRow, 0).toString());
        txtEditName.setText(model.getValueAt(selectedRow, 1).toString());
        txtEditGender.setText(model.getValueAt(selectedRow, 2).toString());
        txtEditAddress.setText(model.getValueAt(selectedRow, 3).toString());
    }//GEN-LAST:event_tableEditMouseClicked

    private void txtEditIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEditIdKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtEditIdKeyTyped

    private void txtEditNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEditNameKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        // Allow only non-numeric characters
        if (Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtEditNameKeyTyped

    private void txtEditGenderKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEditGenderKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        // Allow only non-numeric characters
        if (Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtEditGenderKeyTyped

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
            java.util.logging.Logger.getLogger(EditData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditData().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button EditBtn;
    private java.awt.Button btnBack;
    private java.awt.Button btnRemove;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tableEdit;
    private javax.swing.JTextField txtEditAddress;
    private javax.swing.JTextField txtEditGender;
    private javax.swing.JTextField txtEditId;
    private javax.swing.JTextField txtEditName;
    // End of variables declaration//GEN-END:variables
}
