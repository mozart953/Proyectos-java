/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Areaadministrativa;

import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author Jordin
 */
public class AggEfectivo extends javax.swing.JFrame {

    /**
     * Creates new form CrearUsuario
     */
    public AggEfectivo() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/cajero-automatico.png")));
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
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ct1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ct2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ct3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ct4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ct5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ct6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ct7 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        ar1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cantidad");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, -1, -1));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("No. de billetes");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("200");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, -1, -1));
        jPanel1.add(ct1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 170, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("100");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));
        jPanel1.add(ct2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 170, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("50");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, -1, -1));
        jPanel1.add(ct3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 170, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("20");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, -1, -1));
        jPanel1.add(ct4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 170, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("10");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, -1, -1));
        jPanel1.add(ct5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 170, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("5");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, -1, -1));
        jPanel1.add(ct6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 170, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("1");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, -1, -1));
        jPanel1.add(ct7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 460, 170, -1));

        jButton1.setText("Agregar efectivo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, -1, 70));
        jPanel1.add(ar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, 180, 30));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Nombre del archivo");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel11.setText("DEPOSITAR");
        jLabel11.setToolTipText("");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 220, 50));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/flecha.png"))); // NOI18N
        jLabel14.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel14.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel14MouseMoved(evt);
            }
        });
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel14MouseExited(evt);
            }
        });
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 410, 150, 100));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("VOLVER AL MENU");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 480, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        InicializarCajero leer= new InicializarCajero ();

        int datos []= new int[8];
        int control =0;
        String nombre = this.ar1.getText();
        int cantidad1 = 0;
        int cantidad2 = 0;
        int cantidad3 = 0;
        int cantidad4 = 0;
        int cantidad5 = 0;
        int cantidad6 = 0;
        int cantidad7 = 0;
        int total =0;
        cantidad1 = Integer.parseInt(this.ct1.getText());
        cantidad2 = Integer.parseInt(this.ct2.getText());
        cantidad3 = Integer.parseInt(this.ct3.getText());
        cantidad4 = Integer.parseInt(this.ct4.getText());
        cantidad5 = Integer.parseInt(this.ct5.getText());
        cantidad6 = Integer.parseInt(this.ct6.getText());
        cantidad7 = Integer.parseInt(this.ct7.getText());
        total = ((cantidad1*200)+(cantidad2*100)+(cantidad3*50)+(cantidad4*20)+(cantidad5*10)
            +(cantidad6*5)+(cantidad7*1));

        if(total<=30000){
            //para leer y sumar lo ingresado
            datos = leer.Consultacajero(nombre, total, cantidad1, cantidad2,
                cantidad3, cantidad4, cantidad5, cantidad6, cantidad7);

            if(datos[0]==-1){
                JOptionPane.showMessageDialog(rootPane, "El archivo no esta...");
            }
            else if(datos[0]==-4){
                JOptionPane.showMessageDialog(rootPane, "El cajero no esta inicializado, debe inicializarse");
            }
            else if(datos[0]==-3){
                JOptionPane.showMessageDialog(rootPane, "Error");
            }
            else if(datos[0]==-2){
                JOptionPane.showMessageDialog(rootPane, "El archivo no existe");
            }
            else if(datos[0]>0){
                //para modificar el archivo solicitado del cajero
                control = leer.Modificar(nombre, datos[0], datos[1], datos[2],
                    datos[3], datos[4],datos[5], datos[6], datos[7]);

                if(control==1){
                    JOptionPane.showMessageDialog(rootPane, "Modificado exitosamente");
                }
                else if(control==2){
                    JOptionPane.showMessageDialog(rootPane, "Agregado correctamente");
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Error desconocido");
                }
            }
            else{}
        }else{
            JOptionPane.showMessageDialog(rootPane, "El total ingresado excede los 30000");

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel14MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseMoved
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
    }//GEN-LAST:event_jLabel14MouseMoved

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        PrincipalAdmin principalAdmin = new PrincipalAdmin();
        principalAdmin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseExited
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,153,102)));
    }//GEN-LAST:event_jLabel14MouseExited

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
            java.util.logging.Logger.getLogger(AggEfectivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AggEfectivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AggEfectivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AggEfectivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AggEfectivo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ar1;
    private javax.swing.JTextField ct1;
    private javax.swing.JTextField ct2;
    private javax.swing.JTextField ct3;
    private javax.swing.JTextField ct4;
    private javax.swing.JTextField ct5;
    private javax.swing.JTextField ct6;
    private javax.swing.JTextField ct7;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
