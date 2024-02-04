
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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Arwa-PC
 */
public class Sign_upController implements Initializable {

    @FXML
    private Button sign;
    @FXML
    private TextField MAIL;
    @FXML
    private TextField nom;
    @FXML
    private TextField prenom;
    @FXML
    private PasswordField mdps;
    @FXML
    private PasswordField confirm;
    @FXML
    private Button creer;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void retour(ActionEvent event) {
        try {
        Parent FxmlInterf = FXMLLoader.load(getClass().getResource("page_accueil.fxml"));
        Stage st = new Stage();
        Scene scene = new Scene(FxmlInterf);
        st.setScene(scene);
        st.show();
    } catch (IOException e) {
        System.out.println("essayer de nouveau!");
        
    }
    }

    @FXML
    private void saisirmail(ActionEvent event) {
     
    }

    @FXML
    private void saisirnom(ActionEvent event) {
    }

    @FXML
    private void saisirprenom(ActionEvent event) {
    }

    @FXML
    private void saisirmdps(ActionEvent event) {
    }

    @FXML
    private void confirmermdps(ActionEvent event) {
    }

    @FXML
    private void creer(ActionEvent event) {
       if(MAIL.getText().trim().isEmpty())
        showAlert("le mail ne peut pas etre vide!");
        if( nom.getText().trim().isEmpty())
         showAlert("le nom ne peut pas etre vide");
        if( prenom.getText().trim().isEmpty())
          showAlert("le prenom ne peut pas etre vide"); 
       if (mdps.getText().length() < 9 || !mdps.getText().matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*") || !confirm.getText().equals(mdps.getText())) {
           showAlert("Mot de passe invalide. Veuillez réessayer !");
       }
       
           
       
      else{
           showSuccessMessage("Compte crée avec succès,soyez les bienvenues !");}     
        
     } 

    private void showAlert(String message) {
         Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Erreur");                                                                                                                                                                                   
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
     private void showSuccessMessage(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Succès");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

   
    
}
