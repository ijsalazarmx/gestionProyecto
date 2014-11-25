/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ControllerPaneles;
import Controller.ControllerValidation;
import Controller.ControllerViewPrincipalProveedor;
import Documentos.ClaseAlmacenXLS;
import Documentos.ReportesPDF;

/**
 *
 * @author Teté
 */
public class ViewReportes extends javax.swing.JPanel {
    ControllerValidation validation; ControllerPaneles controllerPaneles;
    ControllerViewPrincipalProveedor controller;

    /**
     * Creates new form ViewReportes
     */
    public ViewReportes(ControllerPaneles controllerPaneles) {
        initComponents();
        
        this.controllerPaneles = controllerPaneles;//asi
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelRuta = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        labelReportesPdf = new javax.swing.JLabel();
        botonVendedor = new javax.swing.JButton();
        botonCliente = new javax.swing.JButton();
        botonAlmacen = new javax.swing.JButton();
        botonProveedor = new javax.swing.JButton();
        botonVenta = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        labelReportesPdf1 = new javax.swing.JLabel();
        botonProducto = new javax.swing.JButton();
        panelStatus = new javax.swing.JPanel();
        labelReportes = new javax.swing.JLabel();

        labelRuta.setBackground(new java.awt.Color(250, 250, 250));
        labelRuta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelRuta.setForeground(new java.awt.Color(53, 107, 161));
        labelRuta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/vendedorInfo.png"))); // NOI18N
        labelRuta.setText("Administración de clientes / Nuevo Cliente");

        setBackground(new java.awt.Color(245, 246, 247));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        labelReportesPdf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelReportesPdf.setForeground(new java.awt.Color(66, 139, 202));
        labelReportesPdf.setText("Reportes en PDF:");

        botonVendedor.setBackground(new java.awt.Color(255, 255, 255));
        botonVendedor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonVendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/vendedoresEnable.png"))); // NOI18N
        botonVendedor.setBorder(null);
        botonVendedor.setContentAreaFilled(false);
        botonVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVendedorActionPerformed(evt);
            }
        });

        botonCliente.setBackground(new java.awt.Color(255, 255, 255));
        botonCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/clientesEnable.png"))); // NOI18N
        botonCliente.setBorder(null);
        botonCliente.setContentAreaFilled(false);
        botonCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonClienteActionPerformed(evt);
            }
        });

        botonAlmacen.setBackground(new java.awt.Color(255, 255, 255));
        botonAlmacen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/inventarioEnable.png"))); // NOI18N
        botonAlmacen.setBorder(null);
        botonAlmacen.setContentAreaFilled(false);
        botonAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAlmacenActionPerformed(evt);
            }
        });

        botonProveedor.setBackground(new java.awt.Color(102, 102, 102));
        botonProveedor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/proveedoresEnable.png"))); // NOI18N
        botonProveedor.setBorder(null);
        botonProveedor.setContentAreaFilled(false);
        botonProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonProveedorActionPerformed(evt);
            }
        });

        botonVenta.setBackground(new java.awt.Color(255, 255, 255));
        botonVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ventasEnable.png"))); // NOI18N
        botonVenta.setBorder(null);
        botonVenta.setContentAreaFilled(false);
        botonVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVentaActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/pedidosEnable.png"))); // NOI18N
        jButton6.setBorder(null);
        jButton6.setContentAreaFilled(false);

        labelReportesPdf1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelReportesPdf1.setForeground(new java.awt.Color(66, 139, 202));
        labelReportesPdf1.setText("Reportes en Enxcel:");

        botonProducto.setBackground(new java.awt.Color(255, 255, 255));
        botonProducto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/productoEnable.png"))); // NOI18N
        botonProducto.setBorder(null);
        botonProducto.setContentAreaFilled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(390, 390, 390)
                .addComponent(botonVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(botonAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelReportesPdf1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(botonVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelReportesPdf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(153, 153, 153)
                        .addComponent(botonCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonProveedor)
                        .addGap(173, 173, 173))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(123, 123, 123)
                    .addComponent(botonProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(674, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelReportesPdf)
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(botonProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(botonVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addComponent(labelReportesPdf1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(222, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(175, 175, 175)
                    .addComponent(botonProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(373, Short.MAX_VALUE)))
        );

        panelStatus.setBackground(new java.awt.Color(255, 255, 255));

        labelReportes.setBackground(new java.awt.Color(255, 255, 255));
        labelReportes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelReportes.setForeground(new java.awt.Color(53, 107, 161));
        labelReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/estadisticas.png"))); // NOI18N
        labelReportes.setText("Generación de Reportes");

        javax.swing.GroupLayout panelStatusLayout = new javax.swing.GroupLayout(panelStatus);
        panelStatus.setLayout(panelStatusLayout);
        panelStatusLayout.setHorizontalGroup(
            panelStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStatusLayout.createSequentialGroup()
                .addComponent(labelReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelStatusLayout.setVerticalGroup(
            panelStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelStatusLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelReportes))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVendedorActionPerformed
        // TODO add your handling code here:
        ReportesPDF pdf = new ReportesPDF();
         pdf.GenerarPDF(controllerPaneles.getModelUsuario().rotuloPDF(),1);
    }//GEN-LAST:event_botonVendedorActionPerformed

    private void botonAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAlmacenActionPerformed
        // TODO add your handling code here:
        new ClaseAlmacenXLS().crearExcel();
    }//GEN-LAST:event_botonAlmacenActionPerformed

    private void botonProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonProveedorActionPerformed
        // TODO add your handling code here:
        ReportesPDF pdf = new ReportesPDF();
        //pdf.GenerarPDF(controllerPaneles);
    }//GEN-LAST:event_botonProveedorActionPerformed

    private void botonClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonClienteActionPerformed
        // TODO add your handling code here:
        ReportesPDF pdf = new ReportesPDF();
        pdf.GenerarPDF(controllerPaneles.getModelCliente().rotuloPDF(),1);
    }//GEN-LAST:event_botonClienteActionPerformed

    private void botonVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVentaActionPerformed
        // TODO add your handling code here:
        ReportesPDF pdf = new ReportesPDF();
        //pdf.GenerarPDF(controllerPaneles., ERROR);
    }//GEN-LAST:event_botonVentaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAlmacen;
    private javax.swing.JButton botonCliente;
    private javax.swing.JButton botonProducto;
    private javax.swing.JButton botonProveedor;
    private javax.swing.JButton botonVendedor;
    private javax.swing.JButton botonVenta;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelReportes;
    private javax.swing.JLabel labelReportesPdf;
    private javax.swing.JLabel labelReportesPdf1;
    private javax.swing.JLabel labelRuta;
    private javax.swing.JPanel panelStatus;
    // End of variables declaration//GEN-END:variables
}
