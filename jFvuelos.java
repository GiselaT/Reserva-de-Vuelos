/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoabasededatos.vistas;

/**
 *
 * @author Hèctor
 */
public class jFvuelos extends javax.swing.JFrame {

    /**
     * Creates new form jFvuelos
     */
    public jFvuelos() {
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

        jFrame1 = new javax.swing.JFrame();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        Vuelos = new javax.swing.JLabel();
        cdOrigen = new javax.swing.JLabel();
        jTextcdOrigen = new javax.swing.JTextField();
        cdDestino = new javax.swing.JLabel();
        jTextcdDestino = new javax.swing.JTextField();
        fecHoraPartida = new javax.swing.JLabel();
        jTextFHPartida = new javax.swing.JTextField();
        fecHoraLlegada = new javax.swing.JLabel();
        jTextFHllegada = new javax.swing.JTextField();
        aceptar = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        finalizar = new javax.swing.JButton();
        jRBidaVuelta = new javax.swing.JRadioButton();
        jRBida = new javax.swing.JRadioButton();
        jRBMultiplesDestinos = new javax.swing.JRadioButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(204, 204, 204));

        Vuelos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Vuelos.setText("Vuelos");

        cdOrigen.setText("Ciudad Origen");

        jTextcdOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextcdOrigenActionPerformed(evt);
            }
        });

        cdDestino.setText("Ciudad Destino");

        fecHoraPartida.setText("Fecha-Hora Partida");

        fecHoraLlegada.setText("Fecha-Hora Llegada");

        jTextFHllegada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFHllegadaActionPerformed(evt);
            }
        });

        aceptar.setText("Aceptar");
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });

        buscar.setText("Buscar");

        finalizar.setText("Finalizar");

        jRBidaVuelta.setBackground(new java.awt.Color(204, 204, 204));
        jRBidaVuelta.setText("Ida y Vuelta");
        jRBidaVuelta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBidaVueltaActionPerformed(evt);
            }
        });

        jRBida.setBackground(new java.awt.Color(204, 204, 204));
        jRBida.setText("Ida");
        jRBida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBidaActionPerformed(evt);
            }
        });

        jRBMultiplesDestinos.setBackground(new java.awt.Color(204, 204, 204));
        jRBMultiplesDestinos.setText("Multiples Destinos");
        jRBMultiplesDestinos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBMultiplesDestinosActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(Vuelos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(cdOrigen, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTextcdOrigen, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(cdDestino, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTextcdDestino, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(fecHoraPartida, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTextFHPartida, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(fecHoraLlegada, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTextFHllegada, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(aceptar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(buscar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(finalizar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jRBidaVuelta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jRBida, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jRBMultiplesDestinos, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jTextFHPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(jTextFHllegada, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(cdOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Vuelos)
                                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextcdDestino, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                        .addComponent(jTextcdOrigen, javax.swing.GroupLayout.Alignment.LEADING))))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(aceptar)
                                .addGap(29, 29, 29)
                                .addComponent(buscar)
                                .addGap(36, 36, 36)
                                .addComponent(finalizar))
                            .addComponent(cdDestino))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jRBidaVuelta)
                                .addGap(18, 18, 18)
                                .addComponent(jRBida)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                                .addComponent(jRBMultiplesDestinos))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(fecHoraPartida)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fecHoraLlegada)))
                        .addGap(74, 74, 74))))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(Vuelos)
                .addGap(39, 39, 39)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBidaVuelta)
                    .addComponent(jRBida)
                    .addComponent(jRBMultiplesDestinos))
                .addGap(44, 44, 44)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cdOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextcdOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cdDestino)
                    .addComponent(jTextcdDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fecHoraPartida)
                    .addComponent(fecHoraLlegada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFHPartida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFHllegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceptar)
                    .addComponent(buscar)
                    .addComponent(finalizar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFHllegadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFHllegadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFHllegadaActionPerformed

    private void jTextcdOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextcdOrigenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextcdOrigenActionPerformed

    private void jRBidaVueltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBidaVueltaActionPerformed
        // TODO add your handling code here:
        jRBida.setEnabled(false);
        jRBMultiplesDestinos.setEnabled(false);
    }//GEN-LAST:event_jRBidaVueltaActionPerformed

    private void jRBidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBidaActionPerformed
        // TODO add your handling code here:
        jRBidaVuelta.setEnabled(false);
        jRBMultiplesDestinos.setEnabled(false);
    }//GEN-LAST:event_jRBidaActionPerformed

    private void jRBMultiplesDestinosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBMultiplesDestinosActionPerformed
        // TODO add your handling code here:
        jRBidaVuelta.setEnabled(false);
        jRBida.setEnabled(false);
    }//GEN-LAST:event_jRBMultiplesDestinosActionPerformed

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed

    }//GEN-LAST:event_aceptarActionPerformed

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
            java.util.logging.Logger.getLogger(jFvuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFvuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFvuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFvuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFvuelos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Vuelos;
    private javax.swing.JButton aceptar;
    private javax.swing.JButton buscar;
    private javax.swing.JLabel cdDestino;
    private javax.swing.JLabel cdOrigen;
    private javax.swing.JLabel fecHoraLlegada;
    private javax.swing.JLabel fecHoraPartida;
    private javax.swing.JButton finalizar;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JRadioButton jRBMultiplesDestinos;
    private javax.swing.JRadioButton jRBida;
    private javax.swing.JRadioButton jRBidaVuelta;
    private javax.swing.JTextField jTextFHPartida;
    private javax.swing.JTextField jTextFHllegada;
    private javax.swing.JTextField jTextcdDestino;
    private javax.swing.JTextField jTextcdOrigen;
    // End of variables declaration//GEN-END:variables
}
