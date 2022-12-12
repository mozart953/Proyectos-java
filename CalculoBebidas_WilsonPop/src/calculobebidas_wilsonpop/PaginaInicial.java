/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculobebidas_wilsonpop;

import PatronDecorador.Bebida;
import PatronDecorador.CafeDescafeinado;
import PatronDecorador.CafeEstandard;
import PatronDecorador.CafeExpresso;
import PatronDecorador.CafeNegro;
import PatronDecorador.Chocolate;
import PatronDecorador.LecheEntera;
import PatronDecorador.LecheSoya;
import PatronEstrategia.Contexto;
import PatronEstrategia.StrategyAsignarPrecio;
import PatronEstrategia.StrategyCafeDescafeinado;
import PatronEstrategia.StrategyCafeExpresso;
import PatronEstrategia.StrategyCafeNegro;
import PatronEstrategia.StrategyCafeStandard;
import PatronEstrategia.StrategyChocolate;
import PatronEstrategia.StrategyLecheEntera;
import PatronEstrategia.StrategyLecheSoya;

/**
 *
 * @author Wilson Pop
 */
public class PaginaInicial extends javax.swing.JFrame {

    /**
     * Creates new form PaginaInicial
     */
    public double costoBebida = 0;

    public PaginaInicial() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        textA1 = new javax.swing.JTextArea();
        item1 = new javax.swing.JCheckBox();
        item2 = new javax.swing.JCheckBox();
        item3 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        caf1 = new javax.swing.JCheckBox();
        caf2 = new javax.swing.JCheckBox();
        caf3 = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        textA1.setBackground(new java.awt.Color(153, 153, 153));
        textA1.setColumns(20);
        textA1.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        textA1.setForeground(new java.awt.Color(255, 255, 255));
        textA1.setRows(5);
        jScrollPane1.setViewportView(textA1);

        item1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        item1.setText("Leche entera Q0.10");

        item2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        item2.setText("Leche de soya Q0.15");

        item3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        item3.setText("Chocolate Q0.20");

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Patrón decorador");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Seleccionar ingrediente:");

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Patrón Estrategia");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        caf1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        caf1.setText("Café Expreso Q1.99");

        caf2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        caf2.setText("Café Descafeinado Q1.05");

        caf3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        caf3.setText("Café negro Q0.99");

        jLabel4.setText("Seleccione el patron con el que desea calcular el precio:");

        jButton3.setBackground(new java.awt.Color(0, 255, 102));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Reiniciar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(caf3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(caf1)
                                .addGap(33, 33, 33)
                                .addComponent(caf2))
                            .addComponent(jLabel4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(item2)
                            .addComponent(item3))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(item1))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(caf2)
                    .addComponent(caf1))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(item1)
                            .addComponent(caf3))
                        .addGap(18, 18, 18)
                        .addComponent(item2)
                        .addGap(18, 18, 18)
                        .addComponent(item3)
                        .addGap(43, 43, 43)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 29, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("CALCULO DE BEBIDAS - ANALIS Y DISEÑO 2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Por - Wilson Victor Alexander Pop Cac -201840972");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CalculoBebidasDecorador();//Se llama al metodo que instancia los diferentes tipos de bebida por el patron decorador
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        CalculoBebidasStrategy(); //Se llama al metodo que realiza los calculos a partir del patron estrategia
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        costoBebida=0;
        textA1.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    public void CalculoBebidasDecorador() {

        //se calcula el precio de cada cafe de forma individual, sin utilizar ningun decorador
        if (caf1.isSelected()) {
            //Cafe Expresso
            Bebida bebida1 = new CafeExpresso("1");
            costoBebida = bebida1.ObtenerCosto() + costoBebida;
            textA1.setText("Q" + String.valueOf(costoBebida));
            CalculoCondimentosDecoracion();
        } else if (caf2.isSelected()) {
            //Cafe Descafeinado
            Bebida bebida1 = new CafeDescafeinado("1");
            costoBebida = bebida1.ObtenerCosto() + costoBebida;
            textA1.setText("Q" + String.valueOf(costoBebida));
            CalculoCondimentosDecoracion();
        } else if (caf3.isSelected()) {
            //Cafe Negro
            Bebida bebida1 = new CafeNegro("1");
            costoBebida = bebida1.ObtenerCosto() + costoBebida;
            textA1.setText("Q" + String.valueOf(costoBebida));
            CalculoCondimentosDecoracion();
        } else {
            //Cafe Estandard -- con un valor de Q 0.00
            Bebida bebida1 = new CafeEstandard("1");
            costoBebida = bebida1.ObtenerCosto() + costoBebida;
            textA1.setText("Q" + String.valueOf(costoBebida));
            CalculoCondimentosDecoracion();
        }

    }

    public void CalculoCondimentosDecoracion() {
        //se calculan los precios de los decoradores
        if (item1.isSelected()) {
            //Leche entera mas el valor estandard de Q 0.00 para evitar bugs
            Bebida bebida1 = new LecheEntera(new CafeEstandard("1"));
            costoBebida = bebida1.ObtenerCosto() + costoBebida;
            textA1.setText("Q" + String.valueOf(costoBebida));
        } else if (item2.isSelected()) {
            //Leche de soya mas el valor estandard de Q 0.00 para evitar bugs
            Bebida bebida1 = new LecheSoya(new CafeEstandard("1"));
            costoBebida = bebida1.ObtenerCosto() + costoBebida;
            textA1.setText("Q" + String.valueOf(costoBebida));
        } else if (item3.isSelected()) {
             //Chocolate mas el valor estandard de Q 0.00 para evitar bugs
            Bebida bebida1 = new Chocolate(new CafeEstandard("1"));
            costoBebida = bebida1.ObtenerCosto() + costoBebida;
            textA1.setText("Q" + String.valueOf(costoBebida));
        }
    }

    public void CalculoBebidasStrategy() {
        if (caf1.isSelected()) {
            //CafeExpresso
            StrategyAsignarPrecio estrategiaCF1 = new StrategyCafeExpresso();
            Contexto context = new Contexto(estrategiaCF1);
            costoBebida = context.Strategy() + costoBebida;
            textA1.setText("Q" + String.valueOf(costoBebida));
        } else if (caf2.isSelected()) {
            //CafeDescafeinado
            StrategyAsignarPrecio estrategiaCF2 = new StrategyCafeDescafeinado();
            Contexto context = new Contexto(estrategiaCF2);
            costoBebida = context.Strategy() + costoBebida;
            textA1.setText("Q" + String.valueOf(costoBebida));
        } else if (caf3.isSelected()) {
            //CafeNegro
            StrategyAsignarPrecio estrategiaCF3 = new StrategyCafeNegro();
            Contexto context = new Contexto(estrategiaCF3);
            costoBebida = context.Strategy() + costoBebida;
            textA1.setText("Q" + String.valueOf(costoBebida));
        } else if (item1.isSelected()) {
            //LecheEntera
            StrategyAsignarPrecio estrategiaC4 = new StrategyLecheEntera();
            Contexto context = new Contexto(estrategiaC4);
            costoBebida = context.Strategy() + costoBebida;
            textA1.setText("Q" + String.valueOf(costoBebida));
        } else if (item2.isSelected()) {
            //LecheSoya
            StrategyAsignarPrecio estrategiaC5 = new StrategyLecheSoya();
            Contexto context = new Contexto(estrategiaC5);
            costoBebida = context.Strategy() + costoBebida;
            textA1.setText("Q" + String.valueOf(costoBebida));
        } else if (item3.isSelected()) {
            //Chocolate
            StrategyAsignarPrecio estrategiaC6 = new StrategyChocolate();
            Contexto context = new Contexto(estrategiaC6);
            costoBebida = context.Strategy() + costoBebida;
            textA1.setText("Q" + String.valueOf(costoBebida));
        }else{
            //CafeStandard --- con un valor de Q 0.00
            StrategyAsignarPrecio estrategiaC7 = new StrategyCafeStandard();
            Contexto context = new Contexto(estrategiaC7);
            costoBebida = context.Strategy() + costoBebida;
            textA1.setText("Q" + String.valueOf(costoBebida));
        }

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
            java.util.logging.Logger.getLogger(PaginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox caf1;
    private javax.swing.JCheckBox caf2;
    private javax.swing.JCheckBox caf3;
    private javax.swing.JCheckBox item1;
    private javax.swing.JCheckBox item2;
    private javax.swing.JCheckBox item3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea textA1;
    // End of variables declaration//GEN-END:variables
}
