package farwest;

public class Bourgeois extends PersonnageFarWest implements EtreCapableDeTirerAvecUneArmeAFeu {
    private String profession;
    public Bourgeois(String nom, String prenom, String profession) {
        super(nom, prenom);
        this.profession = profession;
    }

    @Override
    public String tirerAuPistolet() {
        return "Je tire au très mal au pistolet : Pan....................Pan...................Pan";
    }
    @Override
    public String decrire() {
        return super.decrire() + tirerAuPistolet();
    }
}
