package Personnage;
public class Personnage{
    //le constructeur
    public Personnage(String name, int life, String type){
        this.nom = name;
        this.vie = life;
        this.type = type;
    }
    //assesseur du nom de personnage
    public String LeNom(){
        return this.nom;
    }
    //assesseur de la vie du personnage    
    public int LaVie(){
        return this.vie;
    }
    //assesseur du type du personnage   
    public String LeType(){
        return this.type;
    }
    //méthode pour augmenter la vie
    public void AugmenterVie(int soin) {
        this.vie = this.vie + soin;
    }
    //méthode pour l'attaque 
    public void Attaque(Personnage perso, int degat){
        perso.vie = perso.vie - degat;
    }   
//les attributs
private String nom;
private int vie;
private String type;
}
