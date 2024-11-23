 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model_User;
import java.util.Scanner;

public class Participant extends User {
    private final String email;
    private final String eventchoisi;//nom d'evenement choisi par le participant
    private boolean isConfirmed;

    public Participant(String nom , String prenom, String email,String eventchoisi) {
        super(nom,prenom);
        this.email = email;
        this.isConfirmed = false;
        this.eventchoisi= eventchoisi;
        
    }

    public String getEmail() {
        return email;
    }
     

    public boolean isConfirmed() {
        return isConfirmed;
    }
    public String getevent(){
        return eventchoisi;}
    
    // Méthode pour confirmer la participation
    public void confirmAttendance() {
        System.out.println("        Parfait,Confirmation de participation pour " +nom+"!");
        this.isConfirmed = true;
    }

    // Méthode pour annuler la participation
    public void cancelAttendance() {
        System.out.println(" Etes vous sur de supprimer le participant: "+nom +" "+prenom+" ? ");
        Scanner scanner = new Scanner(System.in);
        boolean response = scanner.nextBoolean();
        if (response){
            System.out.println("       OUPS,Annulation de participation pour " + nom +"!");
            this.isConfirmed = false;
        }
        else if (response==false)
        {   System.out.println("       Tant mieux!,vous avez le temps pour réflechir");}
        else
            System.out.println("invalid input,please try again!");
       
    }

    // Méthode toString
    @Override
    public String toString() {
        return "Participant{" +
                "participantName='" + nom + '\'' +
                ", email='" + email + '\'' +
                ", isConfirmed=" + isConfirmed +"to attend"+eventchoisi+
                '}';
    }

    @Override
    public void userRole() {
       System.out.println("Standard User");
    }
}

    

