package farwest;

public class Cheval{
    private String nom;
    private String race;

    public Cheval(String nom, String race){
        this.nom = nom;
        this.race = race;
    }

    public String decrire() {
        return nom + " " + race;
    }
}
