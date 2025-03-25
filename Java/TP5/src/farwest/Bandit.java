package farwest;

public class Bandit extends PersonnageFarWest implements EtreCapableDeTirerAvecUneArmeAFeu {
    private Integer taille;
    private Boolean estEnPrison;

    public Bandit(String prenom, String nom, Integer taille, Boolean estEnPrison) {
        super(prenom, nom);
        this.taille = taille;
        this.estEnPrison = estEnPrison;
    }
    public Bandit(String prenom, String nom, Integer taille) {
        super(prenom, nom);
        this.taille = taille;
        this.estEnPrison = false;
    }

    @Override
    public String tirerAuPistolet() {
        return "Je tire au pistolet : Pan.....Pan.....Pan";
    }

    public void mettreEnPrison() {
        estEnPrison = true;
    }
    public void sortirDePrison() {
        estEnPrison = false;
    }

    @Override
    public String decrire() {
        return super.decrire() + tirerAuPistolet();
    }

}
