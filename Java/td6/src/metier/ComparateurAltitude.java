package metier;

import java.util.Comparator;

public class ComparateurAltitude implements Comparator<Sommet> {
    @Override
    public int compare(Sommet o1, Sommet o2) {
        return o1.getAltitude().compareTo(o2.getAltitude());
    }
}
