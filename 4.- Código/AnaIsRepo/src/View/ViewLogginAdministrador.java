/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ControllerValidation;
import Controller.ControllerViewUser;
import Model.ModelUsuario;
import java.util.ArrayList;
import javax.swing.JLabel;

/**
 *
 * @author Jesus
 */
public class ViewLogginAdministrador extends javax.swing.JPanel {
    JLabel labelStatus;
    Thread hilo;
    ControllerValidation validation;
    ControllerViewUser controller;
    int idEmpresa;
    ModelUsuario modelUsuario;
    /**
     * Creates new form ViewCaptInfoBussines
     * @param labelStatus
     * @param hilo
     * @param idEmpresa
     * @param modelUsuario
     */
    public ViewLogginAdministrador(JLabel labelStatus, Thread hilo,int idEmpresa,ModelUsuario modelUsuario) {
        this.validation = new ControllerValidation();
        this.labelStatus = labelStatus;
        this.hilo = hilo;
        this.idEmpresa = idEmpresa;
        this.modelUsuario = modelUsuario;
        initComponents();
        validation();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelUser = new javax.swing.JPanel();
        contact = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        aPaterno = new javax.swing.JTextField();
        aMaterno = new javax.swing.JTextField();
        user = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        pass01 = new javax.swing.JPasswordField();
        pass02 = new javax.swing.JPasswordField();
        labelNota = new javax.swing.JLabel();
        next = new javax.swing.JButton();

        setBackground(new java.awt.Color(245, 246, 247));

        jPanelUser.setBackground(new java.awt.Color(68, 62, 63));
        jPanelUser.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        contact.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/contacts.png"))); // NOI18N

        name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        name.setForeground(new java.awt.Color(180, 180, 180));
        name.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        name.setText("Nombre (*)");
        name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameFocusLost(evt);
            }
        });
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameKeyPressed(evt);
            }
        });

        aPaterno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        aPaterno.setForeground(new java.awt.Color(180, 180, 180));
        aPaterno.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        aPaterno.setText("Apellido paterno");
        aPaterno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                aPaternoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                aPaternoFocusLost(evt);
            }
        });
        aPaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aPaternoActionPerformed(evt);
            }
        });
        aPaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                aPaternoKeyPressed(evt);
            }
        });

        aMaterno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        aMaterno.setForeground(new java.awt.Color(180, 180, 180));
        aMaterno.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        aMaterno.setText("Apellido materno");
        aMaterno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                aMaternoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                aMaternoFocusLost(evt);
            }
        });
        aMaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aMaternoActionPerformed(evt);
            }
        });
        aMaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                aMaternoKeyPressed(evt);
            }
        });

        user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/userLoggin.png"))); // NOI18N

        username.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        username.setForeground(new java.awt.Color(180, 180, 180));
        username.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        username.setText("Username (*)");
        username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameFocusLost(evt);
            }
        });
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usernameKeyPressed(evt);
            }
        });

        pass01.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pass01.setForeground(new java.awt.Color(180, 180, 180));
        pass01.setText("Password-01");
        pass01.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pass01FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pass01FocusLost(evt);
            }
        });
        pass01.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pass01KeyTyped(evt);
            }
        });

        pass02.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pass02.setForeground(new java.awt.Color(180, 180, 180));
        pass02.setText("Password-02");
        pass02.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pass02FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pass02FocusLost(evt);
            }
        });
        pass02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pass02ActionPerformed(evt);
            }
        });
        pass02.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pass02KeyTyped(evt);
            }
        });

        labelNota.setBackground(new java.awt.Color(245, 246, 247));
        labelNota.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        labelNota.setForeground(new java.awt.Color(245, 246, 247));
        labelNota.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelNota.setText("Nota: (*) Campos obligatorios");

        next.setFont(new java.awt.Font("CordiaUPC", 0, 24)); // NOI18N
        next.setForeground(new java.awt.Color(245, 246, 247));
        next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/chevron-right.png"))); // NOI18N
        next.setText("Siguiente");
        next.setContentAreaFilled(false);
        next.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        next.setSelected(true);
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelUserLayout = new javax.swing.GroupLayout(jPanelUser);
        jPanelUser.setLayout(jPanelUserLayout);
        jPanelUserLayout.setHorizontalGroup(
            jPanelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUserLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contact)
                    .addComponent(user))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelUserLayout.createSequentialGroup()
                        .addComponent(labelNota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(next))
                    .addGroup(jPanelUserLayout.createSequentialGroup()
                        .addComponent(pass01, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pass02))
                    .addComponent(username, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelUserLayout.createSequentialGroup()
                        .addGroup(jPanelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelUserLayout.createSequentialGroup()
                                .addComponent(aPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(aMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelUserLayout.setVerticalGroup(
            jPanelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUserLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pass02)
                    .addComponent(pass01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNota, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void validation(){
        ArrayList components = new ArrayList<>();
        components.add(name);
        components.add(aPaterno);
        components.add(aMaterno);
        components.add(username);
        components.add(pass01);
        components.add(pass02);
        controller = new ControllerViewUser(components);
        controller.validations();
    }
    
    private void nameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFocusGained
        validation.placeHolder(true,name,"Nombre (*)");
    }//GEN-LAST:event_nameFocusGained

    private void nameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFocusLost
        validation.placeHolder(false ,name,"Nombre (*)");
    }//GEN-LAST:event_nameFocusLost

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void nameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyChar()==10)
            agregarAdministrador();
    }//GEN-LAST:event_nameKeyPressed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        // TODO add your handling code here:
        agregarAdministrador();
    }//GEN-LAST:event_nextActionPerformed

    private void agregarAdministrador(){
        controller.agregarAdministrador(labelStatus,hilo,idEmpresa,modelUsuario);
    }
    private void aPaternoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_aPaternoFocusGained
        // TODO add your handling code here:
        validation.placeHolder(true,aPaterno,"Apellido paterno");
    }//GEN-LAST:event_aPaternoFocusGained

    private void aPaternoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_aPaternoFocusLost
        // TODO add your handling code here:
        validation.placeHolder(false,aPaterno,"Apellido paterno");
    }//GEN-LAST:event_aPaternoFocusLost

    private void aPaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aPaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aPaternoActionPerformed

    private void aPaternoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aPaternoKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyChar()==10)
            agregarAdministrador();
    }//GEN-LAST:event_aPaternoKeyPressed

    private void aMaternoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_aMaternoFocusGained
        // TODO add your handling code here:
        validation.placeHolder(true,aMaterno,"Apellido materno");
    }//GEN-LAST:event_aMaternoFocusGained

    private void aMaternoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_aMaternoFocusLost
        // TODO add your handling code here:
        validation.placeHolder(false,aMaterno,"Apellido materno");
    }//GEN-LAST:event_aMaternoFocusLost

    private void aMaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aMaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aMaternoActionPerformed

    private void aMaternoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aMaternoKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyChar()==10)
            agregarAdministrador();
    }//GEN-LAST:event_aMaternoKeyPressed

    private void usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusGained
        // TODO add your handling code here:
        validation.placeHolder(true,username,"Username (*)");
    }//GEN-LAST:event_usernameFocusGained

    private void usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusLost
        // TODO add your handling code here:
        validation.placeHolder(false,username,"Username (*)");
    }//GEN-LAST:event_usernameFocusLost

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void usernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyChar()==10)
            agregarAdministrador();
    }//GEN-LAST:event_usernameKeyPressed

    private void pass02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pass02ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pass02ActionPerformed

    private void pass01FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pass01FocusGained
        // TODO add your handling code here:
        validation.placeHolderPass(true,pass01,"Password-01");
    }//GEN-LAST:event_pass01FocusGained

    private void pass01FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pass01FocusLost
        // TODO add your handling code here:
        validation.placeHolderPass(false,pass01,"Password-01");
    }//GEN-LAST:event_pass01FocusLost

    private void pass02FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pass02FocusGained
        // TODO add your handling code here:
        validation.placeHolderPass(true,pass02,"Password-02");
    }//GEN-LAST:event_pass02FocusGained

    private void pass02FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pass02FocusLost
        // TODO add your handling code here:
        validation.placeHolderPass(false,pass02,"Password-02");
    }//GEN-LAST:event_pass02FocusLost

    private void pass01KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pass01KeyTyped
        // TODO add your handling code here:
        if(evt.getKeyChar()==10)
            agregarAdministrador();
    }//GEN-LAST:event_pass01KeyTyped

    private void pass02KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pass02KeyTyped
        // TODO add your handling code here:
        if(evt.getKeyChar()==10)
            agregarAdministrador();
    }//GEN-LAST:event_pass02KeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aMaterno;
    private javax.swing.JTextField aPaterno;
    private javax.swing.JLabel contact;
    private javax.swing.JPanel jPanelUser;
    private javax.swing.JLabel labelNota;
    private javax.swing.JTextField name;
    private javax.swing.JButton next;
    private javax.swing.JPasswordField pass01;
    private javax.swing.JPasswordField pass02;
    private javax.swing.JLabel user;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
