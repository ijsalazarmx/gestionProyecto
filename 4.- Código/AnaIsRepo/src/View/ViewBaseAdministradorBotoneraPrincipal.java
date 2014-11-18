/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ControllerPaneles;
import Controller.ControllerViewAdministradorBotoneraPrincipal;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Jesus
 */
public class ViewBaseAdministradorBotoneraPrincipal extends javax.swing.JPanel {
    ControllerPaneles controllerPaneles;
    ControllerViewAdministradorBotoneraPrincipal controller;
    JPanel panelBotoneraSubPrincipal;
    JPanel panelCentral;
    
    /**
     * Creates new form ViewBaseAdministradorBotoneraPrincipal
     * @param controllerPaneles
     */
    public ViewBaseAdministradorBotoneraPrincipal(ControllerPaneles controllerPaneles) {
        this.controllerPaneles = controllerPaneles;
        this.panelCentral = controllerPaneles.getPanelCentral();
        initComponents();
        initController();
        controller.accionButton(1);
        controllerPaneles.addPanel(panelCentral, new ViewBaseAdministrador(controllerPaneles));
    }
    
     private void initController(){
        ArrayList components = new ArrayList<>();
        components.add(inicio);
        components.add(productos);
        components.add(inventario);
        components.add(clientes);
        components.add(proveedores);
        components.add(ventas);
        components.add(pedidos);
        components.add(reportes);
        controller = new ControllerViewAdministradorBotoneraPrincipal(components);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inicio = new javax.swing.JButton();
        productos = new javax.swing.JButton();
        inventario = new javax.swing.JButton();
        clientes = new javax.swing.JButton();
        proveedores = new javax.swing.JButton();
        ventas = new javax.swing.JButton();
        pedidos = new javax.swing.JButton();
        reportes = new javax.swing.JButton();

        setBackground(new java.awt.Color(20, 20, 20));

        inicio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        inicio.setForeground(new java.awt.Color(51, 51, 51));
        inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/inicioDisable.png"))); // NOI18N
        inicio.setContentAreaFilled(false);
        inicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inicio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        inicio.setSelected(true);
        inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioActionPerformed(evt);
            }
        });

        productos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        productos.setForeground(new java.awt.Color(51, 51, 51));
        productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/productoDisable.png"))); // NOI18N
        productos.setContentAreaFilled(false);
        productos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        productos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        productos.setSelected(true);
        productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productosActionPerformed(evt);
            }
        });

        inventario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        inventario.setForeground(new java.awt.Color(51, 51, 51));
        inventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/inventarioDisable.png"))); // NOI18N
        inventario.setContentAreaFilled(false);
        inventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inventario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        inventario.setSelected(true);
        inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventarioActionPerformed(evt);
            }
        });

        clientes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        clientes.setForeground(new java.awt.Color(51, 51, 51));
        clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/clientesDisable.png"))); // NOI18N
        clientes.setContentAreaFilled(false);
        clientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        clientes.setSelected(true);
        clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientesActionPerformed(evt);
            }
        });

        proveedores.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        proveedores.setForeground(new java.awt.Color(51, 51, 51));
        proveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/proveedoresDisable.png"))); // NOI18N
        proveedores.setContentAreaFilled(false);
        proveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        proveedores.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        proveedores.setSelected(true);
        proveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proveedoresActionPerformed(evt);
            }
        });

        ventas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ventas.setForeground(new java.awt.Color(51, 51, 51));
        ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ventasDisable.png"))); // NOI18N
        ventas.setContentAreaFilled(false);
        ventas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ventas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ventas.setSelected(true);
        ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventasActionPerformed(evt);
            }
        });

        pedidos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pedidos.setForeground(new java.awt.Color(51, 51, 51));
        pedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/pedidosDisable.png"))); // NOI18N
        pedidos.setContentAreaFilled(false);
        pedidos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pedidos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pedidos.setSelected(true);
        pedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedidosActionPerformed(evt);
            }
        });

        reportes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        reportes.setForeground(new java.awt.Color(51, 51, 51));
        reportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/reportesDisable.png"))); // NOI18N
        reportes.setContentAreaFilled(false);
        reportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reportes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        reportes.setSelected(true);
        reportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(productos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inventario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(proveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 149, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ventas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pedidos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(reportes, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inventario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(productos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(clientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(proveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ventas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pedidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reportes, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
            .addComponent(inicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioActionPerformed
        // TODO add your handling code here:
        controller.accionButton(1);
        controllerPaneles.addPanel(panelCentral, new ViewBaseAdministrador(controllerPaneles));
    }//GEN-LAST:event_inicioActionPerformed

    private void productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productosActionPerformed
        // TODO add your handling code here:
        controller.accionButton(2);
    }//GEN-LAST:event_productosActionPerformed

    private void inventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventarioActionPerformed
        // TODO add your handling code here:
        controller.accionButton(3);
    }//GEN-LAST:event_inventarioActionPerformed

    private void proveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proveedoresActionPerformed
            // TODO add your handling code here:
        controller.accionButton(5);
        controllerPaneles.addPanel(panelCentral, new ViewProveedores(controllerPaneles));
        
    }//GEN-LAST:event_proveedoresActionPerformed

    private void ventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventasActionPerformed
        // TODO add your handling code here:
        controller.accionButton(6);
        controllerPaneles.addPanel(panelCentral, new ViewCaptInfVendedor());
    }//GEN-LAST:event_ventasActionPerformed

    private void reportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportesActionPerformed
        // TODO add your handling code here:
        controller.accionButton(8);
    }//GEN-LAST:event_reportesActionPerformed

    private void clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientesActionPerformed
        // TODO add your handling code here:
        controller.accionButton(4);
        controllerPaneles.addPanel(panelCentral, new ViewClientes(controllerPaneles));
    }//GEN-LAST:event_clientesActionPerformed

    private void pedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedidosActionPerformed
        // TODO add your handling code here:
        controller.accionButton(7);
    }//GEN-LAST:event_pedidosActionPerformed
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clientes;
    private javax.swing.JButton inicio;
    private javax.swing.JButton inventario;
    private javax.swing.JButton pedidos;
    private javax.swing.JButton productos;
    private javax.swing.JButton proveedores;
    private javax.swing.JButton reportes;
    private javax.swing.JButton ventas;
    // End of variables declaration//GEN-END:variables
}
