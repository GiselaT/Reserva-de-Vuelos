/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservadevuelosvista;

/**
 *
 * @author Usuario
 */
public class VistaCompra extends javax.swing.JInternalFrame {

    /**
     * Creates new form VistaCompra
     */
    public VistaCompra() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtCompra = new javax.swing.JLabel();
        jtCliente = new javax.swing.JLabel();
        jtAsiento = new javax.swing.JLabel();
        jtVuelo = new javax.swing.JLabel();
        txtCompra = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();
        txtAsientos = new javax.swing.JTextField();
        txtVuelo = new javax.swing.JTextField();
        btBuscar = new javax.swing.JToggleButton();
        btGuardar = new javax.swing.JToggleButton();
        btBorrar = new javax.swing.JToggleButton();
        btActualizar = new javax.swing.JToggleButton();

        jPanel1.setBackground(new java.awt.Color(173, 216, 230));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("COMPRA");

        jtCompra.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtCompra.setText("Compra");

        jtCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtCliente.setText("Cliente");

        jtAsiento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtAsiento.setText("Asiento");

        jtVuelo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtVuelo.setText("Vuelo");

        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        btGuardar.setText("Guardar");

        btBorrar.setText("Borrar");

        btActualizar.setText("Actualizar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtCompra)
                                .addGap(71, 71, 71)
                                .addComponent(txtCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtCliente)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jtVuelo)
                                        .addComponent(jtAsiento)))
                                .addGap(74, 74, 74)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCliente)
                                    .addComponent(txtAsientos)
                                    .addComponent(txtVuelo, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(btBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(btGuardar)
                                .addGap(68, 68, 68)
                                .addComponent(btBorrar)
                                .addGap(55, 55, 55)
                                .addComponent(btActualizar))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtCompra)
                            .addComponent(txtCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(jtCliente))
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtAsiento)
                    .addComponent(txtAsientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtVuelo)
                    .addComponent(txtVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 279, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btBuscar)
                    .addComponent(btGuardar)
                    .addComponent(btBorrar)
                    .addComponent(btActualizar))
                .addGap(53, 53, 53))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btActualizar;
    private javax.swing.JToggleButton btBorrar;
    private javax.swing.JToggleButton btBuscar;
    private javax.swing.JToggleButton btGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jtAsiento;
    private javax.swing.JLabel jtCliente;
    private javax.swing.JLabel jtCompra;
    private javax.swing.JLabel jtVuelo;
    private javax.swing.JTextField txtAsientos;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtCompra;
    private javax.swing.JTextField txtVuelo;
    // End of variables declaration//GEN-END:variables
}
