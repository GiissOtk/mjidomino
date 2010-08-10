/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * VentanaLogin.java
 *
 * Created on Jul 29, 2010, 10:25:45 PM
 */

package Presentacion;
import java.awt.*;
import Dato.Usuario;
import Dato.Jcalendar;
import Presentacion.VentanaLogin;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import Logica.Comunicacion;
/**
 *
 * @author Isra
 */
public class VentanaLogin extends javax.swing.JFrame {

    private static class setVisible {

        public setVisible(boolean b) {
        }
    }
private String nickname,clave,nombre,apellido,avatar;
private Jcalendar fechanaci;
    /** Creates new form VentanaLogin */
    public VentanaLogin() {
        initComponents();
        ImageIcon imagen1 = new ImageIcon("Imagen/avatar1.png");
     
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlUsername = new javax.swing.JLabel();
        jlPassword = new javax.swing.JLabel();
        jpwPassword = new javax.swing.JPasswordField();
        jtfUsername = new javax.swing.JTextField();
        jbAceptar = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jlBienvenidoAiDomino = new javax.swing.JLabel();
        jlUsuarioNuevo = new javax.swing.JLabel();
        jbRegistrar = new javax.swing.JButton();
        jlTituloiDomino = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Soy lo mejor del mundo");
        setBackground(new java.awt.Color(204, 204, 204));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jlUsername.setText("Username: ");

        jlPassword.setText("Password:");

        jpwPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpwPasswordMouseClicked(evt);
            }
        });
        jpwPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpwPasswordActionPerformed(evt);
            }
        });

        jtfUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfUsernameActionPerformed(evt);
            }
        });

        jbAceptar.setText("Aceptar");
        jbAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbAceptarMouseClicked(evt);
            }
        });
        jbAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAceptarActionPerformed(evt);
            }
        });

        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jlBienvenidoAiDomino.setText("Bienvenido A iDomino");

        jlUsuarioNuevo.setText("Usuario Nuevo? Resgistrate!!!");

        jbRegistrar.setText("Registrar");
        jbRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistrarActionPerformed(evt);
            }
        });

        jlTituloiDomino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/titulotext.png"))); // NOI18N

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(275, 275, 275)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(jlUsuarioNuevo)
                        .add(18, 18, 18)
                        .add(jbRegistrar))
                    .add(layout.createSequentialGroup()
                        .add(49, 49, 49)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(jlPassword)
                                    .add(jlUsername))
                                .add(24, 24, 24)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                    .add(jtfUsername)
                                    .add(jpwPassword, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
                                .add(55, 55, 55))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 89, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(jbAceptar)
                                .add(47, 47, 47)
                                .add(jbLimpiar))))
                    .add(layout.createSequentialGroup()
                        .add(104, 104, 104)
                        .add(jlBienvenidoAiDomino))
                    .add(jlTituloiDomino, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 337, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(288, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(134, 134, 134)
                .add(jlTituloiDomino)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jlBienvenidoAiDomino, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(31, 31, 31)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jlUsername)
                    .add(jtfUsername, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jlPassword)
                    .add(jpwPassword, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(30, 30, 30)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jbLimpiar)
                    .add(jbAceptar))
                .add(48, 48, 48)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jlUsuarioNuevo)
                    .add(jbRegistrar))
                .addContainerGap(195, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void VentanaPadre(){
        VentanaLogin VentanaPadre = new VentanaLogin();
        this.setVisible(true);

    }
    private void jbRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrarActionPerformed
        VentanaRegistro ventana = new VentanaRegistro();
        ventana.setVisible(true);
        ventana.setVentanaPadre(this);
        this.setVisible(false);
        

        // TODO add your handling code here:
    }//GEN-LAST:event_jbRegistrarActionPerformed

    private void jbAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAceptarActionPerformed

       
        if (jtfUsername.getText().toString().isEmpty()|| jpwPassword.getText().toString().isEmpty()){

JOptionPane.showMessageDialog(null,"Introduzca Nombre de Usuario Y Password","VALIDACION",JOptionPane.ERROR_MESSAGE);

        }
 else{
        new VentandaDePartdida_VDP().setVisible(true);
            nickname =jtfUsername.getText();
        clave = jpwPassword.getText();
        nombre = "";
        apellido = "";
        //fechanaci = J
        avatar= "";
    }//GEN-LAST:event_jbAceptarActionPerformed
    }
    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed

        jtfUsername.setText("");
        jpwPassword.setText("");
         // TODO add your handling code here:
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jpwPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpwPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpwPasswordActionPerformed

    private void jpwPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpwPasswordMouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_jpwPasswordMouseClicked

    private void jbAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbAceptarMouseClicked
    
        // TODO add your handling code here:
    }//GEN-LAST:event_jbAceptarMouseClicked

    private void jtfUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfUsernameActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
//JOptionPane.showConfirmDialog(null, "Desea Salir del Sistema?","iDomino",JOptionPane.YES_NO_CANCEL_OPTION);//showMessageDialog(null,"Todos los datos son Oblogatorios","Error",JOptionPane.ERROR_MESSAGE);

        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
JOptionPane.showConfirmDialog(null, "Desea Salir del Sistema?","iDomino",JOptionPane.YES_NO_CANCEL_OPTION);//showMessageDialog(null,"Todos los datos son Oblogatorios","Error",JOptionPane.ERROR_MESSAGE);
Comunicacion.solicitarGuardarArchivo();

        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    public void setJtfUsername(JTextField jtfUsername) {
        this.jtfUsername = jtfUsername;
    }

    Usuario logear = new Usuario(nickname,clave,nombre,apellido, fechanaci,avatar);
    /**
    * @param args the command line arguments
    */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbAceptar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbRegistrar;
    private javax.swing.JLabel jlBienvenidoAiDomino;
    private javax.swing.JLabel jlPassword;
    private javax.swing.JLabel jlTituloiDomino;
    private javax.swing.JLabel jlUsername;
    private javax.swing.JLabel jlUsuarioNuevo;
    private javax.swing.JPasswordField jpwPassword;
    private javax.swing.JTextField jtfUsername;
    // End of variables declaration//GEN-END:variables

}
