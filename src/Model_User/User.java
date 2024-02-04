/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model_User;

/**
 *
 * @author Arwa-PC
 */
public  abstract class User  {
    protected final String nom;
    protected final String prenom;
    public User(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }
    public abstract void userRole(); 
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
 
 
}

     
     
     
     
     
  

