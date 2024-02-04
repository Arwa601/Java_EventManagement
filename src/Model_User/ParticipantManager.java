/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model_User;
import Model_Exception.ParticipantException;
import Model_User.Participant;
import Model_User.Manager;
import java.util.LinkedList;
import java.util.Scanner;

public class ParticipantManager implements Manager{
    public final String NomPrenomP;
    private final int matriculeP;
    public LinkedList<Participant> par;

    public ParticipantManager(String NomPrenomP,int matriculeP) {
        this.NomPrenomP=NomPrenomP;
        this.matriculeP=matriculeP;
        this.par = new LinkedList<>();
    }
    public String getnomP(){return NomPrenomP;}
    public int getmatP(){return matriculeP;}
    public LinkedList<Participant> getpar(){return par;}
    
    public void addParticipant(Participant participant) throws ParticipantException{
        if(!par.add(participant)){
        throw new ParticipantException("la participant existe deja!");}
        par.addLast(participant);
        System.out.println("Participant added: " + participant.getNom());
    }
    public void retirerparticipant(Participant p)
    {   System.out.println(" Etes vous sur de retirer le participant "+p.getNom()+" "+p.getPrenom()+"?");
        Scanner scanner = new Scanner(System.in);
        boolean response = scanner.nextBoolean();
        if (response){
            System.out.println("       OUPS,participant " +p.getNom()+" "+p.getPrenom()+" retiré!");
            par.remove(p);
        }
    }
       public void displayParticipants() {
        System.out.println("Participants:");
        for (Participant participant : par) {
            System.out.println("- " + participant.getNom());
        }
    }
    @Override
    public String toString(){
    return "le ParticipantManager:" +"{"+NomPrenomP+ "ayant comme matricule:"+
            matriculeP+"}";}

    @Override
    public void Role() {
      System.out.println("i'm the ParticipantManager"+NomPrenomP+",how can i assist you?");
    }
}
