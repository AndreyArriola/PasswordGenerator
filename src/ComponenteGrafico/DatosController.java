/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComponenteGrafico;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author arrio
 */
public class DatosController implements Initializable {
    //enlazamos los componentes con el codigo
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtApellidos;
    @FXML
    private TextField txtDNI;
    
    //metodo para limpiar los txtfield de esta vista
    public void limpiar(){
        txtNombre.setText("");
        txtApellidos.setText("");
        txtDNI.setText("");
        
    }
    //metodo para recuperar el nombre
    public String getNombre(){
        String nombre = txtNombre.getText();
        return nombre;
    }
    //metodo para recuperar el apellido
    public String getApellido(){
        String apellido = txtApellidos.getText();
        return apellido;
    }
    //metodo para recuperar el DNI
    public String getDNI(){
        String DNI = txtDNI.getText();
        return DNI;
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
