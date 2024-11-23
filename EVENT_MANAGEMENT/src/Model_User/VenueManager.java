/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model_User;

/**
 *
 * @author Arwa-PC
 */
import Model_User.Manager;
import java.util.LinkedList;
import Model_Event.venue;
import Model_Exception.VenueException;


public class VenueManager implements Manager  {
    public final String nomprenom;
    private final int  managerMatricule;
    public  LinkedList<venue> venues;//liste des espaces(venues in english) proposés actuellement dans ce projet 
    public static int capacitémax;//la capicité du local la plus supérieur aux autres
    

    public VenueManager(String nomprenom,int  managerMatricule) {
        this.nomprenom=nomprenom;
        this.managerMatricule=managerMatricule;
        this.venues =new LinkedList<>() ;
    }


    public int getManagerMatricule() {
        return managerMatricule;
    }
  
    public LinkedList<venue> getVenues() {
        return venues;
    }

    public void addVenue  (String venueName, String address, int capacity) throws VenueException {
  
        venue venue = new venue(venueName, address, capacity);
       if (! venues.add(venue)) {
        throw new VenueException("local déjà dans la liste"); }
        venues.addLast(venue);
        System.out.println("Lieu ajouté avec succès : " + venueName);
    }
     public void retirervenue(venue v)
    {
       venues.remove(v);}
     public void setcapacitémax(int c){capacitémax=c;}
     public int getcapacitémax(){return capacitémax;}
    public void displayVenues() {
        System.out.println("Liste des lieux :");
       //lambda
        venues.forEach( (n) -> { System.out.println(n); } );
    }
    
    
    @Override
    public String toString() {
        return "VenueManager{" +
                "managerFullName='" +nomprenom +
                 '\'' +
                ", managerMatricule='" + managerMatricule + '\'' +
                ", venues=" + venues +
                '}';
    }

    @Override
    public void Role() {
                System.out.println("i'm the VenueManager"+ nomprenom+" ,how can i assist you?");
    }
}

