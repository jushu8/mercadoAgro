/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import clases.Conexion;
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



/**
 *
 * @author Antonio
 */
public class Usuario_CrearCuenta extends javax.swing.JPanel {

    
    /**
     * Creates new form Principal
     */
    public Usuario_CrearCuenta() {
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

        body = new javax.swing.JPanel();
        icon_logo1 = new javax.swing.JLabel();
        titulo1 = new javax.swing.JLabel();
        passLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        confirmacionpass = new javax.swing.JPasswordField();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        pass_usuario = new javax.swing.JPasswordField();
        passLabel2 = new javax.swing.JLabel();
        logclave = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        user_usuario = new javax.swing.JTextField();
        usuario2 = new javax.swing.JLabel();
        iniciosesion1 = new javax.swing.JLabel();
        loguser = new javax.swing.JLabel();
        btnadduser = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 610));
        setPreferredSize(new java.awt.Dimension(750, 610));
        setRequestFocusEnabled(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        icon_logo1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        icon_logo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_logo1.setToolTipText("");
        add(icon_logo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 130, 100));

        titulo1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        titulo1.setText("AgroFacil");
        add(titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, -1));

        passLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        passLabel1.setText("CONFIRMACION");
        add(passLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 140, 30));
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 30, 30));

        confirmacionpass.setForeground(new java.awt.Color(204, 204, 204));
        confirmacionpass.setText("********");
        confirmacionpass.setBorder(null);
        confirmacionpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                confirmacionpassMousePressed(evt);
            }
        });
        add(confirmacionpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 180, 30));

        jSeparator7.setForeground(new java.awt.Color(51, 153, 255));
        add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 180, 20));

        jSeparator6.setForeground(new java.awt.Color(51, 153, 255));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 180, 20));

        jLabel13.setText("Utiliza 8 caracteres como mínimo con una combinación de letras, números y simbolos.");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, 20));

        pass_usuario.setForeground(new java.awt.Color(204, 204, 204));
        pass_usuario.setText("********");
        pass_usuario.setBorder(null);
        pass_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pass_usuarioMousePressed(evt);
            }
        });
        add(pass_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 180, 30));

        passLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        passLabel2.setText("CONTRASEÑA");
        add(passLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 110, 30));

        logclave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/contrasena2.png"))); // NOI18N
        add(logclave, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 40, 30));

        jSeparator4.setForeground(new java.awt.Color(51, 153, 255));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 410, 10));

        jLabel9.setText("Puede utilizar letras, números y símbolos.");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, 20));

        user_usuario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        user_usuario.setForeground(new java.awt.Color(204, 204, 204));
        user_usuario.setText("example_1234");
        user_usuario.setBorder(null);
        user_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                user_usuarioMousePressed(evt);
            }
        });
        add(user_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 410, 30));

        usuario2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        usuario2.setText("USUARIO");
        add(usuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 70, 30));

        iniciosesion1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        iniciosesion1.setText("CREAR CUENTA");
        add(iniciosesion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        loguser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lgusuario2.png"))); // NOI18N
        add(loguser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 30, 30));

        btnadduser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/adduser2.png"))); // NOI18N
        btnadduser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnadduserMouseClicked(evt);
            }
        });
        add(btnadduser, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoico5.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 620));
    }// </editor-fold>//GEN-END:initComponents

    private void confirmacionpassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmacionpassMousePressed
        if (String.valueOf(confirmacionpass.getPassword()).equals("********")) {
            confirmacionpass.setText("");
            confirmacionpass.setForeground(Color.black);
        }
        if (user_usuario.getText().isEmpty()) {
            user_usuario.setText("example_1234");
            user_usuario.setForeground(Color.gray);
        }
        if (String.valueOf(pass_usuario.getPassword()).isEmpty()) {
            pass_usuario.setText("********");
            pass_usuario.setForeground(Color.gray);
        }
    }//GEN-LAST:event_confirmacionpassMousePressed

    private void pass_usuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pass_usuarioMousePressed
        if (String.valueOf(pass_usuario.getPassword()).equals("********")) {
            pass_usuario.setText("");
            pass_usuario.setForeground(Color.black);
        }
        if (user_usuario.getText().isEmpty()) {
            user_usuario.setText("example_1234");
            user_usuario.setForeground(Color.gray);
        }
        if (String.valueOf(confirmacionpass.getPassword()).isEmpty()) {
            confirmacionpass.setText("********");
            confirmacionpass.setForeground(Color.gray);
        }
    }//GEN-LAST:event_pass_usuarioMousePressed

    private void user_usuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_usuarioMousePressed
        if (user_usuario.getText().equals("example_1234")) {
            user_usuario.setText("");
            user_usuario.setForeground(Color.black);
        }
        if (String.valueOf(pass_usuario.getPassword()).isEmpty()) {
            pass_usuario.setText("********");
            pass_usuario.setForeground(Color.gray);
        }
        if (String.valueOf(confirmacionpass.getPassword()).isEmpty()) {
            confirmacionpass.setText("********");
            confirmacionpass.setForeground(Color.gray);
        }
    }//GEN-LAST:event_user_usuarioMousePressed

    private void btnadduserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnadduserMouseClicked
        try {
            // TODO add your handling code here:
            Conexion con = new Conexion();
            con.ConexionPostgres();
            String pass1= String.valueOf(pass_usuario.getPassword());
            String pass2= String.valueOf(confirmacionpass.getPassword());

            if(pass1.equals(pass2)){
                String query ="INSERT INTO usuario VALUES('"+user_usuario.getText()+"','Vendedor','"+String.valueOf(pass_usuario.getPassword())+"')";
                JOptionPane.showMessageDialog(this, "¡Cuenta creada con exito!");

                con.actualizar(query);
                                
            }
            else{
                JOptionPane.showMessageDialog(this, "¡Las contraseñas no coinciden!");
            }
            con.cerrar();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Usuario_CrearCuenta.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Usuario_CrearCuenta.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Usuario_CrearCuenta.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Usuario_CrearCuenta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnadduserMouseClicked
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private javax.swing.JLabel btnadduser;
    private javax.swing.JPasswordField confirmacionpass;
    private javax.swing.JLabel icon_logo1;
    private javax.swing.JLabel iniciosesion1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel logclave;
    private javax.swing.JLabel loguser;
    private javax.swing.JLabel passLabel1;
    private javax.swing.JLabel passLabel2;
    private javax.swing.JPasswordField pass_usuario;
    private javax.swing.JLabel titulo1;
    private javax.swing.JTextField user_usuario;
    private javax.swing.JLabel usuario2;
    // End of variables declaration//GEN-END:variables
}
