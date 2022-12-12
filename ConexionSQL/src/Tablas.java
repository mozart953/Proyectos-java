
import java.awt.Color;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class Tablas extends javax.swing.JFrame {

    //Se genera el estilo para la tabla
    private void EstiloTabla(){
        JTableHeader tb = tabla.getTableHeader();
        tb.setOpaque(false);
        tb.setFont(new Font("Tahoma",Font.BOLD,20));
        tb.setForeground(new Color(236,240,241));
        tabla.setRowHeight(30);
        tabla.setGridColor(new Color(189, 195, 199));
        tabla.setShowGrid(true);
        
        DefaultTableCellRenderer hr = new DefaultTableCellRenderer();
        hr.setBackground(new java.awt.Color(192,57,43));

        for (int i = 0; i < tabla.getModel().getColumnCount(); i++) {
            tabla.getColumnModel().getColumn(i).setHeaderRenderer(hr);
        }
    
    }
    
    
    public Tablas() throws ClassNotFoundException, IOException {
        initComponents();
        this.setResizable(false);
        this.setSize(900,650);
        this.setLocationRelativeTo(null);
        EstiloTabla();
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cb_funciones = new javax.swing.JComboBox<>();
        btn_execute = new javax.swing.JButton();
        tf_var2 = new javax.swing.JTextField();
        tf_var1 = new javax.swing.JTextField();
        tf_consulta = new javax.swing.JTextField();
        lb_Var1 = new javax.swing.JLabel();
        btn_execute2 = new javax.swing.JButton();
        lb_Var2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Funciones SQL");
        getContentPane().setLayout(null);

        cb_funciones.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cb_funciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PRODUCTOS_POR_FABRICANTE( int )", "RANKING_FABRICANTE( int )", "PRECIO_MAYOR_A( int )", "RANKING_DESDE_VALOR( int; int )", "TOP_PRODUCTOS( int; varchar )" }));
        cb_funciones.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_funcionesItemStateChanged(evt);
            }
        });
        getContentPane().add(cb_funciones);
        cb_funciones.setBounds(250, 20, 400, 40);

        btn_execute.setBackground(new java.awt.Color(51, 153, 0));
        btn_execute.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_execute.setText("Ejecutar");
        btn_execute.setBorder(null);
        btn_execute.setBorderPainted(false);
        btn_execute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_executeActionPerformed(evt);
            }
        });
        getContentPane().add(btn_execute);
        btn_execute.setBounds(510, 70, 140, 60);

        tf_var2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tf_var2.setEnabled(false);
        getContentPane().add(tf_var2);
        tf_var2.setBounds(370, 100, 100, 30);

        tf_var1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(tf_var1);
        tf_var1.setBounds(250, 100, 100, 30);

        tf_consulta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(tf_consulta);
        tf_consulta.setBounds(50, 490, 800, 40);

        lb_Var1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lb_Var1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_Var1.setText("Valor 1");
        lb_Var1.setToolTipText("");
        getContentPane().add(lb_Var1);
        lb_Var1.setBounds(250, 70, 100, 22);

        btn_execute2.setBackground(new java.awt.Color(51, 153, 0));
        btn_execute2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_execute2.setText("Ejecutar");
        btn_execute2.setBorder(null);
        btn_execute2.setBorderPainted(false);
        btn_execute2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_execute2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_execute2);
        btn_execute2.setBounds(300, 540, 300, 40);

        lb_Var2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lb_Var2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_Var2.setText("Valor 2");
        getContentPane().add(lb_Var2);
        lb_Var2.setBounds(370, 70, 100, 22);

        tabla.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "A", "B", "C", "D"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(50, 150, 800, 320);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/F5.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -40, 1050, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Se habilita/inhabilita el textField 2
    private void cb_funcionesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_funcionesItemStateChanged
        tf_var1.setText("");
        tf_var2.setText("");
        if(cb_funciones.getSelectedIndex()==4 || cb_funciones.getSelectedIndex()==3){
            tf_var2.setEnabled(true);            
        }else{
            tf_var2.setEnabled(false);  
        }
    }//GEN-LAST:event_cb_funcionesItemStateChanged

    public String consulta;
    //Se genera la consulta según el indice del comboBox
    private void btn_executeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_executeActionPerformed
        String var1 = tf_var1.getText();
        String var2 = tf_var2.getText();      

        switch(cb_funciones.getSelectedIndex()){
            case 0:
                consulta = "SELECT * FROM dbo.PRODUCTOS_POR_FABRICANTE("+var1+");";
                break;
            case 1:
                consulta = "SELECT * FROM dbo.RANKING_FABRICANTE("+var1+");";
                break;
            case 2:
                consulta = "SELECT * FROM dbo.PRECIO_MAYOR_A("+var1+");";
                break;
            case 3:
                consulta = "SELECT * FROM dbo.RANKING_DESDE_VALOR("+var1+","+var2+");";
                break;
            case 4:
                consulta = "SELECT * FROM dbo.TOP_PRODUCTOS("+var1+",'"+var2+"');";
                break;
        }
        
        try {
            cargar();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Tablas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btn_executeActionPerformed

    private void btn_execute2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_execute2ActionPerformed
        consulta = tf_consulta.getText();
        
        try {
            cargar();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Tablas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_execute2ActionPerformed

    private void modeloTabla(int n, String[] C){
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.setColumnCount(n);
        
    }
    
    private void cargar() throws ClassNotFoundException{
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0);
        
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;
        try{
            Connection con = conexion.getConexion();
            ps = con.prepareStatement(consulta);
            
            rs = ps.executeQuery();
        
            rsmd = rs.getMetaData();
            
            columnas = rsmd.getColumnCount();
            
            modelo.setColumnCount(columnas);
            
            while(rs.next()){
                Object[] fila = new Object[columnas];
                for(int i = 0; i<columnas; i++){
                    fila[i] = rs.getObject(i+1);                
                }
                modelo.addRow(fila);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
        
        EstiloTabla();
    }
    
    
    
    public static void main(String args[]) throws ClassNotFoundException, SQLException {
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
            java.util.logging.Logger.getLogger(Tablas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tablas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tablas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tablas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Tablas().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Tablas.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Tablas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_execute;
    private javax.swing.JButton btn_execute2;
    private javax.swing.JComboBox<String> cb_funciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_Var1;
    private javax.swing.JLabel lb_Var2;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField tf_consulta;
    private javax.swing.JTextField tf_var1;
    private javax.swing.JTextField tf_var2;
    // End of variables declaration//GEN-END:variables
}
