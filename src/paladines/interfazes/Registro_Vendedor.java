package paladines.interfazes;




import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Registro_Vendedor extends javax.swing.JFrame {

    /**
     * Creates new form Registro
     */
    public Registro_Vendedor() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtnom = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtapell = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ciudVend = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtcell = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtdic = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        edadVend = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        regisVend = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtpost = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtcontr = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        txtcont = new javax.swing.JPasswordField();
        txtced = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 102, 0)), "Registro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 102, 0))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Bradley Hand ITC", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setText("Registro Vendedor");

        jLabel2.setBackground(new java.awt.Color(153, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Nombre:");

        txtnom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomActionPerformed(evt);
            }
        });
        txtnom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnomKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("Apellido:");

        txtapell.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapellKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("Cedula:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText(" E-mail");

        txtmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmailKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setText("Ciudad");

        ciudVend.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cuenca", "Quito", "Ambato", "Azogues", "Otavalo", "Riobamba" }));
        ciudVend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ciudVendActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 102));
        jLabel7.setText("Conformar Contraseña:");

        txtcell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcellActionPerformed(evt);
            }
        });
        txtcell.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcellKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 102));
        jLabel8.setText("Edad");

        txtdic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdicKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 102));
        jLabel9.setText("Celular:");

        edadVend.setModel(new javax.swing.SpinnerNumberModel(18, 18, null, 1));

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paladines/iconos/flecha-hacia-atras.png"))); // NOI18N
        jButton1.setText("ATRAS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        regisVend.setBackground(new java.awt.Color(0, 102, 102));
        regisVend.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        regisVend.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paladines/iconos/registrarse.png"))); // NOI18N
        regisVend.setText("REGISTRAR");
        regisVend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regisVendActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 102));
        jLabel10.setText("Codigo Postal:");

        txtpost.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpostKeyTyped(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 102));
        jLabel11.setText("Direccion:");

        txtcontr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontrActionPerformed(evt);
            }
        });
        txtcontr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcontrKeyTyped(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 102));
        jLabel13.setText("Contraseña:");

        txtcont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontActionPerformed(evt);
            }
        });
        txtcont.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcontKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcontKeyTyped(evt);
            }
        });

        txtced.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcedKeyTyped(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtmail, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtcell, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtdic, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(96, 96, 96))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel8)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(edadVend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jLabel10))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel6)
                                                    .addGap(27, 27, 27)
                                                    .addComponent(ciudVend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(txtpost, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtcontr, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtnom, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel3)
                                                    .addComponent(jLabel4))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtapell)
                                                    .addComponent(txtced)))))
                                    .addGap(16, 16, 16)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(txtcont, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 27, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(regisVend)
                .addGap(61, 61, 61)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtnom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtapell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtced, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcontr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtdic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtcell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edadVend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ciudVend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regisVend)
                    .addComponent(jButton1))
                .addGap(87, 87, 87))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 490, 570));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paladines/iconos/Granja.jpg"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 690, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ciudVendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ciudVendActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ciudVendActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void regisVendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regisVendActionPerformed
        // TODO add your handling code here:
         login_vendedor ingresar=new login_vendedor();
        ingresar.setVisible(true);
        dispose();
//        try{
//            Persona per=new Persona();
//            per.setNombres(nom.getText());
//            per.setApellidos(apll.getText());
//            per.setCedula(ced.getText().length());
//            per.setEmail(mail.getText());
//            per.setCiudad(ciud.getSelectedItem().toString());
//            per.setDireccion(direc.getText());
//            per.setCelular(cell.getText());
//            per.setEdad(edad.getValue().hashCode());
//            per.setCodPostal(post.getText());
//            
//            
//        }catch (Exception e){
//            JOptionPane.showInternalMessageDialog(this, "Error al ingresar un dato");
//        }
    }//GEN-LAST:event_regisVendActionPerformed

    private void txtnomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomActionPerformed

    private void txtcellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcellActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcellActionPerformed

    private void txtcontrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcontrActionPerformed

    private void txtcontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcontActionPerformed

    private void txtnomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomKeyTyped
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
        else if (txtnom.getText().length() >= 20) {
            evt.consume();
        }
    }//GEN-LAST:event_txtnomKeyTyped

    private void txtapellKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellKeyTyped
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
        else if (txtapell.getText().length() >= 20) {
            evt.consume();
        }
    }//GEN-LAST:event_txtapellKeyTyped

    private void txtdicKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdicKeyTyped
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
        else if (txtdic.getText().length() >= 50) {
            evt.consume();
        }
    }//GEN-LAST:event_txtdicKeyTyped

    private void txtcedKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcedKeyTyped
        // TODO add your handling code here:
        char aux = evt.getKeyChar();
        boolean ced = aux >= 48 && aux < 58;
        boolean ret =aux == 8;
        boolean ent = aux == 13;

        if (ced == false&& ret== false && ent== false ) {
            System.out.println(evt.getKeyChar());
            evt.consume();
        } else if (txtced.getText().length() >= 10) {
            evt.consume();
        }
    
    }//GEN-LAST:event_txtcedKeyTyped

    private void txtmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmailKeyTyped
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
        else if (txtmail.getText().length() >= 20) {
            evt.consume();
        }
    }//GEN-LAST:event_txtmailKeyTyped

    private void txtcontKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcontKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcontKeyReleased

    private void txtcontKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcontKeyTyped
        // TODO add your handling code here:
        char aux = evt.getKeyChar();
        boolean con= aux >= 32&& aux< 126;
        boolean ret =aux == 127;
        boolean ent = aux == 10;
        if(txtcont.getText().length()> 30 && ent== false){
            evt.consume();
        }
        else if (con== false && ret == false ){
            System.out.println(evt.getKeyChar());
            evt.consume();
        }
    }//GEN-LAST:event_txtcontKeyTyped

    private void txtcontrKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcontrKeyTyped
        // TODO add your handling code here:
        char aux = evt.getKeyChar();
        boolean con= aux >= 32&& aux< 126;
        boolean ret =aux == 127;
        boolean ent = aux == 10;
        if(txtcontr.getText().length()> 25 && ent== false){
            evt.consume();
        }
        else if (con== false && ret == false ){
            System.out.println(evt.getKeyChar());
            evt.consume();
        }
    }//GEN-LAST:event_txtcontrKeyTyped

    private void txtcellKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcellKeyTyped
        // TODO add your handling code here:
        char aux = evt.getKeyChar();
        boolean ced = aux >= 48 && aux < 58;
        boolean ret =aux == 8;
        boolean ent = aux == 13;

        if (ced == false&& ret== false && ent== false ) {
            System.out.println(evt.getKeyChar());
            evt.consume();
        } else if (txtcell.getText().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtcellKeyTyped

    private void txtpostKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpostKeyTyped
        // TODO add your handling code here:
        char aux = evt.getKeyChar();
        boolean ced = aux >= 48 && aux < 58;
        boolean ret =aux == 8;
        boolean ent = aux == 13;

        if (ced == false&& ret== false && ent== false ) {
            System.out.println(evt.getKeyChar());
            evt.consume();
        } else if (txtpost.getText().length() >= 6) {
            evt.consume();
        }
    }//GEN-LAST:event_txtpostKeyTyped

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ciudVend;
    private javax.swing.JSpinner edadVend;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton regisVend;
    private javax.swing.JTextField txtapell;
    private javax.swing.JTextField txtced;
    private javax.swing.JTextField txtcell;
    private javax.swing.JPasswordField txtcont;
    private javax.swing.JPasswordField txtcontr;
    private javax.swing.JTextField txtdic;
    private javax.swing.JTextField txtmail;
    private javax.swing.JTextField txtnom;
    private javax.swing.JTextField txtpost;
    // End of variables declaration//GEN-END:variables
}
