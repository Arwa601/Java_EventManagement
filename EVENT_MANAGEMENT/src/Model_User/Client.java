/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model_User;
import Model_Exception.ClientcapacityException;
import static Model_User.VenueManager.capacitémax;

/**
 *
 * @author Arwa-PC
 */
public  class Client extends User {
    private final String eventnom ;
    private final String eventtype;
    private final String eventDate;
    private int capacity;

    public Client(String nom, String prenom, String eventnom,String eventtype, String eventDate) {
        super(nom,prenom);
        this.eventnom = eventnom;
        this.eventtype = eventtype;
        this.eventDate = eventDate;
    }
    
    public String getEventName() {
        return eventnom;
    }

  
    public String getEventType() {
        return eventtype;
    }

 
    public String getEventDate() {
        return eventDate;
    }


    public double getCap() {
        return capacity;
    }
    public void setcapacity (int c) throws ClientcapacityException{
       
        if (c>capacitémax)
          throw (new ClientcapacityException());
//la capacité declaré par le client ne doit pas depasser la capacité du plus grand espace présent
        else
             capacity=c;
    }
    @Override
    public String toString() {
        return "Client{" +
                "username='" + nom + ":"+prenom + '\'' +
                ", eventName='" + eventnom + '\'' +
                ", eventType='" + eventtype + '\'' +
                ", eventDate='" + eventDate + 
                '}';
    }

    @Override
    public void userRole() {
        System.out.println("Premuim User");
    }
}
