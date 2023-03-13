/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package paladines.interfazes;

import javax.swing.JOptionPane;

/**
 *
 * @author IV
 */
public class Registro_Comprador extends javax.swing.JFrame {

    /**
     * Creates new form Registro_Comprador
     */
    public Registro_Comprador() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Registro Cliente");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoSexo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        btnCrearCuenta = new javax.swing.JButton();
        txtCedula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtCodigoPostal = new javax.swing.JTextField();
        txtCcalle = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtPasswordConfirmar = new javax.swing.JPasswordField();
        txtTelefono = new javax.swing.JTextField();
        rdMasculino = new javax.swing.JRadioButton();
        rdFemenino = new javax.swing.JRadioButton();
        txtEdad = new javax.swing.JSpinner();
        cbCiudad = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setExtendedState(6);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jLabel1.setText("REGISTRO DE CLIENTE");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 430, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Cedula:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 125, 76, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Nombre:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 159, 87, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Edad:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 229, 76, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Apellido:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 193, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Email:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 125, 76, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("Teléfono:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 300, 98, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("Ciudad:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 159, -1, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setText("Contraseña:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 263, -1, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setText("Confirmar Contraseña:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 294, -1, -1));

        btnRegresar.setBackground(new java.awt.Color(0, 102, 102));
        btnRegresar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paladines/iconos/flecha-hacia-atras_1.png"))); // NOI18N
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel3.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 30));

        btnCrearCuenta.setBackground(new java.awt.Color(0, 102, 102));
        btnCrearCuenta.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCrearCuenta.setText("CREAR CUENTA");
        jPanel3.add(btnCrearCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 386, -1, 40));

        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });
        jPanel3.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 130, 179, -1));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel3.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 164, 179, -1));

        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });
        jPanel3.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 198, 179, -1));

        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailKeyTyped(evt);
            }
        });
        jPanel3.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 130, 180, -1));

        txtCodigoPostal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoPostalKeyTyped(evt);
            }
        });
        jPanel3.add(txtCodigoPostal, new org.netbeans.lib.awtextra.AbsoluteConstraints(568, 234, 90, -1));

        txtCcalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCcalleActionPerformed(evt);
            }
        });
        txtCcalle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCcalleKeyTyped(evt);
            }
        });
        jPanel3.add(txtCcalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 190, 180, -1));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setText("Sexo:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 265, 76, -1));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setText("Codigo Postal:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 229, -1, -1));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel13.setText("Calle:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, -1, -1));

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPasswordKeyTyped(evt);
            }
        });
        jPanel3.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(568, 268, 165, -1));

        txtPasswordConfirmar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPasswordConfirmarKeyTyped(evt);
            }
        });
        jPanel3.add(txtPasswordConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(639, 299, 160, -1));

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        jPanel3.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 305, 124, -1));

        GrupoSexo.add(rdMasculino);
        rdMasculino.setText("Masculino");
        jPanel3.add(rdMasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 269, -1, -1));

        GrupoSexo.add(rdFemenino);
        rdFemenino.setText("Femenino");
        jPanel3.add(rdFemenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, -1, -1));

        txtEdad.setModel(new javax.swing.SpinnerNumberModel(18, 18, null, 1));
        jPanel3.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 234, -1, -1));

        cbCiudad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cuenca", "Quito", "Ambato", "Azogues", "Otavalo", "Riobamba" }));
        cbCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCiudadActionPerformed(evt);
            }
        });
        jPanel3.add(cbCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 164, -1, -1));

        jLabel14.setToolTipText("");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(-120, 130, 540, 440));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 820, 480));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paladines/iconos/Granja.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        //Funcio para llamra  ala vetana principal
        this.dispose();
        principal mostrarPrincipal = new principal();
        mostrarPrincipal.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtCcalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCcalleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCcalleActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void cbCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCiudadActionPerformed

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
        // TODO add your handling code here:
       char aux = evt.getKeyChar();
        boolean ced = aux >= 48 && aux < 58;
        boolean ret =aux == 8;
        boolean ent = aux == 13; 

        if (ced == false&& ret== false && ent== false ) {
            System.out.println(evt.getKeyChar());
            evt.consume();
        } else if (txtCedula.getText().length() > 10) {
            evt.consume();   
    }//GEN-LAST:event_txtCedulaKeyTyped
    }
    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
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
         else if (txtNombre.getText().length() >= 20) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
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
         else if (txtApellido.getText().length() >= 20) {
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        // TODO add your handling code here:
        char aux = evt.getKeyChar();
        char espa = evt.getKeyChar();
        char aux1 = evt.getKeyChar();
        boolean ced = aux >= 48 && aux < 58;
        boolean esa = espa == 32;
        boolean ret =aux == 8;
        boolean ent = aux == 13; 

        if (ced == false&& esa == false && ret== false && ent== false ) {
            System.out.println(evt.getKeyChar());
            evt.consume();
        } else if (txtCedula.getText().length() > 10) {
            evt.consume();}
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyTyped
        // TODO add your handling code here:
        char aux = evt.getKeyChar();
        boolean cor = aux >= 64 && aux < 90;
        boolean cor2 = aux >= 94 && aux < 122;
        boolean car = aux == 65;
        boolean ret =aux == 8;
        boolean ent = aux == 13; 
        if (cor == false&& cor2== false && car == false && ret == false && ent== false) {
            System.out.println(evt.getKeyChar());
            evt.consume();
        } else if (txtEmail.getText().length() > 20) {
            evt.consume();
        }
    }//GEN-LAST:event_txtEmailKeyTyped

    private void txtCcalleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCcalleKeyTyped
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
         else if (txtTelefono.getText().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCcalleKeyTyped

    private void txtCodigoPostalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoPostalKeyTyped
        // TODO add your handling code here:
        char aux = evt.getKeyChar();
        char espa = evt.getKeyChar();
        char aux1 = evt.getKeyChar();
        boolean ced = aux >= 48 && aux < 58;
        boolean esa = espa == 32;
        boolean ret =aux == 8;
        boolean ent = aux == 13; 

        if (ced == false&& esa == false && ret== false && ent== false ) {
            System.out.println(evt.getKeyChar());
            evt.consume();
        } else if (txtCodigoPostal.getText().length() > 6) {
            evt.consume();   
    } 
    }//GEN-LAST:event_txtCodigoPostalKeyTyped

    private void txtPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyTyped
        // TODO add your handling code here:
         char aux = evt.getKeyChar();
        boolean con= aux >= 32&& aux< 126;
        boolean ret =aux == 127;
        boolean ent = aux == 10; 
        if(txtPassword.getText().length()> 25 && ent== false){
            evt.consume();
        }      
        else if (con== false && ret == false ){
            System.out.println(evt.getKeyChar());
            evt.consume();
        }
    }//GEN-LAST:event_txtPasswordKeyTyped

    private void txtPasswordConfirmarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordConfirmarKeyTyped
        // TODO add your handling code here:char aux = evt.getKeyChar();
        char aux= evt.getKeyChar();
        boolean con= aux >= 32&& aux< 126;
        boolean ret =aux == 127;
        boolean ent = aux == 10; 
        if(txtPasswordConfirmar.getText().length()> 25 && ent== false){
            evt.consume();
        }      
        else if (con== false && ret == false ){
            System.out.println(evt.getKeyChar());
            evt.consume();
        }
    }//GEN-LAST:event_txtPasswordConfirmarKeyTyped
    
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.ButtonGroup GrupoSexo;
    private javax.swing.JButton btnCrearCuenta;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cbCiudad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton rdFemenino;
    private javax.swing.JRadioButton rdMasculino;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JPasswordField txtCcalle;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCodigoPostal;
    private javax.swing.JSpinner txtEdad;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtPasswordConfirmar;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
