/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;


import Controller.ControllerPaneles;
import Controller.ControllerValidation;
import Controller.ControllerViewPedidos;
import Controller.ControllerViewSession;
import Controller.ControllerViewVendedor;
import java.util.ArrayList;

/**
 *
 * @author Carolina
 */
public class ViewPedidos extends javax.swing.JPanel {

    ControllerValidation validation;
    ControllerViewPedidos controller;

    
    /**
     * Creates new form ViewClientes
     */
    public ViewPedidos(ControllerPaneles controllerPaneles) {
        initComponents();
        this.validation = new ControllerValidation();
//        validation();
    }
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelVentas = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaPedidos = new javax.swing.JTable();
        ClientesEditar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        pedidosEncontrados = new javax.swing.JLabel();
        pedidosEnc = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        labelNombre = new javax.swing.JLabel();
        nombreCliente = new javax.swing.JTextField();
        labelcodCliente = new javax.swing.JLabel();
        idCliente = new javax.swing.JTextField();
        labelBuscar = new javax.swing.JLabel();
        botonNuevoPedido = new javax.swing.JButton();
        botonNuevoPedido1 = new javax.swing.JButton();
        labelFecha = new javax.swing.JLabel();
        fechaPedido = new javax.swing.JTextField();
        botonFecha = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();

        labelVentas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelVentas.setForeground(new java.awt.Color(66, 139, 202));
        labelVentas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelVentas.setText("Ventas");

        jPanel11.setBackground(new java.awt.Color(250, 250, 250));
        jPanel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(245, 246, 247), 1, true));

        jLabel24.setBackground(new java.awt.Color(250, 250, 250));
        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/userInfo.png"))); // NOI18N
        jLabel24.setText("Administración de Clientes");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setBackground(new java.awt.Color(245, 246, 247));

        jPanel1.setBackground(new java.awt.Color(245, 246, 247));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 900));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(220, 220, 220), 1, true));

        tablaPedidos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tablaPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código Venta", "Código Cliente", "Fecha Pedido", "Fecha Entrega", "Lugar Entrega", "Hora Entrega", "Total", "Abono", "Resto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaPedidos);

        ClientesEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/edit.png"))); // NOI18N
        ClientesEditar.setContentAreaFilled(false);
        ClientesEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/times-outline.png"))); // NOI18N
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/refresh.png"))); // NOI18N
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        pedidosEncontrados.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pedidosEncontrados.setText("Pedidos Encontrados");

        pedidosEnc.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        pedidosEnc.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        pedidosEnc.setText("0");
        pedidosEnc.setEnabled(false);
        pedidosEnc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pedidosEncFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pedidosEncFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 826, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ClientesEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(pedidosEncontrados)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pedidosEnc, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ClientesEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pedidosEncontrados)
                    .addComponent(pedidosEnc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(220, 220, 220), 1, true));

        labelNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelNombre.setText("Nombre");

        nombreCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nombreCliente.setForeground(new java.awt.Color(180, 180, 180));
        nombreCliente.setText("Nombre");
        nombreCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nombreClienteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nombreClienteFocusLost(evt);
            }
        });
        nombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreClienteActionPerformed(evt);
            }
        });

        labelcodCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelcodCliente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelcodCliente.setText("Código Cliente");

        idCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        idCliente.setForeground(new java.awt.Color(180, 180, 180));
        idCliente.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        idCliente.setText("Cod. Cliente");
        idCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                idClienteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                idClienteFocusLost(evt);
            }
        });
        idCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idClienteActionPerformed(evt);
            }
        });

        labelBuscar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelBuscar.setForeground(new java.awt.Color(66, 193, 202));
        labelBuscar.setText("Buscar por:");

        botonNuevoPedido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonNuevoPedido.setForeground(new java.awt.Color(52, 73, 94));
        botonNuevoPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/user-add-outline_1.png"))); // NOI18N
        botonNuevoPedido.setText("Nuevo");
        botonNuevoPedido.setContentAreaFilled(false);
        botonNuevoPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonNuevoPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevoPedidoActionPerformed(evt);
            }
        });

        botonNuevoPedido1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonNuevoPedido1.setForeground(new java.awt.Color(52, 73, 94));
        botonNuevoPedido1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/zoom.png"))); // NOI18N
        botonNuevoPedido1.setText("Consultar");
        botonNuevoPedido1.setContentAreaFilled(false);
        botonNuevoPedido1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonNuevoPedido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevoPedido1ActionPerformed(evt);
            }
        });

        labelFecha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelFecha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelFecha.setText("Fecha");

        fechaPedido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fechaPedido.setForeground(new java.awt.Color(180, 180, 180));
        fechaPedido.setText("Fecha de pedido");
        fechaPedido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fechaPedidoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fechaPedidoFocusLost(evt);
            }
        });
        fechaPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaPedidoActionPerformed(evt);
            }
        });

        botonFecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/calender.png"))); // NOI18N
        botonFecha.setContentAreaFilled(false);
        botonFecha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(labelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelcodCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(fechaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(55, 55, 55)
                        .addComponent(botonNuevoPedido1)
                        .addGap(70, 70, 70)
                        .addComponent(botonNuevoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelcodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fechaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonNuevoPedido1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonNuevoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel13.setBackground(new java.awt.Color(250, 250, 250));
        jPanel13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(220, 220, 220), 1, true));

        jLabel26.setBackground(new java.awt.Color(250, 250, 250));
        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/pedidosPendientes.png"))); // NOI18N
        jLabel26.setText("Relación de Pedidos");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreClienteActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_nombreClienteActionPerformed

    private void nombreClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreClienteFocusGained
        validation.placeHolder(true,nombreCliente,"Nombre");// TODO add your handling code here:
    }//GEN-LAST:event_nombreClienteFocusGained

    private void nombreClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreClienteFocusLost
       validation.placeHolder(false ,nombreCliente,"Nombre"); // TODO add your handling code here:
    }//GEN-LAST:event_nombreClienteFocusLost

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void idClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idClienteActionPerformed

    private void idClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idClienteFocusGained
        validation.placeHolder(true,idCliente,"Cod. Cliente"); // TODO add your handling code here:
    }//GEN-LAST:event_idClienteFocusGained

    private void idClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idClienteFocusLost
       validation.placeHolder(false,idCliente,"Cod. Cliente"); // TODO add your handling code here:
    }//GEN-LAST:event_idClienteFocusLost

    private void pedidosEncFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pedidosEncFocusGained
       validation.placeHolder(true,pedidosEnc,"0"); // TODO add your handling code here:
    }//GEN-LAST:event_pedidosEncFocusGained

    private void pedidosEncFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pedidosEncFocusLost
        validation.placeHolder(false,pedidosEnc,"0");        // TODO add your handling code here:
    }//GEN-LAST:event_pedidosEncFocusLost

    private void botonNuevoPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevoPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonNuevoPedidoActionPerformed

    private void botonNuevoPedido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevoPedido1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonNuevoPedido1ActionPerformed

    private void fechaPedidoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fechaPedidoFocusGained
        validation.placeHolder(true, fechaPedido, "Fecha de pedido");
    }//GEN-LAST:event_fechaPedidoFocusGained

    private void fechaPedidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fechaPedidoFocusLost
        validation.placeHolder(false, fechaPedido, "Fecha de pedido");
    }//GEN-LAST:event_fechaPedidoFocusLost

    private void fechaPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaPedidoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClientesEditar;
    private javax.swing.JButton botonFecha;
    private javax.swing.JButton botonNuevoPedido;
    private javax.swing.JButton botonNuevoPedido1;
    private javax.swing.JTextField fechaPedido;
    private javax.swing.JTextField idCliente;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelBuscar;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelVentas;
    private javax.swing.JLabel labelcodCliente;
    private javax.swing.JTextField nombreCliente;
    private javax.swing.JTextField pedidosEnc;
    private javax.swing.JLabel pedidosEncontrados;
    private javax.swing.JTable tablaPedidos;
    // End of variables declaration//GEN-END:variables
}
