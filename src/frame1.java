
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class frame1 extends javax.swing.JFrame {
String temp = "";
Double tt,bd,hs;
    /**
     * Creates new form frame1
     */
    public frame1() {
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

        BG1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        nm = new javax.swing.JTextField();
        tg = new javax.swing.JTextField();
        bb = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        wom = new javax.swing.JRadioButton();
        man = new javax.swing.JRadioButton();
        Hitung = new javax.swing.JButton();
        cl = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        h1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        hasil = new javax.swing.JTextField();
        saran = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("CEK IDEAL TUBUH");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(131, 11, 165, 22);
        getContentPane().add(nm);
        nm.setBounds(232, 73, 123, 20);
        getContentPane().add(tg);
        tg.setBounds(232, 111, 50, 20);
        getContentPane().add(bb);
        bb.setBounds(232, 149, 50, 20);

        jLabel2.setText("Nama");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 76, 40, 14);

        jLabel3.setText("Tinggi");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 114, 40, 14);

        jLabel4.setText("Berat badan");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 152, 70, 14);

        jLabel5.setText("Jenis Kelamin");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(70, 191, 80, 14);

        BG1.add(wom);
        wom.setText("Perempuan");
        getContentPane().add(wom);
        wom.setBounds(189, 187, 79, 23);

        BG1.add(man);
        man.setText("Laki - laki");
        getContentPane().add(man);
        man.setBounds(286, 187, 80, 23);

        Hitung.setText("Hitung");
        Hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HitungActionPerformed(evt);
            }
        });
        getContentPane().add(Hitung);
        Hitung.setBounds(70, 228, 80, 23);

        cl.setText("Coba lagi");
        cl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clActionPerformed(evt);
            }
        });
        getContentPane().add(cl);
        cl.setBounds(173, 228, 77, 23);

        jButton3.setText("keluar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(268, 228, 80, 23);

        jLabel6.setText("Berat badan ideal anda adalah");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(70, 303, 146, 14);
        getContentPane().add(h1);
        h1.setBounds(258, 300, 50, 20);

        jLabel7.setText("Hasil Diagnosa Kesehatan");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(137, 331, 123, 14);
        getContentPane().add(hasil);
        hasil.setBounds(70, 363, 268, 20);
        getContentPane().add(saran);
        saran.setBounds(70, 401, 268, 20);

        jLabel8.setText("cm");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(286, 114, 20, 14);

        jLabel9.setText("kg");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(286, 152, 20, 14);

        jLabel10.setText("kg");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(312, 303, 11, 14);

        jPanel1.setForeground(new java.awt.Color(0, 153, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 410, 480);

        setBounds(0, 0, 424, 518);
    }// </editor-fold>//GEN-END:initComponents

    private void clActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clActionPerformed
        // TODO add your handling code here:
        nm.setText("");
        tg.setText("");
        bb.setText("");
        h1.setText("");
        hasil.setText("");
        saran.setText("");
        BG1.clearSelection();
        
    }//GEN-LAST:event_clActionPerformed

    private void HitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HitungActionPerformed
        // TODO add your handling code here:
        
       if (nm.getText().equals("") || bb.getText().equals("")||tg.getText().equals(""))
               { JOptionPane.showMessageDialog(null, "Kotak Isian Harus diisi semua");               
               }else if (wom.isSelected()||man.isSelected()){
                   try{
                       Proses();
                   }catch (Exception e){
                       JOptionPane.showMessageDialog(null,"Masukkan anda yang salah");
                   }
               }else {
                   JOptionPane.showMessageDialog(null,"RadioButton harus dipilihh");
               }
       
    }//GEN-LAST:event_HitungActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BG1;
    private javax.swing.JButton Hitung;
    private javax.swing.JTextField bb;
    private javax.swing.JButton cl;
    private javax.swing.JTextField h1;
    private javax.swing.JTextField hasil;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton man;
    private javax.swing.JTextField nm;
    private javax.swing.JTextField saran;
    private javax.swing.JTextField tg;
    private javax.swing.JRadioButton wom;
    // End of variables declaration//GEN-END:variables

    private void Proses() {
       tt = Double.parseDouble(tg.getText());
       bd = Double.parseDouble(bb.getText());

       if (wom.isSelected()) {
           hs = (tt - 100) * 1;
       } else if (man.isSelected())
               {
                   hs = (tt - 104) * 1;
               }
       temp = Double.toString(hs.intValue());
       
       if (hs < bd) {
           h1.setText(temp);
           hasil.setText("Maaf " + nm.getText() + " , Sepertinya anda Overweight");
           saran.setText("Banyaklah berolahraga dan hindari makanan berkolestrol tinggi");
       } else if (hs > bd) {
           h1.setText(temp);
           hasil.setText("Maaf " + nm.getText() +" , Sepertinya anda Underweight");
           saran.setText("Banyaklah mengkonsumsi makanan berkabohidrat");
       } else {
           h1.setText(temp);
           hasil.setText("Hallo " + nm.getText() + " , Berat badan anda sudah ideal");
           saran.setText("Lanjutkan pola makan teratur dan gaya hidup sehat");
       }
    }
}
