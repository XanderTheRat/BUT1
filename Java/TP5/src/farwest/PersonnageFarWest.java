package farwest;

public abstract class PersonnageFarWest {
    protected String prenom;
    protected String nom;

    protected PersonnageFarWest(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
    }
    protected PersonnageFarWest(String prenom){
        this.prenom = prenom;
    }

    public String decrire() {
        return prenom + " " + nom + "! ";
    }

    public String nom() {
        return nom;
    }

    public String prenom() {
        return prenom;
    }
}
