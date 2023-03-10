/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package paladines.interfazes;

/**
 *
 * @author IV
 */
public class Lista_Vendedores extends javax.swing.JFrame {

    /**
     * Creates new form Lista_Vendedores
     */
    public Lista_Vendedores() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Lista de Vendedores");
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
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jCBfiltro = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 255, 102));
        jLabel1.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel1.setText("Lista Vendedores");
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(476, 23, 213, 34);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paladines/iconos/flecha-hacia-atras_1.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(16, 6, 50, 32);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paladines/interfazes/community_users_12977.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(695, 23, 125, 0);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"0450799187", "Isaac Geoanny", "Villa Paguay", "20", "0985592917", "Ba??os", "isaac.villa.est@tecazuay.edu.ec"},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Cedula", "Nombres", "Apellidos", "Edad", "Telefono", "Direccion", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(67, 151, 1080, 199);

        jLabel3.setText("Cedula:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(420, 90, 42, 16);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(480, 90, 107, 24);

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Buscar.png"))); // NOI18N
        jPanel1.add(btnConsultar);
        btnConsultar.setBounds(300, 80, 54, 38);

        jButton2.setText("ELiminar");
        jPanel1.add(jButton2);
        jButton2.setBounds(610, 80, 120, 40);

        jCBfiltro.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        jCBfiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opci??n", "Ver todos", "ID" }));
        jCBfiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBfiltroActionPerformed(evt);
            }
        });
        jPanel1.add(jCBfiltro);
        jCBfiltro.setBounds(110, 90, 155, 24);

        jLabel4.setText("Filtro:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(60, 90, 41, 16);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1179, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        menu_adm m = new menu_adm();
        m.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCBfiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBfiltroActionPerformed

    }//GEN-LAST:event_jCBfiltroActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jCBfiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
