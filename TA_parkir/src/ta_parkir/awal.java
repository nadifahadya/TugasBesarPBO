package ta_parkir;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class awal extends javax.swing.JFrame {
    
    public awal() {
        initComponents();
        JFrame frame = new JFrame();
        frame.setUndecorated(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnParkir = new javax.swing.JMenu();
        mnKeluar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Manajemen Parkir");
        setMinimumSize(new java.awt.Dimension(598, 662));
        setPreferredSize(new java.awt.Dimension(598, 662));
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Cover.png"))); // NOI18N
        jLabel1.setIconTextGap(0);

        mnParkir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Traffic Jam-64.png"))); // NOI18N
        mnParkir.setText("Parkir");
        mnParkir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mnParkirMousePressed(evt);
            }
        });
        jMenuBar1.add(mnParkir);

        mnKeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Exit-64.png"))); // NOI18N
        mnKeluar.setText("Keluar");
        mnKeluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mnKeluarMousePressed(evt);
            }
        });
        jMenuBar1.add(mnKeluar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnKeluarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnKeluarMousePressed
        Object[] options = {"Ya", "Tidak, tetap di halaman"};
        int dialog = JOptionPane.showOptionDialog(this, "Apakah Anda yakin akan Keluar?", "Konfirmasi Keluar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (dialog == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_mnKeluarMousePressed

    private void mnParkirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnParkirMousePressed
        new fParkir(this,true).setVisible(true);
    }//GEN-LAST:event_mnParkirMousePressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new awal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mnKeluar;
    private javax.swing.JMenu mnParkir;
    // End of variables declaration//GEN-END:variables
}
