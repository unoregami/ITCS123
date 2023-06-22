/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package LabActivity5;

/**
 *
 * @author student
 */
public class LabActivity51 extends javax.swing.JFrame {

    /**
     * Creates new form LabActivity51
     */
    public LabActivity51() {
        initComponents();
    }

    public static  int sumOfDigits(int input) {
        
        int[] digits = new int[10];
        int a = 1;
        int b = 10;
        int sum = 0;
        
        for (int i = 0; i < 10; i++) {
            digits[i] = (input % b) / a;
            b = b * 10;
            a = a * 10;
            sum += digits[i];
        }
        return sum;
    }
    
    public static int vowelsCounter(String input) {
        int a = 0;
        for (int j = 0; j < input.length(); j++) {
            switch (input.charAt(j)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    a++;
                    break;
                default:
                    break;
            }
        }
        return a;
    }
    
    public static String leapYear(int input) {
        String a = "";
        if (input % 4 == 0) {
            if (input % 100 == 0) {
                if (input % 400 == 0) {
                    a = "It is a Leap Year";
                } else
                    a = "It is NOT a Leap Year";
            } else 
                a = "It is a Leap Year";    
        } else 
            a = "It is NOT a Leap Year";
        return a;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        rbSumOfDigits = new javax.swing.JRadioButton();
        txtSumOfDigits = new javax.swing.JTextField();
        btnEnter = new javax.swing.JButton();
        txtResult = new javax.swing.JTextField();
        rbVowelsCounter = new javax.swing.JRadioButton();
        txtVowelsCounter = new javax.swing.JTextField();
        rbLeapYear = new javax.swing.JRadioButton();
        txtLeapYear = new javax.swing.JTextField();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 500));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 500));

        rbSumOfDigits.setText("Sum Of Digits");
        rbSumOfDigits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSumOfDigitsActionPerformed(evt);
            }
        });

        txtSumOfDigits.setEnabled(false);
        txtSumOfDigits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSumOfDigitsActionPerformed(evt);
            }
        });

        btnEnter.setText("Enter");
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });

        txtResult.setEditable(false);
        txtResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultActionPerformed(evt);
            }
        });

        rbVowelsCounter.setText("Vowels Counter");
        rbVowelsCounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbVowelsCounterActionPerformed(evt);
            }
        });

        txtVowelsCounter.setEnabled(false);

        rbLeapYear.setText("Leap Year Finder");
        rbLeapYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbLeapYearActionPerformed(evt);
            }
        });

        txtLeapYear.setEnabled(false);
        txtLeapYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLeapYearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnter)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(rbSumOfDigits)
                                    .addGap(60, 60, 60))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(rbVowelsCounter)
                                    .addGap(50, 50, 50)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rbLeapYear)
                                .addGap(31, 31, 31)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSumOfDigits)
                            .addComponent(txtVowelsCounter)
                            .addComponent(txtLeapYear, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbSumOfDigits)
                    .addComponent(txtSumOfDigits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbVowelsCounter)
                    .addComponent(txtVowelsCounter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbLeapYear)
                    .addComponent(txtLeapYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                .addComponent(btnEnter)
                .addGap(55, 55, 55)
                .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbSumOfDigitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSumOfDigitsActionPerformed
        // TODO add your handling code here:
        if (rbSumOfDigits.isSelected()){
            txtSumOfDigits.setEnabled(true);
            rbVowelsCounter.setSelected(false);
            txtVowelsCounter.setEnabled(false);
            rbLeapYear.setSelected(false);
            txtLeapYear.setEnabled(false);
        }
        else {
            txtSumOfDigits.setEnabled(false);
        }
    }//GEN-LAST:event_rbSumOfDigitsActionPerformed

    private void txtSumOfDigitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSumOfDigitsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSumOfDigitsActionPerformed

    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed
        // TODO add your handling code here:
        if (rbSumOfDigits.isSelected()){
            int sum = sumOfDigits(Integer.parseInt(txtSumOfDigits.getText()));
            txtResult.setText(Integer.toString(sum));
        }else if (rbVowelsCounter.isSelected()){
            int vowels = vowelsCounter(txtVowelsCounter.getText());
            txtResult.setText(Integer.toString(vowels));
        }else if (rbLeapYear.isSelected()){
            String a = leapYear(Integer.parseInt(txtLeapYear.getText()));
            txtResult.setText(a);
        }
        
    }//GEN-LAST:event_btnEnterActionPerformed

    private void txtResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultActionPerformed

    private void rbVowelsCounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbVowelsCounterActionPerformed
        // TODO add your handling code here:
        if (rbVowelsCounter.isSelected()){
            txtVowelsCounter.setEnabled(true);
            rbSumOfDigits.setSelected(false);
            txtSumOfDigits.setEnabled(false);
            rbLeapYear.setSelected(false);
            txtLeapYear.setEnabled(false);
        }
        else {
            txtVowelsCounter.setEnabled(false);
        }
    }//GEN-LAST:event_rbVowelsCounterActionPerformed

    private void rbLeapYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbLeapYearActionPerformed
        // TODO add your handling code here:
        if (rbLeapYear.isSelected()){
            txtLeapYear.setEnabled(true);
            rbVowelsCounter.setSelected(false);
            txtVowelsCounter.setEnabled(false);
            rbSumOfDigits.setSelected(false);
            txtSumOfDigits.setEnabled(false);
        }
        else {
            txtLeapYear.setEnabled(false);
        }
    }//GEN-LAST:event_rbLeapYearActionPerformed

    private void txtLeapYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLeapYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLeapYearActionPerformed

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
            java.util.logging.Logger.getLogger(LabActivity51.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LabActivity51.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LabActivity51.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LabActivity51.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LabActivity51().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnter;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButton rbLeapYear;
    private javax.swing.JRadioButton rbSumOfDigits;
    private javax.swing.JRadioButton rbVowelsCounter;
    private javax.swing.JTextField txtLeapYear;
    private javax.swing.JTextField txtResult;
    private javax.swing.JTextField txtSumOfDigits;
    private javax.swing.JTextField txtVowelsCounter;
    // End of variables declaration//GEN-END:variables
}
