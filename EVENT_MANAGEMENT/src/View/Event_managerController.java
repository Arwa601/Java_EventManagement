/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package View;

import Model_Event.TypeMateriel;
import Model_Event.event;
import Model_Event.venue;
import Model_User.EventManager;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Arwa-PC
 */
public class Event_managerController implements Initializable {

    @FXML
    private TableView<event> table;
    @FXML
    private TableColumn<event, String> eventName;
    @FXML
    private TableColumn<event,String> eventType;
    @FXML
    private TableColumn<event,String> eventDate;
    @FXML
    private TableColumn<event,venue> localisation;
    @FXML
    private TableColumn<event,double> cost;
    @FXML
    private TableColumn<event, TypeMateriel> materiels;
    @FXML
    private Button event;
    @FXML
    private TableColumn<venue, String> locname;
    @FXML
    private TableColumn<venue, String> adress;
    @FXML
    private TableColumn<venue, String> cap;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       eventList = FXCollections.observableArrayList();
        table.setItems(eventList);
        eventName.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getEventName()));
        eventType.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getEventType()));
        eventDate.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getEventDate()));
        locname.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().venueName()));
        adress.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().address()));
        cap.setCellValueFactory(cellData ->new SimpleIntegerProperty(cellData.getValue().capacity().asObject()));
        table.setEditable(true);
        eventName.setCellFactory(TextFieldTableCell.forTableColumn());
        eventType.setCellFactory(TextFieldTableCell.forTableColumn());
        eventDate.setCellFactory(TextFieldTableCell.forTableColumn());
        locname.setCellFactory(TextFieldTableCell.forTableColumn());
        adress.setCellFactory(TextFieldTableCell.forTableColumn());
        cap.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        table.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    }    
 
    @FXML
    private void newevent(ActionEvent event) {
        try {
        Parent FxmlInterf = FXMLLoader.load(getClass().getResource("formulaire.fxml"));
        Stage st = new Stage();
        Scene scene = new Scene(FxmlInterf);
        st.setScene(scene);
        st.show();
    } catch (IOException e) {
        System.out.println("essayer de nouveau!");
        
    } 
    }
    private EventManager eventManager;
    ObservableList<event> eventList = FXCollections.observableArrayList();

    void addvenue(ActionEvent event) {
        event newEvent = new event(
                eventName.getText(),
                eventType.getText(),
                eventDate.getText(),
                locname.getText(),
                adress.getText(),
                Integer.parseInt(cap.getText())
                 );

        eventManager.addEvent(newEvent);
        eventList.add(newEvent);
        clearFields();
    }

    void deletevenue(ActionEvent event) {
        event selectedVenue = table.getSelectionModel().getSelectedItem();
        if (selectedVenue != null) {
            eventManager.removeEvent(selectedVenue);
            eventList.remove(selectedVenue);
        }
    }


    void changeeventDateCellEvent(CellEditEvent<event, String> edittedCell) {
         event eventSelected = table.getSelectionModel().getSelectedItem();
        eventSelected.setEventDate(edittedCell.getNewValue());
    }



 

    private void clearFields() {
        eventName.clear();
        eventDate.clear();
        eventType.clear();
        locname.clear();
        adress.clear();
        cap.clear();
    }

    public void seteventManager(EventManager eventManager) {
        this.eventManager = venueManager;
        eventList.setAll(venueManager.getVenues());
    }
}
