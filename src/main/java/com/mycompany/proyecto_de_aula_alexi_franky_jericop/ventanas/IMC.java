/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyecto_de_aula_alexi_franky_jericop.ventanas;

import com.mycompany.proyecto_de_aula_alexi_franky_jericop.datos.Persona;
import com.mycompany.proyecto_de_aula_alexi_franky_jericop.persistencia.Almacenamiento;
import java.io.IOException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;




/**
 *
 * @author FRANKY F
 */
public class IMC extends javax.swing.JFrame {

    /**
     * Creates new form ventanita
     */
   public IMC() {
        initComponents();
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        peso1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        altura1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        edad1 = new javax.swing.JTextField();
        calcular = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nombre1 = new javax.swing.JTextField();
        id1 = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        editar = new javax.swing.JButton();
        tabla = new javax.swing.JButton();
        sexo = new javax.swing.JTextField();
        limpiar = new javax.swing.JButton();
        ELIMINAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB Demi", 3, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CALCULADORA IMC");

        peso1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        peso1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peso1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 3, 18)); // NOI18N
        jLabel1.setText("PESO");

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB Demi", 3, 18)); // NOI18N
        jLabel3.setText("ALTURA");

        altura1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        altura1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altura1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB Demi", 3, 18)); // NOI18N
        jLabel5.setText("ID");

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB Demi", 3, 18)); // NOI18N
        jLabel6.setText("SEXO");

        edad1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        edad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edad1ActionPerformed(evt);
            }
        });

        calcular.setFont(new java.awt.Font("Berlin Sans FB Demi", 3, 18)); // NOI18N
        calcular.setText("CALCULAR");
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB Demi", 3, 18)); // NOI18N
        jLabel7.setText("EDAD");

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB Demi", 3, 18)); // NOI18N
        jLabel8.setText("NOMBRE");

        nombre1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre1ActionPerformed(evt);
            }
        });

        id1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        buscar.setFont(new java.awt.Font("Berlin Sans FB Demi", 3, 18)); // NOI18N
        buscar.setText("BUSCAR");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        editar.setFont(new java.awt.Font("Berlin Sans FB Demi", 3, 18)); // NOI18N
        editar.setText("EDITAR");
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });

        tabla.setFont(new java.awt.Font("Berlin Sans FB Demi", 3, 18)); // NOI18N
        tabla.setText("VER EN TABLA");
        tabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tablaActionPerformed(evt);
            }
        });

        sexo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        limpiar.setFont(new java.awt.Font("Berlin Sans FB Demi", 3, 18)); // NOI18N
        limpiar.setText("LIMPIAR");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        ELIMINAR.setFont(new java.awt.Font("Berlin Sans FB Demi", 3, 18)); // NOI18N
        ELIMINAR.setText("ELIMINAR");
        ELIMINAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ELIMINARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ELIMINAR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tabla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(limpiar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(peso1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(altura1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(id1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(edad1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buscar)
                .addGap(18, 18, 18)
                .addComponent(calcular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editar)
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(id1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(peso1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(edad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(altura1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3)
                    .addComponent(sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscar)
                    .addComponent(editar)
                    .addComponent(calcular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tabla)
                    .addComponent(limpiar)
                    .addComponent(ELIMINAR))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
        
        float peso, altura, imc;
        String pb,pn,sp,o1,o2,o3,nombre;
       
        String status="";
        int edad;
        String id;
        peso=Float.parseFloat(peso1.getText());
        altura=Float.parseFloat(altura1.getText());
        edad=Integer.parseInt(edad1.getText());
        id=id1.getText();
        nombre=nombre1.getText();
        imc=peso/(altura*altura);
       
        pb="Peso bajo";
        pn="Peso normal";
        sp="Sobrepeso";
        o1="Obesidad I";
        o2="Obesidad II";
        o3="Obesidad III";
         String sex=sexo.getText();
        if(imc<18.5){
             status=pb;
             peso_bajo p = new peso_bajo();
            int x = 1080;
            int y = 200;
            p.setLocation(x, y);
             p.setVisible(true);
        }
        if(imc>=18.5 && imc<24.9){
             status=pn;  
             peso_normal p = new peso_normal();
            int x = 1080;
            int y = 200;
            p.setLocation(x, y);
             p.setVisible(true);
        }
        if(imc>=25 && imc<29.9){
             status=sp;
             sobre_peso p = new sobre_peso();
            int x = 1080;
            int y = 200;
            p.setLocation(x, y);
             p.setVisible(true);
        }
        if(imc>=30 && imc<34.9){
             status=o1;
             obesidad_1 p = new obesidad_1();
            int x = 1080;
            int y = 200;
            p.setLocation(x, y);
             p.setVisible(true);
        }
        if(imc>=35 && imc<39.9){
             status=o2;
             obesidad_2 p = new obesidad_2();
            int x = 1080;
            int y = 200;
            p.setLocation(x, y);
             p.setVisible(true);
        }
        if(imc>=40){
             status=o3;
             obesidad_3 p = new obesidad_3();
            int x = 1080;
            int y = 200;
            p.setLocation(x, y);
             p.setVisible(true);
        }
        if(Persona.personasBd.containsKey(id)){
            JOptionPane.showMessageDialog(this, "La persona con el id "+id + " ya existe, si desea cambiar los datos ingresados presione editar");
            return;
        }
        Persona p = new Persona(id, nombre, sex, status, peso, altura, edad, imc);
        p.id=id;
        p.nombre=nombre;
        p.sexo=sex;
        p.estado=status;
        p.edad=edad;
        p.peso=peso;
        p.altura=altura;
        p.imc=imc;
        Persona.personasBd.put(id, p);
        int total= Persona.personasBd.size();
        
       try {
           Almacenamiento.guardar(Persona.personasBd);
           JOptionPane.showMessageDialog(this,"Persona guardada\nTotal: " + total);
       } catch (IOException ex) {
           JOptionPane.showMessageDialog(this,ex.getMessage());
       }
    }//GEN-LAST:event_calcularActionPerformed

    private void altura1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altura1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_altura1ActionPerformed

    private void peso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peso1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_peso1ActionPerformed

    private void edad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edad1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edad1ActionPerformed

    private void nombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre1ActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
       String id=id1.getText();
       try {
           Persona.personasBd = Almacenamiento.recuperar();
       
       if(Persona.personasBd.containsKey(id)){
           Persona p = Persona.personasBd.get(id);
           nombre1.setText(p.nombre);
           id1.setText(p.id);
           peso1.setText(p.peso+"");
           edad1.setText(p.edad+"");
           altura1.setText(p.altura+"");
           sexo.setText(p.sexo);
           if(p.imc<18.5){
            
             peso_bajo i = new peso_bajo();
            int x = 1080;
            int y = 200;
            i.setLocation(x, y);
             i.setVisible(true);
        }
        if(p.imc>=18.5 && p.imc<24.9){
             
             peso_normal i = new peso_normal();
            int x = 1080;
            int y = 200;
            i.setLocation(x, y);
             i.setVisible(true);
        }
        if(p.imc>=25 && p.imc<29.9){
            
             sobre_peso i = new sobre_peso();
            int x = 1080;
            int y = 200;
            i.setLocation(x, y);
             i.setVisible(true);
        }
        if(p.imc>=30 && p.imc<34.9){
            
             obesidad_1 i = new obesidad_1();
            int x = 1080;
            int y = 200;
            i.setLocation(x, y);
             i.setVisible(true);
        }
        if(p.imc>=35 && p.imc<39.9){
            
             obesidad_2 i = new obesidad_2();
            int x = 1080;
            int y = 200;
            i.setLocation(x, y);
             i.setVisible(true);
        }
        if(p.imc>=40){
            
             obesidad_3 i = new obesidad_3();
            int x = 1080;
            int y = 200;
            i.setLocation(x, y);
             i.setVisible(true);
        }
           }else{
           JOptionPane.showMessageDialog(this, "La persona no existe");
       }
       } catch (Exception ex) {
          JOptionPane.showMessageDialog(this, ex.getMessage());
       }
    }//GEN-LAST:event_buscarActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editarActionPerformed

    private void tablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tablaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
          nombre1.setText("");
           id1.setText("");
           peso1.setText("");
           edad1.setText("");
           altura1.setText("");
           sexo.setText("");
             
    }//GEN-LAST:event_limpiarActionPerformed

    private void ELIMINARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ELIMINARActionPerformed
       try {
           Almacenamiento.eliminar(id1.getText());
       } catch (Exception ex) {
           JOptionPane.showMessageDialog(this,ex.getMessage() );
       }
    }//GEN-LAST:event_ELIMINARActionPerformed

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
            java.util.logging.Logger.getLogger(IMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IMC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ELIMINAR;
    private javax.swing.JTextField altura1;
    private javax.swing.JButton buscar;
    private javax.swing.JButton calcular;
    private javax.swing.JTextField edad1;
    private javax.swing.JButton editar;
    private javax.swing.JTextField id1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton limpiar;
    private javax.swing.JTextField nombre1;
    private javax.swing.JTextField peso1;
    private javax.swing.JTextField sexo;
    private javax.swing.JButton tabla;
    // End of variables declaration//GEN-END:variables
}
