/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author ASUS
 */
public class iniciovista extends javax.swing.JFrame {

    int    xMouse, yMouse;
    FondoPanel fondo = new FondoPanel();
    
    public iniciovista() {
        this.setContentPane(fondo);
        initComponents();
       // this.setExtendedState(MAXIMIZED_BOTH);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new FondoPanel();
        inventxt = new javax.swing.JLabel();
        iconinv = new javax.swing.JLabel();
        ventatxt = new javax.swing.JLabel();
        iconventa = new javax.swing.JLabel();
        iconcontact = new javax.swing.JLabel();
        provetxt = new javax.swing.JLabel();
        iconprove = new javax.swing.JLabel();
        estadotxt = new javax.swing.JLabel();
        estadotienda = new javax.swing.JLabel();
        contactxt = new javax.swing.JLabel();
        factxt = new javax.swing.JLabel();
        iconfact = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cerrartxt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        head = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(4088, 3066));
        setMinimumSize(new java.awt.Dimension(4088, 3066));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(4088, 3066));
        setResizable(false);
        getContentPane().setLayout(null);

        bg.setMaximumSize(new java.awt.Dimension(4088, 3066));
        bg.setMinimumSize(new java.awt.Dimension(4088, 3066));
        bg.setPreferredSize(new java.awt.Dimension(4088, 3066));
        bg.setVerifyInputWhenFocusTarget(false);
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inventxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        inventxt.setText("INVENTARIO");
        inventxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inventxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inventxtMouseClicked(evt);
            }
        });
        bg.add(inventxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 460, -1, -1));

        iconinv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/inventario2.png"))); // NOI18N
        iconinv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconinv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconinvMouseClicked(evt);
            }
        });
        bg.add(iconinv, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 50, -1));

        ventatxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ventatxt.setText("VENTAS");
        ventatxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ventatxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ventatxtMouseClicked(evt);
            }
        });
        bg.add(ventatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 130, 40));

        iconventa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconventa.png"))); // NOI18N
        iconventa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconventa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconventaMouseClicked(evt);
            }
        });
        bg.add(iconventa, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 50, 50));

        iconcontact.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconocontactos.png"))); // NOI18N
        iconcontact.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconcontact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconcontactMouseClicked(evt);
            }
        });
        bg.add(iconcontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 50, 50));

        provetxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        provetxt.setText("PROVEEDORES");
        provetxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        provetxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                provetxtMouseClicked(evt);
            }
        });
        bg.add(provetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 140, 30));

        iconprove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconoprovedores.png"))); // NOI18N
        iconprove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconprove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconproveMouseClicked(evt);
            }
        });
        bg.add(iconprove, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 50, 50));

        estadotxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        estadotxt.setText("Estado de Tienda");
        estadotxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        estadotxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                estadotxtMouseClicked(evt);
            }
        });
        bg.add(estadotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 160, 40));

        estadotienda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/estadotienda.png"))); // NOI18N
        estadotienda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        estadotienda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                estadotiendaMouseClicked(evt);
            }
        });
        bg.add(estadotienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 50, 50));

        contactxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        contactxt.setText("CONTACTOS");
        contactxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        contactxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contactxtMouseClicked(evt);
            }
        });
        bg.add(contactxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 130, 30));

        factxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        factxt.setText("FACTURACION");
        factxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        factxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                factxtMouseClicked(evt);
            }
        });
        bg.add(factxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, -1));

        iconfact.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconofacturacion2.png"))); // NOI18N
        iconfact.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconfact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconfactMouseClicked(evt);
            }
        });
        bg.add(iconfact, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 50, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoempresamediano.jpg"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(39, 32));
        jLabel3.setMinimumSize(new java.awt.Dimension(39, 32));
        jLabel3.setPreferredSize(new java.awt.Dimension(39, 32));
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 120, 102));

        cerrartxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cerrartxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cerrartxt.setText("X");
        cerrartxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrartxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrartxtMouseClicked(evt);
            }
        });
        bg.add(cerrartxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        jLabel1.setAlignmentY(0.0F);
        jLabel1.setMaximumSize(new java.awt.Dimension(4088, 3066));
        jLabel1.setMinimumSize(new java.awt.Dimension(4088, 3066));
        jLabel1.setPreferredSize(new java.awt.Dimension(4088, 3066));
        jLabel1.setRequestFocusEnabled(false);
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -6, -1, -1));

        head.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headMouseDragged(evt);
            }
        });
        head.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headMousePressed(evt);
            }
        });

        javax.swing.GroupLayout headLayout = new javax.swing.GroupLayout(head);
        head.setLayout(headLayout);
        headLayout.setHorizontalGroup(
            headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
        );
        headLayout.setVerticalGroup(
            headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        bg.add(head, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 40));

        getContentPane().add(bg);
        bg.setBounds(0, 0, 4088, 3066);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrartxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrartxtMouseClicked
        
        System.exit(0);
    }//GEN-LAST:event_cerrartxtMouseClicked

    private void headMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headMousePressed
       
        xMouse = evt.getX();
        yMouse = evt.getY();
        
    }//GEN-LAST:event_headMousePressed

    private void headMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headMouseDragged
        
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse,y - yMouse);
        
    }//GEN-LAST:event_headMouseDragged

    private void factxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_factxtMouseClicked
        
         new detallevista().setVisible(true);
    }//GEN-LAST:event_factxtMouseClicked

    private void provetxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_provetxtMouseClicked
       
         new proveedorvista().setVisible(true);
    }//GEN-LAST:event_provetxtMouseClicked

    private void iconproveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconproveMouseClicked
        
        new proveedorvista().setVisible(true);
    }//GEN-LAST:event_iconproveMouseClicked

    private void contactxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactxtMouseClicked
       
        new clientevista().setVisible(true);
    }//GEN-LAST:event_contactxtMouseClicked

    private void iconcontactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconcontactMouseClicked
      
        new clientevista().setVisible(true);
    }//GEN-LAST:event_iconcontactMouseClicked

    private void iconfactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconfactMouseClicked
        
        new detallevista().setVisible(true);
    }//GEN-LAST:event_iconfactMouseClicked

    private void inventxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventxtMouseClicked
       
        new familiavista().setVisible(true);
    }//GEN-LAST:event_inventxtMouseClicked

    private void iconinvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconinvMouseClicked
        
        new familiavista().setVisible(true);
    }//GEN-LAST:event_iconinvMouseClicked

    private void ventatxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ventatxtMouseClicked
        // TODO add your handling code here:
        new ventavista().setVisible(true);
    }//GEN-LAST:event_ventatxtMouseClicked

    private void iconventaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconventaMouseClicked
        // TODO add your handling code here:
        new ventavista().setVisible(true);
    }//GEN-LAST:event_iconventaMouseClicked

    private void estadotxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_estadotxtMouseClicked
        // TODO add your handling code here:
        new estadotiendavista().setVisible(true);
    }//GEN-LAST:event_estadotxtMouseClicked

    private void estadotiendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_estadotiendaMouseClicked
        // TODO add your handling code here:
        new estadotiendavista().setVisible(true);
    }//GEN-LAST:event_estadotiendaMouseClicked

    
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
            java.util.logging.Logger.getLogger(iniciovista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(iniciovista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(iniciovista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(iniciovista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new iniciovista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JLabel cerrartxt;
    private javax.swing.JLabel contactxt;
    private javax.swing.JLabel estadotienda;
    private javax.swing.JLabel estadotxt;
    private javax.swing.JLabel factxt;
    private javax.swing.JPanel head;
    private javax.swing.JLabel iconcontact;
    private javax.swing.JLabel iconfact;
    private javax.swing.JLabel iconinv;
    private javax.swing.JLabel iconprove;
    private javax.swing.JLabel iconventa;
    private javax.swing.JLabel inventxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel provetxt;
    private javax.swing.JLabel ventatxt;
    // End of variables declaration//GEN-END:variables
class FondoPanel extends JPanel{
   
    private Image imagen;
    @Override
     public void paint(Graphics g)
     {
         imagen = new ImageIcon(getClass().getResource("/imagenes/fondotienda.jpg")).getImage();
         g.drawImage(imagen,0, 0, getWidth(), getHeight(),this);
         setOpaque(false);
         super.paint(g);
     }
    
}
}
