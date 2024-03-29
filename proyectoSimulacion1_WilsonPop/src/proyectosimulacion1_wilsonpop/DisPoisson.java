/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectosimulacion1_wilsonpop;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Wilson Pop
 */
public class DisPoisson extends javax.swing.JFrame {

    /**
     * Creates new form DisPoisson
     */
    //panelControl panel = new panelControl();
    distPoisson dist = new distPoisson();
    int numeroExperimentos = 0;
    int numeroAciertos = 0;
    double probabilidad = 0;
    double valoresProb[];
    String acumulador = "";
    int intervalo[];
    int xva1 = 0;
    int xv2 = 0;

    DefaultTableModel modelo5 = new DefaultTableModel();

    public DisPoisson() {
        initComponents();
        this.setLocationRelativeTo(null);
        String[] titulo = new String[]{"x", "P(x)%", "q(x)%"};
        modelo5.setColumnIdentifiers(titulo);
        tablaP.setModel(modelo5);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        n1 = new javax.swing.JTextField();
        x1 = new javax.swing.JTextField();
        x2 = new javax.swing.JTextField();
        x0 = new javax.swing.JTextField();
        p1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaP = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        Calcular = new javax.swing.JButton();
        checkbox1 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        textArea1 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        n1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        x1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        x2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        x0.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        x0.setEnabled(false);

        p1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("n");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("x1");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("x2");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("x");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("p");

        tablaP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaP);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        Calcular.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Calcular.setText("Calcular");
        Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularActionPerformed(evt);
            }
        });

        checkbox1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        checkbox1.setText("Activar/Desactivar");
        checkbox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkbox1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Distribución de poisson");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        textArea1.setColumns(20);
        textArea1.setRows(5);
        jScrollPane2.setViewportView(textArea1);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Datos:");

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Limpiar ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(51, 51, 51)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(p1, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(x0, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(x1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel3)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(x2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(n1))
                                .addGap(18, 18, 18)
                                .addComponent(checkbox1)))
                        .addGap(30, 30, 30)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(jLabel7)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(172, 636, Short.MAX_VALUE)
                .addComponent(Calcular)
                .addGap(45, 45, 45)
                .addComponent(jButton1)
                .addGap(228, 228, 228))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Calcular)
                            .addComponent(jButton1)
                            .addComponent(jButton2))))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(n1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)
                                .addComponent(checkbox1))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(x0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Asignador asignar = new Asignador();
        this.setVisible(false);
        asignar.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void checkbox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkbox1ActionPerformed
        if (checkbox1.isSelected()) {
            x1.setEnabled(false);
            x2.setEnabled(false);
            x0.setEnabled(true);
        } else {
            x1.setEnabled(true);
            x2.setEnabled(true);
            x0.setEnabled(false);
        }
    }//GEN-LAST:event_checkbox1ActionPerformed

    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularActionPerformed
        limpiarMatriz();
        textArea1.setText("");
        decidir1();
    }//GEN-LAST:event_CalcularActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        limpiar();
    }//GEN-LAST:event_jButton2ActionPerformed

    public void Dibujar(double valoresProb[]) {
        DefaultCategoryDataset dtsc = new DefaultCategoryDataset();
        for (int re = xva1; re <= xv2; re++) {
            dtsc.setValue(valoresProb[re], "Probabilidad", String.valueOf(re));
        }
        JFreeChart grafica = ChartFactory.createBarChart("Distribución de Poisson", "Numero de aciertos", "Probabilidad", dtsc, PlotOrientation.VERTICAL, true, true, false);

        ChartPanel pa = new ChartPanel(grafica);
        /*add(pa);
        pa.setBounds(0, 50, 600, 300);
        panel.add(pa, BorderLayout.NORTH);*/
        pa.setMouseWheelEnabled(true);
        pa.setPreferredSize(new Dimension(600, 400));
        jPanel1.setLayout(new BorderLayout());
        jPanel1.add(pa, BorderLayout.NORTH);
        pack();
        //repaint();

    }

    private void Matriz() {
        intervalo = new int[numeroExperimentos + 1];

        for (int a = 0; a < numeroExperimentos + 1; a++) {
            intervalo[a] = a;
        }

        for (int ctn = xva1; ctn <= xv2; ctn++) {
            modelo5.addRow(new Object[]{
                String.valueOf(intervalo[ctn]), String.valueOf(valoresProb[ctn]), String.valueOf(100 - valoresProb[ctn])
            });
        }

    }

    private void limpiarMatriz() {
        int filas = modelo5.getRowCount();
        for (int a = 0; a < filas; a++) {
            modelo5.removeRow(0);
        }
    }

    private void limpiar() {
        limpiarMatriz();
        n1.setText("");
        x1.setText("");
        x2.setText("");
        x0.setText("");
        p1.setText("");
        numeroExperimentos = 0;
        numeroAciertos = 0;
        probabilidad = 0;
        acumulador = "";
        xva1 = 0;
        xv2 = 0;

    }

    private void limpiar2() {
        numeroExperimentos = 0;
        numeroAciertos = 0;
        probabilidad = 0;
        acumulador = "";
        xva1 = 0;
        xv2 = 0;
    }

    public void decidir1() {
        try {
            numeroExperimentos = Integer.parseInt(n1.getText());
            probabilidad = Double.parseDouble(p1.getText());
            double np = probabilidad * numeroExperimentos;
            panelControl panel = new panelControl();

            if ((probabilidad < 0.10) && (np < 10)) {
                Calcular();
            } else {
                JOptionPane.showMessageDialog(rootPane, "No es posible realizar el cálculo por distribución de Poissson");
                this.setVisible(false);
                panel.setVisible(true);
                panel.poblacion.setText("0");
                panel.n.setText(n1.getText());
                panel.p.setText(p1.getText());
                JOptionPane.showMessageDialog(rootPane, "Distribución binomial");
            }

        } catch (Exception e) {
             JOptionPane.showMessageDialog(rootPane, "Ha ocurrido un error, revise las entradas.");
        }

    }

    public void Calcular() {
        try {
            if (checkbox1.isSelected()) {
                xva1 = Integer.parseInt(x0.getText());
                xv2 = Integer.parseInt(x0.getText());
            } else {
                xva1 = Integer.parseInt(x1.getText());
                xv2 = Integer.parseInt(x2.getText());
            }

            numeroExperimentos = Integer.parseInt(n1.getText());
            probabilidad = Double.parseDouble(p1.getText());
            valoresProb = new double[numeroExperimentos + 1];
            valoresProb = dist.calculoProbabilidad(numeroExperimentos, probabilidad);
            acumulador = dist.Datos(numeroExperimentos, probabilidad);
            Matriz();
            Dibujar(valoresProb);
            textArea1.setText(acumulador);
            limpiar2();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "No es posible realizar el cálculo, revise las entradas.");
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
            java.util.logging.Logger.getLogger(DisPoisson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisPoisson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisPoisson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisPoisson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DisPoisson().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calcular;
    private javax.swing.JCheckBox checkbox1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTextField n1;
    public static javax.swing.JTextField p1;
    public static javax.swing.JTable tablaP;
    private javax.swing.JTextArea textArea1;
    public static javax.swing.JTextField x0;
    public static javax.swing.JTextField x1;
    public static javax.swing.JTextField x2;
    // End of variables declaration//GEN-END:variables
}
