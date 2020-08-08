package parkir;

import javafx.scene.control.CheckBox;

import javax.swing.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class apps extends javax.swing.JFrame {

    public apps() {
        initComponents();
    }
    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        NoKendaraan = new javax.swing.JTextField();
        Motor = new javax.swing.JRadioButton();
        Mobil = new javax.swing.JRadioButton();
        HargaParkir = new javax.swing.JTextField();
        HargaBerikutnya = new javax.swing.JTextField();
        JamMasuk = new javax.swing.JTextField();
        Proses = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        TotalBayar = new javax.swing.JTextField();
        JamKeluar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        ButtonGroup grup = new ButtonGroup();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Bodoni MT Black", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("APLIKASI PARKIR");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setText("No Kendaraan");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setText("Jenis Kendaraan");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel4.setText("Harga Parkir Jam Pertama");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel5.setText("Jam Masuk");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel6.setText("Jam Keluar");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel7.setText("Total Bayar");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel9.setText("Harga Parkir Jam Berikutnya");

        NoKendaraan.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        Motor.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Motor.setText("Motor");
        Motor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MotorActionPerformed(evt);
            }
        });

        Mobil.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Mobil.setText("Mobil");
        Mobil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MobilActionPerformed(evt);
            }
        });

        HargaParkir.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        HargaBerikutnya.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        JamMasuk.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Proses.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Proses.setText("Proses");
        Proses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProsesActionPerformed(evt);
            }
        });

        Clear.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        TotalBayar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N


        grup.add(Motor);
        grup.add(Mobil);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TotalBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(105, 105, 105))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(27, 27, 27)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                .addGap(97, 97, 97)
                                                                .addComponent(NoKendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jLabel4)
                                                                                        .addComponent(jLabel5)
                                                                                        .addComponent(jLabel6)
                                                                                        .addComponent(jLabel7)
                                                                                        .addComponent(jLabel2)
                                                                                        .addComponent(jLabel8)
                                                                                        .addComponent(jLabel9))
                                                                                .addGap(27, 27, 27))
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                .addComponent(jLabel3)
                                                                                .addGap(18, 18, 18)))
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(18, 18, 18)
                                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                                        .addComponent(HargaParkir)
                                                                        .addComponent(HargaBerikutnya)
                                                                        .addComponent(JamMasuk)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(Motor)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(Mobil, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(JamKeluar)))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(103, 103, 103)
                                                .addComponent(Proses)
                                                .addGap(72, 72, 72)
                                                .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(95, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(NoKendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(Motor)
                                        .addComponent(Mobil))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(HargaParkir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel9)
                                        .addComponent(HargaBerikutnya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(JamMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5))
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(JamKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(27, 27, 27)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(Clear)
                                                        .addComponent(Proses))
                                                .addGap(18, 18, 18)
                                                .addComponent(TotalBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel7))
                                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void MobilActionPerformed(java.awt.event.ActionEvent evt) {
// TODO add your handling code here:
        HargaParkir.setText("5000");
        HargaBerikutnya.setText("2000");
    }

    private void MotorActionPerformed(java.awt.event.ActionEvent evt) {
// TODO add your handling code here:
        HargaParkir.setText("2000");
        HargaBerikutnya.setText("1000");
    }

    private void ProsesActionPerformed(java.awt.event.ActionEvent evt) {
// TODO add your handling code here:
        SimpleDateFormat format = new SimpleDateFormat("HH:mm");
        Date d1 = null;
        Date d2 = null;

        try {
            d1 = format.parse(JamMasuk.getText());
            d2 = format.parse(JamKeluar.getText());

//in milliseconds
            long diff = d2.getTime() - d1.getTime();

            long diffSeconds = diff / 1000 % 60;
            long diffMinutes = diff / (60 * 1000) % 60;
            long diffHours = diff / (60 * 60 * 1000) % 24;
            long diffDays = diff / (24 * 60 * 60 * 1000);

            //System.out.print(diffDays + " days, ");
            System.out.print(diffHours + " hours, ");
            //System.out.print(diffMinutes + " minutes, ");
            //System.out.print(diffSeconds + " seconds.");

            int a =Integer.parseInt(HargaParkir.getText());
            int b =Integer.parseInt(String.valueOf(diffHours));
            int c =Integer.parseInt(HargaBerikutnya.getText());
            System.out.print(c);
            int hasilnya = 0;
            if (a==5000) {
                if (b>1){
                    hasilnya = c*(b-1)+a;
                }else{
                    hasilnya = a*b;
                }
            }else{
                if (b>1){
                    hasilnya = c*(b-1)+a;
                }else{
                    hasilnya = a*b;
                }
            }


            TotalBayar.setText(""+hasilnya);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {
// TODO add your handling code here:
        NoKendaraan.setText("");
        JamMasuk.setText("");
        JamKeluar.setText("");
        HargaParkir.setText("");
        HargaBerikutnya.setText("");
        TotalBayar.setText("");

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
            java.util.logging.Logger.getLogger(apps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(apps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(apps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(apps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
//</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new apps().setVisible(true);
            }
        });
    }

    // Variables declaration – do not modify
    private javax.swing.JButton Clear;
    private javax.swing.JTextField HargaParkir;
    private javax.swing.JTextField JamKeluar;
    private javax.swing.JTextField JamMasuk;
    private javax.swing.JRadioButton Mobil;
    private javax.swing.JRadioButton Motor;
    private javax.swing.JTextField NoKendaraan;
    private javax.swing.JButton Proses;
    private javax.swing.JTextField TotalBayar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private JTextField HargaBerikutnya;
    // End of variables declaration
}
