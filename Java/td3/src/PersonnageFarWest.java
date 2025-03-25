public class PersonnageFarWest {
    protected String prenom;
    protected String nom;

    public PersonnageFarWest(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public void tirerAuPistolet() {
        //TODO
    }

    @Override
    public String toString() {
        return prenom + " " + nom;
    }
}
