public class Hero extends PersonnageFarWest{
    private String profession;
    private Cheval cheval;

    public Hero(String profession,String nom, String prenom) {
        super(prenom, nom);
        this.profession = profession;
    }

    public String getProfession() {
        return profession;
    }
    public String getName() {
        return this.prenom + " " + this.nom;
    }
    public Cheval getCheval() {
        return cheval;
    }

    public void monterCheval(Cheval cheval) {
        //TODO
    }

    public void attraperBandit(Bandit bandit) {
        //TODO
    }

}
