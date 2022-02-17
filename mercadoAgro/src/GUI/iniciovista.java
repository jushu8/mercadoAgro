/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package GUI;

import AppPackage.AnimationClass;
import java.awt.Desktop;
import java.net.URI;
import javax.swing.JOptionPane;

public class iniciovista extends javax.swing.JFrame {

    /** Creates new form iniciovista */
    public iniciovista() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public void OpenInternet(){
        try{
            Desktop.getDesktop().browse(URI.create("www.google.com"));
        } catch (Exception e){
            JOptionPane.showConfirmDialog(this, e);
        }
    }
     public void OpenMusica(){
        try{
            Desktop.getDesktop().browse(URI.create("https://open.spotify.com"));
        } catch (Exception e){
            JOptionPane.showConfirmDialog(this, e);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imgventas = new javax.swing.JPanel();
        imgreporte = new javax.swing.JLabel();
        imgcategoria = new javax.swing.JLabel();
        imgproveedor = new javax.swing.JLabel();
        imghogar = new javax.swing.JLabel();
        imgclientes = new javax.swing.JLabel();
        imginventario = new javax.swing.JLabel();
        reportetxt = new javax.swing.JLabel();
        ventastxt = new javax.swing.JLabel();
        categoriatxt = new javax.swing.JLabel();
        proveedortxt = new javax.swing.JLabel();
        clientestxt = new javax.swing.JLabel();
        invtxt = new javax.swing.JLabel();
        imgusuario = new javax.swing.JLabel();
        usuariotxt = new javax.swing.JLabel();
        btnmenu = new javax.swing.JLabel();
        btncalculadora = new javax.swing.JLabel();
        btnmusica = new javax.swing.JLabel();
        btninternet = new javax.swing.JLabel();
        imgventas1 = new javax.swing.JLabel();
        hogartxt = new javax.swing.JLabel();
        jpmostrar = new javax.swing.JPanel();
        jphead = new javax.swing.JPanel();
        btncerrar = new javax.swing.JLabel();
        btnminimi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgventas.setBackground(new java.awt.Color(0, 153, 204));
        imgventas.setForeground(new java.awt.Color(255, 255, 255));
        imgventas.setToolTipText("");
        imgventas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgreporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/facturacion2.png"))); // NOI18N
        imgreporte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imgreporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgreporteMouseClicked(evt);
            }
        });
        imgventas.add(imgreporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 203, -1, -1));

        imgcategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/estadotienda2.png"))); // NOI18N
        imgcategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imgcategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgcategoriaMouseClicked(evt);
            }
        });
        imgventas.add(imgcategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 264, -1, -1));

        imgproveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/proveedor2.png"))); // NOI18N
        imgproveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imgproveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgproveedorMouseClicked(evt);
            }
        });
        imgventas.add(imgproveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 325, -1, -1));

        imghogar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hogar2.png"))); // NOI18N
        imghogar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imghogar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imghogarMouseClicked(evt);
            }
        });
        imgventas.add(imghogar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        imgclientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/contactos2.png"))); // NOI18N
        imgclientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imgclientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgclientesMouseClicked(evt);
            }
        });
        imgventas.add(imgclientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 386, -1, -1));

        imginventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/inventario2.png"))); // NOI18N
        imginventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imginventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imginventarioMouseClicked(evt);
            }
        });
        imgventas.add(imginventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 447, -1, -1));

        reportetxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        reportetxt.setText("Reportes");
        reportetxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        imgventas.add(reportetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(-115, 203, 113, 50));

        ventastxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ventastxt.setText("Ventas");
        ventastxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        imgventas.add(ventastxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(-115, 142, 113, 50));

        categoriatxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        categoriatxt.setText("Categorias");
        categoriatxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        imgventas.add(categoriatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(-115, 264, 113, 50));

        proveedortxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        proveedortxt.setText("Proveedores");
        proveedortxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        imgventas.add(proveedortxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(-115, 325, -1, 50));

        clientestxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        clientestxt.setText("Clientes");
        clientestxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        imgventas.add(clientestxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(-115, 386, 113, 50));

        invtxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        invtxt.setText("Inventario");
        invtxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        imgventas.add(invtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(-115, 447, 113, 50));

        imgusuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuarios2.png"))); // NOI18N
        imgusuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imgusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgusuarioMouseClicked(evt);
            }
        });
        imgventas.add(imgusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 508, -1, -1));

        usuariotxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        usuariotxt.setText("Usuarios");
        usuariotxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        imgventas.add(usuariotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(-115, 508, 113, 50));

        btnmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu2.png"))); // NOI18N
        btnmenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnmenuMouseClicked(evt);
            }
        });
        imgventas.add(btnmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        btncalculadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calculadora2.png"))); // NOI18N
        btncalculadora.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncalculadora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncalculadoraMouseClicked(evt);
            }
        });
        imgventas.add(btncalculadora, new org.netbeans.lib.awtextra.AbsoluteConstraints(-35, 20, -1, -1));

        btnmusica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/musica2.png"))); // NOI18N
        btnmusica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnmusica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnmusicaMouseClicked(evt);
            }
        });
        imgventas.add(btnmusica, new org.netbeans.lib.awtextra.AbsoluteConstraints(-35, 20, -1, -1));

        btninternet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/internet2.png"))); // NOI18N
        btninternet.setToolTipText("");
        btninternet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btninternet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btninternetMouseClicked(evt);
            }
        });
        imgventas.add(btninternet, new org.netbeans.lib.awtextra.AbsoluteConstraints(-35, 20, -1, -1));

        imgventas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ventas2.png"))); // NOI18N
        imgventas1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imgventas1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgventas1MouseClicked(evt);
            }
        });
        imgventas.add(imgventas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 142, -1, -1));

        hogartxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        hogartxt.setText("INICIO");
        imgventas.add(hogartxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(-115, 80, 113, 50));

        getContentPane().add(imgventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 640));

        jpmostrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jpmostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 740, 610));

        jphead.setBackground(new java.awt.Color(0, 153, 204));
        jphead.setForeground(new java.awt.Color(255, 255, 255));
        jphead.setToolTipText("");
        jphead.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btncerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/apagar.png"))); // NOI18N
        btncerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncerrarMouseClicked(evt);
            }
        });
        jphead.add(btncerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, -1, 30));

        btnminimi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/minimizar.png"))); // NOI18N
        btnminimi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnminimi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnminimiMouseClicked(evt);
            }
        });
        jphead.add(btnminimi, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, -1, -1));

        getContentPane().add(jphead, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 740, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmenuMouseClicked

       AnimationClass internet = new AnimationClass();
       internet.jLabelXRight(-35, 70, 10, 5, btninternet);
        
       AnimationClass internett = new AnimationClass();
       internett.jLabelXLeft(70, -35, 10, 5, btninternet); 
        
       AnimationClass calculadora = new AnimationClass();
       calculadora.jLabelXRight(-35, 120, 10, 5, btncalculadora);
        
       AnimationClass calculadoras = new AnimationClass();
       calculadoras.jLabelXLeft(120, -35, 10, 5, btncalculadora); 
       
       AnimationClass musica = new AnimationClass();
       musica.jLabelXRight(-35, 160, 10, 5, btnmusica);
        
       AnimationClass musicas = new AnimationClass();
       musicas.jLabelXLeft(160, -35, 10, 5, btnmusica);
       
    }//GEN-LAST:event_btnmenuMouseClicked

    private void imghogarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imghogarMouseClicked

        
        AnimationClass hogar = new AnimationClass();
        hogar.jLabelXRight(-115, 80, 10, 5, hogartxt);
        
        AnimationClass hogarr = new AnimationClass();
        hogarr.jLabelXLeft(80, -115, 10, 5, hogartxt);
    }//GEN-LAST:event_imghogarMouseClicked

    private void imgreporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgreporteMouseClicked
      
        AnimationClass reporte = new AnimationClass();
        reporte.jLabelXRight(-115, 70, 10, 5, reportetxt);
        
        AnimationClass reportes = new AnimationClass();
        reportes.jLabelXLeft(70, -115, 10, 5, reportetxt);
    }//GEN-LAST:event_imgreporteMouseClicked

    private void imgcategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgcategoriaMouseClicked

        AnimationClass catego = new AnimationClass();
        catego.jLabelXRight(-115, 70, 10, 5, categoriatxt);
        
        AnimationClass categor = new AnimationClass();
        categor.jLabelXLeft(70, -115, 10, 5, categoriatxt);
    }//GEN-LAST:event_imgcategoriaMouseClicked

    private void imgproveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgproveedorMouseClicked
        
        AnimationClass prove = new AnimationClass();
        prove.jLabelXRight(-115, 70, 10, 5, proveedortxt);
        
        AnimationClass provee = new AnimationClass();
        provee.jLabelXLeft(70, -115, 10, 5, proveedortxt);
    }//GEN-LAST:event_imgproveedorMouseClicked

    private void imgclientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgclientesMouseClicked
       
        AnimationClass cliente = new AnimationClass();
        cliente.jLabelXRight(-115, 70, 10, 5, clientestxt);
        
        AnimationClass clientes = new AnimationClass();
        clientes.jLabelXLeft(70, -115, 10, 5, clientestxt);
    }//GEN-LAST:event_imgclientesMouseClicked

    private void imginventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imginventarioMouseClicked
       
        AnimationClass inv = new AnimationClass();
        inv.jLabelXRight(-115, 70, 10, 5, invtxt);
        
        AnimationClass inve = new AnimationClass();
        inve.jLabelXLeft(70, -115, 10, 5, invtxt);
    }//GEN-LAST:event_imginventarioMouseClicked

    private void imgusuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgusuarioMouseClicked
        
        AnimationClass usuario = new AnimationClass();
        usuario.jLabelXRight(-115, 70, 10, 5, usuariotxt);
        
        AnimationClass usuarios = new AnimationClass();
        usuarios.jLabelXLeft(70, -115, 10, 5, usuariotxt);
    }//GEN-LAST:event_imgusuarioMouseClicked

    private void btncerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncerrarMouseClicked
        
        try{
            int dialogButton =  JOptionPane.YES_NO_OPTION;
            int result = JOptionPane.showConfirmDialog(null,"Desea cerrar el sistema?", "EXIT", dialogButton);
            if(result == 0){
                System.exit(0);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
            
    }//GEN-LAST:event_btncerrarMouseClicked

    private void btnminimiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnminimiMouseClicked
        
        this.setState(GUI.iniciovista.ICONIFIED);
    }//GEN-LAST:event_btnminimiMouseClicked

    private void btninternetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btninternetMouseClicked
        
        OpenInternet();
    }//GEN-LAST:event_btninternetMouseClicked

    private void btncalculadoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncalculadoraMouseClicked
        
        try {
            Runtime rt= Runtime.getRuntime();
            Process p = rt.exec("calc");
            p.waitFor();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btncalculadoraMouseClicked

    private void btnmusicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmusicaMouseClicked
        
        OpenMusica();
    }//GEN-LAST:event_btnmusicaMouseClicked

    private void imgventas1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgventas1MouseClicked
        
        new ventavista().setVisible(true);
        
        AnimationClass ventas = new AnimationClass();
        ventas.jLabelXRight(-115, 70, 10, 5, ventastxt);
        
        AnimationClass ventass = new AnimationClass();
        ventass.jLabelXLeft(70, -115, 10, 5, ventastxt);
    }//GEN-LAST:event_imgventas1MouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(iniciovista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(iniciovista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(iniciovista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(iniciovista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new iniciovista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btncalculadora;
    private javax.swing.JLabel btncerrar;
    private javax.swing.JLabel btninternet;
    private javax.swing.JLabel btnmenu;
    private javax.swing.JLabel btnminimi;
    private javax.swing.JLabel btnmusica;
    private javax.swing.JLabel categoriatxt;
    private javax.swing.JLabel clientestxt;
    private javax.swing.JLabel hogartxt;
    private javax.swing.JLabel imgcategoria;
    private javax.swing.JLabel imgclientes;
    private javax.swing.JLabel imghogar;
    private javax.swing.JLabel imginventario;
    private javax.swing.JLabel imgproveedor;
    private javax.swing.JLabel imgreporte;
    private javax.swing.JLabel imgusuario;
    private javax.swing.JPanel imgventas;
    private javax.swing.JLabel imgventas1;
    private javax.swing.JLabel invtxt;
    private javax.swing.JPanel jphead;
    private javax.swing.JPanel jpmostrar;
    private javax.swing.JLabel proveedortxt;
    private javax.swing.JLabel reportetxt;
    private javax.swing.JLabel usuariotxt;
    private javax.swing.JLabel ventastxt;
    // End of variables declaration//GEN-END:variables

}
