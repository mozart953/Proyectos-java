/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Areaadministrativa;

import javax.swing.JOptionPane;

/**
 *
 * @author Wilson Pop
 */
public class Modificarlimite extends javax.swing.JInternalFrame {

    /**
     * Creates new form Modificarlimite
     */
    public Modificarlimite() {
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

        jPanel1 = new javax.swing.JPanel();
        pin = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        monto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Modificar monto");

        jPanel1.setBackground(new java.awt.Color(51, 255, 255));

        jLabel1.setText("No. de Pin");

        jLabel2.setText("Nuevo monto");

        jButton1.setText("Realizar cambios");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(monto, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                    .addComponent(pin))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(224, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(97, 97, 97))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(monto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(28, Short.MAX_VALUE))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Crearusuar modif = new Crearusuar ();
 
        String regi [] = new String [7];
        String pin1 = this.pin.getText();
        String mont = this.monto.getText();
        
        String aux = "";
        String aux1 = "";
        int contador2 =0;
        int decision = 0;
        boolean inte = false;
        boolean inte1 = true;
        
        if((pin1.length()==4)){
          
                for(int o=0;o<mont.length();o++){
                    inte=false;
                    aux="";
                    aux+=mont.charAt(o);
                    //para determinar si cada posicion es un numero en el monto
                    for(int ri=0;ri<10;ri++){
                        aux1="";
                        aux1+=ri;
                        if(aux.equals(aux1)){
                            inte=true;
                        }else{}
                    }
                    
                    if(inte==false){
                        inte1=false;
                    }else{}
                    
                }
            
                
                aux="";
                aux1="";
                
            if(inte1==true){
                regi=modif.Leerusuario1(pin1);
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
                    decision = modif.Modificartarjeta(regi[0], regi[1],regi[2],mont, regi[4]
                            ,regi[5],regi[6]);
                    
                    if(decision==0){
                        JOptionPane.showMessageDialog(rootPane, "El usuario no existe");
                    }
                    else if (decision==1){
                        JOptionPane.showMessageDialog(rootPane, "El limite se ha modificada correctamente");
                    }
                    else if (decision==2){
                        JOptionPane.showMessageDialog(rootPane, "Error desconocido");
                    }
                    else if (decision==3){
                        JOptionPane.showMessageDialog(rootPane, "Archivo inexistente");
                    }else{}
                    
                }
                
            }else{
                JOptionPane.showMessageDialog(rootPane, "El monto debe tener caracteres numericos");
            }    
                
            
        }
        else {
            JOptionPane.showMessageDialog(rootPane, "La longitud del pin debe ser igual a 4");
        }
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField monto;
    private javax.swing.JTextField pin;
    // End of variables declaration//GEN-END:variables
}
