package metier;

public enum ChaineDeMontagne {
    MASSIF_CENTRAL("Massif Central"), MONT_BLANC("Massif du Mont Blanc"), PYRENEES ("Pyrénées"), VOSGES("Massifs des Vosges");
    private final String nom;
    ChaineDeMontagne(final String nom) {
        this.nom = nom;
    }

    public final String getNom() {
        return nom;
    }


}
