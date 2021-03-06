/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ControllerPaneles;
import Controller.ControllerValidation;
import Controller.ControllerViewGeneraVenta;
import Model.ModelCategoria;
import Model.ModelEmpresa;
import Model.ModelProveedor;
import Model.ModelUsuario;
import Model.ModelVenta;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jesus
 */
public class ViewGeneraVenta extends javax.swing.JPanel {
    ControllerPaneles controllerPaneles;
    ControllerValidation validation;
    ControllerViewGeneraVenta controller;
    ModelEmpresa modelEmpresa;
    ModelUsuario userTemp;
    ModelVenta modelVenta;
    List<ModelProveedor> listProveedores;
    List<ModelCategoria> listCategoria;
    boolean tipoAlmacen;
    /**
     * Creates new form ViewBaseAdministrador
     * @param controllerPaneles
     * @param user
     * @param tipoAlmacen
     */
    public ViewGeneraVenta(ControllerPaneles controllerPaneles, ModelUsuario user,boolean tipoAlmacen) {
        this.tipoAlmacen=tipoAlmacen;
        this.userTemp = user;
        this.validation = new ControllerValidation();
        this.controllerPaneles = controllerPaneles;
        this.modelEmpresa = controllerPaneles.getModelEmpresa();
        controllerPaneles.setModelVenta(new Model.ModelVenta());
        this.modelVenta = controllerPaneles.getModelVenta();
        initComponents();
        modelVenta.creaModelTable();
        panelPedido.setVisible(false);
        validation();
        controller.cargarCombo(0);
        controller.cargarCombo(1);
        controller.cargarCombo(2);
////        eliminar.setVisible(false);
////        for (int i = 0; i < 4; i++)
////            controller.cargarCombo(i,tipoAlmacen);
//        if(user==null){
//            if(tipoAlmacen)
//                labelRuta.setText("Administración de almacén / Nuevo producto almacén");
//            else
//                labelRuta.setText("Administración de productos / Nuevo producto tienda");
//
//        }else{
//            if(tipoAlmacen)
//                labelRuta.setText("Administración de almacén / Modifica producto almacén");
//            else
//                labelRuta.setText("Administración de productos / Modifica producto");
//        }
        
    }
    
    private void validation(){
        ArrayList components = new ArrayList<>();
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("MMM d, yyyy");
        Calendar fecha = new GregorianCalendar();
        int YYYY = fecha.get(Calendar.YEAR);
        String MM = encuentraMes(fecha.get(Calendar.MONTH)+1);
        int DD = fecha.get(Calendar.DATE);
        Date dato=null;
        try {
            dato = formatoDelTexto.parse(""+MM+" "+DD+", "+YYYY);
        } catch (ParseException ex) {
            Logger.getLogger(ViewGeneraVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        fechaEntrega.setDate(dato);
        components.add(codigoBarras);
        components.add(idProductoTienda);
        components.add(panelImagen);
        components.add(imagen);
        components.add(tipoVenta);
        components.add(existencia);
        components.add(precio);
        components.add(cantidad);
        components.add(agregar);
        components.add(idCliente);
        components.add(fechaEntrega);
        components.add(hora);
        components.add(minutos);
        components.add(descripcion);
        components.add(precioKilo);
        components.add(kilos);
        components.add(abono01);
        components.add(abono02);
        components.add(resto);
        components.add(tablaNuevaVenta);
        components.add(modelVenta.getModeloTable());
        components.add(cantidadRecibida01);
        components.add(cantidadRecibida02);
        components.add(resta01);
        components.add(cambio);
        components.add(total);
        components.add(idProductoAlmacen);
        controller = new ControllerViewGeneraVenta(components);
        controller.validations();
    }
    
    private String encuentraMes(int mes){
        String MMM = "";
        switch(mes){
            case 1:MMM = "JAN";break;
            case 2:MMM = "FEB";break;
            case 3:MMM = "MAR";break;
            case 4:MMM = "APR";break;
            case 5:MMM = "MAY";break;
            case 6:MMM = "JUN";break;
            case 7:MMM = "JUL";break;
            case 8:MMM = "AUG";break;
            case 9:MMM = "SEP";break;
            case 10:MMM = "OCT";break;
            case 11:MMM = "NOV";break;
            case 12:MMM = "DEC";break;
        }
        return MMM;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        labelRuta = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        panelVenta = new javax.swing.JPanel();
        codigoBarras = new javax.swing.JTextField();
        buscaProducto = new javax.swing.JButton();
        panelImagen = new javax.swing.JPanel();
        imagen = new javax.swing.JButton();
        idProductoAlmacen = new javax.swing.JComboBox();
        tipoVenta = new javax.swing.JComboBox();
        jLabel38 = new javax.swing.JLabel();
        existencia = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        precio = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        cantidad = new javax.swing.JSpinner();
        agregar = new javax.swing.JButton();
        idProductoTienda = new javax.swing.JComboBox();
        panelPedido = new javax.swing.JPanel();
        idCliente = new javax.swing.JComboBox();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        hora = new javax.swing.JSpinner();
        jLabel33 = new javax.swing.JLabel();
        minutos = new javax.swing.JSpinner();
        describirVenta = new javax.swing.JScrollPane();
        descripcion = new javax.swing.JTextArea();
        labelPrecioKilo = new javax.swing.JLabel();
        precioKilo = new javax.swing.JTextField();
        labelKilos = new javax.swing.JLabel();
        kilos = new javax.swing.JSpinner();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        resto = new javax.swing.JTextField();
        abono01 = new javax.swing.JTextField();
        abono02 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        fechaEntrega = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaNuevaVenta = new javax.swing.JTable();
        panelprecios = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        cantidadRecibida01 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        cantidadRecibida02 = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        resta01 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        cambio = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        agregar1 = new javax.swing.JButton();
        agregar2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(245, 246, 247));
        setPreferredSize(new java.awt.Dimension(900, 600));

        jPanel4.setBackground(new java.awt.Color(250, 250, 250));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true));

        labelRuta.setBackground(new java.awt.Color(250, 250, 250));
        labelRuta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelRuta.setForeground(new java.awt.Color(53, 107, 161));
        labelRuta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/nuevaVenta.png"))); // NOI18N
        labelRuta.setText("Venta de prodcutos / Nueva venta");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(labelRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelRuta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(220, 220, 220), 1, true));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));

        panelVenta.setBackground(new java.awt.Color(255, 255, 255));

        codigoBarras.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        codigoBarras.setForeground(new java.awt.Color(180, 180, 180));
        codigoBarras.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        codigoBarras.setText("Código de barras");
        codigoBarras.setPreferredSize(new java.awt.Dimension(49, 28));
        codigoBarras.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                codigoBarrasFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                codigoBarrasFocusLost(evt);
            }
        });
        codigoBarras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoBarrasActionPerformed(evt);
            }
        });
        codigoBarras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                codigoBarrasKeyPressed(evt);
            }
        });

        buscaProducto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        buscaProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/findproducto.png"))); // NOI18N
        buscaProducto.setText("Busca");
        buscaProducto.setToolTipText("Limpia formulario");
        buscaProducto.setContentAreaFilled(false);
        buscaProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscaProducto.setPreferredSize(new java.awt.Dimension(107, 33));
        buscaProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaProductoActionPerformed(evt);
            }
        });

        panelImagen.setBackground(new java.awt.Color(255, 255, 255));
        panelImagen.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(180, 180, 180), 1, true));

        imagen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/buscaImagen.png"))); // NOI18N
        imagen.setToolTipText("Cargar foto de producto");
        imagen.setContentAreaFilled(false);
        imagen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imagen.setPreferredSize(new java.awt.Dimension(107, 33));
        imagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imagenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelImagenLayout = new javax.swing.GroupLayout(panelImagen);
        panelImagen.setLayout(panelImagenLayout);
        panelImagenLayout.setHorizontalGroup(
            panelImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelImagenLayout.setVerticalGroup(
            panelImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        idProductoAlmacen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        idProductoAlmacen.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Producto almacen" }));
        idProductoAlmacen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        idProductoAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idProductoAlmacenActionPerformed(evt);
            }
        });
        idProductoAlmacen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                idProductoAlmacenKeyPressed(evt);
            }
        });

        tipoVenta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tipoVenta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tipo venta", "Mostrador", "Pedido" }));
        tipoVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tipoVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoVentaActionPerformed(evt);
            }
        });
        tipoVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tipoVentaKeyPressed(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel38.setText("Existencia:");

        existencia.setEditable(false);
        existencia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        existencia.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        existencia.setText("0");
        existencia.setOpaque(false);
        existencia.setPreferredSize(new java.awt.Dimension(49, 28));
        existencia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                existenciaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                existenciaFocusLost(evt);
            }
        });
        existencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                existenciaActionPerformed(evt);
            }
        });
        existencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                existenciaKeyPressed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel37.setText("Precio: $");

        precio.setEditable(false);
        precio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        precio.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        precio.setText("0");
        precio.setOpaque(false);
        precio.setPreferredSize(new java.awt.Dimension(49, 28));
        precio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                precioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                precioFocusLost(evt);
            }
        });
        precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioActionPerformed(evt);
            }
        });
        precio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                precioKeyPressed(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel39.setText("Cantidad:");

        cantidad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));
        cantidad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cantidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cantidadStateChanged(evt);
            }
        });
        cantidad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cantidadFocusLost(evt);
            }
        });
        cantidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cantidadMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cantidadMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cantidadMousePressed(evt);
            }
        });
        cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cantidadKeyPressed(evt);
            }
        });

        agregar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/agregar.png"))); // NOI18N
        agregar.setText("Agregar");
        agregar.setToolTipText("Limpia formulario");
        agregar.setContentAreaFilled(false);
        agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agregar.setPreferredSize(new java.awt.Dimension(107, 33));
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        idProductoTienda.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        idProductoTienda.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Producto tienda" }));
        idProductoTienda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        idProductoTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idProductoTiendaActionPerformed(evt);
            }
        });
        idProductoTienda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                idProductoTiendaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panelVentaLayout = new javax.swing.GroupLayout(panelVenta);
        panelVenta.setLayout(panelVentaLayout);
        panelVentaLayout.setHorizontalGroup(
            panelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelVentaLayout.createSequentialGroup()
                        .addComponent(codigoBarras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buscaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelVentaLayout.createSequentialGroup()
                        .addComponent(panelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelVentaLayout.createSequentialGroup()
                                .addGroup(panelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel38))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(precio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(existencia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelVentaLayout.createSequentialGroup()
                                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                    .addComponent(agregar, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)))
                            .addComponent(tipoVenta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(idProductoAlmacen, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(idProductoTienda, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(2, 2, 2))))
        );
        panelVentaLayout.setVerticalGroup(
            panelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoBarras, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(panelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelVentaLayout.createSequentialGroup()
                        .addComponent(idProductoTienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(idProductoAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tipoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(existencia, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelPedido.setBackground(new java.awt.Color(255, 255, 255));

        idCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        idCliente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecciona cliente" }));
        idCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        idCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idClienteActionPerformed(evt);
            }
        });
        idCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                idClienteKeyPressed(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel40.setText("Fecha:");

        jLabel41.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel41.setText("Hora:");

        hora.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        hora.setModel(new javax.swing.SpinnerNumberModel(12, 1, 23, 1));
        hora.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hora.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                horaStateChanged(evt);
            }
        });
        hora.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                horaFocusLost(evt);
            }
        });
        hora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                horaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                horaMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                horaMousePressed(evt);
            }
        });
        hora.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                horaKeyPressed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(66, 139, 202));
        jLabel33.setText(":");

        minutos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        minutos.setModel(new javax.swing.SpinnerNumberModel(30, 0, 59, 15));
        minutos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minutos.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                minutosStateChanged(evt);
            }
        });
        minutos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                minutosFocusLost(evt);
            }
        });
        minutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minutosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minutosMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                minutosMousePressed(evt);
            }
        });
        minutos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                minutosKeyPressed(evt);
            }
        });

        descripcion.setColumns(20);
        descripcion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        descripcion.setForeground(new java.awt.Color(180, 180, 180));
        descripcion.setLineWrap(true);
        descripcion.setRows(3);
        descripcion.setText("Agrega una descripción");
        descripcion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                descripcionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                descripcionFocusLost(evt);
            }
        });
        describirVenta.setViewportView(descripcion);

        labelPrecioKilo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelPrecioKilo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelPrecioKilo.setText("Precio kilo:");

        precioKilo.setEditable(false);
        precioKilo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        precioKilo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        precioKilo.setText("0");
        precioKilo.setOpaque(false);
        precioKilo.setPreferredSize(new java.awt.Dimension(49, 28));
        precioKilo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                precioKiloFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                precioKiloFocusLost(evt);
            }
        });
        precioKilo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioKiloActionPerformed(evt);
            }
        });
        precioKilo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                precioKiloKeyPressed(evt);
            }
        });

        labelKilos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelKilos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelKilos.setText("Kilos:");

        kilos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        kilos.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        kilos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kilos.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                kilosStateChanged(evt);
            }
        });
        kilos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                kilosFocusLost(evt);
            }
        });
        kilos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kilosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                kilosMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                kilosMousePressed(evt);
            }
        });
        kilos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                kilosKeyPressed(evt);
            }
        });

        jLabel44.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel44.setText("Abono: $");

        jLabel45.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel45.setText("Resto: $");

        resto.setEditable(false);
        resto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        resto.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        resto.setText("0");
        resto.setOpaque(false);
        resto.setPreferredSize(new java.awt.Dimension(49, 28));
        resto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                restoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                restoFocusLost(evt);
            }
        });
        resto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restoActionPerformed(evt);
            }
        });
        resto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                restoKeyPressed(evt);
            }
        });

        abono01.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        abono01.setForeground(new java.awt.Color(180, 180, 180));
        abono01.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        abono01.setText("0");
        abono01.setPreferredSize(new java.awt.Dimension(49, 28));
        abono01.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                abono01FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                abono01FocusLost(evt);
            }
        });

        abono02.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        abono02.setForeground(new java.awt.Color(180, 180, 180));
        abono02.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        abono02.setText("00");
        abono02.setPreferredSize(new java.awt.Dimension(49, 28));
        abono02.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                abono02FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                abono02FocusLost(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(66, 139, 202));
        jLabel31.setText(".");

        jLabel50.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel50.setText("Cliente:");

        fechaEntrega.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout panelPedidoLayout = new javax.swing.GroupLayout(panelPedido);
        panelPedido.setLayout(panelPedidoLayout);
        panelPedidoLayout.setHorizontalGroup(
            panelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPedidoLayout.createSequentialGroup()
                .addGroup(panelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelPedidoLayout.createSequentialGroup()
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fechaEntrega, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelPedidoLayout.createSequentialGroup()
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(minutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPedidoLayout.createSequentialGroup()
                        .addGroup(panelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelPedidoLayout.createSequentialGroup()
                                .addComponent(abono01, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(abono02, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(resto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(describirVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelPedidoLayout.createSequentialGroup()
                        .addGroup(panelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelPrecioKilo)
                            .addComponent(labelKilos, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPedidoLayout.createSequentialGroup()
                                .addComponent(kilos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(precioKilo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
            .addGroup(panelPedidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelPedidoLayout.setVerticalGroup(
            panelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPedidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(panelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panelPedidoLayout.createSequentialGroup()
                        .addGroup(panelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fechaEntrega, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33)
                            .addComponent(minutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))
                    .addComponent(describirVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precioKilo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPrecioKilo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(abono01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31)
                    .addComponent(abono02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelKilos, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kilos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tablaNuevaVenta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tablaNuevaVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaNuevaVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaNuevaVentaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaNuevaVenta);

        panelprecios.setBackground(new java.awt.Color(255, 255, 255));

        jLabel46.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel46.setText("Cantidad Recibida: $");

        cantidadRecibida01.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cantidadRecibida01.setForeground(new java.awt.Color(180, 180, 180));
        cantidadRecibida01.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        cantidadRecibida01.setText("0");
        cantidadRecibida01.setPreferredSize(new java.awt.Dimension(49, 28));
        cantidadRecibida01.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cantidadRecibida01FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cantidadRecibida01FocusLost(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(66, 139, 202));
        jLabel32.setText(".");

        cantidadRecibida02.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cantidadRecibida02.setForeground(new java.awt.Color(180, 180, 180));
        cantidadRecibida02.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        cantidadRecibida02.setText("00");
        cantidadRecibida02.setPreferredSize(new java.awt.Dimension(49, 28));
        cantidadRecibida02.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cantidadRecibida02FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cantidadRecibida02FocusLost(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel49.setText("Resta: $");

        resta01.setEditable(false);
        resta01.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        resta01.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        resta01.setText("0");
        resta01.setOpaque(false);
        resta01.setPreferredSize(new java.awt.Dimension(49, 28));
        resta01.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                resta01FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                resta01FocusLost(evt);
            }
        });
        resta01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resta01ActionPerformed(evt);
            }
        });
        resta01.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                resta01KeyPressed(evt);
            }
        });

        jLabel48.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel48.setText("Cambio: $");

        cambio.setEditable(false);
        cambio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cambio.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        cambio.setText("0");
        cambio.setOpaque(false);
        cambio.setPreferredSize(new java.awt.Dimension(49, 28));
        cambio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cambioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cambioFocusLost(evt);
            }
        });
        cambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambioActionPerformed(evt);
            }
        });
        cambio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cambioKeyPressed(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel47.setText("Total: $");

        total.setEditable(false);
        total.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        total.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        total.setText("0");
        total.setOpaque(false);
        total.setPreferredSize(new java.awt.Dimension(49, 28));
        total.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                totalFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                totalFocusLost(evt);
            }
        });
        total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalActionPerformed(evt);
            }
        });
        total.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                totalKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panelpreciosLayout = new javax.swing.GroupLayout(panelprecios);
        panelprecios.setLayout(panelpreciosLayout);
        panelpreciosLayout.setHorizontalGroup(
            panelpreciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelpreciosLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cantidadRecibida01, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cantidadRecibida02, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel49)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resta01, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel48)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cambio, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel47)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelpreciosLayout.setVerticalGroup(
            panelpreciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelpreciosLayout.createSequentialGroup()
                .addGroup(panelpreciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cantidadRecibida01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32)
                    .addComponent(cantidadRecibida02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resta01, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cambio, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(66, 139, 202));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Datos venta pedido");

        agregar1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        agregar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/aceptar.png"))); // NOI18N
        agregar1.setText("Vender");
        agregar1.setToolTipText("Limpia formulario");
        agregar1.setContentAreaFilled(false);
        agregar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agregar1.setPreferredSize(new java.awt.Dimension(107, 33));
        agregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar1ActionPerformed(evt);
            }
        });

        agregar2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        agregar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/limpiar.png"))); // NOI18N
        agregar2.setText("Limpia producto");
        agregar2.setToolTipText("Limpia formulario");
        agregar2.setContentAreaFilled(false);
        agregar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agregar2.setPreferredSize(new java.awt.Dimension(107, 33));
        agregar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(panelVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panelPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 858, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(agregar2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(agregar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(panelprecios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelprecios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agregar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 909, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        // TODO add your handling code here:
        controller.agregarVentaTabla(userTemp.getIdUsuario());
         controller.limpiaCamposVenta();
    }//GEN-LAST:event_agregarActionPerformed

    private void idProductoAlmacenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idProductoAlmacenKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_idProductoAlmacenKeyPressed

    private void idProductoAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idProductoAlmacenActionPerformed
        // TODO add your handling code here:
        controller.buscaInfoProducto(true);
        panelPedido.setVisible(false);
    }//GEN-LAST:event_idProductoAlmacenActionPerformed

    private void imagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imagenActionPerformed
        // TODO add your handling code here:
//        Controller.ControllerImagenes image = new Controller.ControllerImagenes();
//        image.buscaImagen(panelImagen,imagen);
//        controller.setRutaImagen(image.getRuta());
    }//GEN-LAST:event_imagenActionPerformed

    private void codigoBarrasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigoBarrasKeyPressed
        // TODO add your handling code here:
//        if(evt.getKeyChar()==10)
//        controller.agregaModificaProducto();
    }//GEN-LAST:event_codigoBarrasKeyPressed

    private void codigoBarrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoBarrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoBarrasActionPerformed

    private void codigoBarrasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_codigoBarrasFocusLost
        // TODO add your handling code here:
        validation.placeHolder(false,codigoBarras,"Código de barras");
    }//GEN-LAST:event_codigoBarrasFocusLost

    private void codigoBarrasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_codigoBarrasFocusGained
        // TODO add your handling code here:
        validation.placeHolder(true,codigoBarras,"Código de barras");
//        labelStatus.setText("");
    }//GEN-LAST:event_codigoBarrasFocusGained

    private void cantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadKeyPressed
        // TODO add your handling code here:
//        if(evt.getKeyChar()==10)
//        controller.agregaModificaProducto();;
    }//GEN-LAST:event_cantidadKeyPressed

    private void cantidadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cantidadMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadMousePressed

    private void cantidadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cantidadMouseEntered

    }//GEN-LAST:event_cantidadMouseEntered

    private void cantidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cantidadMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadMouseClicked

    private void cantidadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cantidadFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadFocusLost

    private void cantidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cantidadStateChanged
        // TODO add your handling code here:
        controller.calcularPrecioVentaGeneral(true);
    }//GEN-LAST:event_cantidadStateChanged

    private void tablaNuevaVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaNuevaVentaMouseClicked
        // TODO add your handling code here:
//        controller.buscaInfoProducto(panelImagen,imagen);
    }//GEN-LAST:event_tablaNuevaVentaMouseClicked

    private void precioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_precioFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_precioFocusGained

    private void precioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_precioFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_precioFocusLost

    private void precioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioActionPerformed

    private void precioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precioKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioKeyPressed

    private void tipoVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoVentaActionPerformed
        // TODO add your handling code here:
    controller.muestraInfoPedido(panelPedido, labelPrecioKilo, labelKilos);
    }//GEN-LAST:event_tipoVentaActionPerformed

    private void tipoVentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tipoVentaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoVentaKeyPressed

    private void buscaProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscaProductoActionPerformed

    private void existenciaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_existenciaFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_existenciaFocusGained

    private void existenciaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_existenciaFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_existenciaFocusLost

    private void existenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_existenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_existenciaActionPerformed

    private void existenciaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_existenciaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_existenciaKeyPressed

    private void totalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_totalFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_totalFocusGained

    private void totalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_totalFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_totalFocusLost

    private void totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalActionPerformed

    private void totalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_totalKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalKeyPressed

    private void cambioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cambioFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cambioFocusGained

    private void cambioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cambioFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cambioFocusLost

    private void cambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cambioActionPerformed

    private void cambioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cambioKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cambioKeyPressed

    private void resta01FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_resta01FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_resta01FocusGained

    private void resta01FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_resta01FocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_resta01FocusLost

    private void resta01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resta01ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resta01ActionPerformed

    private void resta01KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_resta01KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_resta01KeyPressed

    private void restoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_restoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_restoKeyPressed

    private void restoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_restoActionPerformed

    private void restoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_restoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_restoFocusLost

    private void restoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_restoFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_restoFocusGained

    private void kilosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kilosKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_kilosKeyPressed

    private void kilosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kilosMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_kilosMousePressed

    private void kilosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kilosMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_kilosMouseEntered

    private void kilosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kilosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_kilosMouseClicked

    private void kilosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kilosFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_kilosFocusLost

    private void kilosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_kilosStateChanged
        // TODO add your handling code here:
        controller.calcularPrecioVentaGeneral(false);
    }//GEN-LAST:event_kilosStateChanged

    private void precioKiloKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precioKiloKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioKiloKeyPressed

    private void precioKiloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioKiloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioKiloActionPerformed

    private void precioKiloFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_precioKiloFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_precioKiloFocusLost

    private void precioKiloFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_precioKiloFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_precioKiloFocusGained

    private void descripcionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_descripcionFocusLost
        // TODO add your handling code here:
        validation.placeHolder(false,descripcion,"Agrega una descripción");
    }//GEN-LAST:event_descripcionFocusLost

    private void descripcionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_descripcionFocusGained
        // TODO add your handling code here:
        validation.placeHolder(true,descripcion,"Agrega una descripción");
    }//GEN-LAST:event_descripcionFocusGained

    private void minutosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_minutosKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_minutosKeyPressed

    private void minutosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minutosMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_minutosMousePressed

    private void minutosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minutosMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_minutosMouseEntered

    private void minutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minutosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_minutosMouseClicked

    private void minutosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_minutosFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_minutosFocusLost

    private void minutosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_minutosStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_minutosStateChanged

    private void horaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_horaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_horaKeyPressed

    private void horaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_horaMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_horaMousePressed

    private void horaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_horaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_horaMouseEntered

    private void horaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_horaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_horaMouseClicked

    private void horaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_horaFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_horaFocusLost

    private void horaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_horaStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_horaStateChanged

    private void idClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idClienteKeyPressed
//        if(evt.getKeyChar()==10)
//        controller.agregaModificaProducto();         // TODO add your handling code here:
    }//GEN-LAST:event_idClienteKeyPressed

    private void idClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idClienteActionPerformed

    private void abono01FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_abono01FocusGained
        // TODO add your handling code here:
        validation.placeHolder(true, abono01,"0");
    }//GEN-LAST:event_abono01FocusGained

    private void abono01FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_abono01FocusLost
        // TODO add your handling code here:
        validation.placeHolder(false, abono01,"0");
        controller.ingresaAbono();
    }//GEN-LAST:event_abono01FocusLost

    private void abono02FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_abono02FocusGained
        // TODO add your handling code here:
        validation.placeHolder(true, abono02,"00");
    }//GEN-LAST:event_abono02FocusGained

    private void abono02FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_abono02FocusLost
        // TODO add your handling code here:
        validation.placeHolder(false, abono02,"00");
        controller.ingresaAbono();
    }//GEN-LAST:event_abono02FocusLost

    private void cantidadRecibida01FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cantidadRecibida01FocusGained
        // TODO add your handling code here:
        validation.placeHolder(true, cantidadRecibida01,"0");
    }//GEN-LAST:event_cantidadRecibida01FocusGained

    private void cantidadRecibida01FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cantidadRecibida01FocusLost
        // TODO add your handling code here:
        validation.placeHolder(false, cantidadRecibida01,"0");
        controller.ingresaCantidadPagar();
    }//GEN-LAST:event_cantidadRecibida01FocusLost

    private void cantidadRecibida02FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cantidadRecibida02FocusGained
        // TODO add your handling code here:
        validation.placeHolder(true, cantidadRecibida02,"00");
    }//GEN-LAST:event_cantidadRecibida02FocusGained

    private void cantidadRecibida02FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cantidadRecibida02FocusLost
        // TODO add your handling code here:
        validation.placeHolder(false, cantidadRecibida02,"00");
        controller.ingresaCantidadPagar();
    }//GEN-LAST:event_cantidadRecibida02FocusLost

    private void idProductoTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idProductoTiendaActionPerformed
        // TODO add your handling code here:
        controller.buscaInfoProducto(false);
        panelPedido.setVisible(false);
    }//GEN-LAST:event_idProductoTiendaActionPerformed

    private void idProductoTiendaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idProductoTiendaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_idProductoTiendaKeyPressed

    private void agregar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar2ActionPerformed
        // TODO add your handling code here:
        controller.limpiaCamposVenta();
    }//GEN-LAST:event_agregar2ActionPerformed

    private void agregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar1ActionPerformed
        // TODO add your handling code here:
        controller.addRegistro();
    }//GEN-LAST:event_agregar1ActionPerformed

    
       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField abono01;
    private javax.swing.JTextField abono02;
    private javax.swing.JButton agregar;
    private javax.swing.JButton agregar1;
    private javax.swing.JButton agregar2;
    private javax.swing.JButton buscaProducto;
    private javax.swing.JTextField cambio;
    private javax.swing.JSpinner cantidad;
    private javax.swing.JTextField cantidadRecibida01;
    private javax.swing.JTextField cantidadRecibida02;
    private javax.swing.JTextField codigoBarras;
    private javax.swing.JScrollPane describirVenta;
    private javax.swing.JTextArea descripcion;
    private javax.swing.JTextField existencia;
    private com.toedter.calendar.JDateChooser fechaEntrega;
    private javax.swing.JSpinner hora;
    private javax.swing.JComboBox idCliente;
    private javax.swing.JComboBox idProductoAlmacen;
    private javax.swing.JComboBox idProductoTienda;
    private javax.swing.JButton imagen;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner kilos;
    private javax.swing.JLabel labelKilos;
    private javax.swing.JLabel labelPrecioKilo;
    private javax.swing.JLabel labelRuta;
    private javax.swing.JSpinner minutos;
    private javax.swing.JPanel panelImagen;
    private javax.swing.JPanel panelPedido;
    private javax.swing.JPanel panelVenta;
    private javax.swing.JPanel panelprecios;
    private javax.swing.JTextField precio;
    private javax.swing.JTextField precioKilo;
    private javax.swing.JTextField resta01;
    private javax.swing.JTextField resto;
    private javax.swing.JTable tablaNuevaVenta;
    private javax.swing.JComboBox tipoVenta;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}
