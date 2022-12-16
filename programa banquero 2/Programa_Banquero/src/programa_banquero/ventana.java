/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa_banquero;

import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Paint;
import javax.swing.AbstractListModel;
import static javax.swing.GroupLayout.Alignment.CENTER;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListCellRenderer;
import javax.swing.ListModel;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Wilson Pop
 */
class RowHeaderRenderer extends JLabel implements ListCellRenderer {

  RowHeaderRenderer(JTable table) {
    JTableHeader header = table.getTableHeader();
    setOpaque(true);
    setBorder(UIManager.getBorder("TableHeader.cellBorder"));
    setHorizontalAlignment(CENTER);
    setForeground(header.getForeground());
    setBackground(header.getBackground());
    setFont(new Font("Tahoma",Font.PLAIN,16));
  }

  public Component getListCellRendererComponent(JList list, Object value,
      int index, boolean isSelected, boolean cellHasFocus) {
    setText((value == null) ? "" : value.toString());
    return this;
  }
}




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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSP3 = new javax.swing.JScrollPane();
        tablaMR = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jSP4 = new javax.swing.JScrollPane();
        tablaCA = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        procesos = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jSP1 = new javax.swing.JScrollPane();
        tablaC = new javax.swing.JTable();
        jSP2 = new javax.swing.JScrollPane();
        tablaA = new javax.swing.JTable();
        jSP6 = new javax.swing.JScrollPane();
        tablaP = new javax.swing.JTable(){
            @Override
            public Component prepareRenderer(TableCellRenderer renderer,int row, int col) {
                Component comp = super.prepareRenderer(renderer,0, col);
                Object value = getModel().getValueAt(0, col);

                if (value.equals("NO")) {
                    comp.setBackground(Color.red);
                } else if (value.equals("SI")) {
                    comp.setBackground(Color.green);
                } else {
                    comp.setBackground(Color.white);
                }

                return comp;
            }

        };

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(200, 200, 200));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Empezar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 137, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Matriz C");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 75, 360, 19));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Matriz Recursos Disponibles");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 520, 370, 19));

        tablaMR.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
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
        jSP3.setViewportView(tablaMR);

        jPanel1.add(jSP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 550, 370, 58));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Matriz A");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 75, 350, 19));

        jButton2.setBackground(new java.awt.Color(0, 255, 102));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Empezar proceso");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 371, 50));

        jSP4.setMinimumSize(new java.awt.Dimension(371, 346));
        jSP4.setPreferredSize(new java.awt.Dimension(371, 346));

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
        tablaCA.setEnabled(false);
        tablaCA.setMaximumSize(new java.awt.Dimension(330, 300));
        tablaCA.setMinimumSize(new java.awt.Dimension(330, 300));
        tablaCA.setPreferredSize(new java.awt.Dimension(330, 300));
        jSP4.setViewportView(tablaCA);

        jPanel1.add(jSP4, new org.netbeans.lib.awtextra.AbsoluteConstraints(775, 100, 371, 346));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Matriz C-A");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 75, 360, 19));

        procesos.setColumns(20);
        procesos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        procesos.setRows(5);
        jScrollPane5.setViewportView(procesos);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(775, 470, 370, 140));

        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Seguir proceso");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(775, 10, 371, 50));

        jSP1.setMinimumSize(new java.awt.Dimension(371, 346));
        jSP1.setPreferredSize(new java.awt.Dimension(371, 346));

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
        tablaC.setMaximumSize(new java.awt.Dimension(330, 300));
        tablaC.setMinimumSize(new java.awt.Dimension(330, 300));
        tablaC.setName(""); // NOI18N
        tablaC.setPreferredSize(new java.awt.Dimension(330, 300));
        jSP1.setViewportView(tablaC);

        jPanel1.add(jSP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 100, 371, 346));

        jSP2.setMinimumSize(new java.awt.Dimension(371, 346));
        jSP2.setPreferredSize(new java.awt.Dimension(371, 346));

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
        tablaA.setMaximumSize(new java.awt.Dimension(330, 300));
        tablaA.setMinimumSize(new java.awt.Dimension(330, 300));
        tablaA.setPreferredSize(new java.awt.Dimension(330, 300));
        jSP2.setViewportView(tablaA);

        jPanel1.add(jSP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 371, 346));

        tablaP.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tablaP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"sad", "asd", "asd", "asd"},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaP.setEnabled(false);
        jSP6.setViewportView(tablaP);

        jPanel1.add(jSP6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 550, 370, 58));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 710));

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
       
       String headerFilas[];
       String headerColumnas[];
       DefaultTableModel modelo; //tabla C
       DefaultTableModel modelo1; // tabla A
       DefaultTableModel modelo2; // tabla Recursos disponibles
       DefaultTableModel modelo3; // tabla C-A
       DefaultTableModel modelo4; // tabla Procesos
      
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
       JOptionPane.showMessageDialog(rootPane,"Debe escribir el # de filas y columnas de la matriz A y C");
       Mensaje();
       setFilas();
       MatrizC();
       MatrizA();
       MatrizRecursosDisponibles();
       MatrizCA();
       MatrizP();
      procesos.setText("");
      mostrar = "";
      jButton2.setEnabled(true);
      jButton3.setEnabled(false);
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        tableFormatProcess(tablaP);
        RestarCA();// Este metodo es para asignar valores a la matriz C-A
        procesos.setText("");
        mostrar = "";
       jButton3.setEnabled(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       CompararMatriz();
    }//GEN-LAST:event_jButton3ActionPerformed
    
    private void Mensaje(){
        fila = Integer.parseInt(JOptionPane.showInputDialog("Escriba el no. de filas"));
        columna = Integer.parseInt(JOptionPane.showInputDialog("Escriba el no. de columnas"));
    }   
   
    private void setFilas(){
       headerFilas = new String[fila];
       for(int x = 1; x <= fila;x++){
           headerFilas[x-1]="P"+x;
       }
    }
    
    
    private void MatrizC(){
        modelo=new DefaultTableModel(fila,columna);
        tablaC.setModel(modelo);
        tableFormat(tablaC, jSP1);
    }
    
    private void MatrizA(){
        modelo1=new DefaultTableModel(fila,columna);
        tablaA.setModel(modelo1);
        tableFormat(tablaA, jSP2);
    }
    
    private void MatrizRecursosDisponibles(){
        modelo2=new DefaultTableModel(1,columna);
        tablaMR.setModel(modelo2);
        tableItem(tablaMR);
        CellRendererColumn(tablaMR);
    }
    
     private void MatrizCA(){
        modelo3=new DefaultTableModel(fila,columna);
        tablaCA.setModel(modelo3);
        tableFormat(tablaCA, jSP4);
    }
     
     
    private void MatrizP(){
        modelo4 = new DefaultTableModel(1,fila);
        tablaP.setModel(modelo4);
        tableItem(tablaP);
        tableFormatProcess(tablaP);
    }
     
    ListModel lm = new AbstractListModel() {

      public int getSize() {
        return headerFilas.length;
      }

      public Object getElementAt(int index) {
        return headerFilas[index];
      }
    };
       
   private void tableItem(JTable t){
        t.setFont(new Font("Tahoma",Font.PLAIN,18));
        t.setRowHeight( 30 );
        t.setGridColor(new Color(0, 0, 0));
        t.setShowGrid(true);
   }
    
    private void tableFormat(JTable t, JScrollPane s){
        t.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        
        t.setFont(new Font("Tahoma",Font.PLAIN,16));
        t.setRowHeight( (300) / (fila) );
        t.setGridColor(new Color(0, 0, 0));
        t.setShowGrid(true);
              
        JList rowHeader = new JList(lm);

        rowHeader.setFixedCellWidth(35);
        rowHeader.setFixedCellHeight(t.getRowHeight() + t.getRowMargin());
        rowHeader.setCellRenderer(new RowHeaderRenderer(t));
        
        s.setRowHeaderView(rowHeader);
        CellRendererColumn(t);
    }
       
    private void CellRendererColumn(JTable t){
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        for(int i = 0; i < columna; i++) {
            t.getColumnModel().getColumn(i).setHeaderValue("R"+(i+1));
            t.getColumnModel().getColumn(i).setCellRenderer( centerRenderer );
        }  
    }
     
    private void tableFormatProcess(JTable t){
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        for(int i = 0; i < fila; i++) {
            t.getColumnModel().getColumn(i).setHeaderValue("P"+(i+1));
            t.getColumnModel().getColumn(i).setCellRenderer( centerRenderer );
            t.setValueAt("NO", 0, i);
            t.setBackground(Color.red);
        }  
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
           int contador = 0;
           int contador2 = 0;
           int contador3 = 0;
           String auxiliar2="";
           Boolean Deadlock = true;
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
                               contador3++; // este ciclo se usa para descartar todod los recursos asignados
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
                         mostrar +="Proceso escogido -> P"+(auxiliarfila+1)+"\n";
                         //mostrar +="Fila de C-A donde se debe restar -> "+auxiliarfila +"\n";
                        procesos.setText(mostrar);
                        contador3 = 0;
                        Deadlock = false;
                        break;
                      }else{
                         contador =0;
                         contador2 =0;
                      }
                       
                   }
                   
                   
                   
            }
            contador = 0;
            
           if(!Deadlock){
            for(int y=0;y<columna;y++){
                    //Aqui se guardan los valores de la tabla de recursos disponibles en una matriz
                    
                    //Se suma nuestra fila X de la Matriz C-A a nuestra Matriz A
                    mostrar +="Asignando R"+(y + 1)+"\n";
                    auxiliar2=Integer.toString((datosCA [auxiliarfila][y])+Integer.parseInt(datosA[auxiliarfila][y])); 
                    datosA[auxiliarfila][y]=auxiliar2;
                    
                    //Se resta nuestra fila X de la Matriz C-A con nuestra Matriz de recursos asignados
                    //mostrar +="Restando fila "+ auxiliarfila+ " la matiz C-A de la matriz de recursos asignados \n";
                    auxiliar2=Integer.toString(Integer.parseInt(datosRD[0][y])-(datosCA [auxiliarfila][y])); 
                    datosRD[0][y]=auxiliar2;
                    modelo2.setValueAt(datosRD[0][y], 0, y);
                    
                    //Se resta nuestra fila X de la Matriz C-A a si misma (se anula la fila)
                    //mostrar +="Restando fila "+ auxiliarfila+ " de la matiz C-A \n";
                    datosCA [auxiliarfila][y]=(datosCA [auxiliarfila][y])-(datosCA [auxiliarfila][y]);
                    
                    //Se suma la fila X de la Matriz A a nuestra Matriz de recursos asignados
                    //mostrar +="Sumando fila "+ auxiliarfila+ " la matiz A de la matriz de recursos asignados \n";
                    datosRD[0][y]= Integer.toString(Integer.parseInt(datosRD[0][y])+(Integer.parseInt(datosA [auxiliarfila][y])));
                    modelo2.setValueAt(datosRD[0][y], 0, y);
                    
                    //Se resta nuestra fila X de la Matriz A a si misma (se anula la fila)
                    //mostrar +="Restando fila "+ auxiliarfila+ " de la matiz A \n";
                    datosA [auxiliarfila][y]=Integer.toString(Integer.parseInt(datosA [auxiliarfila][y])-Integer.parseInt(datosA [auxiliarfila][y]));
                    
                    modelo3.setValueAt(datosCA[auxiliarfila][y], auxiliarfila, y);
                    modelo1.setValueAt(datosA[auxiliarfila][y], auxiliarfila, y);
                    //System.out.println(datosCA[auxiliarfila][y]);
            }
            
            
            mostrar +="PROCESO " +(auxiliarfila + 1)+" COMPLETADO \n"; // Aqui se muestra el proceso que ya se realizo
            mostrar +="NUEVOS RECURSOS DISPONIBLES\n";
            tablaP.setValueAt("SI", 0, auxiliarfila);

            
            
        }else{
               if(contador3 == fila*columna){
               mostrar +="PROCESOS YA FINALIZADOS\n"; // Aqui se muestra si los procesos ya se realizaron
               }else{
               mostrar +="SISTEMA SIN RECURSOS SUFICIENTES\n"; // Aqui se muestra si ningun proceso se ha logrado realizar
               }
                }
           
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
    private javax.swing.JScrollPane jSP1;
    private javax.swing.JScrollPane jSP2;
    private javax.swing.JScrollPane jSP3;
    private javax.swing.JScrollPane jSP4;
    private javax.swing.JScrollPane jSP6;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea procesos;
    private javax.swing.JTable tablaA;
    private javax.swing.JTable tablaC;
    private javax.swing.JTable tablaCA;
    private javax.swing.JTable tablaMR;
    private javax.swing.JTable tablaP;
    // End of variables declaration//GEN-END:variables
}
