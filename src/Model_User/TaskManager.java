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
import Model_Event.task;
import java.util.Scanner;


public class TaskManager implements Manager{
    public final String nomprenomT;
    private final int  managerMatriculeT;
    public LinkedList<task> Task;

    public TaskManager(String nomprenomT,int managerMatriculeT) {
        this.nomprenomT=nomprenomT;
        this.managerMatriculeT=managerMatriculeT;
        this.Task = new LinkedList<>();
    }
    public int getMatricule(){return managerMatriculeT;}
    public void addTask( task T) {
        Task.addLast(T);
        System.out.println("Task added: " + T.getTaskName());
    }
    public void retirertask(task t)
    {  System.out.println(" Etes vous sur de supprimer le task "+t.getTaskName()+"?");
        Scanner scanner = new Scanner(System.in);
        boolean response = scanner.nextBoolean();
        if (response){
            System.out.println("       OUPS,task " +t.getTaskName()+" retiré!");
            Task.remove(t);}
    }
    public void displayTasks() {
        System.out.println("Tasks:");
        //lambda
           Task.forEach( (n) -> { System.out.println(n); } );
    }
  public LinkedList<task> getTasks() {
    return Task; 
}


    
    @Override
    public void Role() {
         System.out.println("i'm the TaskManager"+ nomprenomT+" ,how can i assist you?");
    }
}
