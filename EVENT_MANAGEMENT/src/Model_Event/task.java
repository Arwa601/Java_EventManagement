/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model_Event;

/**
 *
 * @author Arwa-PC
 */
public class task implements Comparable <task> {
    private final String taskName;
    private final String Event;
    private String description;
    public final int heureddl;
    private boolean isCompleted=false;

  
    public task(String taskName, String description, String Event, int heureddl) {
        this.taskName = taskName;
        this.description = description;
        this.heureddl=heureddl;
        this.Event=Event;
    }
    public String Eventname(){return Event;}
    public int getddl(){return heureddl;}
    public String getTaskName() {
        return taskName;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void markAsCompleted() {
        System.out.println("Tâche '" + taskName + "' pour l'événement marquée comme complétée.");
        this.isCompleted = true;
    }
    //voila
    @Override
     public int compareTo(task t){
     return this.heureddl-t.heureddl;}
             
             
  @Override
    public String toString() {
        return "Task{" +
                "taskName='" + taskName +": dans le cadre de l'evenement "+Event+
                " ,description: " + description +
                " isCompleted =" + isCompleted +
                '}';
    }
}
