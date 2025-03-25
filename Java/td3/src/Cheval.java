public class Cheval {
    private final String nom;
    private final String race;

    public Cheval(String nom, String race) {
        this.nom = nom;
        this.race = race;
    }

    public String getNom() {
        return nom;
    }
    public String getRace() {
        return race;
    }

    @Override
    public String toString() {
        return this.nom + " est un cheval de la race " + this.race;
    }
}
