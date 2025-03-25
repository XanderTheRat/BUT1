package metier;

public class Sommet implements Comparable<Sommet> {
    private final String nom;
    private final Integer altitude;
    private final ChaineDeMontagne chaine;
    public Sommet(String nom, Integer altitude, ChaineDeMontagne chaine) {
        this.nom = nom;
        this.altitude = altitude;
        this.chaine = chaine;
    }

    public String getNom(){
        return this.nom;
    }

    public Integer getAltitude(){
        return this.altitude;
    }

    public ChaineDeMontagne getChaine() {
        return this.chaine;
    }

    public String getDescription() {
        return nom + " - altitude : " + altitude + " - : " + chaine.getNom();
    }

    public static void sort() {
        // TODO
    }
    @Override
    public int compareTo(Sommet o) {
        return o.altitude.compareTo(this.altitude);
    }

    public boolean equals(Sommet o) {
        return this.altitude.equals(o.altitude) && this.chaine.equals(o.chaine) && this.nom.equals(o.nom);
    }

}
