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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Arwa-PC
 */
public class Choix_userController implements Initializable {

    @FXML
    private Button part;
    @FXML
    private Button cl;
    @FXML
    private PasswordField task;
    @FXML
    private PasswordField venue;
    @FXML
    private PasswordField event;
    @FXML
    private PasswordField partmanager;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void movetopart(ActionEvent event) {
        try {
        Parent FxmlInterf = FXMLLoader.load(getClass().getResource("PARTICIPANT.fxml"));
        Stage st = new Stage();
        Scene scene = new Scene(FxmlInterf);
        st.setScene(scene);
        st.show();
    } catch (IOException e) {
        // Gérez les erreurs d'entrée/sortie ici
        
    }
    }

    @FXML
    private void movetocl(ActionEvent event) {
              try {
        Parent FxmlInterf = FXMLLoader.load(getClass().getResource("Client.fxml"));
        Stage st = new Stage();
        Scene scene = new Scene(FxmlInterf);
        st.setScene(scene);
        st.show();
    } catch (IOException e) {
        // Gérez les erreurs d'entrée/sortie ici
        
    }
    }

    @FXML
    private void movetotask(ActionEvent event) {
                  try {
        int entermatricule = Integer.parseInt(task.getText());
        if (entermatricule ==123456) {
        Parent FxmlInterf = FXMLLoader.load(getClass().getResource("Task_manager.fxml"));
        Stage st = new Stage();
        Scene scene = new Scene(FxmlInterf);
        st.setScene(scene);
        st.show();
        
    } else {
        showAlert("Mot de passe invalide. Veuillez réessayer !");
    }
       
    } catch (IOException e) {
        // Gérez les erreurs d'entrée/sortie ici
        
    }
    }

    @FXML
    private void movetovenue(ActionEvent event) {
        try {int entermatricule = Integer.parseInt(venue.getText());
        if (entermatricule ==654321) {
        Parent FxmlInterf = FXMLLoader.load(getClass().getResource("Venue_manager.fxml"));
        Stage st = new Stage();
        Scene scene = new Scene(FxmlInterf);
        st.setScene(scene);
        st.show();
        } else {
        showAlert("Mot de passe invalide. Veuillez réessayer !");
    }
    } catch (IOException e) {
        // Gérez les erreurs d'entrée/sortie ici
        
    }
    }

    @FXML
    private void movetoevent(ActionEvent event) {
                    try {int entermatricule = Integer.parseInt(venue.getText());
        if (entermatricule ==678900) {
        Parent FxmlInterf = FXMLLoader.load(getClass().getResource("Event_manager.fxml"));
        Stage st = new Stage();
        Scene scene = new Scene(FxmlInterf);
        st.setScene(scene);
        st.show();
        } else {
        showAlert("Mot de passe invalide. Veuillez réessayer !");
    }
    } catch (IOException e) {
        // Gérez les erreurs d'entrée/sortie ici
        
    }
    }

    @FXML
    private void movetopartman(ActionEvent event) {
        try {
        int entermatricule = Integer.parseInt(partmanager.getText());
        if (entermatricule ==121212) {

        Parent FxmlInterf = FXMLLoader.load(getClass().getResource("participant_manager.fxml"));
        Stage st = new Stage();
        Scene scene = new Scene(FxmlInterf);
        st.setScene(scene);
        st.show();
        } else {
        showAlert("Mot de passe invalide. Veuillez réessayer !");
    }
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

   
    
}
