package paladines.interfazes;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC01
 */
public class login_vendedor extends javax.swing.JFrame {

    /**
     * Creates new form login_vendedor
     */
    public login_vendedor() {
        initComponents();
        transpariencia();
        
        
        
    }
///
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    public void transpariencia(){
    Registrate.setOpaque(false);
    Registrate.setContentAreaFilled(false);
    Registrate.setBorderPainted(false);
    
}
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtCorrVen = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        Registrate = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtConVen = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCorrVen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtCorrVen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorrVenActionPerformed(evt);
            }
        });
        txtCorrVen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorrVenKeyTyped(evt);
            }
        });
        jPanel3.add(txtCorrVen, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 340, 40));

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Mostrar contraseña");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel3.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        Registrate.setForeground(new java.awt.Color(55, 115, 72));
        Registrate.setText("Registrate ahora");
        Registrate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrateActionPerformed(evt);
            }
        });
        jPanel3.add(Registrate, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, 140, 40));

        jLabel8.setText("¿Todavía no tienes una cuenta?");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 190, 20));

        jButton1.setBackground(new java.awt.Color(55, 115, 72));
        jButton1.setForeground(new java.awt.Color(248, 248, 251));
        jButton1.setText("Iniciar Sesión");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 330, 30));

        txtConVen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtConVen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConVenActionPerformed(evt);
            }
        });
        txtConVen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtConVenKeyTyped(evt);
            }
        });
        jPanel3.add(txtConVen, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 340, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Contraseña");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Usuario");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 90, 20));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Detalles_loginVendedor/Avatar_Container.png"))); // NOI18N
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Detalles_loginVendedor/Encabezado_login.jpg"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Detalles_loginVendedor/Fondo_blanco.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 450, 370));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(25, 25, 25));
        jLabel7.setText("¿Todavía no tienes una cuenta? ");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 600, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 450, 480));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paladines/iconos/Fondo_loginVendedor.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCorrVenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorrVenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorrVenActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed


        // TODO add your handling code here:
        MenuVendedor menvend=new MenuVendedor();
        menvend.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void RegistrateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrateActionPerformed
     
     this.dispose();
     Registro_Vendedor registrateAhora = new Registro_Vendedor();
     registrateAhora.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_RegistrateActionPerformed

    private void txtCorrVenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorrVenKeyTyped
        // TODO add your handling code here:
        char aux = evt.getKeyChar();
        char aux1 = evt.getKeyChar();
        boolean Mayus = aux >= 65 && aux < 90;
        boolean minus = aux1 >= 94 && aux1 < 122;
        boolean ret =aux == 8;
        boolean ent = aux == 13;
        if (Mayus == false&& minus ==false && ret== false && ent== false) {
            System.out.println(evt.getKeyChar());
            evt.consume();}
        else if (txtCorrVen.getText().length() >= 20) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCorrVenKeyTyped

    private void txtConVenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConVenKeyTyped
        // TODO add your handling code here:
        char aux = evt.getKeyChar();
        boolean con= aux >= 32&& aux< 126;
        boolean ret =aux == 127;
        boolean ent = aux == 10;
        if(txtConVen.getText().length()> 30 && ent== false){
            evt.consume();
        }
        else if (con== false && ret == false ){
            System.out.println(evt.getKeyChar());
            evt.consume();}
    }//GEN-LAST:event_txtConVenKeyTyped

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void txtConVenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConVenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConVenActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Registrate;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField txtConVen;
    private javax.swing.JTextField txtCorrVen;
    // End of variables declaration//GEN-END:variables
}
