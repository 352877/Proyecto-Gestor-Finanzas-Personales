
package vistas;

import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;


public class ContenedorGastosIngresos extends javax.swing.JFrame {


    public ContenedorGastosIngresos() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelContenedor = new javax.swing.JPanel();
        crearButton = new javax.swing.JButton();
        editarButton = new javax.swing.JButton();
        editarButton1 = new javax.swing.JButton();
        editarButton2 = new javax.swing.JButton();
        crearButton1 = new javax.swing.JButton();
        editarButton3 = new javax.swing.JButton();
        editarButton4 = new javax.swing.JButton();
        editarButton5 = new javax.swing.JButton();
        menuPrincipal = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 153));

        javax.swing.GroupLayout panelContenedorLayout = new javax.swing.GroupLayout(panelContenedor);
        panelContenedor.setLayout(panelContenedorLayout);
        panelContenedorLayout.setHorizontalGroup(
            panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelContenedorLayout.setVerticalGroup(
            panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 582, Short.MAX_VALUE)
        );

        crearButton.setText("Nuevo ingreso");
        crearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearButtonActionPerformed(evt);
            }
        });

        editarButton.setText("Editar Ingresos");
        editarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarButtonActionPerformed(evt);
            }
        });

        editarButton1.setText("Ver Ingresos");
        editarButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarButton1ActionPerformed(evt);
            }
        });

        editarButton2.setText("Ver Gastos");
        editarButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarButton2ActionPerformed(evt);
            }
        });

        crearButton1.setText("Nuevo Gasto");
        crearButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearButton1ActionPerformed(evt);
            }
        });

        editarButton3.setText("Editar Gastos");
        editarButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarButton3ActionPerformed(evt);
            }
        });

        editarButton4.setText("Ver Metas");
        editarButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarButton4ActionPerformed(evt);
            }
        });

        editarButton5.setText("Analisis Presupuesto");
        editarButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarButton5ActionPerformed(evt);
            }
        });
        setJMenuBar(menuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelContenedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(editarButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editarButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(crearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(crearButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editarButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editarButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editarButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editarButton)
                    .addComponent(crearButton)
                    .addComponent(editarButton1)
                    .addComponent(editarButton2)
                    .addComponent(crearButton1)
                    .addComponent(editarButton3)
                    .addComponent(editarButton4)
                    .addComponent(editarButton5))
                .addGap(18, 18, 18)
                .addComponent(panelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void crearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearButtonActionPerformed
        VistaIngresos crear = new VistaIngresos();
        cargarFormulario(crear);
    }//GEN-LAST:event_crearButtonActionPerformed

    private void editarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarButtonActionPerformed
        VistaEditarIngresos editar = new VistaEditarIngresos();
        cargarFormulario(editar);
    }//GEN-LAST:event_editarButtonActionPerformed

    private void editarButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarButton1ActionPerformed
        VistaPrincipalIngresos editar = new VistaPrincipalIngresos();
        cargarFormulario(editar);
    }//GEN-LAST:event_editarButton1ActionPerformed

    private void editarButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarButton2ActionPerformed
        VistaPrincipalGastos editar = new VistaPrincipalGastos();
        cargarFormulario(editar);
    }//GEN-LAST:event_editarButton2ActionPerformed

    private void crearButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearButton1ActionPerformed
        VistaGastos crear = new VistaGastos();
        cargarFormulario(crear);
    }//GEN-LAST:event_crearButton1ActionPerformed

    private void editarButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarButton3ActionPerformed
        VistaEditarGastos editar = new VistaEditarGastos();
        cargarFormulario(editar);
    }//GEN-LAST:event_editarButton3ActionPerformed

    private void editarButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarButton4ActionPerformed
        VistaMetas editar = new VistaMetas();
        cargarFormulario(editar);
    }//GEN-LAST:event_editarButton4ActionPerformed

    private void editarButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarButton5ActionPerformed
        VistaAnalisis editar = new VistaAnalisis();
        cargarFormulario(editar);
    }//GEN-LAST:event_editarButton5ActionPerformed

    private void cargarFormulario(JInternalFrame ventana){
        panelContenedor.removeAll();
        panelContenedor.add(ventana);
        ventana.setVisible(true);
        try {
            ventana.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(ContenedorGastosIngresos.class.getName()).log(Level.SEVERE, null, ex);
        }
        panelContenedor.updateUI();
    }
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
            java.util.logging.Logger.getLogger(ContenedorGastosIngresos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContenedorGastosIngresos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContenedorGastosIngresos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContenedorGastosIngresos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContenedorGastosIngresos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton crearButton;
    protected javax.swing.JButton crearButton1;
    protected javax.swing.JButton editarButton;
    protected javax.swing.JButton editarButton1;
    protected javax.swing.JButton editarButton2;
    protected javax.swing.JButton editarButton3;
    protected javax.swing.JButton editarButton4;
    protected javax.swing.JButton editarButton5;
    private javax.swing.JMenuBar menuPrincipal;
    private javax.swing.JPanel panelContenedor;
    // End of variables declaration//GEN-END:variables
}
