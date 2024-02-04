/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package View;

import Model_Event.TypeMateriel;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Arwa-PC
 */
public class FormulaireController implements Initializable {

    @FXML
    private TextField name;
    @FXML
    private TextField type;
    @FXML
    private TextField date;
    @FXML
    private Button ajouter;
    @FXML
    private TextField adress;
    @FXML
    private TextField venue;
    @FXML
    private TextField capacity;

    /**
     * Initializes the controller class.
     */

    @FXML
    private void ajouter(ActionEvent event) {
           showSuccessMessage("Compte crée avec succès,soyez les bienvenues !");}     
       }
       
       
     private void showSuccessMessage(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Succès");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    }
       
    

    


