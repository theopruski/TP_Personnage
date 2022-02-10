import Personnage.*;
public class jeuPersonnage{
    public static void main(String args[]){
    Personnage UnSorcier = new Personnage("Clotaire", 200, "Sorcier");
    System.out.println("nom du personnage = " + UnSorcier.LeNom());
    System.out.println("vie du personnage = " + UnSorcier.LaVie());
    System.out.println("type du personnage = " + UnSorcier.LeType());
    Personnage UnTroll = new Personnage("Romuald", 200, "Troll");
    System.out.println("nom du personnage = " + UnTroll.LeNom());
    System.out.println("vie du personnage = " + UnTroll.LaVie());
    System.out.println("type du personnage = " + UnTroll.LeType());
    System.out.println (UnSorcier.LeNom() + ",le " + UnSorcier.LeType() + " se promenait dans les bois");
    System.out.println ("Il trouva un champignon qui permet de gagner de la vie");
    System.out.println("Il passa de " + UnSorcier.LaVie());
    UnSorcier.AugmenterVie(5);
    System.out.println ("a " + UnSorcier.LaVie());
    System.out.println("Soudain, il se fit attaquer par " + UnTroll.LeNom() + ",le " + UnTroll.LeType() + " des bois");
    UnTroll.Attaque(UnSorcier, 50);
    System.out.println("Le " + UnSorcier.LeType() + " se retrouva avec " + UnSorcier.LaVie());
    System.out.println(UnSorcier.LeNom() + " ne se laisse pas faire et lance une icantations puissante");
    UnSorcier.Attaque(UnTroll, 100);
    System.out.println("Le " + UnTroll.LeType() + " se retrouva avec " + UnTroll.LaVie());
    System.out.println("Pendant que " + UnTroll.LeNom() + " se releve, " + UnSorcier.LeNom() + ", le sorcier s'applique potion de soin");
    System.out.println(UnSorcier.LeNom() + ",le " + UnSorcier.LeType() + " se soigne");
    UnSorcier.AugmenterVie(25);
    System.out.println("Il  a maintenant " + UnSorcier.LaVie());
    System.out.println("Le troll se releve et attaque avec moins de puissance");
    UnTroll.Attaque(UnSorcier, 25);
    System.out.println("Le " + UnSorcier.LeType() + " perd 25 point de vie et a desormais " + UnSorcier.LaVie());
    System.out.println(UnSorcier.LeNom() + " tente un ultime coup de maitre pour achever le troll");
    UnSorcier.Attaque(UnTroll, 100);
    System.out.println("Le " + UnTroll.LeType() + " perd ses dernier points de vie");
    System.out.println(UnTroll.LeNom() + " a desormais " + UnTroll.LaVie());
    System.out.println("Il est mort");
    }
}
