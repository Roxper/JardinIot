/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appjardiniot.GUIs;

import appjardiniot.Clases.JDesertico;
import appjardiniot.Clases.JInteriores;
import appjardiniot.Clases.JSombra;
import appjardiniot.Clases.SistRiego;
import appjardiniot.Clases.Usuario;
import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Rodrigo S
 */
public class Registro extends javax.swing.JFrame {

    /**
     * Creates new form Registro
     */
    public Registro() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/appjardiniot/Images/Icon5.png")).getImage());
        this.getContentPane().setBackground(new Color(251,172,41)); //106,226,166
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TEdad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TCorreo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TJardin = new javax.swing.JComboBox<>();
        Cancelar = new javax.swing.JButton();
        Aceptar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TContra1 = new javax.swing.JPasswordField();
        TContra2 = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        TNomJard = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Registro");
        setPreferredSize(new java.awt.Dimension(830, 710));
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appjardiniot/Images/Wellcome.gif"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appjardiniot/Images/Name.png"))); // NOI18N
        jLabel2.setText("Nombre:");

        TNombre.setBackground(new java.awt.Color(255, 194, 97));
        TNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TNombreActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appjardiniot/Images/Age.png"))); // NOI18N
        jLabel3.setText("Edad:");

        TEdad.setBackground(new java.awt.Color(255, 194, 97));
        TEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TEdadActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appjardiniot/Images/Email.png"))); // NOI18N
        jLabel4.setText("E-mail:");

        TCorreo.setBackground(new java.awt.Color(255, 194, 97));
        TCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TCorreoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appjardiniot/Images/NJarden.png"))); // NOI18N
        jLabel5.setText("Nombre del Jardin:");

        TJardin.setBackground(new java.awt.Color(255, 194, 97));
        TJardin.setMaximumRowCount(3);
        TJardin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Con Plantas Deserticas", "Con Plantas de Sombra", "Con Plantas de Interiores" }));
        TJardin.setSelectedIndex(-1);
        TJardin.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                TJardinItemStateChanged(evt);
            }
        });
        TJardin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TJardinActionPerformed(evt);
            }
        });

        Cancelar.setBackground(new java.awt.Color(255, 194, 97));
        Cancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appjardiniot/Images/Cross.png"))); // NOI18N
        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        Aceptar.setBackground(new java.awt.Color(255, 194, 97));
        Aceptar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Aceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appjardiniot/Images/Tick.png"))); // NOI18N
        Aceptar.setText("Aceptar");
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Digite su Informaci??n por favor:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appjardiniot/Images/Password1.png"))); // NOI18N
        jLabel7.setText("Contrase??a:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appjardiniot/Images/Password1.png"))); // NOI18N
        jLabel8.setText("Confirmar Contrase??a:");

        TContra1.setBackground(new java.awt.Color(255, 194, 97));

        TContra2.setBackground(new java.awt.Color(255, 194, 97));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appjardiniot/Images/Garden.png"))); // NOI18N
        jLabel9.setText("Tipo de Jardin:");

        TNomJard.setBackground(new java.awt.Color(255, 194, 97));
        TNomJard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TNomJardActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Cancelar)
                        .addGap(448, 448, 448)
                        .addComponent(Aceptar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(TNombre)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TJardin, 0, 190, Short.MAX_VALUE)
                                    .addComponent(TContra1))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(TContra2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TEdad)
                                    .addComponent(TNomJard))))))
                .addGap(0, 40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(128, 128, 128))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(TEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(TNomJard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(TJardin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TContra1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(TContra2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Aceptar))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TNombreActionPerformed

    private void TEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TEdadActionPerformed

    private void TCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TCorreoActionPerformed

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        Usuario Aux ;
        String Nombre;
        String Correo;
        String Contra1, Contra2;
        int Edad = 0, error = 0;
        String NJardin;
        Aux = new Usuario();
        
        Nombre = TNombre.getText();
        Correo = TCorreo.getText();
        Contra1 = TContra1.getText();
        Contra2 = TContra2.getText();
        NJardin = TNomJard.getText();
        
        if(Nombre.length() == 0){
            error = error + 1;
        }
        if(Correo.length() == 0){
            error = error + 1;
        }
        if(Contra1.length() == 0){
            error = error + 1;
        }
        if(Contra2.length() == 0){
            error = error + 1;
        }
        try{
            Edad = Integer.parseInt(TEdad.getText());
            if (Edad < 18){
                error = error +1;
                JOptionPane.showMessageDialog(this, "Debes ser mayor de 18 a??os", "Error",JOptionPane.WARNING_MESSAGE+JOptionPane.YES_NO_OPTION,null);
            }
        }catch(NumberFormatException e){
            error = error + 1;
        } 
        if(NJardin.length() == 0){
            error = error + 1;
        }
        if(TiJardin.length() == 0){
            error = error + 1;
        } else {
            switch(Var){
                case 1:
                    JDesertico JD;
                    JD = new JDesertico();
                    JD.setNombre(NJardin);
                    JD.setTipo("Desertico");
                    JD.setTemperatura(35, 0, 25);
                    JD.setH_Ambiente(45, 0, 18);
                    JD.setH_Suelo(50, 0, 20);
                    Aux.setJardines(JD);
                    break;
                case 2:
                    JSombra JS;
                    JS = new JSombra();
                    JS.setNombre(NJardin);
                    JS.setTipo("De Sombra");
                    JS.setTemperatura(32, 0, 26);
                    JS.setH_Ambiente(40, 0, 20);
                    JS.setH_Suelo(50, 0, 22);
                    Aux.setJardines(JS);
                    break;
                case 3:
                    JInteriores JI;
                    JI = new JInteriores();
                    JI.setNombre(NJardin);
                    JI.setTipo("De Interiores");
                    JI.setTemperatura(30, 0, 20);
                    JI.setH_Ambiente(30, 0, 22);
                    JI.setH_Suelo(45, 0, 18);
                    Aux.setJardines(JI);
                    break;
            }
        }
        if(Contra1.equalsIgnoreCase(Contra2) && error == 0){
            Aux.setNombre(Nombre);
            Aux.setEdad(Edad);
            Aux.setCorreo(Correo);
            
           // Aux.setJardines(TiJardin); 
          // Aux.setJardines(Jardines);
            Aux.setPassword(Contra1);
            SR.setUsers(Aux);
            login = new Login(SR);
            //login.setGuardar(SR);
            Guardar();
            //login.setSR(SR);
            login.setVisible(true);
            dispose();
        }else{
            JOptionPane.showMessageDialog(this, "Se ingreso informaci??n de manera Incorrecta", "Error",JOptionPane.ERROR_MESSAGE+JOptionPane.YES_NO_OPTION,null);
        }

    }//GEN-LAST:event_AceptarActionPerformed

    private void TJardinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TJardinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TJardinActionPerformed

    private void TJardinItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_TJardinItemStateChanged
        TiJardin = (String)TJardin.getSelectedItem();  
        if(TiJardin.equalsIgnoreCase("Con Plantas Deserticas")){
            Var = 1;
        }else if(TiJardin.equalsIgnoreCase("Con Plantas de Sombra")){
            Var = 2;    
        }else if(TiJardin.equalsIgnoreCase("Con Plantas de Interiores")){
            Var = 3;
        }
        System.out.println(TiJardin);
    }//GEN-LAST:event_TJardinItemStateChanged

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_CancelarActionPerformed

    private void TNomJardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TNomJardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TNomJardActionPerformed

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JButton Cancelar;
    private javax.swing.JPasswordField TContra1;
    private javax.swing.JPasswordField TContra2;
    private javax.swing.JTextField TCorreo;
    private javax.swing.JTextField TEdad;
    private javax.swing.JComboBox<String> TJardin;
    private javax.swing.JTextField TNomJard;
    private javax.swing.JTextField TNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
//Usuario Nuevo;
SistRiego SR;
Login login;
String TiJardin;
int Var;

public void setSR(SistRiego SR){
    this.SR = SR;
}

public void setLogin(Login login){
    this.login = login;
}

public void Guardar(){
            ObjectOutputStream Out;
        try{
            Out = new ObjectOutputStream(new FileOutputStream("Users.data"));
            Out.writeObject(SR);
            Out.close();
        }catch(FileNotFoundException e){
                System.out.println("Archivo No Encontrado");    
        }catch(IOException e){
                System.out.println("No se puede Mostrar");
        } 
}

}
