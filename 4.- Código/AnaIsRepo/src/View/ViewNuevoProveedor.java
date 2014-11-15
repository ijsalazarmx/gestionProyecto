/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Teté
 */
public class ViewNuevoProveedor extends javax.swing.JPanel {

    /**
     * Creates new form ViewNuevoProveedor
     */
    public ViewNuevoProveedor() {
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

        labelNuevoPro = new javax.swing.JLabel();
        panelDatoPer = new javax.swing.JPanel();
        labelCodProv = new javax.swing.JLabel();
        codProveedor = new javax.swing.JTextField();
        labelNomProveedor = new javax.swing.JLabel();
        nomProveedor = new javax.swing.JTextField();
        labelApePaProv = new javax.swing.JLabel();
        apePaternoProv = new javax.swing.JTextField();
        labelApMatProv = new javax.swing.JLabel();
        apeMatProv = new javax.swing.JTextField();
        labelRFC = new javax.swing.JLabel();
        rFC = new javax.swing.JTextField();
        marcaProv = new javax.swing.JTextField();
        labelMarcaProv = new javax.swing.JLabel();
        labelEmpresaProv = new javax.swing.JLabel();
        empresaProv = new javax.swing.JTextField();
        labelTelFijoProv = new javax.swing.JLabel();
        telefonoFijoProv = new javax.swing.JTextField();
        labelTelCelProv = new javax.swing.JLabel();
        telefonoCelProv = new javax.swing.JTextField();
        labelEMail = new javax.swing.JLabel();
        eMailProv = new javax.swing.JTextField();
        panelDirProv = new javax.swing.JPanel();
        labelCalleProv = new javax.swing.JLabel();
        calleProv = new javax.swing.JTextField();
        labelNoIntProv = new javax.swing.JLabel();
        noIntProv = new javax.swing.JTextField();
        labelNoExt = new javax.swing.JLabel();
        noExtProv = new javax.swing.JTextField();
        labelColProv = new javax.swing.JLabel();
        coloniaProv = new javax.swing.JTextField();
        labelCiuProv = new javax.swing.JLabel();
        ciudadProv = new javax.swing.JTextField();
        codPosProv = new javax.swing.JTextField();
        codigoPosProv = new javax.swing.JLabel();
        botonLimpiarProv = new javax.swing.JButton();
        botonCancelarProv = new javax.swing.JButton();
        botonAceptarProv = new javax.swing.JButton();

        setBackground(new java.awt.Color(245, 246, 247));

        labelNuevoPro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelNuevoPro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNuevoPro.setText("Nuevo Proveedor");

        panelDatoPer.setBackground(new java.awt.Color(245, 246, 247));
        panelDatoPer.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Personales", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        labelCodProv.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCodProv.setText("Código de Proveedor");

        codProveedor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        codProveedor.setForeground(new java.awt.Color(204, 204, 255));
        codProveedor.setText("Cod. Prov.");
        codProveedor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                codProveedorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                codProveedorFocusLost(evt);
            }
        });

        labelNomProveedor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelNomProveedor.setText("Nombre");

        nomProveedor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nomProveedor.setForeground(new java.awt.Color(204, 204, 255));
        nomProveedor.setText("Nombre.");
        nomProveedor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nomProveedorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nomProveedorFocusLost(evt);
            }
        });

        labelApePaProv.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelApePaProv.setText("Apellido Paterno");

        apePaternoProv.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        apePaternoProv.setForeground(new java.awt.Color(204, 204, 255));
        apePaternoProv.setText("Ape. Paterno.");
        apePaternoProv.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                apePaternoProvFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                apePaternoProvFocusLost(evt);
            }
        });

        labelApMatProv.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelApMatProv.setText("Apellido Materno");

        apeMatProv.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        apeMatProv.setForeground(new java.awt.Color(204, 204, 255));
        apeMatProv.setText("Ape. Materno.");
        apeMatProv.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                apeMatProvFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                apeMatProvFocusLost(evt);
            }
        });

        labelRFC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelRFC.setText("RFC");

        rFC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rFC.setForeground(new java.awt.Color(204, 204, 255));
        rFC.setText("RFC");
        rFC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                rFCFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                rFCFocusLost(evt);
            }
        });

        marcaProv.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        marcaProv.setForeground(new java.awt.Color(204, 204, 255));
        marcaProv.setText("Marca");
        marcaProv.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                marcaProvFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                marcaProvFocusLost(evt);
            }
        });

        labelMarcaProv.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelMarcaProv.setText("Marca");

        labelEmpresaProv.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelEmpresaProv.setText("Empresa");

        empresaProv.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        empresaProv.setForeground(new java.awt.Color(204, 204, 255));
        empresaProv.setText("Empresa");
        empresaProv.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                empresaProvFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                empresaProvFocusLost(evt);
            }
        });

        labelTelFijoProv.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelTelFijoProv.setText("Teléfono Fijo");

        telefonoFijoProv.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        telefonoFijoProv.setForeground(new java.awt.Color(204, 204, 255));
        telefonoFijoProv.setText("Tel. Fijo.");
        telefonoFijoProv.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                telefonoFijoProvFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                telefonoFijoProvFocusLost(evt);
            }
        });

        labelTelCelProv.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelTelCelProv.setText("Teléfono Celular");

        telefonoCelProv.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        telefonoCelProv.setForeground(new java.awt.Color(204, 204, 255));
        telefonoCelProv.setText("Tel. Cel.");
        telefonoCelProv.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                telefonoCelProvFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                telefonoCelProvFocusLost(evt);
            }
        });

        labelEMail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelEMail.setText("e-Mail");

        eMailProv.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        eMailProv.setForeground(new java.awt.Color(204, 204, 255));
        eMailProv.setText("e-Mail.");
        eMailProv.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                eMailProvFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                eMailProvFocusLost(evt);
            }
        });

        javax.swing.GroupLayout panelDatoPerLayout = new javax.swing.GroupLayout(panelDatoPer);
        panelDatoPer.setLayout(panelDatoPerLayout);
        panelDatoPerLayout.setHorizontalGroup(
            panelDatoPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatoPerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatoPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatoPerLayout.createSequentialGroup()
                        .addComponent(labelCodProv)
                        .addGap(18, 18, 18)
                        .addComponent(codProveedor))
                    .addGroup(panelDatoPerLayout.createSequentialGroup()
                        .addComponent(labelNomProveedor)
                        .addGap(98, 98, 98)
                        .addComponent(nomProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE))
                    .addGroup(panelDatoPerLayout.createSequentialGroup()
                        .addComponent(labelApePaProv)
                        .addGap(47, 47, 47)
                        .addComponent(apePaternoProv, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE))
                    .addGroup(panelDatoPerLayout.createSequentialGroup()
                        .addComponent(labelApMatProv)
                        .addGap(42, 42, 42)
                        .addComponent(apeMatProv, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE))
                    .addGroup(panelDatoPerLayout.createSequentialGroup()
                        .addGroup(panelDatoPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelRFC)
                            .addComponent(labelMarcaProv))
                        .addGap(110, 110, 110)
                        .addGroup(panelDatoPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(marcaProv)
                            .addComponent(rFC, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)))
                    .addGroup(panelDatoPerLayout.createSequentialGroup()
                        .addComponent(labelEmpresaProv)
                        .addGap(96, 96, 96)
                        .addComponent(empresaProv))
                    .addGroup(panelDatoPerLayout.createSequentialGroup()
                        .addComponent(labelTelFijoProv)
                        .addGap(71, 71, 71)
                        .addComponent(telefonoFijoProv))
                    .addGroup(panelDatoPerLayout.createSequentialGroup()
                        .addComponent(labelTelCelProv)
                        .addGap(50, 50, 50)
                        .addComponent(telefonoCelProv))
                    .addGroup(panelDatoPerLayout.createSequentialGroup()
                        .addComponent(labelEMail)
                        .addGap(109, 109, 109)
                        .addComponent(eMailProv)))
                .addContainerGap())
        );
        panelDatoPerLayout.setVerticalGroup(
            panelDatoPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatoPerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatoPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCodProv)
                    .addComponent(codProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatoPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomProveedor)
                    .addComponent(nomProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatoPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelApePaProv)
                    .addComponent(apePaternoProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatoPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelApMatProv)
                    .addComponent(apeMatProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatoPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRFC)
                    .addComponent(rFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(panelDatoPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMarcaProv)
                    .addComponent(marcaProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatoPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmpresaProv)
                    .addComponent(empresaProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatoPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTelFijoProv)
                    .addComponent(telefonoFijoProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatoPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTelCelProv)
                    .addComponent(telefonoCelProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatoPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEMail)
                    .addComponent(eMailProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        panelDirProv.setBackground(new java.awt.Color(245, 246, 247));
        panelDirProv.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dirección", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        labelCalleProv.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCalleProv.setText("Calle");

        calleProv.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        calleProv.setForeground(new java.awt.Color(204, 204, 255));
        calleProv.setText("Calle.");
        calleProv.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                calleProvFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                calleProvFocusLost(evt);
            }
        });

        labelNoIntProv.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelNoIntProv.setText("No. Interior");

        noIntProv.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        noIntProv.setForeground(new java.awt.Color(204, 204, 255));
        noIntProv.setText("No. Int.");
        noIntProv.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                noIntProvFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                noIntProvFocusLost(evt);
            }
        });

        labelNoExt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelNoExt.setText("No. Exterior");

        noExtProv.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        noExtProv.setForeground(new java.awt.Color(204, 204, 255));
        noExtProv.setText("No. Ext.");
        noExtProv.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                noExtProvFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                noExtProvFocusLost(evt);
            }
        });

        labelColProv.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelColProv.setText("Colonia");

        coloniaProv.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        coloniaProv.setForeground(new java.awt.Color(204, 204, 255));
        coloniaProv.setText("Colonia.");
        coloniaProv.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                coloniaProvFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                coloniaProvFocusLost(evt);
            }
        });

        labelCiuProv.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCiuProv.setText("Ciudad");

        ciudadProv.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ciudadProv.setForeground(new java.awt.Color(204, 204, 255));
        ciudadProv.setText("Ciudad.");
        ciudadProv.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ciudadProvFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ciudadProvFocusLost(evt);
            }
        });

        codPosProv.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        codPosProv.setForeground(new java.awt.Color(204, 204, 255));
        codPosProv.setText("C.P.");
        codPosProv.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                codPosProvFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                codPosProvFocusLost(evt);
            }
        });

        codigoPosProv.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        codigoPosProv.setText("Código Postal");

        javax.swing.GroupLayout panelDirProvLayout = new javax.swing.GroupLayout(panelDirProv);
        panelDirProv.setLayout(panelDirProvLayout);
        panelDirProvLayout.setHorizontalGroup(
            panelDirProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDirProvLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDirProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDirProvLayout.createSequentialGroup()
                        .addGroup(panelDirProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCiuProv)
                            .addComponent(codigoPosProv))
                        .addGap(63, 63, 63)
                        .addGroup(panelDirProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ciudadProv)
                            .addComponent(codPosProv)))
                    .addGroup(panelDirProvLayout.createSequentialGroup()
                        .addGroup(panelDirProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNoIntProv)
                            .addComponent(labelCalleProv)
                            .addComponent(labelNoExt)
                            .addComponent(labelColProv))
                        .addGap(77, 77, 77)
                        .addGroup(panelDirProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(coloniaProv, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                            .addComponent(noExtProv)
                            .addComponent(noIntProv)
                            .addComponent(calleProv))))
                .addContainerGap())
        );
        panelDirProvLayout.setVerticalGroup(
            panelDirProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDirProvLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDirProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCalleProv)
                    .addComponent(calleProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDirProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNoIntProv)
                    .addComponent(noIntProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDirProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNoExt)
                    .addComponent(noExtProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDirProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelColProv)
                    .addComponent(coloniaProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDirProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCiuProv)
                    .addComponent(ciudadProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(panelDirProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoPosProv)
                    .addComponent(codPosProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(170, Short.MAX_VALUE))
        );

        botonLimpiarProv.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonLimpiarProv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/trash.png"))); // NOI18N
        botonLimpiarProv.setText("Limpiar");
        botonLimpiarProv.setContentAreaFilled(false);
        botonLimpiarProv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        botonCancelarProv.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonCancelarProv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/cancel.png"))); // NOI18N
        botonCancelarProv.setText("Cancelar");
        botonCancelarProv.setContentAreaFilled(false);
        botonCancelarProv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        botonAceptarProv.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonAceptarProv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/tick.png"))); // NOI18N
        botonAceptarProv.setText("Aceptar");
        botonAceptarProv.setContentAreaFilled(false);
        botonAceptarProv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNuevoPro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelDatoPer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(panelDirProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 17, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(botonLimpiarProv)
                .addGap(100, 100, 100)
                .addComponent(botonCancelarProv)
                .addGap(89, 89, 89)
                .addComponent(botonAceptarProv)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelNuevoPro)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelDatoPer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelDirProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonLimpiarProv)
                    .addComponent(botonCancelarProv)
                    .addComponent(botonAceptarProv))
                .addContainerGap(144, Short.MAX_VALUE))
        );

        panelDirProv.getAccessibleContext().setAccessibleName("Dirección");
    }// </editor-fold>//GEN-END:initComponents

    private void codProveedorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_codProveedorFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_codProveedorFocusGained

    private void codProveedorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_codProveedorFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_codProveedorFocusLost

    private void nomProveedorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nomProveedorFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_nomProveedorFocusGained

    private void nomProveedorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nomProveedorFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_nomProveedorFocusLost

    private void apePaternoProvFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_apePaternoProvFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_apePaternoProvFocusGained

    private void apePaternoProvFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_apePaternoProvFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_apePaternoProvFocusLost

    private void apeMatProvFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_apeMatProvFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_apeMatProvFocusGained

    private void apeMatProvFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_apeMatProvFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_apeMatProvFocusLost

    private void rFCFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rFCFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_rFCFocusGained

    private void rFCFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rFCFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_rFCFocusLost

    private void marcaProvFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_marcaProvFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_marcaProvFocusGained

    private void marcaProvFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_marcaProvFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_marcaProvFocusLost

    private void empresaProvFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_empresaProvFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_empresaProvFocusGained

    private void empresaProvFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_empresaProvFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_empresaProvFocusLost

    private void telefonoFijoProvFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_telefonoFijoProvFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoFijoProvFocusGained

    private void telefonoFijoProvFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_telefonoFijoProvFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoFijoProvFocusLost

    private void telefonoCelProvFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_telefonoCelProvFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoCelProvFocusGained

    private void telefonoCelProvFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_telefonoCelProvFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoCelProvFocusLost

    private void eMailProvFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_eMailProvFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_eMailProvFocusGained

    private void eMailProvFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_eMailProvFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_eMailProvFocusLost

    private void calleProvFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_calleProvFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_calleProvFocusGained

    private void calleProvFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_calleProvFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_calleProvFocusLost

    private void noIntProvFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_noIntProvFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_noIntProvFocusGained

    private void noIntProvFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_noIntProvFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_noIntProvFocusLost

    private void noExtProvFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_noExtProvFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_noExtProvFocusGained

    private void noExtProvFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_noExtProvFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_noExtProvFocusLost

    private void coloniaProvFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_coloniaProvFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_coloniaProvFocusGained

    private void coloniaProvFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_coloniaProvFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_coloniaProvFocusLost

    private void ciudadProvFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ciudadProvFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_ciudadProvFocusGained

    private void ciudadProvFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ciudadProvFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_ciudadProvFocusLost

    private void codPosProvFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_codPosProvFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_codPosProvFocusGained

    private void codPosProvFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_codPosProvFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_codPosProvFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apeMatProv;
    private javax.swing.JTextField apePaternoProv;
    private javax.swing.JButton botonAceptarProv;
    private javax.swing.JButton botonCancelarProv;
    private javax.swing.JButton botonLimpiarProv;
    private javax.swing.JTextField calleProv;
    private javax.swing.JTextField ciudadProv;
    private javax.swing.JTextField codPosProv;
    private javax.swing.JTextField codProveedor;
    private javax.swing.JLabel codigoPosProv;
    private javax.swing.JTextField coloniaProv;
    private javax.swing.JTextField eMailProv;
    private javax.swing.JTextField empresaProv;
    private javax.swing.JLabel labelApMatProv;
    private javax.swing.JLabel labelApePaProv;
    private javax.swing.JLabel labelCalleProv;
    private javax.swing.JLabel labelCiuProv;
    private javax.swing.JLabel labelCodProv;
    private javax.swing.JLabel labelColProv;
    private javax.swing.JLabel labelEMail;
    private javax.swing.JLabel labelEmpresaProv;
    private javax.swing.JLabel labelMarcaProv;
    private javax.swing.JLabel labelNoExt;
    private javax.swing.JLabel labelNoIntProv;
    private javax.swing.JLabel labelNomProveedor;
    private javax.swing.JLabel labelNuevoPro;
    private javax.swing.JLabel labelRFC;
    private javax.swing.JLabel labelTelCelProv;
    private javax.swing.JLabel labelTelFijoProv;
    private javax.swing.JTextField marcaProv;
    private javax.swing.JTextField noExtProv;
    private javax.swing.JTextField noIntProv;
    private javax.swing.JTextField nomProveedor;
    private javax.swing.JPanel panelDatoPer;
    private javax.swing.JPanel panelDirProv;
    private javax.swing.JTextField rFC;
    private javax.swing.JTextField telefonoCelProv;
    private javax.swing.JTextField telefonoFijoProv;
    // End of variables declaration//GEN-END:variables
}
