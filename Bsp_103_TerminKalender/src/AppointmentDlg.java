/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mroth
 */
public class AppointmentDlg extends javax.swing.JDialog {

    /**
     * Creates new form AppointmentDlg
     */
    public AppointmentDlg(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfday = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfmonth = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfyear = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfhour = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfminute = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tftext = new javax.swing.JTextField();
        btok = new javax.swing.JButton();
        btdeny = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(7, 2));

        jLabel1.setText("Tag:");
        jPanel1.add(jLabel1);
        jPanel1.add(tfday);

        jLabel2.setText("Monat:");
        jPanel1.add(jLabel2);
        jPanel1.add(tfmonth);

        jLabel3.setText("Jahr:");
        jPanel1.add(jLabel3);
        jPanel1.add(tfyear);

        jLabel4.setText("Stunde:");
        jPanel1.add(jLabel4);
        jPanel1.add(tfhour);

        jLabel5.setText("Minute:");
        jPanel1.add(jLabel5);
        jPanel1.add(tfminute);

        jLabel6.setText("Text:");
        jPanel1.add(jLabel6);
        jPanel1.add(tftext);

        btok.setText("Übernehmen");
        jPanel1.add(btok);

        btdeny.setText("Abbrechen");
        jPanel1.add(btdeny);

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btdeny;
    private javax.swing.JButton btok;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfday;
    private javax.swing.JTextField tfhour;
    private javax.swing.JTextField tfminute;
    private javax.swing.JTextField tfmonth;
    private javax.swing.JTextField tftext;
    private javax.swing.JTextField tfyear;
    // End of variables declaration//GEN-END:variables
}
