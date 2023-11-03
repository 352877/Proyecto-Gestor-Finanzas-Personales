
package vistas;

import controladores.Metas;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class VistaMetas extends javax.swing.JInternalFrame {

    public VistaMetas() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelProductos = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        panelProductos1 = new javax.swing.JScrollPane();
        tblProductos1 = new javax.swing.JTable();
        jTextFieldInicio = new javax.swing.JTextField();
        jTextFieldFinal = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jTextFieldOperacion = new javax.swing.JTextField();
        jTextFieldMetaDeseada = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 255, 204));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setClosable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        tblProductos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Categoria", "Ingresos"
            }
        ));
        tblProductos.setGridColor(new java.awt.Color(153, 153, 153));
        tblProductos.setSelectionBackground(new java.awt.Color(102, 255, 102));
        tblProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductosMouseClicked(evt);
            }
        });
        panelProductos.setViewportView(tblProductos);

        tblProductos1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tblProductos1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Categorias", "Gastos"
            }
        ));
        tblProductos1.setGridColor(new java.awt.Color(0, 0, 0));
        tblProductos1.setSelectionBackground(new java.awt.Color(102, 255, 102));
        tblProductos1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductos1MouseClicked(evt);
            }
        });
        panelProductos1.setViewportView(tblProductos1);

        jTextFieldInicio.setBorder(javax.swing.BorderFactory.createTitledBorder("ID Inicio"));

        jTextFieldFinal.setBorder(javax.swing.BorderFactory.createTitledBorder("ID final"));

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jTextFieldMetaDeseada.setBorder(javax.swing.BorderFactory.createTitledBorder("Meta Deseada"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTextFieldMetaDeseada, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonBuscar)
                .addGap(10, 10, 10))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(panelProductos1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextFieldOperacion, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelProductos1, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                    .addComponent(panelProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldMetaDeseada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jButtonBuscar)))
                .addGap(18, 18, 18)
                .addComponent(jTextFieldOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("Editar");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductosMouseClicked
        int fila = tblProductos1.getSelectedRow();
    }//GEN-LAST:event_tblProductosMouseClicked

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        cargarTabla();
    }//GEN-LAST:event_formInternalFrameOpened

    private void tblProductos1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductos1MouseClicked
        int fila = tblProductos.getSelectedRow();
    }//GEN-LAST:event_tblProductos1MouseClicked

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        try {
        int idInicio = Integer.parseInt(jTextFieldInicio.getText());
        int idFinal = Integer.parseInt(jTextFieldFinal.getText());
        double metaDeseada = Double.parseDouble(jTextFieldMetaDeseada.getText());

        if (idInicio > idFinal) {
            JOptionPane.showMessageDialog(this, "El ID de inicio debe ser menor o igual al ID final");
            return;
        }

        Metas controlador = new Metas();
        double diferencia = controlador.calcularDiferencia(idInicio, idFinal);

        jTextFieldOperacion.setText(String.valueOf(diferencia));

        if (diferencia < metaDeseada) {
            jTextFieldOperacion.setText("No lograste alcanzar tu meta de presupuesto. Te recomendamos analizar tus gastos. Dinero: " + diferencia);
        } else {
            jTextFieldOperacion.setText("¡Lo lograste! Tu meta de presupuesto fue alcanzada. Dinero: " + diferencia);
        }

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Ingrese valores numéricos válidos para los IDs y la meta deseada");
    } catch (SQLException ex) {
        Logger.getLogger(VistaMetas.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void cargarTabla(){
    Metas controlador = new Metas();
    try {
        // Cargar datos de ingresos en tblProductos
        tblProductos.setModel(controlador.cargarProductos("ingresos"));

        // Cargar datos de gastos en tblProductos1
        tblProductos1.setModel(controlador.cargarProductos("gastos"));
    } catch (SQLException ex) {
        Logger.getLogger(VistaIngresos.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    
    private int id;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JTextField jTextFieldFinal;
    private javax.swing.JTextField jTextFieldInicio;
    private javax.swing.JTextField jTextFieldMetaDeseada;
    private javax.swing.JTextField jTextFieldOperacion;
    private javax.swing.JScrollPane panelProductos;
    private javax.swing.JScrollPane panelProductos1;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTable tblProductos1;
    // End of variables declaration//GEN-END:variables
}
