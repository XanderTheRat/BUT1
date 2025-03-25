package metier;

import java.util.Comparator;

public class ComparateurNom implements Comparator<Sommet> {
    @Override
    public int compare(Sommet o1, Sommet o2) {
        return o1.getNom().compareTo(o2.getNom());
    }
}
