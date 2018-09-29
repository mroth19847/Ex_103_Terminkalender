
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AppointmentGUI extends javax.swing.JFrame {

    private AppointmentModel bl = new AppointmentModel();
    public AppointmentGUI() {
        initComponents();
        AppList.setModel(bl);
        try {
            bl.loadData(new File("./appointments.ser"));
        } catch (Exception ex) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ContextMenu = new javax.swing.JPopupMenu();
        Menu = new javax.swing.JMenu();
        AppAdd = new javax.swing.JMenuItem();
        AppDelete = new javax.swing.JMenuItem();
        AppChange = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        AppList = new javax.swing.JList<>();

        Menu.setText("Termin");

        AppAdd.setText("Hinzufügen");
        AppAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AppAddActionPerformed(evt);
            }
        });
        Menu.add(AppAdd);

        AppDelete.setText("Löschen");
        AppDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AppDeleteActionPerformed(evt);
            }
        });
        Menu.add(AppDelete);

        AppChange.setText("Ändern");
        AppChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AppChangeActionPerformed(evt);
            }
        });
        Menu.add(AppChange);

        ContextMenu.add(Menu);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        AppList.setBorder(javax.swing.BorderFactory.createTitledBorder("Kalender"));
        AppList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        AppList.setComponentPopupMenu(ContextMenu);
        jScrollPane1.setViewportView(AppList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            bl.saveData(new File("./appointments.ser"));
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_formWindowClosing

    private void AppAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AppAddActionPerformed
        AppointmentDlg dlg = new AppointmentDlg(this, true, true);
        dlg.setVisible(true);
        if(dlg.isOk()){
            
        }
    }//GEN-LAST:event_AppAddActionPerformed

    private void AppDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AppDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AppDeleteActionPerformed

    private void AppChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AppChangeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AppChangeActionPerformed

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
            java.util.logging.Logger.getLogger(AppointmentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppointmentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppointmentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppointmentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppointmentGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AppAdd;
    private javax.swing.JMenuItem AppChange;
    private javax.swing.JMenuItem AppDelete;
    private javax.swing.JList<String> AppList;
    private javax.swing.JPopupMenu ContextMenu;
    private javax.swing.JMenu Menu;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
