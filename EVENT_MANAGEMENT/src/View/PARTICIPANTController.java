/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package View;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Arwa-PC
 */
public class PARTICIPANTController implements Initializable {

    @FXML
    private TextField nom;
    @FXML
    private TextField prenom;
    @FXML
    private TextField email;
    @FXML
    private ChoiceBox<?> eventChoiceBox;
    @FXML
    private Button logout;
    @FXML
    private Button confirm;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    

    @FXML
    private void logout(ActionEvent event) {

         try {
        Parent FxmlInterf = FXMLLoader.load(getClass().getResource("page_accueil.fxml"));
        Stage st = new Stage();
        Scene scene = new Scene(FxmlInterf);
        st.setScene(scene);
        st.show();
    } catch (IOException e) {
        // Gérez les erreurs d'entrée/sortie ici
        
    }
    }

    @FXML
    private void initialize(MouseEvent event) {
         // TODO in box de choix
    }

    @FXML
    private void confirm(ActionEvent event) {
        showSuccessMessage("Compte crée avec succès,soyez les bienvenues !");
    }
    
    private void showSuccessMessage(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Succès");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
