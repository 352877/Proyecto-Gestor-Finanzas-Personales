
package vistas;

import controladores.Analisis;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VistaAnalisis extends javax.swing.JInternalFrame {

    public VistaAnalisis() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelProductos = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        panelProductos1 = new javax.swing.JScrollPane();
        tblProductos1 = new javax.swing.JTable();
        jTextFieldMGastos = new javax.swing.JTextField();
        jTextFieldPromedioGastos = new javax.swing.JTextField();
        jTextFieldPromedioIngresos = new javax.swing.JTextField();
        jTextFieldTotalGastos = new javax.swing.JTextField();
        jTextFieldTotalIngresos = new javax.swing.JTextField();
        jTextFieldTasaAhorro = new javax.swing.JTextField();
        jTextFieldRelacionngresosGastos = new javax.swing.JTextField();
        jTextFieldMIngresos = new javax.swing.JTextField();
        jTextFieldInicio = new javax.swing.JTextField();
        jTextFieldFinal = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jTextFieldTextoAnalasis = new javax.swing.JTextField();

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

        jTextFieldMGastos.setBorder(javax.swing.BorderFactory.createTitledBorder("Categoria con mas gastos"));

        jTextFieldPromedioGastos.setBorder(javax.swing.BorderFactory.createTitledBorder("Promedio de Gastos"));

        jTextFieldPromedioIngresos.setBorder(javax.swing.BorderFactory.createTitledBorder("Promedio de Ingresos"));

        jTextFieldTotalGastos.setBorder(javax.swing.BorderFactory.createTitledBorder("Total de Gastos"));

        jTextFieldTotalIngresos.setBorder(javax.swing.BorderFactory.createTitledBorder("Total de Ingresos"));

        jTextFieldTasaAhorro.setBorder(javax.swing.BorderFactory.createTitledBorder("Tasa de ahorro"));

        jTextFieldRelacionngresosGastos.setBorder(javax.swing.BorderFactory.createTitledBorder("Relacion Ingresos-Gastos"));

        jTextFieldMIngresos.setBorder(javax.swing.BorderFactory.createTitledBorder("Categoria con mas ingresos"));
        jTextFieldMIngresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMIngresosActionPerformed(evt);
            }
        });

        jTextFieldInicio.setBorder(javax.swing.BorderFactory.createTitledBorder("ID Inicio"));

        jTextFieldFinal.setBorder(javax.swing.BorderFactory.createTitledBorder("ID final"));

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jTextFieldInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonBuscar)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldTextoAnalasis)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(panelProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldTotalIngresos)
                                            .addComponent(jTextFieldTasaAhorro))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextFieldPromedioIngresos, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                            .addComponent(jTextFieldRelacionngresosGastos))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldMIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(panelProductos1, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextFieldTotalGastos, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldPromedioGastos, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextFieldMGastos, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(12, 12, 12))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                    .addComponent(panelProductos1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPromedioIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTotalIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTotalGastos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPromedioGastos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMGastos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTasaAhorro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldRelacionngresosGastos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldTextoAnalasis, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonBuscar)
                        .addGap(49, 49, 49))))
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
        int inicio = Integer.parseInt(jTextFieldInicio.getText());
    int fin = Integer.parseInt(jTextFieldFinal.getText());

    Analisis controlador = new Analisis();
    try {
        double totalIngresos = controlador.obtenerSuma("ingresos", inicio, fin);
        double promedioIngresos = controlador.obtenerPromedio("ingresos", inicio, fin);
        String categoriaMasIngresos = controlador.obtenerCategoriaMasFrecuente("ingresos", inicio, fin);

        double totalGastos = controlador.obtenerSuma("gastos", inicio, fin);
        double promedioGastos = controlador.obtenerPromedio("gastos", inicio, fin);
        String categoriaMasGastos = controlador.obtenerCategoriaMasFrecuente("gastos", inicio, fin);

        double tasaAhorro = (totalIngresos - totalGastos) / totalIngresos;
        double relacionIngresosGastos = totalGastos / totalIngresos;

        jTextFieldTotalIngresos.setText(String.valueOf(totalIngresos));
        jTextFieldPromedioIngresos.setText(String.valueOf(promedioIngresos));
        jTextFieldMIngresos.setText(categoriaMasIngresos);

        jTextFieldTotalGastos.setText(String.valueOf(totalGastos));
        jTextFieldPromedioGastos.setText(String.valueOf(promedioGastos));
        jTextFieldMGastos.setText(categoriaMasGastos);

        jTextFieldTasaAhorro.setText(String.valueOf(tasaAhorro));
        jTextFieldRelacionngresosGastos.setText(String.valueOf(relacionIngresosGastos));

        String textoAnalisis = "Se registro la cantidad de gastos de: " + totalGastos
                + ". El promedio de tus gastos fue: " + promedioGastos
                + ". La categoria con mas gastos fue: " + categoriaMasGastos
                + ". Tus ingresos fueron de: " + totalIngresos
                + ". Tu mayor fuente de ingresos fue: " + categoriaMasIngresos + ".";
        jTextFieldTextoAnalasis.setText(textoAnalisis);

    } catch (SQLException ex) {
        Logger.getLogger(VistaIngresos.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jTextFieldMIngresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMIngresosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMIngresosActionPerformed

    private void cargarTabla(){
    Analisis controlador = new Analisis();
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
    private javax.swing.JTextField jTextFieldMGastos;
    private javax.swing.JTextField jTextFieldMIngresos;
    private javax.swing.JTextField jTextFieldPromedioGastos;
    private javax.swing.JTextField jTextFieldPromedioIngresos;
    private javax.swing.JTextField jTextFieldRelacionngresosGastos;
    private javax.swing.JTextField jTextFieldTasaAhorro;
    private javax.swing.JTextField jTextFieldTextoAnalasis;
    private javax.swing.JTextField jTextFieldTotalGastos;
    private javax.swing.JTextField jTextFieldTotalIngresos;
    private javax.swing.JScrollPane panelProductos;
    private javax.swing.JScrollPane panelProductos1;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTable tblProductos1;
    // End of variables declaration//GEN-END:variables
}
