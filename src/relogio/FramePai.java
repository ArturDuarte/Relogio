/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package relogio;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public final class FramePai extends javax.swing.JDialog {

    private final Icon um, dois, tres, quatro, cinco, seis, sete, oito, nove, zero;
    private final Icon ums, doiss, tress, quatros, cincos, seiss, setes, oitos, noves, zeros;
    private final Icon[] vetIcon;
    private final Icon[] vetIconSeg;
    private String horas;
    private String semana;
    private String dia;
    private String mes;
    private String ano;
    public FramePai() {
        
        //jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Titulo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 70, 214)));
       // jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
       // jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        um = new ImageIcon(getClass().getResource("/Imagens/Num-1-50x102.png"));
        dois = new ImageIcon(getClass().getResource("/Imagens/Num-2-50x102.png"));
        tres = new ImageIcon(getClass().getResource("/Imagens/Num-3-50x102.png"));
        quatro = new ImageIcon(getClass().getResource("/Imagens/Num-4-50x102.png"));
        cinco = new ImageIcon(getClass().getResource("/Imagens/Num-5-50x102.png"));
        seis = new ImageIcon(getClass().getResource("/Imagens/Num-6-50x102.png"));
        sete = new ImageIcon(getClass().getResource("/Imagens/Num-7-50x102.png"));
        oito = new ImageIcon(getClass().getResource("/Imagens/Num-8-50x102.png"));
        nove = new ImageIcon(getClass().getResource("/Imagens/Num-9-50x102.png"));
        zero = new ImageIcon(getClass().getResource("/Imagens/Num-0-50x102.png"));
        
        ums = new ImageIcon(getClass().getResource("/Imagens/Num-1-16x30.png"));
        doiss = new ImageIcon(getClass().getResource("/Imagens/Num-2-16x30.png"));
        tress = new ImageIcon(getClass().getResource("/Imagens/Num-3-16x30.png"));
        quatros = new ImageIcon(getClass().getResource("/Imagens/Num-4-16x30.png"));
        cincos = new ImageIcon(getClass().getResource("/Imagens/Num-5-16x30.png"));
        seiss = new ImageIcon(getClass().getResource("/Imagens/Num-6-16x30.png"));
        setes = new ImageIcon(getClass().getResource("/Imagens/Num-7-16x30.png"));
        oitos = new ImageIcon(getClass().getResource("/Imagens/Num-8-16x30.png"));
        noves = new ImageIcon(getClass().getResource("/Imagens/Num-9-16x30.png"));
        zeros = new ImageIcon(getClass().getResource("/Imagens/Num-0-16x30.png"));

        vetIcon = new Icon[10];       
        vetIcon[0] = zero;
        vetIcon[1] = um;
        vetIcon[2] = dois;
        vetIcon[3] = tres;
        vetIcon[4] = quatro;
        vetIcon[5] = cinco;
        vetIcon[6] = seis;
        vetIcon[7] = sete;
        vetIcon[8] = oito;
        vetIcon[9] = nove;
        
        vetIconSeg = new Icon[10];
        vetIconSeg[0] = zeros;
        vetIconSeg[1] = ums;
        vetIconSeg[2] = doiss;
        vetIconSeg[3] = tress;
        vetIconSeg[4] = quatros;
        vetIconSeg[5] = cincos;
        vetIconSeg[6] = seiss;
        vetIconSeg[7] = setes;
        vetIconSeg[8] = oitos;
        vetIconSeg[9] = noves;

        setUndecorated(true);//retira a barra de título do JFrame  

        initComponents();
        this.setBackground(new Color(0, 0, 0, 0));
        jPanel1.setBackground(new Color(0, 0, 0, 50));
        //jPanel1.setBackground(new Color(0, 113, 155, 0));

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();// PEGA A LARGURA  E ALTURA  EM PIXEL
        int l = (dim.width / 2) - 180;
        this.setLocation(l, 2);

        timer1.start();

        //jLabel1.setToolTipText("Art-Comp Informatica \n (67)3291-2467");
    }

    public void alteraRelogio(Date date) {

        horas = new SimpleDateFormat("hh:mm:ss").format(date);
        System.out.println(horas);
        String[] vetHoras = horas.split(":");
        String caracter = "";
        
        semana = new SimpleDateFormat("EEEEE").format(date);
        dia = new SimpleDateFormat("dd").format(date);
        mes = new SimpleDateFormat("MMMMM").format(date);
        ano = new SimpleDateFormat("YYYY").format(date);
        
        jLabel11.setText(semana + " - " + dia + " de " + mes + " de " + ano );
        // SETA O DIA NO LABEL
               
        jLabel1.setText(new SimpleDateFormat(" a ").format(date));
        //seta o pm ou am
        
        for (int i = 0; i < 10; i++) {
            caracter = String.valueOf(i);
            Character c = caracter.charAt(0);

            if (vetHoras[0].charAt(0) == c) {
                jLabel3.setIcon(vetIcon[i]);
            }

            if (vetHoras[0].charAt(1) == c) {
                jLabel4.setIcon(vetIcon[i]);
            }

            if (vetHoras[1].charAt(0) == c) {
                jLabel6.setIcon(vetIcon[i]);
            }

            if (vetHoras[1].charAt(1) == c) {
                jLabel7.setIcon(null);
                jLabel7.setIcon(vetIcon[i]);
            }

            if (vetHoras[2].charAt(0) == c) {
                jLabel10.setIcon(vetIconSeg[i]);
            }
            if (vetHoras[2].charAt(1) == c) {
                jLabel9.setIcon(vetIconSeg[i]);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        timer1 = new org.netbeans.examples.lib.timerbean.Timer();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        timer1.addTimerListener(new org.netbeans.examples.lib.timerbean.TimerListener() {
            public void onTime(java.awt.event.ActionEvent evt) {
                timer1OnTime(evt);
            }
        });

        jToggleButton1.setBackground(new java.awt.Color(204, 204, 255));
        jToggleButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(0, 51, 102));
        jToggleButton1.setText("SUPORTTOOLS");
        jToggleButton1.setBorder(null);
        jToggleButton1.setBorderPainted(false);
        jToggleButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setFocusableWindowState(false);

        jPanel1.setBackground(new java.awt.Color(3, 81, 120));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Reem Kufi", 0, 22)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText(" ");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 380, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 50, 130));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 50, 130));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Ponto-B.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 30, 30));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 50, 130));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 50, 130));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 30, 70));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 30, 70));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Ponto-B.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 10, 30));

        jLabel1.setFont(new java.awt.Font("Reem Kufi", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 40, 30));

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        setSize(new java.awt.Dimension(413, 178));
    }// </editor-fold>//GEN-END:initComponents

    private void timer1OnTime(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timer1OnTime
        alteraRelogio(new Date());
    }//GEN-LAST:event_timer1OnTime

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed

        String command = ("java -jar C:\\CadastroClientesServidor\\store\\CadastroClientes.jar");
        try {
            Process exec = Runtime.getRuntime().exec(command);

        } catch (IOException ex) {
            Logger.getLogger(FramePai.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FramePai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FramePai().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    private org.netbeans.examples.lib.timerbean.Timer timer1;
    // End of variables declaration//GEN-END:variables

}
