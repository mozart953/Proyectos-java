/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Areausuario;

import Areaadministrativa.*;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author Jordin
 */
public class Retirar extends javax.swing.JFrame {

    /**
     * Creates new form CrearUsuario
     */
    public Retirar() {
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
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        reti = new javax.swing.JTextField();
        tarjeta = new javax.swing.JTextField();
        pin = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel11.setText("RETIRAR");
        jLabel11.setToolTipText("");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 180, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PIN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tarjeta");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Escriba la cantidad a retirar");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, -1, -1));
        jPanel1.add(reti, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 260, 30));
        jPanel1.add(tarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 260, 30));
        jPanel1.add(pin, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 260, 30));

        jButton1.setText("Retirar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 160, 50));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/flecha.png"))); // NOI18N
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel6MouseMoved(evt);
            }
        });
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 410, 150, 100));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("VOLVER AL MENU");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 480, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Crearusuar leer = new Crearusuar();

        String regi []= new String [7];
        String pin1 = this.pin.getText();
        String tarjeta1 = this.tarjeta.getText();
        String retiro = this.reti.getText();
        int deci = 0;
        int decision =0;
        deci=leer.Leerusuario2(pin1, tarjeta1);
        int aux = 0;//retiros
        int aux1 =0;//depositos
        int aux2=0;//Saldo
        int aux3=0;
        if(deci==0){
            JOptionPane.showMessageDialog(rootPane, "Probablemente el pin no sea el correcto");
        }
        else if(deci==1){
            // JOptionPane.showMessageDialog(rootPane, "Datos correctos, bienvenido");
            regi=leer.Leerusuario1(pin1);
            if(regi[0]=="-1"){
                JOptionPane.showMessageDialog(rootPane, "Usuario no registrado");
            }
            else if(regi[0]=="-2"){
                JOptionPane.showMessageDialog(rootPane, "Error desconocido");
            }
            else if(regi[0]=="-3"){
                JOptionPane.showMessageDialog(rootPane, "El archivo no existe");
            }
            else{
                aux = Integer.parseInt(regi[5]); //retiros
                aux2 = Integer.parseInt(regi[4]); //saldo
                aux3 = Integer.parseInt(regi[3]); //monto

                if(aux2>=Integer.parseInt(retiro)){
                    if(aux3>=Integer.parseInt(retiro)){
                        aux2= aux2 -Integer.parseInt(retiro);
                        regi[4]=Integer.toString(aux2); //saldo
                        regi[5] = Integer.toString(aux+Integer.parseInt(retiro)); //retiro
                        decision = leer.Modificartarjeta(regi[0], regi[1],regi[2],regi[3], regi[4]
                            ,regi[5],regi[6]);
                        aux=0;
                        aux2=0;
                        aux3=0;
                        if(decision==0){
                            JOptionPane.showMessageDialog(rootPane, "El usuario no existe");
                        }
                        else if (decision==1){
                            JOptionPane.showMessageDialog(rootPane, "Se ha hecho el retiro de manera exitosa");
                        }
                        else if (decision==2){
                            JOptionPane.showMessageDialog(rootPane, "Error desconocido");
                        }
                        else if (decision==3){
                            JOptionPane.showMessageDialog(rootPane, "Archivo inexistente");
                        }else{}

                    }else{
                        JOptionPane.showMessageDialog(rootPane, "El retiro solicitado excede al monto");
                    }

                }else{
                    JOptionPane.showMessageDialog(rootPane, "El saldo es insuficiente para realizar el retiro");
                }

            }

        }
        else if(deci==2){
            JOptionPane.showMessageDialog(rootPane, "Nombre o clave incorrectos");
        }
        else if(deci==3){
            JOptionPane.showMessageDialog(rootPane, "Los datos solicitados no existen, intentelo de nuevo");
        }else{}

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel6MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseMoved
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
    }//GEN-LAST:event_jLabel6MouseMoved

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        PrincipalUsuario principalUsuario = new PrincipalUsuario();
        principalUsuario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,102,153)));
    }//GEN-LAST:event_jLabel6MouseExited

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
            java.util.logging.Logger.getLogger(Retirar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Retirar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Retirar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Retirar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Retirar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField pin;
    private javax.swing.JTextField reti;
    private javax.swing.JTextField tarjeta;
    // End of variables declaration//GEN-END:variables
}
