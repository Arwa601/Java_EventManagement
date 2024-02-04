/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package View;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;

public class ClientController implements Initializable {

    @FXML
    private Button bt1;

    @FXML
    private TextField capacity;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void submit(ActionEvent event) {
        try {
            int enteredCapacity = Integer.parseInt(capacity.getText());
            if (enteredCapacity > 1200) {
                showAlert("On ne peut pas supporter cette capacité pour le moment.Notre plus grand espace de capacité est de 1200.");
            } else {
                showSuccessMessage("Enregistrement de l'événement effectué avec succès !");
            }
        } catch (NumberFormatException e) {
            // Gérer l'exception si l'entrée n'est pas un entier
            showAlert("Veuillez entrer une valeur numérique pour la capacité.");
        }
    }

    @FXML
    private void filled(ActionEvent event) {
        // Cette méthode est appelée lorsque l'utilisateur interagit avec le champ
    }

    private void showAlert(String message) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Erreur");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    
    private void showSuccessMessage(String message) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Succès");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
