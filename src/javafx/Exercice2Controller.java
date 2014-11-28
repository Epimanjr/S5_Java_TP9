/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Maxime
 */
public class Exercice2Controller implements Initializable {

    @FXML
    private Button btBonjour;
    
    @FXML
    private TextField saisie;
    
    public void direBonjour() {
        // Récupération du message
        String maxime = saisie.getText();
        System.out.println(maxime);
        
        // Avec Javax.swing
        JOptionPane.showMessageDialog(null, maxime, "Titre", JOptionPane.INFORMATION_MESSAGE);
        
        // Avec Java.fx
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
