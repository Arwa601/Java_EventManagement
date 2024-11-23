package Model_Event;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import Model_User.Participant;
import java.util.ArrayList;

/**
 *
 * @author Arwa-PC
 */



public class event {
    private final String eventName;
    private final String eventType;
    private String eventDate;
    private venue localisation;
    public  double cost;
    public  ArrayList<Materiel>materiels;
    public  ArrayList<Participant> participants;
    public  ArrayList<task> tasks;
    
    
   

    public event(String eventName, String eventType, String eventDate, String venueName, String address, int capacity) {
        this.eventName = eventName;
        this.eventType = eventType;
        this.eventDate = eventDate;
        this.localisation = new venue(venueName,address,capacity);
        this.participants = new ArrayList<>();
        this.tasks = new ArrayList<>();
        this.materiels=new ArrayList<>();
        this.cost  =1000;
    }


    public String getEventName() {
        return eventName;
    }

    public String getEventType() {
        return eventType;
    }

    public String getEventDate() {
        return eventDate;
    }

    public String getLocation() {
        return localisation.venueName();     
 
    }

    public double getCost() {
        return cost;
    }

    public ArrayList<Participant> getParticipants() {
        return participants;
    }

    public ArrayList<task> getTasks() {
        return tasks;
    }
     public ArrayList<Materiel> getMateriels() {
        return materiels;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public void setLocation(String venueName, String address, int capacity) {
        this.localisation = new venue(venueName,address,capacity);
    }
    
    public void addTasks(task T) {
        tasks.add(T);
    }
    public void addParticipants(Participant P){participants.add(P);}
    public void addMateriels(Materiel M){materiels.add(M);}
     private double generercost() {
        double c = cost; 
        for (Materiel M : materiels) {
            c += M.cost;
        }
        for (task t : tasks) {
            if (t.isCompleted()) {
                c += 50;
            }
        }
        return c;
    }
  public void updateCost() {
        this.cost = generercost();
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Event Name: ").append(eventName).append("\n");
        sb.append("Event Type: ").append(eventType).append("\n");
        sb.append("Event Date: ").append(eventDate).append("\n");
        sb.append("Location: ").append(localisation).append("\n");
        sb.append("Cost: ").append(cost).append("\n");

        sb.append("Participants:\n");
        for (Participant participant : participants) {
            sb.append("- ").append(participant.getNom()).append("\n");
        }

        sb.append("Tasks:\n");
        for (task task : tasks) {
            sb.append("- ").append(task.getTaskName()).append("\n");
        }
         sb.append("materiels:\n");
        for (Materiel materiel : materiels) {
            sb.append("- ").append(materiel.getType()).append(":").append(materiel.isDisponible()).append("\n");
        }

        return sb.toString();
    }
}
