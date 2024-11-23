/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model_Event;


/**
 *
 * @author Arwa-PC
 */
public class Materiel {
    private final String identifiant;
    public TypeMateriel Type;
    private int stock;
    public boolean disponible;
    public  final double cost;
    

    private int identifiantCounter = 0;

    
      // Méthode pour générer un identifiant unique
    
    private  String generateIdentifiant() {
        //  nous utilisons simplement une valeur statique qui s'incrémente à chaque appel
        
        identifiantCounter+=1;
        //switch expressions
        return switch (Type) {
            case Décoratif -> "Deco" + String.valueOf(identifiantCounter);
                
            case Audio -> "Aud" + String.valueOf(identifiantCounter);
              
            case Eclairage -> "Eclai" + String.valueOf(identifiantCounter);
               
            case Mobilier -> "Mob" + String.valueOf(identifiantCounter);
                
            case Informatique -> "infor" + String.valueOf(identifiantCounter);
            case Scenique -> "Scen" + String.valueOf(identifiantCounter);
            case Projection -> "Project" + String.valueOf(identifiantCounter);
            case Catering -> "Cat" + String.valueOf(identifiantCounter);
            case Securite -> "Secure" + String.valueOf(identifiantCounter);
            case Transport -> "Transport" + String.valueOf(identifiantCounter);
            case Signalisation -> "Signalisat" + String.valueOf(identifiantCounter);
            case Logistique -> "Logist" + String.valueOf(identifiantCounter);
            default -> "Invalid Type";
        };

    }

    public Materiel(TypeMateriel Type, int stock, double cost) {
        this.Type = Type;
        this.stock = stock;
        this.cost=cost;
        this.identifiant = generateIdentifiant();
        this.disponible = false;
    }
   

    public String getIdentifiant() {
        return identifiant;
    }

   
    public TypeMateriel getType() {
        return Type;
    }

    public void setType(TypeMateriel type) {
        this.Type = type;
    }

    public int getStock() {
        return stock;
    }

    public boolean isDisponible() {
        return disponible;
    }
    
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    public void ajoutez_au_stock(int qte){
        stock += qte;
    }
        @Override
    public String toString() {
        return "Materiel{" +
                "identifiant=" + identifiant +
                ", Type=" + Type +
                ", stock=" + stock +
                ", disponible=" + disponible +
                ", cost=" + cost +
                '}';
    }
    
    
}
