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
public class Proveedor extends javax.swing.JPanel {

    
    /**
     * Creates new form Principal
     */
    public Proveedor() {
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
        Title = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        Text3 = new javax.swing.JLabel();
        nit_proveedor = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        Text6 = new javax.swing.JLabel();
        nombre_proveedor = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        Text7 = new javax.swing.JLabel();
        telefono_proveedor = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        Text8 = new javax.swing.JLabel();
        correo_proveedor = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        Text9 = new javax.swing.JLabel();
        direccion_proveedor = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        btnaddprove = new javax.swing.JLabel();
        btnbuscarprove = new javax.swing.JLabel();
        btneditprove = new javax.swing.JLabel();
        btnmostrarprove = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Title.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Agregar, Buscar, Modificar y Mostrar Proveedores");
        add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 600, -1));

        jSeparator3.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 10, 260));

        Text3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Text3.setText("Nit Proveedor");
        add(Text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 160, -1));

        nit_proveedor.setForeground(new java.awt.Color(102, 102, 102));
        nit_proveedor.setText("Ingrese el Nit del Proveedor");
        nit_proveedor.setBorder(null);
        nit_proveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nit_proveedorMousePressed(evt);
            }
        });
        nit_proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nit_proveedorActionPerformed(evt);
            }
        });
        nit_proveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nit_proveedorKeyTyped(evt);
            }
        });
        add(nit_proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 270, 30));

        jSeparator4.setForeground(new java.awt.Color(51, 153, 255));
        jSeparator4.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 270, 10));

        Text6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Text6.setText("Nombre");
        add(Text6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 140, -1));

        nombre_proveedor.setForeground(new java.awt.Color(102, 102, 102));
        nombre_proveedor.setText("Ingrese el Nombre del Proveedor");
        nombre_proveedor.setBorder(null);
        nombre_proveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nombre_proveedorMousePressed(evt);
            }
        });
        nombre_proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_proveedorActionPerformed(evt);
            }
        });
        nombre_proveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombre_proveedorKeyTyped(evt);
            }
        });
        add(nombre_proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 270, 30));

        jSeparator7.setForeground(new java.awt.Color(51, 153, 255));
        jSeparator7.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 270, 10));

        Text7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Text7.setText("Telefono");
        add(Text7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 190, -1));

        telefono_proveedor.setForeground(new java.awt.Color(102, 102, 102));
        telefono_proveedor.setText("Ingrese el Telefono del Proveedor");
        telefono_proveedor.setBorder(null);
        telefono_proveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                telefono_proveedorMousePressed(evt);
            }
        });
        telefono_proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefono_proveedorActionPerformed(evt);
            }
        });
        telefono_proveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefono_proveedorKeyTyped(evt);
            }
        });
        add(telefono_proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 270, 30));

        jSeparator8.setForeground(new java.awt.Color(51, 153, 255));
        jSeparator8.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 270, 10));

        Text8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Text8.setText("Correo");
        add(Text8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 150, -1));

        correo_proveedor.setForeground(new java.awt.Color(102, 102, 102));
        correo_proveedor.setText("Ingrese el Correo del Proveedor");
        correo_proveedor.setBorder(null);
        correo_proveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                correo_proveedorMousePressed(evt);
            }
        });
        correo_proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correo_proveedorActionPerformed(evt);
            }
        });
        correo_proveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                correo_proveedorKeyTyped(evt);
            }
        });
        add(correo_proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 250, 30));

        jSeparator9.setForeground(new java.awt.Color(51, 153, 255));
        jSeparator9.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 250, 10));

        Text9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Text9.setText("Direccion");
        add(Text9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 180, -1));

        direccion_proveedor.setForeground(new java.awt.Color(102, 102, 102));
        direccion_proveedor.setText("Ingrese la Direccion del Proveedor");
        direccion_proveedor.setBorder(null);
        direccion_proveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                direccion_proveedorMousePressed(evt);
            }
        });
        direccion_proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccion_proveedorActionPerformed(evt);
            }
        });
        direccion_proveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                direccion_proveedorKeyTyped(evt);
            }
        });
        add(direccion_proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 250, 30));

        jSeparator10.setForeground(new java.awt.Color(51, 153, 255));
        jSeparator10.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 250, 10));

        btnaddprove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/addprove2.png"))); // NOI18N
        btnaddprove.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnaddprove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnaddproveMouseClicked(evt);
            }
        });
        add(btnaddprove, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, -1, -1));

        btnbuscarprove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnbuscar.png"))); // NOI18N
        btnbuscarprove.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnbuscarprove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnbuscarproveMouseClicked(evt);
            }
        });
        add(btnbuscarprove, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, -1, -1));

        btneditprove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnedit.png"))); // NOI18N
        btneditprove.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btneditprove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btneditproveMouseClicked(evt);
            }
        });
        add(btneditprove, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, -1, -1));

        btnmostrarprove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnmostrar.png"))); // NOI18N
        btnmostrarprove.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(btnmostrarprove, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 380, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoico5.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 620));
    }// </editor-fold>//GEN-END:initComponents

    private void nit_proveedorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nit_proveedorMousePressed
    if (nit_proveedor.getText().equals("Ingrese el Nit del Proveedor")) {
            nit_proveedor.setText("");
            nit_proveedor.setForeground(Color.black);
        }
    
    if (nombre_proveedor.getText().isEmpty()) {
            nombre_proveedor.setText("Ingrese el Nombre del Proveedor");
            nombre_proveedor.setForeground(Color.gray);
        }
    
    if (telefono_proveedor.getText().isEmpty()) {
            telefono_proveedor.setText("Ingrese el Telefono del Proveedor");
            telefono_proveedor.setForeground(Color.gray);
        }
    
    if (correo_proveedor.getText().isEmpty()) {
            correo_proveedor.setText("Ingrese el Correo del Proveedor");
            correo_proveedor.setForeground(Color.gray);
        }
    
    if (direccion_proveedor.getText().isEmpty()) {
            direccion_proveedor.setText("Ingrese la Direccion del Proveedor");
            direccion_proveedor.setForeground(Color.gray);
        }
    
    
    }//GEN-LAST:event_nit_proveedorMousePressed

    private void nit_proveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nit_proveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nit_proveedorActionPerformed

    private void nombre_proveedorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombre_proveedorMousePressed
    if (nombre_proveedor.getText().equals("Ingrese el Nombre del Proveedor")) {
            nombre_proveedor.setText("");
            nombre_proveedor.setForeground(Color.black);
        }
    
    if (nit_proveedor.getText().isEmpty()) {
            nit_proveedor.setText("Ingrese el Nit del Proveedor");
            nit_proveedor.setForeground(Color.gray);
        }
    
    if (telefono_proveedor.getText().isEmpty()) {
            telefono_proveedor.setText("Ingrese el Telefono del Proveedor");
            telefono_proveedor.setForeground(Color.gray);
        }
    
    if (correo_proveedor.getText().isEmpty()) {
            correo_proveedor.setText("Ingrese el Correo del Proveedor");
            correo_proveedor.setForeground(Color.gray);
        }
    
    if (direccion_proveedor.getText().isEmpty()) {
            direccion_proveedor.setText("Ingrese la Direccion del Proveedor");
            direccion_proveedor.setForeground(Color.gray);
        }
    
   
    }//GEN-LAST:event_nombre_proveedorMousePressed

    private void nombre_proveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_proveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre_proveedorActionPerformed

    private void telefono_proveedorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telefono_proveedorMousePressed
    if (telefono_proveedor.getText().equals("Ingrese el Telefono del Proveedor")) {
            telefono_proveedor.setText("");
            telefono_proveedor.setForeground(Color.black);
        }
    
    if (nit_proveedor.getText().isEmpty()) {
            nit_proveedor.setText("Ingrese el Nit del Proveedor");
            nit_proveedor.setForeground(Color.gray);
        }
    
    if (nombre_proveedor.getText().isEmpty()) {
            nombre_proveedor.setText("Ingrese el Nombre del Proveedor");
            nombre_proveedor.setForeground(Color.gray);
        }
    
    if (correo_proveedor.getText().isEmpty()) {
            correo_proveedor.setText("Ingrese el Correo del Proveedor");
            correo_proveedor.setForeground(Color.gray);
        }
    
    if (direccion_proveedor.getText().isEmpty()) {
            direccion_proveedor.setText("Ingrese la Direccion del Proveedor");
            direccion_proveedor.setForeground(Color.gray);
        }
    
    
    }//GEN-LAST:event_telefono_proveedorMousePressed

    private void telefono_proveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefono_proveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefono_proveedorActionPerformed

    private void correo_proveedorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_correo_proveedorMousePressed
    if (correo_proveedor.getText().equals("Ingrese el Correo del Proveedor")) {
            correo_proveedor.setText("");
            correo_proveedor.setForeground(Color.black);
        }
    
    if (nit_proveedor.getText().isEmpty()) {
            nit_proveedor.setText("Ingrese el Nit del Proveedor");
            nit_proveedor.setForeground(Color.gray);
        }
    
    if (nombre_proveedor.getText().isEmpty()) {
            nombre_proveedor.setText("Ingrese el Nombre del Proveedor");
            nombre_proveedor.setForeground(Color.gray);
        }
    
    if (telefono_proveedor.getText().isEmpty()) {
            telefono_proveedor.setText("Ingrese el Telefono del Proveedor");
            telefono_proveedor.setForeground(Color.gray);
        }
    
    if (direccion_proveedor.getText().isEmpty()) {
            direccion_proveedor.setText("Ingrese la Direccion del Proveedor");
            direccion_proveedor.setForeground(Color.gray);
        }
    
    
    }//GEN-LAST:event_correo_proveedorMousePressed

    private void correo_proveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correo_proveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correo_proveedorActionPerformed

    private void direccion_proveedorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_direccion_proveedorMousePressed
    if (direccion_proveedor.getText().equals("Ingrese la Direccion del Proveedor")) {
            direccion_proveedor.setText("");
            direccion_proveedor.setForeground(Color.black);
        }
    
    if (nit_proveedor.getText().isEmpty()) {
            nit_proveedor.setText("Ingrese el Nit del Proveedor");
            nit_proveedor.setForeground(Color.gray);
        }
    
    if (nombre_proveedor.getText().isEmpty()) {
            nombre_proveedor.setText("Ingrese el Nombre del Proveedor");
            nombre_proveedor.setForeground(Color.gray);
        }
    
    if (correo_proveedor.getText().isEmpty()) {
            correo_proveedor.setText("Ingrese el Correo del Proveedor");
            correo_proveedor.setForeground(Color.gray);
        }
    
    if (telefono_proveedor.getText().isEmpty()) {
            telefono_proveedor.setText("Ingrese el Telefono del Proveedor");
            telefono_proveedor.setForeground(Color.gray);
        }
    
    
    }//GEN-LAST:event_direccion_proveedorMousePressed

    private void direccion_proveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccion_proveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccion_proveedorActionPerformed
   
    private void nit_proveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nit_proveedorKeyTyped
    char c = evt.getKeyChar();
    if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_nit_proveedorKeyTyped

    private void nombre_proveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombre_proveedorKeyTyped
    
    }//GEN-LAST:event_nombre_proveedorKeyTyped

    private void telefono_proveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefono_proveedorKeyTyped
    char c = evt.getKeyChar();
    if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_telefono_proveedorKeyTyped

    private void correo_proveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_correo_proveedorKeyTyped
    
    }//GEN-LAST:event_correo_proveedorKeyTyped

    private void direccion_proveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_direccion_proveedorKeyTyped
    
    }//GEN-LAST:event_direccion_proveedorKeyTyped

    private void btnaddproveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnaddproveMouseClicked
        try {
            // TODO add your handling code here:
            Conexion con = new Conexion();
            con.ConexionPostgres();
            if(correo_proveedor.getText().contains("@") && correo_proveedor.getText().contains(".")){
                if(telefono_proveedor.getText().length()==10){
                    String query ="INSERT INTO proveedor VALUES("+ Long.parseLong(nit_proveedor.getText().trim())+ ",'" + nombre_proveedor.getText().trim() + "','" + correo_proveedor.getText().trim() + "',"+ Long.parseLong(telefono_proveedor.getText().trim())+ ",'"+ direccion_proveedor.getText().trim() +"')";
                    JOptionPane.showMessageDialog(this, "Registro exitoso");
                    con.actualizar(query);
                    
                    con.cerrar();
                    nit_proveedor.setText(null);
                    nombre_proveedor.setText(null);
                    direccion_proveedor.setText(null);
                    correo_proveedor.setText(null);
                    telefono_proveedor.setText(null);
                }
                else{
                    JOptionPane.showMessageDialog(this, "Telefono Invalido");
                }
            }
            else{
                JOptionPane.showMessageDialog(this, "Correo Invalido");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Proveedor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Proveedor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Proveedor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Proveedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnaddproveMouseClicked

    private void btnbuscarproveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbuscarproveMouseClicked
        try {
            // TODO add your handling code here:
            Conexion con = new Conexion();
            con.ConexionPostgres();
            
            String query ="select * from proveedor where nit_proveedor = "+ Integer.parseInt(nit_proveedor.getText().trim());
            
            ResultSet rs = con.consultar(query);
            
            if(rs.next()){
                nombre_proveedor.setText(rs.getString("nombre_proveedor"));
                correo_proveedor.setText(rs.getString("correo_proveedor"));
                telefono_proveedor.setText(rs.getString("telefono_proveedor"));
                direccion_proveedor.setText(rs.getString("direccion_proveedor"));
            }
            else{
                JOptionPane.showMessageDialog(this, "No existe el Proveedor");
            }
            con.cerrar();
            nit_proveedor.setForeground(Color.black);
            nombre_proveedor.setForeground(Color.black);
            telefono_proveedor.setForeground(Color.black);
            correo_proveedor.setForeground(Color.black);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Proveedor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Proveedor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Proveedor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Proveedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnbuscarproveMouseClicked

    private void btneditproveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneditproveMouseClicked
        try {
            // TODO add your handling code here:
            Conexion con = new Conexion();
            con.ConexionPostgres();
            
            String query ="update proveedor set nombre_proveedor = '"+nombre_proveedor.getText().trim()+"', correo_proveedor='"+correo_proveedor.getText().trim()+ "', telefono_proveedor="+ Long.parseLong(telefono_proveedor.getText().trim())+ ", direccion_proveedor = '"+ direccion_proveedor.getText().trim() +"' where nit_proveedor="+Long.parseLong(nit_proveedor.getText().trim());
            JOptionPane.showMessageDialog(this, "Datos Actualizados");
            con.actualizar(query);
            
            con.cerrar();
            nit_proveedor.setText(null);
            correo_proveedor.setText(null);
            telefono_proveedor.setText(null);
            direccion_proveedor.setText(null);        
            nombre_proveedor.setText(null);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Proveedor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Proveedor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Proveedor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Proveedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btneditproveMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Text3;
    private javax.swing.JLabel Text6;
    private javax.swing.JLabel Text7;
    private javax.swing.JLabel Text8;
    private javax.swing.JLabel Text9;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel body;
    private javax.swing.JLabel btnaddprove;
    private javax.swing.JLabel btnbuscarprove;
    private javax.swing.JLabel btneditprove;
    private javax.swing.JLabel btnmostrarprove;
    private javax.swing.JTextField correo_proveedor;
    private javax.swing.JTextField direccion_proveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField nit_proveedor;
    private javax.swing.JTextField nombre_proveedor;
    private javax.swing.JTextField telefono_proveedor;
    // End of variables declaration//GEN-END:variables
}