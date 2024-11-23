/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model_User;

/**
 *
 * @author Arwa-PC
 */
    

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import Model_Event.event;




/**
 *
 * @author Arwa-PC
 */
import java.util.ArrayList;

public class EventManager implements Manager{
   public final String NomPrenomE;
   private final int matriculeE;
   public ArrayList<event> evenements;
   

    public EventManager(String NomPrenomE,int matriculeE) {
        this.NomPrenomE=NomPrenomE;
        this.matriculeE=matriculeE;
        this.evenements = new ArrayList<>();
    }
    public void removeEvent(event E) {
        evenements.remove(E);
       
    }

    public void addEvent(event E) {
        evenements.add(E);
        System.out.println("Event added: " + E);
    }
    public int getmat(){return matriculeE;}
    public void displayEvents() {
        System.out.println("Events:");
        for (event event : evenements) {
            System.out.println("- " + event);
        }
    }
      
     public ArrayList<String> getEventNames() {
        ArrayList<String> eventNames = new ArrayList<>();
        for (event e : evenements) {
            eventNames.add(e.getEventName()); // Assuming there's a getName() method in your Event class
        }
        return eventNames;
    }
    
    @Override
    public void Role() {
        System.out.println("i'm the EventManager"+NomPrenomE+",how can i assist you?");
    }
}
