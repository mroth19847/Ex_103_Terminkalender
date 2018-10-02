
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class CalenderGUI extends javax.swing.JFrame {

    private ArrayList<DayInCal> days = new ArrayList<>();
    private AppointmentModel bl = new AppointmentModel();
    private Month current;

    public CalenderGUI(AppointmentModel bl) {
        initComponents();
        this.bl = bl;
        lbmonth.setText("" + LocalDate.now().getMonth());
        current = LocalDate.now().getMonth();
        fillList(current);
    }

    private void fillList(Month m) {
        LocalDate start = LocalDate.of(LocalDate.now().getYear(), m, 1);
        int x = 0, y = 0;
        while (start.getMonth().equals(m)) {
            days.add(new DayInCal(start, x, y));
            if (x == 600) {
                x = 0;
                y += 100;
            } else {
                x += 100;
            }
            start = start.plusDays(1);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbback = new javax.swing.JButton();
        lbup = new javax.swing.JButton();
        lbmonth = new javax.swing.JLabel();
        GraphicsPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbback.setText("<-");
        lbback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbbackActionPerformed(evt);
            }
        });

        lbup.setText("->");
        lbup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbupActionPerformed(evt);
            }
        });

        lbmonth.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbmonth.setText("jLabel1");

        javax.swing.GroupLayout GraphicsPanelLayout = new javax.swing.GroupLayout(GraphicsPanel);
        GraphicsPanel.setLayout(GraphicsPanelLayout);
        GraphicsPanelLayout.setHorizontalGroup(
            GraphicsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        GraphicsPanelLayout.setVerticalGroup(
            GraphicsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbback)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbmonth, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbup))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GraphicsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbmonth, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbback, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbup, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(GraphicsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbbackActionPerformed
        current = current.plus(-1);
        fillList(current);
        lbmonth.setText(""+current);
        repaint();
    }//GEN-LAST:event_lbbackActionPerformed

    private void lbupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbupActionPerformed
        current = current.plus(1);
        fillList(current);
        lbmonth.setText(""+current);
        repaint();
    }//GEN-LAST:event_lbupActionPerformed

    @Override
    public void paint(Graphics grphcs) {
        super.paint(grphcs);
        Graphics2D g = (Graphics2D) GraphicsPanel.getGraphics();
        for (DayInCal day : days) {
            day.draw(g);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel GraphicsPanel;
    private javax.swing.JButton lbback;
    private javax.swing.JLabel lbmonth;
    private javax.swing.JButton lbup;
    // End of variables declaration//GEN-END:variables
}
