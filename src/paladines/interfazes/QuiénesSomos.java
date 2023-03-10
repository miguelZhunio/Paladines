/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package paladines.interfazes;

/**
 *
 * @author IV
 */
public class QuiénesSomos extends javax.swing.JFrame {

    /**
     * Creates new form QuiénesSomos
     */
    public QuiénesSomos() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Informacion");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        fMiguel = new javax.swing.JLabel();
        fIsaac = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Ferick = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fJose = new javax.swing.JLabel();
        fSebas = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paladines/iconos/flecha-hacia-atras.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("¿Quiénes somos?");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 226, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 3, 13)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Somos una sistema que ofrece un servicio de compra y venta de ganado.\n\nLos compradores suelen buscar animales sanos y fuertes para criar y vender en\nel futuro, mientras que los vendedores buscan obtener el mejor precio posible por\nsus animales. La finalidad de este sistema es importante ya que tanto compradores \ncomo vendedores puean realizar transacciones justas y honestas para mantener la\nsostenibilidad de la industria ganadera.\nAdemas este sistema tiene una parte apartado en donde se podra pedir el\ntransporte para el ganado, tambien para la factura y una feria en donde podran \nasistir, y observar de forma presencial nuevos ganados.\n\nLos integrantes en la creación de este sisema son:");
        jTextArea1.setEnabled(false);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 490, 220));

        fMiguel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(fMiguel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 101, 112));

        fIsaac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paladines/iconos/IsaacVilla.jpg"))); // NOI18N
        fIsaac.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(fIsaac, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, -1, -1));

        jLabel3.setText("Miguel Zhunio");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 91, 33));

        jLabel2.setText("Isaac Villa");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 82, 33));

        Ferick.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(Ferick, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 108, 112));

        jLabel4.setText("Erick Guarango");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, -1, -1));

        jLabel5.setText("Jose Benavides");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 440, -1, -1));

        jLabel6.setText("Sebastian Avila");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 430, -1, 28));

        fJose.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(fJose, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, 117, 112));

        fSebas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(fSebas, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 310, 117, 112));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paladines/iconos/cielo.jpg"))); // NOI18N
        jPanel2.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        principal msotrarPrincipal = new principal();
        msotrarPrincipal.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ferick;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel fIsaac;
    private javax.swing.JLabel fJose;
    private javax.swing.JLabel fMiguel;
    private javax.swing.JLabel fSebas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
