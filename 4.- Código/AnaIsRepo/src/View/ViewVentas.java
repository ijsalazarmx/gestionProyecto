/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ControllerPaneles;
import Controller.ControllerValidation;
import Controller.ControllerViewVendedor;
import java.util.ArrayList;
import javax.swing.JTextField;

/**
 *
 * @author Teté
 */
public class ViewVentas extends javax.swing.JPanel {
    ControllerValidation validation;
    ControllerViewVendedor controller;
    ControllerPaneles controllerPaneles;

    /**
     * Creates new form ViewVentas
     */
    public ViewVentas() {
        this.controllerPaneles = controllerPaneles;
        this.validation = new ControllerValidation();
        initComponents();
        validation();
    }
    
    private void validation(){
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        labelVentas = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        panelTablaVentas = new javax.swing.JPanel();
        labelRevisar = new javax.swing.JLabel();
        comboRevisarPor = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVentas = new javax.swing.JTable();
        labelTotalVentas = new javax.swing.JLabel();
        totalVentas = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jPanel7.setBackground(new java.awt.Color(250, 250, 250));
        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(220, 220, 220), 1, true));

        labelVentas.setBackground(new java.awt.Color(250, 250, 250));
        labelVentas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelVentas.setText("Administración de ventas");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ventasInfo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(560, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelTablaVentas.setBackground(new java.awt.Color(250, 250, 250));
        panelTablaVentas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(220, 220, 220), 1, true));

        labelRevisar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelRevisar.setForeground(new java.awt.Color(66, 139, 202));
        labelRevisar.setText("Revisar ventas por:");

        comboRevisarPor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboRevisarPor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Fecha", "Mes", "Vendedor", "Venta de mostrador", "Venta por pedido", "Última semana", "Últimos tres días" }));

        tablaVentas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tablaVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código Venta", "Fecha", "Vendedor", "Total compra"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaVentas);

        labelTotalVentas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelTotalVentas.setText("Total de ventas:");

        totalVentas.setEditable(false);
        totalVentas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        totalVentas.setForeground(new java.awt.Color(204, 204, 255));
        totalVentas.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        totalVentas.setText("0");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("$");

        javax.swing.GroupLayout panelTablaVentasLayout = new javax.swing.GroupLayout(panelTablaVentas);
        panelTablaVentas.setLayout(panelTablaVentasLayout);
        panelTablaVentasLayout.setHorizontalGroup(
            panelTablaVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablaVentasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTablaVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 887, Short.MAX_VALUE)
                    .addGroup(panelTablaVentasLayout.createSequentialGroup()
                        .addGroup(panelTablaVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelTablaVentasLayout.createSequentialGroup()
                                .addComponent(labelRevisar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboRevisarPor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelTablaVentasLayout.createSequentialGroup()
                                .addComponent(labelTotalVentas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totalVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelTablaVentasLayout.setVerticalGroup(
            panelTablaVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablaVentasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTablaVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRevisar)
                    .addComponent(comboRevisarPor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelTablaVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTotalVentas)
                    .addComponent(totalVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(146, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelTablaVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelTablaVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox comboRevisarPor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelRevisar;
    private javax.swing.JLabel labelTotalVentas;
    private javax.swing.JLabel labelVentas;
    private javax.swing.JPanel panelTablaVentas;
    private javax.swing.JTable tablaVentas;
    private javax.swing.JTextField totalVentas;
    // End of variables declaration//GEN-END:variables
}
