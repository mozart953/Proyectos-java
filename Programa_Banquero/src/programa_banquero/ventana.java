/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa_banquero;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Wilson Pop
 */
public class ventana extends javax.swing.JFrame {
    
                
   
    public ventana() {
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
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaC = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaA = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaMR = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaCA = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        procesos = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Empezar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tablaC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tablaC.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaC);

        tablaA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tablaA.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tablaA);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Matriz C");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Matriz Recursos Disponibles");

        tablaMR.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tablaMR);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Matriz A");

        jButton2.setBackground(new java.awt.Color(0, 255, 102));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Empezar proceso");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tablaCA.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(tablaCA);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Matriz C-A");

        procesos.setColumns(20);
        procesos.setRows(5);
        jScrollPane5.setViewportView(procesos);

        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Seguir proceso");
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(331, 331, 331))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))
                        .addGap(58, 58, 58)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(61, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(143, 143, 143)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                            .addComponent(jScrollPane5))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(560, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(157, 157, 157)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(84, 84, 84)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(446, Short.MAX_VALUE)))
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
       int fila=0;
       int columna=0;
       int fila2 =0;
       int columna2=0;
       int auxiliarfila=0;//variable para determinar que fila usar de C-A
       String mostrar="";//Para mostrar que esta sucediendo
       String datosC [][];//En esta matriz se guardan los valores que se escribieron en la tabla C
       String datosA [][];// En esta matriz se guardan los valores que se escribieron en la tabla A
       int datosCA [][];// En esta matriz se guarda la diferencia de C-A  
       String datosRD [][];//para guardar los valores de la tabla de recursos diponibles
       
       DefaultTableModel modelo; //tabla C
       DefaultTableModel modelo1; // tabla A
       DefaultTableModel modelo2; // tabla Recursos disponibles
       DefaultTableModel modelo3; // tabla C-A
      
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
       JOptionPane.showMessageDialog(rootPane,"Debe escribir el # de filas y columnas de la matriz A y C");
       Mensaje();
       MatrizC();
       MatrizA();
       MatrizRecursosDisponibles();
       MatrizCA();
      
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        RestarCA();// Este metodo es para asignar valores a la matriz C-A
        CompararMatriz();
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       CompararMatriz();
    }//GEN-LAST:event_jButton3ActionPerformed
    
    private void Mensaje(){
        fila = Integer.parseInt(JOptionPane.showInputDialog("Escriba el no. de filas"));
        columna = Integer.parseInt(JOptionPane.showInputDialog("Escriba el no. de columnas"));
    }
    
    private void Mensaje2(){
        fila2 = Integer.parseInt(JOptionPane.showInputDialog("Escriba el no. de filas"));
        columna2 = Integer.parseInt(JOptionPane.showInputDialog("Escriba el no. de columnas"));
    }
    
   
    private void MatrizC(){
        
        modelo=new DefaultTableModel(fila,columna);
        tablaC.setModel(modelo);
    }
    
    private void MatrizA(){
        modelo1=new DefaultTableModel(fila,columna);
        tablaA.setModel(modelo1);
    }
    
    private void MatrizRecursosDisponibles(){
        modelo2=new DefaultTableModel(1,columna);
        tablaMR.setModel(modelo2);
    }
     private void MatrizCA(){
        modelo3=new DefaultTableModel(fila,columna);
        tablaCA.setModel(modelo3);
    }
     
    
    private void RestarCA(){
       
           datosC =new String [fila][columna]; //En esta matriz se guardan los valores que se escribieron en la tabla C
           datosA =new String [fila][columna]; // En esta matriz se guardan los valores que se escribieron en la tabla A
           datosCA=new int [fila][columna]; // En esta matriz se guarda la diferencia de C-A   
       
            for(int x=0;x<fila;x++){
                for(int y=0;y<columna;y++){
                    datosC [x][y]=(String) modelo.getValueAt(x, y); //Aqui se obtienen los datos de la matriz C
                    System.out.println(datosC[x][y]);
                }
            }
            
            for(int x=0;x<fila;x++){
                for(int y=0;y<columna;y++){
                    datosA [x][y]=(String) modelo1.getValueAt(x, y);//Aqui se obtienen los datos de la matriz A
                    System.out.println(datosA[x][y]);
                }
            }
            
            for(int x=0;x<fila;x++){
               for(int y=0;y<columna;y++){
                   datosCA [x][y]=Integer.parseInt(datosC[x][y])-Integer.parseInt(datosA[x][y]);//Aqui se resta A de C 
                   System.out.println(datosCA[x][y]);
                }
            }
            
             for(int x=0;x<fila;x++){
               for(int y=0;y<columna;y++){
                  modelo3.setValueAt(datosCA[x][y], x, y);//Aqui se mandan la diferencia C-A a la matriz C-A
                }
            }
    
    } 
    
    private void CompararMatriz(){
           datosRD =new String [1][columna]; //para guardar los valores de la tabla de recursos diponibles
           String auxiliar ="";
           int contador=0;
           int contador2=0;
           String auxiliar2="";
           
           for(int y=0;y<columna;y++){
                    auxiliar=(String) modelo2.getValueAt(0, y); //Aqui se guardan los valores de la tabla de recursos disponibles en una matriz
                    datosRD [0][y]=auxiliar;
                    System.out.println(datosRD[0][y]);
            }
           
           
           for(int x=0;x<fila;x++){
                   for(int y=0;y<columna;y++){
                       if(Integer.parseInt(datosRD[0][y])>=datosCA [x][y]){ //Aqui se determina con que fila de C-A se debe proceder
                           contador++;
                           if(datosCA [x][y]==0){
                               contador2++; // este ciclo se usa para descartar las filas donde solo hay ceros
                           }else{}
                           
                       }
                   }
                   
                   
                   if(contador2==columna){
                       contador=0;
                       contador2=0;
                   }else{
                   
                      if(contador==columna){
                         auxiliarfila=x; // A la variable auxiliar se le asigna el valor de la fila que procede
                         mostrar +="Fila de C-A donde se debe restar -> "+auxiliarfila +"\n";
                        procesos.setText(mostrar);
                      }else{
                         //contador=0;
                      }
                       
                   }
                   
                   
                   
            }
            contador = 0;
            
           
            for(int y=0;y<columna;y++){
            //Aqui se guardan los valores de la tabla de recursos disponibles en una matriz
                    mostrar +="Sumando fila "+ auxiliarfila+ " de la matiz C-A a la matriz A \n";
                    procesos.setText(mostrar);
                    auxiliar2=Integer.toString((datosCA [auxiliarfila][y])+Integer.parseInt(datosA[auxiliarfila][y])); 
                    datosA[auxiliarfila][y]=auxiliar2;
                    
                    mostrar +="Restando fila "+ auxiliarfila+ " la matiz C-A de la matriz de recursos asignados \n";
                    procesos.setText(mostrar);
                    auxiliar2=Integer.toString(Integer.parseInt(datosRD[0][y])-(datosCA [auxiliarfila][y])); 
                    datosRD[0][y]=auxiliar2;
                    modelo2.setValueAt(datosRD[0][y], 0, y);
                    
                    mostrar +="Restando fila "+ auxiliarfila+ " de la matiz C-A \n";
                    procesos.setText(mostrar);
                    datosCA [auxiliarfila][y]=(datosCA [auxiliarfila][y])-(datosCA [auxiliarfila][y]);
                    
                    mostrar +="Sumando fila "+ auxiliarfila+ " la matiz A de la matriz de recursos asignados \n";
                    procesos.setText(mostrar);
                    datosRD[0][y]= Integer.toString(Integer.parseInt(datosRD[0][y])+(Integer.parseInt(datosA [auxiliarfila][y])));
                    modelo2.setValueAt(datosRD[0][y], 0, y);
                    
                    mostrar +="Restando fila "+ auxiliarfila+ " de la matiz A \n";
                    procesos.setText(mostrar);
                    datosA [auxiliarfila][y]=Integer.toString(Integer.parseInt(datosA [auxiliarfila][y])-Integer.parseInt(datosA [auxiliarfila][y]));
                    
                    modelo3.setValueAt(datosCA[auxiliarfila][y], auxiliarfila, y);
                    modelo1.setValueAt(datosA[auxiliarfila][y], auxiliarfila, y);
                    System.out.println(datosCA[auxiliarfila][y]);
            }
            
            
            mostrar +="Proceso " +auxiliarfila+" completado \n"; // Aqui se muestra el proceso que ya se realizo
            procesos.setText(mostrar);
            auxiliarfila=0;
           
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
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea procesos;
    private javax.swing.JTable tablaA;
    private javax.swing.JTable tablaC;
    private javax.swing.JTable tablaCA;
    private javax.swing.JTable tablaMR;
    // End of variables declaration//GEN-END:variables
}
