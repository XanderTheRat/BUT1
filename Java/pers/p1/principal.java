package pers.p1;
import utils.strInput;

public class principal {
    public static void main(String[] args) {
        strInput chaine = new strInput("Veuillez rentrer un nombre :\n");
        System.out.println("Votre nombre est : " + chaine.recupString());
    }
    
}
