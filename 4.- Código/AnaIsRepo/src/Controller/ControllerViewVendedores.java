/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ModelUsuario;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Jesus
 */
public class ControllerViewVendedores {
    JTextField name;
    JTextField aPaterno;
    JTextField aMaterno;
    JTextField username;
    JPasswordField pass1;
    JPasswordField pass2;
    
    public ControllerViewVendedores(ArrayList components){
        this.name = (JTextField)components.get(0);
        this.aPaterno = (JTextField)components.get(1);
        this.aMaterno = (JTextField)components.get(2);
        this.username = (JTextField)components.get(3);
        this.pass1 = (JPasswordField)components.get(4);
        this.pass2 = (JPasswordField)components.get(5);
    }
    
    public void validations(){
        ControllerValidation.limitarCaracteres(name, 25);
        ControllerValidation.limitarCaracteres(aPaterno, 20);
        ControllerValidation.limitarCaracteres(aMaterno, 20);
        ControllerValidation.limitarCaracteres(username, 25);
        ControllerValidation.limitarCaracteres(pass1, 16);
        ControllerValidation.limitarCaracteres(pass2, 16);
    }
    
    public void addUser(JLabel labelStatus,ModelUsuario user){
        if(!name.getText().equals("Nombre (*)") && !name.getText().isEmpty()){
            if(!username.getText().equals("Username (*)") && !username.getText().isEmpty()){
                if(!crearPass(pass1).equals("Password-01") && !pass1.getText().isEmpty()){
                    if(!crearPass(pass2).equals("Password-02") && !pass2.getText().isEmpty()){
                        if(!DataBase.DataBaseUsuario.checkExistUser(username.getText())){
                            if(ControllerValidation.validarContrasenias(pass1,pass2)){
                                user.setTipo(2);
                                 if(DataBase.DataBaseUsuario.addUser(user)){
                                    labelStatus.setText("Vendedor agregado con éxito");
                                    limpiaCampos();
                                 }else
                                    labelStatus.setText("Error interno para almacenar la información");
                            }
                        }else
                            ControllerViewMsj.muestraMensajeGlobo("El nombre de usuario ya existe", username);
                    }else
                        ControllerViewMsj.muestraMensajeGlobo("Completa el formulario para la contraseña", pass2);
                }else
                    ControllerViewMsj.muestraMensajeGlobo("Ingresa una contraseña", pass1);
            }else
                ControllerViewMsj.muestraMensajeGlobo("Agrega un username", username);
        }else
            ControllerViewMsj.muestraMensajeGlobo("Agrega un nombre de usuario", name);
    }
    
    public boolean guardarCambios(JLabel labelStatus,ModelUsuario user){
        boolean flag = false;
        if(!name.getText().equals("Nombre (*)") && !name.getText().isEmpty()){
            if(!username.getText().equals("Username (*)") && !username.getText().isEmpty()){
                if(!crearPass(pass1).equals("Password-01") && !pass1.getText().isEmpty()){
                    if(!crearPass(pass2).equals("Password-02") && !pass2.getText().isEmpty()){
                        if(ControllerValidation.validarContrasenias(pass1,pass2)){
                             if(DataBase.DataBaseUsuario.modifUser(user)){
                                ControllerViewMsj.informacion(name.getText()+" modificado con éxito","Modificación de usuario");
                                flag = true;
                            }else
                                labelStatus.setText("Error interno para almacenar la información");
                        }
                    }else
                        ControllerViewMsj.muestraMensajeGlobo("Completa el formulario para la contraseña", pass2);
                }else
                    ControllerViewMsj.muestraMensajeGlobo("Ingresa una contraseña", pass1);
            }else
                ControllerViewMsj.muestraMensajeGlobo("Agrega un username", username);
        }else
            ControllerViewMsj.muestraMensajeGlobo("Agrega un nombre de usuario", name);
        return flag;
    }
    
    public boolean acceptUsername(String user,String username2){
        if(DataBase.DataBaseUsuario.checkExistUser(user)){
            return user.equals(username2);
        }else
            return true;
    }
    
    public void identificaInfo(ModelUsuario model){
        if(!model.getNombre().equals("")){
            name.setForeground(Color.black);
            name.setText(model.getNombre());
        }if(!model.getaPaterno().equals("")){
            aPaterno.setText(model.getaPaterno());
            aPaterno.setForeground(Color.black);
        }if(!model.getaMaterno().equals("")){
            aMaterno.setText(model.getaMaterno());
            aMaterno.setForeground(Color.black);
        }if(!model.getUsername().equals("")){
            username.setText(model.getUsername());
            username.setForeground(Color.black);
        }if(!model.getPassword().equals("")){
            pass1.setForeground(Color.black);
            pass2.setForeground(Color.black);
            pass1.setText(model.getPassword());
            pass2.setText(model.getPassword());
        }
    }
    
    private String crearPass(JPasswordField pass) {
        String pas = "";
        char[] car = pass.getPassword();
        for (int i = 0; i < car.length; i++)
           pas = pas + car[i];
        return pas;
    }
    private String reviewInfo(JTextField box, String value,boolean flag){
        if(flag){
            if(box.getText().equals(value))
                return "";
            else
                return box.getText();
        }else{
            if(box.getText().equals(value))
                return "0";
            else
                return box.getText();
        }
    }
    
    public void limpiaCampos(){
        limpiaJtextField(name,"Nombre (*)");
        limpiaJtextField(aPaterno,"Apellido Paterno");
        limpiaJtextField(aMaterno,"Apellido Materno");
        limpiaJtextField(username,"Username (*)");
        limpiaJPasswordField(pass1,"Password-01");
        limpiaJPasswordField(pass2,"Password-02");
    }
    
    private void limpiaJtextField(JTextField box, String msj){
        box.setForeground(new Color(180,180,180));
        box.setText(msj);
    }
    
    private void limpiaJPasswordField(JPasswordField box, String msj){
        box.setForeground(new Color(180,180,180));
        box.setText(msj);
    }
    
    public ModelUsuario creaModelo(ModelUsuario model){
            model.setNombre(reviewInfo(name,"Nombre (*)", true));
            model.setaPaterno(reviewInfo(aPaterno,"Apellido Paterno", true));
            model.setaMaterno(reviewInfo(aMaterno,"Apellido Materno", true));
            model.setUsername(reviewInfo(username,"Username (*)", true));
            model.setPassword(reviewInfo(pass1,"Password-01", true));
            return model;
    }
}
