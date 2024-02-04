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
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Arwa-PC
 */
public class Page_loginController implements Initializable {

    @FXML
    private Button login;
    @FXML
    private TextField name;
    @FXML
    private PasswordField mdps;
    @FXML
    private Label sign;
    @FXML
    private TextField mail;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

   

    @FXML
    private void demarerchoix(ActionEvent event) {
        if(mail.getText().trim().isEmpty())
        showAlert("le mail ne peut pas etre vide!");
        if(name.getText().trim().isEmpty())
         showAlert("le nom ne peut pas etre vide");
        if( mdps.getText().trim().isEmpty())
          showAlert("le mot de passe ne peut pas etre vide"); 
        else try {
             Parent FxmlInterf = FXMLLoader.load(getClass().getResource("choix_user.fxml"));
        Stage st = new Stage();
        Scene scene = new Scene(FxmlInterf);
        st.setScene(scene);
        st.show();
    } catch (IOException e) {
        // Gérez les erreurs d'entrée/sortie ici
        
    }
    
        
    }

    @FXML
    private void name(ActionEvent event) {
    }

    @FXML
    private void mdps(ActionEvent event) {
    }

    @FXML
    private void sign(MouseEvent event) {try {
        Parent FxmlInterf = FXMLLoader.load(getClass().getResource("Sign_up.fxml"));
        Stage st = new Stage();
        Scene scene = new Scene(FxmlInterf);
        st.setScene(scene);
        st.show();
    } catch (IOException e) {
        // Gérez les erreurs d'entrée/sortie ici
        
    }
    }
     private void showAlert(String message) {
         Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Erreur");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    @FXML
    private void mail(ActionEvent event) {
    }
}
