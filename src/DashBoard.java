import algos.*;
import javax.swing.JOptionPane;

/**
 *
 * @author perun
 */
public class DashBoard extends javax.swing.JFrame {

    public DashBoard() {
        initComponents();
    }
    OneTimePad pad = new OneTimePad();
    Baconian k = new Baconian();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lblOne = new javax.swing.JLabel();
        tfPlain = new javax.swing.JTextField();
        btnSwap = new javax.swing.JButton();
        depth = new javax.swing.JTextField();
        lblTwo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taCipher = new javax.swing.JTextArea();
        btnEncrypt = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblTwo1 = new javax.swing.JLabel();
        lblOne1 = new javax.swing.JLabel();
        tfPlain1 = new javax.swing.JTextField();
        btnSwap1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        taCipher1 = new javax.swing.JTextArea();
        depth1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 51));
        setMaximumSize(new java.awt.Dimension(300, 400));
        setMinimumSize(new java.awt.Dimension(300, 400));
        setUndecorated(true);
        setResizable(false);

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setFont(new java.awt.Font("Ubuntu Mono", 3, 15)); // NOI18N
        jTabbedPane1.setOpaque(true);

        lblOne.setText("enter plain text");

        tfPlain.setToolTipText("enter the plain text");

        btnSwap.setText("<swap>");
        btnSwap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSwapActionPerformed(evt);
            }
        });

        depth.setToolTipText("enter the key here");

        lblTwo.setText("key length");

        taCipher.setColumns(20);
        taCipher.setRows(5);
        taCipher.setToolTipText("cipher text");
        jScrollPane1.setViewportView(taCipher);

        btnEncrypt.setText("encrypt");
        btnEncrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncryptActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(btnEncrypt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSwap)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(lblOne)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblTwo)
                                .addGap(30, 30, 30)
                                .addComponent(depth, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tfPlain))))
                .addGap(118, 118, 118))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(depth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTwo))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPlain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOne))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSwap)
                    .addComponent(btnEncrypt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("One Time Pad", jPanel1);

        lblTwo1.setText("depth");

        lblOne1.setText("enter plain text");

        tfPlain1.setToolTipText("enter the plain text");
        tfPlain1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfPlain1KeyReleased(evt);
            }
        });

        btnSwap1.setText("<swap>");
        btnSwap1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSwap1ActionPerformed(evt);
            }
        });

        taCipher1.setColumns(20);
        taCipher1.setRows(5);
        taCipher1.setToolTipText("cipher text");
        jScrollPane2.setViewportView(taCipher1);

        depth1.setToolTipText("enter the key here");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSwap1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblTwo1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(depth1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblOne1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPlain1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(63, 63, 63))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(depth1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTwo1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPlain1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOne1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSwap1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Baconian", jPanel2);

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setForeground(new java.awt.Color(204, 0, 0));
        jButton1.setText("EXIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(153, 153, 255));
        jLabel1.setText("PROGRAM TO ENCRYPT AND DECRYPT");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(90, 90, 90)
                .addComponent(jLabel1))
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSwapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSwapActionPerformed
        if(status == false){
            status = true;
            lblOne.setText("enter cipher");
            lblTwo.setText("key");
            btnEncrypt.setText("decrypt");
        }else{
            status = false;
            lblOne.setText("enter plain text");
            lblTwo.setText("key length");
            btnEncrypt.setText("encrypt");
        }
    }//GEN-LAST:event_btnSwapActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tfPlain1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPlain1KeyReleased
        
        try{
            if(status){
                taCipher1.setText(k.encrypt(tfPlain1.getText(), Integer.parseInt(depth1.getText())));
            }else{
                taCipher1.setText(k.decrypt(tfPlain1.getText(), Integer.parseInt(depth1.getText())));
            }
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"exception has occured","error", 0);
        }
            
    }//GEN-LAST:event_tfPlain1KeyReleased

    private void btnSwap1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSwap1ActionPerformed
        if(status == false){
            status = true;
            lblOne1.setText("enter cipher");
        }else{
            status = false;
            lblOne1.setText("enter plain text");
        }
    }//GEN-LAST:event_btnSwap1ActionPerformed

    private void btnEncryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncryptActionPerformed
        
        try{
            if(status){
                taCipher.setText(pad.decrypt(tfPlain.getText(), depth.getText()));
            }else{
            
            String[] arg = pad.encrypt(tfPlain.getText(), Integer.valueOf(depth.getText()));
            taCipher.setText("auto generated key : " + arg[1]+"\n##############"
                    + "############"+"\ncipher="+arg[0]);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnEncryptActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashBoard().setVisible(true);
            }
        });
    }

    boolean status = false;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEncrypt;
    private javax.swing.JButton btnSwap;
    private javax.swing.JButton btnSwap1;
    private javax.swing.JTextField depth;
    private javax.swing.JTextField depth1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblOne;
    private javax.swing.JLabel lblOne1;
    private javax.swing.JLabel lblTwo;
    private javax.swing.JLabel lblTwo1;
    private javax.swing.JTextArea taCipher;
    private javax.swing.JTextArea taCipher1;
    private javax.swing.JTextField tfPlain;
    private javax.swing.JTextField tfPlain1;
    // End of variables declaration//GEN-END:variables
}
