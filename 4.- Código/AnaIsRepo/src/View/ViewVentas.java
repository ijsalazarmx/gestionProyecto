/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ControllerPaneles;
import Controller.ControllerTables;
import Controller.ControllerValidation;
import Controller.ControllerViewVendedor;
import Model.ModelVenta;
import java.util.List;

/**
 *
 * @author Teté
 */
public class ViewVentas extends javax.swing.JPanel {
    ControllerValidation validation;
    ControllerViewVendedor controller;
    ControllerPaneles controllerPaneles;
    ControllerTables controllerTable;
    ModelVenta modelVenta;

    /**
     * Creates new form ViewVentas
     * @param controllerPaneles
     */
    public ViewVentas(ControllerPaneles controllerPaneles) {
        this.controllerPaneles = controllerPaneles;
        this.validation = new ControllerValidation();
        this.controllerTable = new ControllerTables();
        initComponents();
        modelVenta = new Model.ModelVenta();
        controllerPaneles.setModelVenta(modelVenta);
        modelVenta.creaModelTable();
        this.modelVenta = controllerPaneles.getModelVenta();
        controllerTable.setTabla(tablaVentas);
        controllerTable.setModelTable(modelVenta.getModeloTable());
        controllerTable.getTabla().setModel(controllerTable.getModelTable());
        verDatos();
    }
    

    private void verDatos(){
        List list = DataBase.DataBaseVenta.buscaVentas();
        for (int i = 0; i < list.size(); i++) {
            List lista = (List)list.get(i);
            String[] datos = {""+lista.get(0),""+lista.get(1),""+lista.get(2),""+lista.get(3),""+lista.get(4),""+lista.get(5),""+lista.get(6),""+lista.get(7)};
            controllerTable.agregarDatos(datos);
        }
        totalVentas.setText(""+DataBase.DataBaseVenta.buscaCantidadGanada());
        
    }
    
    private String[] convertirCantidades(String valor){
        String aux = ""+valor;
        int posDot = aux.indexOf(".");
        String valor1 = aux.substring(0,posDot);
        int posDotTemp = posDot+1;
        int posDotTemp2 = posDot+3;
        if(aux.length()<posDotTemp2)
            posDotTemp2=posDotTemp2-1;
        String valor2 = aux.substring(posDotTemp,posDotTemp2);
        if(valor2.length()==1)
            valor2 = valor2+"0";
        String[] temp = new String[]{valor1,valor2};
        return temp;
    }
    
    private double buscaValor(double parteEntera, double parteDecimal) {
        return parteEntera + (parteDecimal / 100);
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
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
            .addComponent(labelVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelTablaVentas.setBackground(new java.awt.Color(250, 250, 250));
        panelTablaVentas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(220, 220, 220), 1, true));

        tablaVentas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tablaVentas.setModel(new javax.swing.table.DefaultTableModel(
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
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaVentas);

        labelTotalVentas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelTotalVentas.setText("Total de ventas:");

        totalVentas.setEditable(false);
        totalVentas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 878, Short.MAX_VALUE)
                    .addGroup(panelTablaVentasLayout.createSequentialGroup()
                        .addComponent(labelTotalVentas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelTablaVentasLayout.setVerticalGroup(
            panelTablaVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablaVentasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTablaVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTotalVentas)
                    .addComponent(jLabel1)
                    .addComponent(totalVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelTablaVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTablaVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelTotalVentas;
    private javax.swing.JLabel labelVentas;
    private javax.swing.JPanel panelTablaVentas;
    private javax.swing.JTable tablaVentas;
    private javax.swing.JTextField totalVentas;
    // End of variables declaration//GEN-END:variables
}
