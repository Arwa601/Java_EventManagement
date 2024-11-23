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
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Arwa-PC
 */
public class Page_accueilController implements Initializable {

    @FXML
    private Button d122;
    @FXML
    private Button signup;
    @FXML
    private Button createevent;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
@FXML
private void demarerlogin(ActionEvent event) {
    try {
        Parent FxmlInterf = FXMLLoader.load(getClass().getResource("page_login.fxml"));
        Stage st = new Stage();
        Scene scene = new Scene(FxmlInterf);
        st.setScene(scene);
        st.show();
    } catch (IOException e) {
        // Gérez les erreurs d'entrée/sortie ici
        
    }

}

    @FXML
    private void signup(ActionEvent event) throws IOException {
        Parent FxmlInterf = FXMLLoader.load(getClass().getResource("Sign_up.fxml"));
        Stage st = new Stage();
        Scene scene = new Scene(FxmlInterf);
        st.setScene(scene);
        st.show();
   
    }

    @FXML
    private void createevent(ActionEvent event) throws IOException {
        Parent FxmlInterf = FXMLLoader.load(getClass().getResource("event_manager.fxml"));
        Stage st = new Stage();
        Scene scene = new Scene(FxmlInterf);
        st.setScene(scene);
        st.show();
   
    }
}

  
