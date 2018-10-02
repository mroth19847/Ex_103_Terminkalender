
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class CalenderGUI extends javax.swing.JFrame {

    private ArrayList<DayInCal> days = new ArrayList<>();
    private AppointmentModel bl = new AppointmentModel();
    
    public CalenderGUI(AppointmentModel bl) {
        initComponents();
        this.bl = bl;
        lbmonth.setText(""+LocalDate.now().getMonth());
    }
    
    private void fillList(){
        LocalDate start = LocalDate.of(LocalDate.now().getYear(),LocalDate.now().getMonth(),1);
        int x = 0,y = 0;
        while(!start.getMonth().equals(LocalDate.now().getMonth())){
            days.add(new DayInCal());
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

        lbup.setText("->");

        lbmonth.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbmonth.setText("jLabel1");

        GraphicsPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

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
                .addComponent(lbmonth, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbback, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbup, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbmonth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(GraphicsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void paint(Graphics grphcs) {
        super.paint(grphcs);
        Graphics2D g = (Graphics2D) GraphicsPanel.getGraphics();
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel GraphicsPanel;
    private javax.swing.JButton lbback;
    private javax.swing.JLabel lbmonth;
    private javax.swing.JButton lbup;
    // End of variables declaration//GEN-END:variables
}
