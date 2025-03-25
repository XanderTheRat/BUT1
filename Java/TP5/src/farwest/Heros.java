package farwest;

public class Heros extends PersonnageFarWest implements EtreCapableDeTirerAvecUneArmeAFeu {
    private String profession;
    private Cheval cheval;

    public Heros(String nom, String prenom, String profession, Cheval cheval) {
        super(nom, prenom);
        this.profession = profession;
        this.cheval = cheval;
    }
    public Heros (String nom, String prenom, String profession) {
        super(nom, prenom);
        this.profession = profession;
    }

    @Override
    public String tirerAuPistolet() {
        return "Je tire plus vite au pistolet : Pan..Pan..Pan";
    }

    @Override
    public String decrire() {
        return super.decrire() + tirerAuPistolet();
    }

    public void monter(Cheval cheval) {
        this.cheval = cheval;
    }
}
