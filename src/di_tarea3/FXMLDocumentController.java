/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di_tarea3;

import ComponenteGrafico.DatosController;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 *
 * @author arrio
 */
public class FXMLDocumentController implements Initializable {
    //enlazamos los componentes con el codigo
    @FXML
    private TextField txtContraseña;
    @FXML 
    private DatosController dataController;
    
    
    @FXML
    private void GenerarContraseña(ActionEvent event) {
        //Guardamos los caracteres que queremos recoger de cada string
        //pidiendo su posicion del char
        char nombre = dataController.getNombre().charAt(0);    
        char ape0 = dataController.getApellido().charAt(0);
        char ape1 = dataController.getApellido().charAt(1);
        char ape2 = dataController.getApellido().charAt(2);
        char DNI0 = dataController.getDNI().charAt(5);
        char DNI1 = dataController.getDNI().charAt(6);
        char DNI2 = dataController.getDNI().charAt(7);
        char DNI3 = dataController.getDNI().charAt(8);
        
        // Controlamos que el DNI tenga 9 cifras
        if(dataController.getDNI().length()!=9){
            JOptionPane.showMessageDialog(null, "DNI tiene que ser 9 cifras", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
        //Guardamos en un stringbuilder los char:
        StringBuilder contraseña = new StringBuilder();
        contraseña.append(nombre);
        contraseña.append(ape0);
        contraseña.append(ape1);
        contraseña.append(ape2);
        contraseña.append(DNI0);
        contraseña.append(DNI1);
        contraseña.append(DNI2);
        contraseña.append(DNI3);
        //Lo guardamos en un String y lo ponemos en mayuscula y lo ponemos en 
        //el txtfield
       String password = contraseña.toString().toUpperCase(); 
       txtContraseña.setText(password);
        }
    }
    //metodo para salir de la aplicacion
    @FXML
    private void salir(ActionEvent event){
        System.exit(0);
    }
    //Metodo para limpiar la aplicacion
    @FXML
    private void limpiar(ActionEvent event){
        dataController.limpiar();
        txtContraseña.setText("");
    }
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
